package com.example.crudone;

public class Book {

        private int   id;
        private String title;
        private String auther;  

    // getter 
        public int getId() {
            return id;
        }
        public String getTitle() {
            return title;
        }
        public String getAuther() {
            return auther;
        }

    // setter
    
        public void setId(int id) {
            this.id = id;
        }
        public void setTitle(String title) {
            this.title = title;
        }public void setAuther(String auther) {
            this.auther = auther;
        }
}
