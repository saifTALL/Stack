public class TestStack {

    public static void main(String[] args) {

        MyStack<String> stack = new MyStack<>();

        stack.push("Java");
        stack.push("Python");

        System.out.println(stack.top());
    }
}