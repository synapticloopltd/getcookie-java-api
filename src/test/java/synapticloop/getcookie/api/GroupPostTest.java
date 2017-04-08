package synapticloop.getcookie.api;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import synapticloop.getcookie.api.exception.GetCookieApiException;
import synapticloop.getcookie.api.model.GroupData;
import synapticloop.getcookie.api.model.Post;
import synapticloop.getcookie.api.response.GroupPostsResponse;


public class GroupPostTest {
	private static final String DEFAULT_USER_GROUP = "i-have-a-question";

	private GetCookieApiClient getCookieApiClient;

	@Before
	public void setup() {
		getCookieApiClient = new GetCookieApiClient();
	}

	@Test
	public void testGetUserPosts() throws GetCookieApiException {
		GroupPostsResponse groupPosts = getCookieApiClient.getGroupPosts(DEFAULT_USER_GROUP, 0l);
		List<Post> posts = groupPosts.getData().getGroups().get(0).getPosts();
		assertNotNull(posts);
		GroupData data = groupPosts.getData();
		assertNotNull(data.getGroups());

		Long nextOffset = groupPosts.getData().getGroups().get(0).getNextOffset();
		while(null != nextOffset) {
			GroupPostsResponse groupPostish = getCookieApiClient.getGroupPosts(DEFAULT_USER_GROUP, nextOffset);
			posts = groupPostish.getData().getGroups().get(0).getPosts();
			assertNotNull(posts);
			nextOffset = groupPostish.getData().getGroups().get(0).getNextOffset();
		}
	}
}
