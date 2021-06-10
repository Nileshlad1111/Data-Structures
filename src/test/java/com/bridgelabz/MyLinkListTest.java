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

    //adding last element
    @Test
    public void provideThreeNumber_WhenAddedToTop_ShouldTestCasePassed(){
        MyNode<Integer> newFNode = new MyNode<>(30);
        MyNode<Integer> newSNode = new MyNode<>(56);
        MyNode<Integer> newTNode = new MyNode<>(70);
        MyLinkList myCreatedLinkList = new MyLinkList();
        myCreatedLinkList.addAtStart(newFNode);
        myCreatedLinkList.addAtStart(newSNode);
        myCreatedLinkList.addAtStart(newTNode);

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
        myCreatedLinkList.addAtStart(newFNode);
        myCreatedLinkList.addAtStart(newSNode);
        myCreatedLinkList.addAtStart(newTNode);

        boolean isLinkedListCreated = myCreatedLinkList.start.equals(newTNode) &&
                myCreatedLinkList.start.getNext().equals(newSNode) &&
                myCreatedLinkList.last.equals(newSNode);
        Assert.assertFalse(isLinkedListCreated);
    }

    //adding in top element
    @Test
    public void provideThreeNumber_WhenAddedToLast_ShouldTestCasePassed()
    {
        MyNode<Integer> newFNode = new MyNode<>(56);
        MyNode<Integer> newSNode = new MyNode<>(30);
        MyNode<Integer> newTNode = new MyNode<>(70);
        MyLinkList myCreatedLinkList = new MyLinkList();
        myCreatedLinkList.addAtLast(newFNode);
        myCreatedLinkList.addAtLast(newSNode);
        myCreatedLinkList.addAtLast(newTNode);

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
        myCreatedLinkList.addAtLast(newFNode);
        myCreatedLinkList.addAtLast(newSNode);
        myCreatedLinkList.addAtLast(newTNode);

        boolean isLinkedListCreated = myCreatedLinkList.start.equals(newTNode) &&
                myCreatedLinkList.start.getNext().equals(newSNode) &&
                myCreatedLinkList.last.equals(newFNode);
        Assert.assertFalse(isLinkedListCreated);
    }

    //insert element
    @Test
    public void provideThreeNumber_WhenAddedToUserPosition_ShouldReturnTrue()
    {
        MyNode<Integer> newFNode = new MyNode<>(56);
        MyNode<Integer> newSNode = new MyNode<>(70);
        MyNode<Integer> nodeToInsert = new MyNode<>(30);
        MyLinkList myCreatedLinkList = new MyLinkList();
        myCreatedLinkList.addAtStart(newFNode);
        myCreatedLinkList.addAtLast(newSNode);

        myCreatedLinkList.addAtSelectedPosition(newFNode, nodeToInsert);

        boolean isLinkedListCreated = myCreatedLinkList.start.equals(newFNode) &&
                myCreatedLinkList.start.getNext().equals(nodeToInsert) &&
                myCreatedLinkList.last.equals(newSNode);
        Assert.assertTrue(isLinkedListCreated);
    }

    //delete head element
    @Test
    public void deleteStartNumber_WhenStartWillBeDeleted_TestCaseShouldPass()
    {
        MyNode<Integer> newFNode = new MyNode<>(56);
        MyNode<Integer> newSNode = new MyNode<>(30);
        MyNode<Integer> newTNode = new MyNode<>(70);
        MyLinkList myCreatedLinkList = new MyLinkList();
        myCreatedLinkList.addAtLast(newFNode);
        myCreatedLinkList.addAtLast(newSNode);
        myCreatedLinkList.addAtLast(newTNode);

        myCreatedLinkList.RemoveAtStart();

        boolean isLinkedListCreated = myCreatedLinkList.start.equals(newSNode) &&
                myCreatedLinkList.last.equals(newTNode);
        Assert.assertTrue(isLinkedListCreated);
    }

    @Test
    public void deleteLastNumber_WhenLastWillBeDeleted_TestCaseShouldPass()
    {
        MyNode<Integer> newFNode = new MyNode<>(56);
        MyNode<Integer> newSNode = new MyNode<>(30);
        MyNode<Integer> newTNode = new MyNode<>(70);
        MyLinkList myCreatedLinkList = new MyLinkList();
        myCreatedLinkList.addAtLast(newFNode);
        myCreatedLinkList.addAtLast(newSNode);
        myCreatedLinkList.addAtLast(newTNode);

        myCreatedLinkList.RemoveAtLast();

        boolean isLinkedListCreated = myCreatedLinkList.start.equals(newFNode) &&
                myCreatedLinkList.last.equals(newSNode);
        Assert.assertTrue(isLinkedListCreated);
    }

    //search node
    @Test
    public void provideNode_whenSearchNumber_ShouldReturnTrue()
    {
        MyNode<Integer> newFNode = new MyNode<>(56);
        MyNode<Integer> newSNode = new MyNode<>(30);
        MyNode<Integer> newTNode = new MyNode<>(70);
        MyLinkList myCreatedLinkList = new MyLinkList();
        myCreatedLinkList.addAtLast(newFNode);
        myCreatedLinkList.addAtLast(newSNode);
        myCreatedLinkList.addAtLast(newTNode);

        boolean isNodeFound = myCreatedLinkList.findNode(30);
        Assert.assertTrue(isNodeFound);
    }

    //after search node element
    @Test
    public void provideNumber_ShouldAddAfter_WhenAddedTestCaseShouldPassed()
    {
        MyNode<Integer> newFNode = new MyNode<>(56);
        MyNode<Integer> newSNode = new MyNode<>(30);
        MyNode<Integer> newTNode = new MyNode<>(70);
        MyNode<Integer> newNodeToAdd = new MyNode<>(40);
        MyLinkList myCreatedLinkList = new MyLinkList();
        myCreatedLinkList.addAtLast(newFNode);
        myCreatedLinkList.addAtLast(newSNode);
        myCreatedLinkList.addAtLast(newTNode);

        myCreatedLinkList.addAfterSearchedPosition(newSNode, newNodeToAdd);

        boolean isLinkedListCreated = myCreatedLinkList.start.equals(newFNode) &&
                myCreatedLinkList.start.getNext().equals(newSNode) &&
                myCreatedLinkList.start.getNext().getNext().equals(newNodeToAdd) &&
                myCreatedLinkList.last.equals(newTNode);
        Assert.assertTrue(isLinkedListCreated);
    }

}

