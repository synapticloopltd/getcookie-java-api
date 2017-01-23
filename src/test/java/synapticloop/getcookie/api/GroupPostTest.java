package synapticloop.getcookie.api;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import synapticloop.getcookie.api.exception.GetCookieApiException;
import synapticloop.getcookie.api.gmodel.Post;
import synapticloop.getcookie.api.model.ContentPhoto;
import synapticloop.getcookie.api.model.GroupPost;
import synapticloop.getcookie.api.model._480wv_;

public class GroupPostTest {
	private GetCookieApiClient getCookieApiClient;

	@Before
	public void setup() {
		getCookieApiClient = new GetCookieApiClient();
	}

	@Test
	public void testGetUserPosts() throws GetCookieApiException {
		GroupPost groupPosts = getCookieApiClient.getGroupPosts("truth-or-dare-me", 0l);
		List<Post> posts = groupPosts.getData().getGroups().get(0).getPosts();
		for (Post post : posts) {
			getCorrectPhoto(post);
		}

		Long nextOffset = groupPosts.getData().getGroups().get(0).getNextOffset();
		while(null != nextOffset) {
			getCookieApiClient = new GetCookieApiClient();
			GroupPost groupPostish = getCookieApiClient.getGroupPosts("truth-or-dare-me", nextOffset);
			List<Post> postish = groupPostish.getData().getGroups().get(0).getPosts();
			for (Post post : postish) {
				getCorrectPhoto(post);
			}
			nextOffset = groupPostish.getData().getGroups().get(0).getNextOffset();
		}
	}

	private void getCorrectPhoto(Post post) {
		System.out.println(">>" + post.getOwner().getUsername());
		List<ContentPhoto> contentPhotos = post.getContentPhotos();
		for (ContentPhoto contentPhoto : contentPhotos) {
			_480wv_ video = contentPhoto.getThumbnails().get480wv();
			if(null != video) {
				System.out.println("wget " + video.getUrl());
			} else {
				System.out.println("wget " + contentPhoto.getThumbnails().get840w().getUrl());
			}
		}

	}
}
