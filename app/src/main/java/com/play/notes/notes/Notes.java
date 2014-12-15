package com.play.notes.notes;

import java.util.ArrayList;

/**
 * Created by User on 05/12/2014.
 */
public class Notes {

    private String header;
    private String body;
    public ArrayList<String> list = new ArrayList<String>();


    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void addToList(String listItem) {
        list.add(listItem);
    }
}
