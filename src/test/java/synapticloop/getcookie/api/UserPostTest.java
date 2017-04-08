package synapticloop.getcookie.api;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import synapticloop.getcookie.api.exception.GetCookieApiException;
import synapticloop.getcookie.api.model.Post;
import synapticloop.getcookie.api.response.UserPostsResponse;

public class UserPostTest {
	private GetCookieApiClient getCookieApiClient;

	@Before
	public void setup() {
		getCookieApiClient = new GetCookieApiClient();
	}

	@Test
	public void testGetUserPosts() throws GetCookieApiException {
		UserPostsResponse userPosts = getCookieApiClient.getUserPosts("9chat", 0l);

		List<Post> posts = userPosts.getData().getUsers().get(0).getPosts();

		Long nextOffset = userPosts.getData().getUsers().get(0).getNextOffset();

		while(null != nextOffset) {
			getCookieApiClient = new GetCookieApiClient();
			nextOffset = userPosts.getData().getUsers().get(0).getNextOffset();
			userPosts = getCookieApiClient.getUserPosts("9chat", nextOffset);
		}

	}

}
