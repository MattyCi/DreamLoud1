package com.test.Models;


public class PostComments {
    public String username;
    public String content;
    public String acctPictureUrl;
    public String date;
    public String postId;

    public String getAcctId() {
        return acctId;
    }

    public void setAcctId(String acctId) {
        this.acctId = acctId;
    }

    public String acctId;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAcctPictureUrl() {
        return acctPictureUrl;
    }

    public void setAcctPictureUrl(String acctPictureUrl) {
        this.acctPictureUrl = acctPictureUrl;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }
}
