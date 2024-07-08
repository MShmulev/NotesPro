package com.example.notespro;

import com.google.firebase.Timestamp;

import java.sql.Time;

public class Note {
    String title;
    String content;
    com.google.firebase.Timestamp timestamp;
    
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


    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
