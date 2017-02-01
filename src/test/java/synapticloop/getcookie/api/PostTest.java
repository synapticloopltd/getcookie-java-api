package synapticloop.getcookie.api;

import org.junit.Before;
import org.junit.Test;

import synapticloop.getcookie.api.exception.GetCookieApiException;
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
	}

}
