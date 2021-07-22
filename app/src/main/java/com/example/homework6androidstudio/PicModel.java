package com.example.homework6androidstudio;

public class PicModel {
   public String title, description;

   public PicModel(String title, String description) {
       this.title = title;
       this.description = description;
   }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
