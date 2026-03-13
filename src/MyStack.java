public class MyStack {

    private int stackPointer;
    private int[] elements;

    public MyStack(int size){
        elements = new int[size];
        stackPointer = -1;
    }

    public void push(int n){
        elements[++stackPointer] = n;
    }

    public void pop(){
        stackPointer--;
    }

    public int top(){
        return elements[stackPointer];
    }

    public boolean isEmpty(){
        return stackPointer == -1;
    }

    public int getSize(){
        return stackPointer + 1;
    }
}
