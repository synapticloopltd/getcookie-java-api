package synapticloop.getcookie.api.example;

import java.util.List;

import synapticloop.getcookie.api.GetCookieApiClient;
import synapticloop.getcookie.api.exception.GetCookieApiException;
import synapticloop.getcookie.api.model.Group;
import synapticloop.getcookie.api.model.Owner;
import synapticloop.getcookie.api.model.Post;
import synapticloop.getcookie.api.model.User;
import synapticloop.getcookie.api.response.GroupPostsResponse;
import synapticloop.getcookie.api.response.UserPostsResponse;

public class QuickTest {
	public static void main(String[] args) throws GetCookieApiException {
		GetCookieApiClient getCookieApiClient = new GetCookieApiClient();

		// get the posts for the 'shower-thoughts' group

		GroupPostsResponse groupPosts = getCookieApiClient.getGroupPosts("shower-thoughts");

		// due to the JSON data structure - there is an array of groups - which
		// only ever has one entry in the array
		List<Group> groups = groupPosts.getData().getGroups();

		// get the group
		Group group = groups.get(0);

		// now get the posts
		List<Post> posts = group.getPosts();
		for (Post post : posts) {
			// now we can retrieve the information from the post
			String title = post.getTitle();
			System.out.println(String.format("[ POST ] title: %s", title));

			// we can also retrieve who posted it
			Owner owner = post.getOwner();
			String username = owner.getUsername();

			// anonymous posts don't have much information
			if(!"anonymous".equals(username)) {
				System.out.println(String.format("  [ USER ] name: %s", username));
				System.out.println(String.format("  [ USER ] from: %s", owner.getCountryName()));

				// and get the posts that they have done
				UserPostsResponse userPosts = getCookieApiClient.getUserPosts(username);
				List<User> users = userPosts.getData().getUsers();
				// once again - there is only one user in the array
				User user = users.get(0);
				List<Post> postsFromUser = user.getPosts();
				for (Post postFromUser : postsFromUser) {
					System.out.println(String.format("    [ USER_POST ] title: %s", postFromUser.getTitle()));
				}
			} else {
				System.out.println(String.format("  [ USER ] [ anonymous ]"));
			}
		}
	}
}
