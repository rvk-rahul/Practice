package practice.other;

import java.util.*;

public class FlattenListOfObject {

    List<Integer> resultRecursion = new ArrayList<>();

    void getFlatListRecursion(List<Object> list) {

        if (list.isEmpty())
            return;

        for (Object ob: list) {
            if (ob instanceof Integer) {
                resultRecursion.add(((Integer) ob));
            }
            else if (ob instanceof ArrayList) {
                getFlatListRecursion((ArrayList) ob);
            }
        }
    }

    List<Integer> getFlatListUsingStack(List<Object> list) {

        List<Integer> result = new ArrayList<>();
        Stack<Object> stack = new Stack<>();

        for (Object ob: list) {
            stack.push(ob);
        }

        while (!stack.isEmpty()) {
            if (stack.peek() instanceof Integer)
                result.add((Integer) stack.pop());
            else {
                for (Object ob: (ArrayList) stack.pop()) {
                    stack.push(ob);
                }
            }
        }
        return result;
    }

    List<Integer> getFlatListUsingQueue(List<Object> list) {

        List<Integer> result = new ArrayList<>();
        Queue<Object> queue = new LinkedList<>();

        for (Object ob: list) {
            queue.add(ob);
        }

        while (!queue.isEmpty()) {
            if (queue.peek() instanceof Integer)
                result.add((Integer) queue.poll());
            else
                for (Object ob: (ArrayList) queue.poll())
                    queue.add(ob);
        }

        return result;
    }

    public FlattenListOfObject() {
        List<Object> list = new ArrayList<Object>() {{
            add(1);
            add(2);
            add(new ArrayList<Integer>(){{
                add(3);
                add(4);
            }});
            add(5);
            add(new ArrayList<Object>(){{
                add(6);
                add(new ArrayList<Integer>(){{
                    add(7);
                    add(8);
                }});
            }});
        }};
        getFlatListRecursion(list);
        System.out.println(resultRecursion);

        System.out.println(getFlatListUsingStack(list));

        System.out.println(getFlatListUsingQueue(list));
    }
}
