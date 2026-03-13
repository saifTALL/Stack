public class TestStack {

    public static void main(String[] args) {

        MyStack stack = new MyStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.top());

        stack.pop();

        System.out.println(stack.top());
    }
}