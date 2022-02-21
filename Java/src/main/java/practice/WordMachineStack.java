package practice;

import java.util.Stack;

// https://www.assignmentaccess.com/ExpertAnswers/in-python-a-word-machine-is-a-system-that-performs-a-sequence-of-simple-operations-on-a-stack-of-int
public class WordMachineStack {

    int solutionStack(String S) {

        if (S == null || S.isEmpty())
            return -1;
        try {
            String []commands = S.split(" ");

            Stack<Integer> stack = new Stack<>();

            int len = commands.length;

            for (int i = 0; i < len; i++) {
                switch (commands[i]) {
                    case "DUP":
                        if (stack.empty())
                            return -1;
                        else {
                            int num = stack.peek();
                            stack.push(num);
                        }

                        break;

                    case "POP":
                        if (stack.empty())
                            return -1;
                        else
                            stack.pop();

                        break;

                    case "+":
                        if (stack.empty() || stack.size() < 2)
                            return -1;

                        int num1 = stack.pop();
                        int num2 = stack.pop();
                        int sum = num1 + num2;
                        if (sum < 0 || sum >= Math.pow(2,20)) {
                            return -1;
                        }
                        stack.push(sum);

                        break;

                    case "-":
                        if (stack.empty() || stack.size() < 2)
                            return -1;

                        num1 = stack.pop();
                        num2 = stack.pop();
                        int sub = num1 - num2;
                        if (sub < 0 || sub >= Math.pow(2,20))
                            return -1;
                        stack.push(sub);
                        break;

                    default:
                        int num = Integer.parseInt(commands[i]);
                        if (num < 0 || num >= Math.pow(2,20))
                            return -1;
                        stack.push(num);

                }
            }
            return stack.size() > 0 ? stack.pop() : -1;
        }
        catch (Exception e){
            return -1;
        }
    }

    public WordMachineStack() {
        System.out.println("######################################");
        System.out.println("Word Machine Stack");

        String stack = "4 5 6 - 7 +";

        System.out.println(solutionStack(stack));

        stack = "13 DUP 4 POP 5 DUP + DUP + -";

        System.out.println(solutionStack(stack));

        stack = "5 6 + -";

        System.out.println(solutionStack(stack));

        stack = "3 DUP 5 - -";

        System.out.println(solutionStack(stack));

        stack = "1048575 DUP +";

        System.out.println(solutionStack(stack));

        stack = "";

        System.out.println(solutionStack(stack));

        stack = "1048575 POP POP";

        System.out.println(solutionStack(stack));

        System.out.println("######################################");
    }
}
