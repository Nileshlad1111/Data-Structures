package com.bridgelabz;

public class MyLinkList {
    public MyNode last;
    public MyNode start;

    public MyLinkList() {
        this.start = null;
        this.last = null;
    }

    public void add(MyNode newNode) {
        if(last == null) {
            last = newNode;
        }
        if(start == null){
            start = newNode;
        }
        else {
            MyNode temp = start;
            this.start = newNode;
            this.start.setNext(temp);
        }
    }
}
