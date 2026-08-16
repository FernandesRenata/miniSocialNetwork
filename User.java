import java.util.List;

public class User {
    
    private String username;
    private List<String> followingUsers;
    private List<String> publishedPosts;
    public Object notifications;

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

    public void publishPost(String postId, String content) {
        Post newPost = new Post(postId, content);
        publishedPosts.add(newPost.getPostId());
    }

    public String getUsername() {
        return username;
    }

}
