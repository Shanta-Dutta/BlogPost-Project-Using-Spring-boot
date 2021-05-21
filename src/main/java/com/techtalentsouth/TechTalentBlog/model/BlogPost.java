package com.techtalentsouth.TechTalentBlog.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity

public class BlogPost {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String title;
    private String author;
    private String blogEntry;
    @CreationTimestamp
    private Date date;

    public BlogPost() {
    }




    public BlogPost(String title, String author, String blogEntry ) {
        this.title = title;
        this.author = author;
        this.blogEntry = blogEntry;
    }

    public Date getDate() {
        return date;
    }


    public Long getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBlogEntry() {
        return blogEntry;
    }

    public void setBlogEntry(String blogEntry) {
        this.blogEntry = blogEntry;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    @Override
    public String toString() {
        return "BlogPost [id=" + id + ", title=" + title + ", author=" + author + ", blogEntry=" + blogEntry + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BlogPost blogPost = (BlogPost) o;

        if (id != null ? !id.equals(blogPost.id) : blogPost.id != null) return false;
        if (title != null ? !title.equals(blogPost.title) : blogPost.title != null) return false;
        if (author != null ? !author.equals(blogPost.author) : blogPost.author != null) return false;
        return blogEntry != null ? blogEntry.equals(blogPost.blogEntry) : blogPost.blogEntry == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (blogEntry != null ? blogEntry.hashCode() : 0);
        return result;
    }
}