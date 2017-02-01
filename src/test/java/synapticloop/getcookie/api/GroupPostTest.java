package synapticloop.getcookie.api;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import synapticloop.getcookie.api.exception.GetCookieApiException;
import synapticloop.getcookie.api.model.Post;
import synapticloop.getcookie.api.response.GroupPostsResponse;

public class GroupPostTest {
	private GetCookieApiClient getCookieApiClient;

	@Before
	public void setup() {
		getCookieApiClient = new GetCookieApiClient();
	}

	@Test
	public void testGetUserPosts() throws GetCookieApiException {
		GroupPostsResponse groupPosts = getCookieApiClient.getGroupPosts("i-have-a-question", 0l);
		List<Post> posts = groupPosts.getData().getGroups().get(0).getPosts();

		Long nextOffset = groupPosts.getData().getGroups().get(0).getNextOffset();
		while(null != nextOffset) {
			getCookieApiClient = new GetCookieApiClient();
			GroupPostsResponse groupPostish = getCookieApiClient.getGroupPosts("i-have-a-question", nextOffset);
			posts = groupPostish.getData().getGroups().get(0).getPosts();
			nextOffset = groupPostish.getData().getGroups().get(0).getNextOffset();
		}
	}
}
