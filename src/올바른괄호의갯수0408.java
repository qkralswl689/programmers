import java.util.Stack;

public class 올바른괄호의갯수0408 {
    public static void main(String[] args) {
        int n = 2;
        int result = 0;

        Stack<String> stack = new Stack<>();

        for(int i = 0; i < n; i++){
            stack.push("(");
            stack.push(")");
        }

    }
}
