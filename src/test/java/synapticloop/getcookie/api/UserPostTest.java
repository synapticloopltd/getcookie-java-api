package synapticloop.getcookie.api;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import synapticloop.getcookie.api.exception.GetCookieApiException;
import synapticloop.getcookie.api.model.ContentPhoto;
import synapticloop.getcookie.api.model.Post;
import synapticloop.getcookie.api.model.Thumbnail;
import synapticloop.getcookie.api.model.UserPosts;

public class UserPostTest {
	private GetCookieApiClient getCookieApiClient;

	@Before
	public void setup() {
		getCookieApiClient = new GetCookieApiClient();
	}

	@Test
	public void testGetUserPosts() throws GetCookieApiException {
		UserPosts userPosts = getCookieApiClient.getUserPosts("bob_the_pirate", 0);

		List<Post> posts = userPosts.getData().getUsers().get(0).getPosts();
		for (Post post : posts) {
			System.out.println(":::" + post.getGroups().get(0).getUrl());
			List<ContentPhoto> contentPhotos = post.getContentPhotos();
			for (ContentPhoto contentPhoto : contentPhotos) {
				System.out.println("wget " + contentPhoto.getThumbnails().get840w().getUrl());
			}
		}

		Integer nextOffset = userPosts.getData().getUsers().get(0).getNextOffset();

		while(null != nextOffset) {
			getCookieApiClient = new GetCookieApiClient();
			nextOffset = userPosts.getData().getUsers().get(0).getNextOffset();
			userPosts = getCookieApiClient.getUserPosts("bob_the_pirate", nextOffset);

			List<Post> postsish = userPosts.getData().getUsers().get(0).getPosts();
			for (Post post : postsish) {
				System.out.println(":::" + post.getGroups().get(0).getUrl());
				List<ContentPhoto> contentPhotos = post.getContentPhotos();
				for (ContentPhoto contentPhoto : contentPhotos) {
					Thumbnail get480wv = contentPhoto.getThumbnails().get480wv();
					if(null != get480wv) {
						System.out.println("wget " + get480wv.getUrl());
					} else {
						System.out.println("wget " + contentPhoto.getThumbnails().get840w().getUrl());
					}
				}
			}
		}

	}

}
