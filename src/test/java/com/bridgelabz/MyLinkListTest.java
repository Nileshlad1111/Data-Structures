package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkListTest {

    @Test
    public void provideThreeNumber_WhenLinked_shouldTestCasePassed() {
        MyNode<Integer> newFNode = new MyNode<>(56);
        MyNode<Integer> newSNode = new MyNode<>(30);
        MyNode<Integer> newTNode = new MyNode<>(70);
        newFNode.setNext(newSNode);
        newSNode.setNext(newTNode);
        boolean result = newFNode.getNext().equals(newSNode) &&
                newSNode.getNext().equals(newTNode);
        Assert.assertTrue(result);
    }

    //adding top element
    @Test
    public void provideThreeNumber_WhenAddedToTop_ShouldTestCasePassed(){
        MyNode<Integer> newFNode = new MyNode<>(30);
        MyNode<Integer> newSNode = new MyNode<>(56);
        MyNode<Integer> newTNode = new MyNode<>(70);
        MyLinkList myCreatedLinkList = new MyLinkList();
        myCreatedLinkList.addAtLast(newFNode);
        myCreatedLinkList.addAtLast(newSNode);
        myCreatedLinkList.addAtLast(newTNode);

        boolean isLinkedListCreated = myCreatedLinkList.start.equals(newTNode) &&
                myCreatedLinkList.start.getNext().equals(newSNode) &&
                myCreatedLinkList.last.equals(newFNode);
        Assert.assertTrue(isLinkedListCreated);
    }


    @Test
    public void provideThreeNumber_WhenNotAddedToTop_ShouldTestCaseNotPassed(){
        MyNode<Integer> newFNode = new MyNode<>(30);
        MyNode<Integer> newSNode = new MyNode<>(56);
        MyNode<Integer> newTNode = new MyNode<>(70);
        MyLinkList myCreatedLinkList = new MyLinkList();
        myCreatedLinkList.addAtLast(newFNode);
        myCreatedLinkList.addAtLast(newSNode);
        myCreatedLinkList.addAtLast(newTNode);

        boolean isLinkedListCreated = myCreatedLinkList.start.equals(newTNode) &&
                myCreatedLinkList.start.getNext().equals(newSNode) &&
                myCreatedLinkList.last.equals(newSNode);
        Assert.assertFalse(isLinkedListCreated);
    }

    //adding in last element
    @Test
    public void provideThreeNumber_WhenAddedToLast_ShouldTestCasePassed()
    {
        MyNode<Integer> newFNode = new MyNode<>(56);
        MyNode<Integer> newSNode = new MyNode<>(30);
        MyNode<Integer> newTNode = new MyNode<>(70);
        MyLinkList myCreatedLinkList = new MyLinkList();
        myCreatedLinkList.addAtStart(newFNode);
        myCreatedLinkList.addAtStart(newSNode);
        myCreatedLinkList.addAtStart(newTNode);

        boolean isLinkedListCreated = myCreatedLinkList.start.equals(newFNode) &&
                myCreatedLinkList.start.getNext().equals(newSNode) &&
                myCreatedLinkList.last.equals(newTNode);
        Assert.assertTrue(isLinkedListCreated);
    }

    @Test
    public void provideThreeNumber_WhenNotAddedToLast_ShouldTestCase_NotPassed()
    {
        MyNode<Integer> newFNode = new MyNode<>(56);
        MyNode<Integer> newSNode = new MyNode<>(30);
        MyNode<Integer> newTNode = new MyNode<>(70);
        MyLinkList myCreatedLinkList = new MyLinkList();
        myCreatedLinkList.addAtStart(newFNode);
        myCreatedLinkList.addAtStart(newSNode);
        myCreatedLinkList.addAtStart(newTNode);

        boolean isLinkedListCreated = myCreatedLinkList.start.equals(newTNode) &&
                myCreatedLinkList.start.getNext().equals(newSNode) &&
                myCreatedLinkList.last.equals(newFNode);
        Assert.assertFalse(isLinkedListCreated);
    }
}

