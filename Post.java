public class Post {
    private String postId;
    private String content;
    private int likes;

    public Post(String postId, String content) {
        this.postId = postId;
        this.content = content;
        this.likes = 0;
    }

    public String getPostId() {
        return postId;
    }
    
    public String showPost() {
        return "Post ID: " + postId + "\nContent: " + content + "\nLikes: " + likes;
    }
}
