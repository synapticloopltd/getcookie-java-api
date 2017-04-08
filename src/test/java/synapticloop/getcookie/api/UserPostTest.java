package synapticloop.getcookie.api;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import synapticloop.getcookie.api.exception.GetCookieApiException;
import synapticloop.getcookie.api.model.Post;
import synapticloop.getcookie.api.response.UserPostsResponse;

public class UserPostTest {
	private static final String DEFAULT_USER_NAME = "9chat";

	private GetCookieApiClient getCookieApiClient;

	@Before
	public void setup() {
		getCookieApiClient = new GetCookieApiClient();
	}

	@Test
	public void testGetUserPosts() throws GetCookieApiException {
		UserPostsResponse userPosts = getCookieApiClient.getUserPosts(DEFAULT_USER_NAME, 0l);

		List<Post> posts = userPosts.getData().getUsers().get(0).getPosts();
		for (Post post : posts) {
			assertNotNull(post.getAnonymous());
			assertNotNull(post.getComments());
		}

		Long nextOffset = userPosts.getData().getUsers().get(0).getNextOffset();

		while(null != nextOffset) {
			nextOffset = userPosts.getData().getUsers().get(0).getNextOffset();
			userPosts = getCookieApiClient.getUserPosts(DEFAULT_USER_NAME, nextOffset);
		}

	}

}
