import java.util.List;

public class User {
    
    private String username;
    private List<String> followingUsers;
    private List<String> publishedPosts;

    public User(String username) {
        this.username = username;
    }

    public List<String> getFollowingUsers() {
        return followingUsers;
    }

    public void followUser(String username) {
        followingUsers.add(username);
    }

    public List<String> getPublishedPosts() {
        return publishedPosts;
    }

    public void publishPost(String postId) {
        publishedPosts.add(postId);
    }

    public String getUsername() {
        return username;
    }

}
