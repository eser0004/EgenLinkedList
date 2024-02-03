public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        LinkedList<Integer> myList = new LinkedList<>();
        myList.addFirst(5);
        myList.addFirst(6);
        myList.addLast(10);
        myList.addLast(30);
        myList.addFirst(2);
        myList.addAtIndex(2,40);
        myList.addAtIndex(3,16);

        myList.removeFirst();
        myList.removeLast();
        myList.removeAtIndex(2);
        myList.get(3);
        myList.isEmpty();
        myList.size();

        // Add more elements and perform operations as needed

        // Print the elements of the linked list
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }


    }
}
