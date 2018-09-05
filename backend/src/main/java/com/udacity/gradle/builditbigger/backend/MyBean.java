package com.udacity.gradle.builditbigger.backend;


import com.example.jokeslib.JokesClass;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;
    //private JokesClass jokesClass;

    public String getData() {
        myData = new JokesClass().getJoke();

        return myData;
    }

    public void setData(String data) {
        myData = data;
    }
}