package synapticloop.getcookie.api;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import synapticloop.getcookie.api.exception.GetCookieApiException;
import synapticloop.getcookie.api.model.Meta;
import synapticloop.getcookie.api.model.Post;
import synapticloop.getcookie.api.model.PostData;
import synapticloop.getcookie.api.response.PostResponse;

public class PostTest {
	private GetCookieApiClient getCookieApiClient;

	@Before
	public void setup() {
		getCookieApiClient = new GetCookieApiClient();
	}

	@Test
	public void testGetPost() throws GetCookieApiException {
		PostResponse postResponse = getCookieApiClient.getPost("abG9gNKgd");
		assertNotNull(postResponse);
		Meta meta = postResponse.getMeta();
		Integer code = meta.getCode();
		String statusCode = meta.getStatusCode();

		assertEquals(200, code.intValue());
		assertEquals("OK", statusCode);

		PostData data = postResponse.getData();
		List<Post> posts = data.getPosts();
		assertNotNull(posts);
		assertEquals(1, posts.size());

		for (Post post : posts) {
			assertNotNull(post.getComments());
			assertNotNull(post.getContentPhotos());
			assertNotNull(post.getGroups());
		}
	}

}
