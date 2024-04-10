import java.util.LinkedList;

public class LinkedListOperations {
    public static void main(String[] args) {
        LinkedList<String> list= new LinkedList<>();

        list.add("Kamal");
        list.add("Amal");
        list.add("Nimal");
        list.add("Sunimal");

        System.out.println("Names:-"+list);

        list.add(3,"Rash");
        System.out.println("New list:- "+list);

        System.out.println("3rd index element of list:-" +list.get(3));

        list.set(4,"Kavi");
        System.out.println("Updated List:-"+list);

        list.remove(1);
        System.out.println("After remove 1st index value:-"+list);

    }
}

