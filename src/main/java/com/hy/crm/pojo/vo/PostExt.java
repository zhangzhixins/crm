package com.hy.crm.pojo.vo;

import com.hy.crm.pojo.Business;
import com.hy.crm.pojo.Post;
import com.hy.crm.pojo.Reply;
import com.hy.crm.pojo.User;

/**
 * @ProjectName: crm
 * @Package: com.hy.crm.pojo.vo
 * @ClassName: PostExt
 * @Author: Xiaobai
 * @Description:
 * @Date: 2020/9/8 16:31
 * @Version: 1.0
 */
public class PostExt {
    private Post post;
    private Business business;
    private User user;
    private Integer replies;

    public PostExt(Post post, Business business, User user, Integer replyes) {
        this.post=post;
        this.business=business;
        this.user=user;
        this.replies=replyes;
    }
    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getReplies() {
        return replies;
    }

    public void setReplies(Integer replies) {
        this.replies = replies;
    }
}
