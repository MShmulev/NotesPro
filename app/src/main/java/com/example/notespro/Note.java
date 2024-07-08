package com.example.notespro;

import java.security.Timestamp;

public class Note {
    String title;
    String content;
    Timestamp timestamp;
    
    public Note(){
        
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }


    public void setTimestamp(com.google.firebase.Timestamp now) {
    }
}
