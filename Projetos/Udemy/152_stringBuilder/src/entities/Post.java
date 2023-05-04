package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");
    private Date moment;
    private String title;
    private String content;
    private int likes;
    private List<Comment> comments = new ArrayList<Comment>();

    public Post() {
    }

    public Post(Date date, String title, String content, int likes) {
        this.moment = date;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public Date getMoment() {
        return this.moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return this.likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return this.comments;
    }

    public void addComment(Comment comment) {
        comments.add(comment);

    }

    public void removeComment(Comment comment) {
        comments.remove(comment);

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(sdf.format(moment) + "\n");
        sb.append(content + "\n");
        sb.append("Comments" + "\n");
        for (Comment c : comments) {
            sb.append(c.getText());
        }

        return sb.toString();
       
    }

}