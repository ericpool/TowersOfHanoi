package com.example.towersofhanoi;

public class Stack
{
    private Node top;
    private int count;

    public Stack()
    {
        this.top = null;
        this.count = 0;
    }

    public int getCount()
    {
        return this.count;
    }

    public void push(int payload)
    {
        Node n = new Node(payload);
        n.setNextNode(this.top);
        this.top = n;
        this.count++;
    }

    public int pop()
    {
        //we are assuming we will not call pop on the empty list
        Node nodeToReturn = this.top;
        this.top = this.top.getNextNode();
        nodeToReturn.setNextNode(null);
        this.count--;
        return nodeToReturn.getPayload();
    }

    public int peek()
    {
        if(this.count > 0)
        {
            return this.top.getPayload();
        }
        else
        {
            return -1;
        }

    }

    public void display()
    {
        //show elements one per line
        if(this.top == null)
        {
            System.out.println("Empty Stack");
        }
        else
        {
            Node currNode = this.top;
            do {
                System.out.println("*** " + currNode.getPayload());
                currNode = currNode.getNextNode();
            }
            while(currNode != null);
        }
    }
}
