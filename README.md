 <a name="#documentr_top"></a>

> **This project requires JVM version of at least 1.8**






<a name="documentr_heading_0"></a>

# getcookie-java-api <sup><sup>[top](documentr_top)</sup></sup>



> A Java API for getcookie.com






<a name="documentr_heading_1"></a>

# Table of Contents <sup><sup>[top](documentr_top)</sup></sup>



 - [getcookie-java-api](#documentr_heading_0)
 - [Table of Contents](#documentr_heading_1)
 - [Usage](#documentr_heading_2)
 - [Building the Package](#documentr_heading_3)
   - [*NIX/Mac OS X](#documentr_heading_4)
   - [Windows](#documentr_heading_5)
 - [Running the Tests](#documentr_heading_6)
   - [*NIX/Mac OS X](#documentr_heading_7)
   - [Windows](#documentr_heading_8)
 - [Artefact Publishing - Github](#documentr_heading_9)
 - [Artefact Publishing - Bintray](#documentr_heading_10)
   - [maven setup](#documentr_heading_11)
   - [gradle setup](#documentr_heading_12)
   - [Dependencies - Gradle](#documentr_heading_13)
   - [Dependencies - Maven](#documentr_heading_14)
   - [Dependencies - Downloads](#documentr_heading_15)
 - [License](#documentr_heading_20)





<a name="documentr_heading_2"></a>

# Usage <sup><sup>[top](documentr_top)</sup></sup>

The getcookie java API offers a **LIMITED, READ ONLY** interface to the 
[https://getcookie.com/](https://getcookie.com/) website.  You can retrieve:

  - Posts (and comments) from a specific group
  - Posts (and comments) from a specific user

An example is below:




```
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

```






<a name="documentr_heading_3"></a>

# Building the Package <sup><sup>[top](documentr_top)</sup></sup>



<a name="documentr_heading_4"></a>

## *NIX/Mac OS X <sup><sup>[top](documentr_top)</sup></sup>

From the root of the project, simply run

`./gradlew build`




<a name="documentr_heading_5"></a>

## Windows <sup><sup>[top](documentr_top)</sup></sup>

`./gradlew.bat build`


This will compile and assemble the artefacts into the `build/libs/` directory.

Note that this may also run tests (if applicable see the Testing notes)



<a name="documentr_heading_6"></a>

# Running the Tests <sup><sup>[top](documentr_top)</sup></sup>



<a name="documentr_heading_7"></a>

## *NIX/Mac OS X <sup><sup>[top](documentr_top)</sup></sup>

From the root of the project, simply run

`gradle --info test`

if you do not have gradle installed, try:

`gradlew --info test`



<a name="documentr_heading_8"></a>

## Windows <sup><sup>[top](documentr_top)</sup></sup>

From the root of the project, simply run

`gradle --info test`

if you do not have gradle installed, try:

`./gradlew.bat --info test`


The `--info` switch will also output logging for the tests



<a name="documentr_heading_9"></a>

# Artefact Publishing - Github <sup><sup>[top](documentr_top)</sup></sup>

This project publishes artefacts to [GitHub](https://github.com/)

> Note that the latest version can be found [https://github.com/synapticloopltd/getcookie-java-api/releases](https://github.com/synapticloopltd/getcookie-java-api/releases)

As such, this is not a repository, but a location to download files from.



<a name="documentr_heading_10"></a>

# Artefact Publishing - Bintray <sup><sup>[top](documentr_top)</sup></sup>

This project publishes artefacts to [bintray](https://bintray.com/)

> Note that the latest version can be found [https://bintray.com/synapticloop/maven/getcookie-java-api/view](https://bintray.com/synapticloop/maven/getcookie-java-api/view)



<a name="documentr_heading_11"></a>

## maven setup <sup><sup>[top](documentr_top)</sup></sup>

this comes from the jcenter bintray, to set up your repository:



```
<?xml version="1.0" encoding="UTF-8" ?>
<settings xsi:schemaLocation='http://maven.apache.org/SETTINGS/1.0.0 http://maven.apache.org/xsd/settings-1.0.0.xsd' xmlns='http://maven.apache.org/SETTINGS/1.0.0' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance'>
  <profiles>
    <profile>
      <repositories>
        <repository>
          <snapshots>
            <enabled>false</enabled>
          </snapshots>
          <id>central</id>
          <name>bintray</name>
          <url>http://jcenter.bintray.com</url>
        </repository>
      </repositories>
      <pluginRepositories>
        <pluginRepository>
          <snapshots>
            <enabled>false</enabled>
          </snapshots>
          <id>central</id>
          <name>bintray-plugins</name>
          <url>http://jcenter.bintray.com</url>
        </pluginRepository>
      </pluginRepositories>
      <id>bintray</id>
    </profile>
  </profiles>
  <activeProfiles>
    <activeProfile>bintray</activeProfile>
  </activeProfiles>
</settings>
```





<a name="documentr_heading_12"></a>

## gradle setup <sup><sup>[top](documentr_top)</sup></sup>

Repository



```
repositories {
	maven {
		url  "http://jcenter.bintray.com" 
	}
}
```



or just



```
repositories {
	jcenter()
}
```





<a name="documentr_heading_13"></a>

## Dependencies - Gradle <sup><sup>[top](documentr_top)</sup></sup>



```
dependencies {
	runtime(group: 'synapticloop', name: 'getcookie-java-api', version: '1.0.2', ext: 'jar')

	compile(group: 'synapticloop', name: 'getcookie-java-api', version: '1.0.2', ext: 'jar')
}
```



or, more simply for versions of gradle greater than 2.1



```
dependencies {
	runtime 'synapticloop:getcookie-java-api:1.0.2'

	compile 'synapticloop:getcookie-java-api:1.0.2'
}
```





<a name="documentr_heading_14"></a>

## Dependencies - Maven <sup><sup>[top](documentr_top)</sup></sup>



```
<dependency>
	<groupId>synapticloop</groupId>
	<artifactId>getcookie-java-api</artifactId>
	<version>1.0.2</version>
	<type>jar</type>
</dependency>
```





<a name="documentr_heading_15"></a>

## Dependencies - Downloads <sup><sup>[top](documentr_top)</sup></sup>


You will also need to download the following dependencies:



### compile dependencies

  - `org.apache.httpcomponents:httpclient:4.5.1`: (It may be available on one of: [bintray](https://bintray.com/org.apache.httpcomponents/maven/httpclient/4.5.1/view#files/org.apache.httpcomponents/httpclient/4.5.1) [mvn central](http://search.maven.org/#artifactdetails|org.apache.httpcomponents|httpclient|4.5.1|jar))
  - `commons-io:commons-io:2.4`: (It may be available on one of: [bintray](https://bintray.com/commons-io/maven/commons-io/2.4/view#files/commons-io/commons-io/2.4) [mvn central](http://search.maven.org/#artifactdetails|commons-io|commons-io|2.4|jar))
  - `com.fasterxml.jackson.core:jackson-databind:2.8.5`: (It may be available on one of: [bintray](https://bintray.com/com.fasterxml.jackson.core/maven/jackson-databind/2.8.5/view#files/com.fasterxml.jackson.core/jackson-databind/2.8.5) [mvn central](http://search.maven.org/#artifactdetails|com.fasterxml.jackson.core|jackson-databind|2.8.5|jar))
  - `org.slf4j:slf4j-api:1.7.13`: (It may be available on one of: [bintray](https://bintray.com/org.slf4j/maven/slf4j-api/1.7.13/view#files/org.slf4j/slf4j-api/1.7.13) [mvn central](http://search.maven.org/#artifactdetails|org.slf4j|slf4j-api|1.7.13|jar))
  - `org.apache.commons:commons-lang3:3.5`: (It may be available on one of: [bintray](https://bintray.com/org.apache.commons/maven/commons-lang3/3.5/view#files/org.apache.commons/commons-lang3/3.5) [mvn central](http://search.maven.org/#artifactdetails|org.apache.commons|commons-lang3|3.5|jar))
  - `org.apache.logging.log4j:log4j-slf4j-impl:2.7`: (It may be available on one of: [bintray](https://bintray.com/org.apache.logging.log4j/maven/log4j-slf4j-impl/2.7/view#files/org.apache.logging.log4j/log4j-slf4j-impl/2.7) [mvn central](http://search.maven.org/#artifactdetails|org.apache.logging.log4j|log4j-slf4j-impl|2.7|jar))
  - `org.apache.logging.log4j:log4j-core:2.7`: (It may be available on one of: [bintray](https://bintray.com/org.apache.logging.log4j/maven/log4j-core/2.7/view#files/org.apache.logging.log4j/log4j-core/2.7) [mvn central](http://search.maven.org/#artifactdetails|org.apache.logging.log4j|log4j-core|2.7|jar))


### runtime dependencies

  - `org.apache.httpcomponents:httpclient:4.5.1`: (It may be available on one of: [bintray](https://bintray.com/org.apache.httpcomponents/maven/httpclient/4.5.1/view#files/org.apache.httpcomponents/httpclient/4.5.1) [mvn central](http://search.maven.org/#artifactdetails|org.apache.httpcomponents|httpclient|4.5.1|jar))
  - `commons-io:commons-io:2.4`: (It may be available on one of: [bintray](https://bintray.com/commons-io/maven/commons-io/2.4/view#files/commons-io/commons-io/2.4) [mvn central](http://search.maven.org/#artifactdetails|commons-io|commons-io|2.4|jar))
  - `com.fasterxml.jackson.core:jackson-databind:2.8.5`: (It may be available on one of: [bintray](https://bintray.com/com.fasterxml.jackson.core/maven/jackson-databind/2.8.5/view#files/com.fasterxml.jackson.core/jackson-databind/2.8.5) [mvn central](http://search.maven.org/#artifactdetails|com.fasterxml.jackson.core|jackson-databind|2.8.5|jar))
  - `org.slf4j:slf4j-api:1.7.13`: (It may be available on one of: [bintray](https://bintray.com/org.slf4j/maven/slf4j-api/1.7.13/view#files/org.slf4j/slf4j-api/1.7.13) [mvn central](http://search.maven.org/#artifactdetails|org.slf4j|slf4j-api|1.7.13|jar))
  - `org.apache.commons:commons-lang3:3.5`: (It may be available on one of: [bintray](https://bintray.com/org.apache.commons/maven/commons-lang3/3.5/view#files/org.apache.commons/commons-lang3/3.5) [mvn central](http://search.maven.org/#artifactdetails|org.apache.commons|commons-lang3|3.5|jar))
  - `org.apache.logging.log4j:log4j-slf4j-impl:2.7`: (It may be available on one of: [bintray](https://bintray.com/org.apache.logging.log4j/maven/log4j-slf4j-impl/2.7/view#files/org.apache.logging.log4j/log4j-slf4j-impl/2.7) [mvn central](http://search.maven.org/#artifactdetails|org.apache.logging.log4j|log4j-slf4j-impl|2.7|jar))
  - `org.apache.logging.log4j:log4j-core:2.7`: (It may be available on one of: [bintray](https://bintray.com/org.apache.logging.log4j/maven/log4j-core/2.7/view#files/org.apache.logging.log4j/log4j-core/2.7) [mvn central](http://search.maven.org/#artifactdetails|org.apache.logging.log4j|log4j-core|2.7|jar))


### testCompile dependencies

  - `junit:junit:4.12`: (It may be available on one of: [bintray](https://bintray.com/junit/maven/junit/4.12/view#files/junit/junit/4.12) [mvn central](http://search.maven.org/#artifactdetails|junit|junit|4.12|jar))


### testRuntime dependencies

  - `junit:junit:4.12`: (It may be available on one of: [bintray](https://bintray.com/junit/maven/junit/4.12/view#files/junit/junit/4.12) [mvn central](http://search.maven.org/#artifactdetails|junit|junit|4.12|jar))

**NOTE:** You may need to download any dependencies of the above dependencies in turn (i.e. the transitive dependencies)



<a name="documentr_heading_20"></a>

# License <sup><sup>[top](documentr_top)</sup></sup>



```
The MIT License (MIT)

Copyright (c) 2017 synapticloop

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```




--

> `This README.md file was hand-crafted with care utilising synapticloop`[`templar`](https://github.com/synapticloop/templar/)`->`[`documentr`](https://github.com/synapticloop/documentr/)

--
