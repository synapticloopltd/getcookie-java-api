package synapticloop.getcookie.api;

import java.util.List;

import org.junit.Before;

import synapticloop.getcookie.api.exception.GetCookieApiException;
import synapticloop.getcookie.api.model.Post;
import synapticloop.getcookie.api.response.UserPostsResponse;

public class UserTest {
	private GetCookieApiClient getCookieApiClient;

	@Before
	public void setup() {
		getCookieApiClient = new GetCookieApiClient();
	}

//	@Test
	public void testGetUser() throws GetCookieApiException {
		UserPostsResponse userPosts = getCookieApiClient.getUserPosts("bob_the_pirate", 0l);

		List<Post> posts = userPosts.getData().getUsers().get(0).getPosts();

		Long nextOffset = userPosts.getData().getUsers().get(0).getNextOffset();

		while(null != nextOffset) {
			getCookieApiClient = new GetCookieApiClient();
			nextOffset = userPosts.getData().getUsers().get(0).getNextOffset();
			userPosts = getCookieApiClient.getUserPosts("bob_the_pirate", nextOffset);
		}

	}

}
