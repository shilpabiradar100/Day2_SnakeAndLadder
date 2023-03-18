import java.util.*;

public class Collection {
    public static void main(String[] args) {
        //NOTE: (ArrayList is slow) insertion and deletion is slow
        // in arrayList because shifting performs
        //data stores in sequance form

        //searching and sorting is fast
        //1. follow insertion order
        //2. allowed null value
        //3. duplicate allowed
        //4. Async
        List<Integer> myList = new ArrayList();
        myList.add(10);
        myList.add(20);
        myList.add(null);
        myList.add(null);
        myList.add(30);
        myList.add(40);
        myList.add(10);
        myList.add(null);
//        for (Integer item : myList) {
//            System.out.println(item);
//        }
        //NOTE: (LinkedList is fast) insertion and deletion is fast
        // in LinkedList because no shifting performs
        // it use Linked list node
        //searching and sorting is slow
//1. follow insertion order
        //2. allowed null value
        //3. duplicate allowed
        //4. Async
        List<Integer> linkList = new LinkedList<>();
        linkList.add(10);
        linkList.add(20);
        linkList.add(null);
        linkList.add(30);
        linkList.add(40);
        linkList.add(10);
        linkList.add(null);
//        for (Integer item : linkList) {
//            System.out.println(item);
//        }
//1. follow insertion order
        //2. allowed null value
        //3. duplicate allowed
        //4. sync

        List<Integer> vectorList = new Vector<>();
        vectorList.add(10);
        vectorList.add(20);
        vectorList.add(null);
        vectorList.add(30);
        vectorList.add(40);
        vectorList.add(10);
        vectorList.add(null);
//        for (Integer item : vectorList) {
//            System.out.println(item);
//        }
//
        //1. follow insertion ord
//2. allowed null value
        //3. duplicate allowed
        //4. sync
        Stack<Integer> stack = new Stack<>();
        stack.add(10);
        stack.add(20);
        stack.add(null);
        stack.add(30);
        stack.add(40);
        stack.add(10);
        stack.add(null);

        for (Integer item : stack) {
            System.out.println(item);
        }
    }
}