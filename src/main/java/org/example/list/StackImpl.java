package org.example.list;

public class StackImpl {

    int size;
    int top;
    int arr[];

    StackImpl(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return (size-1)==top;
    }

    public int pop(){
        if (!isEmpty()){
            int returnedTop = top;
            top--;
            System.out.println("pop element :"+ arr[returnedTop]);
            return arr[returnedTop];
        }else{
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public int peek(){
        if (!isEmpty()){
            return arr[top];
        }else{
            System.out.println("Stack is empty");
            return -1;
        }
    }

    public void push(int data){
        if (!isFull()){
            top++;
            arr[top]=data;
            System.out.println("pushed element :"+ data);
        }else{
            System.out.println("Stack is full");
        }
    }



    public static void main(String[] args) {
        StackImpl s = new StackImpl(5);
        System.out.println(s.peek());
        s.push(5);
        s.push(2);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());

    }


}
