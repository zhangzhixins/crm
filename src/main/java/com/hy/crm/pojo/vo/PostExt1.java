package com.hy.crm.pojo.vo;

import com.hy.crm.pojo.Post;
import com.hy.crm.pojo.Reply;
import com.hy.crm.pojo.User;

import java.util.List;

/**
 * @ProjectName: crm
 * @Package: com.hy.crm.pojo.vo
 * @ClassName: PostExt1
 * @Author: Xiaobai
 * @Description:
 * @Date: 2020/9/9 15:00
 * @Version: 1.0
 */
public class PostExt1 {
    private Post post;
    private User user;
    private List<Reply> reply;
    private Integer replies;

    public PostExt1(Post post, User user, List<Reply> reply, Integer replies) {
        this.post = post;
        this.user = user;
        this.reply = reply;
        this.replies = replies;
    }


    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Reply> getReply() {
        return reply;
    }

    public void setReply(List<Reply> reply) {
        this.reply = reply;
    }

    public Integer getReplies() {
        return replies;
    }

    public void setReplies(Integer replies) {
        this.replies = replies;
    }

    @Override
    public String toString() {
        return "PostExt1{" +
                "post=" + post +
                ", user=" + user +
                ", reply=" + reply +
                ", replies=" + replies +
                '}';
    }
}
