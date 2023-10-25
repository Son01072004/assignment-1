import java.util.LinkedList;

public class LinkedListADT {

    public static void addElement(LinkedList<String> linkedList){
        linkedList.add("Mouse");
        linkedList.add("Cat");
        linkedList.add("Dog");
        System.out.println("LinkedList : " + linkedList);
    }

    public static void addElementWithIndex(LinkedList<String> linkedList, int index, String valueElement){
        linkedList.add(index, "Tiger");
        System.out.println("LinkedList : " + linkedList);
    }

    public static void getElementByIndex(LinkedList<String> object, int index){
        String element = object.get(index);
        System.out.println("get Element : " + element);
        System.out.println("LinkedList : " + object);
    }

    public static void getElementValueByIndex(LinkedList<String> object, int index, String value){
        object.set(index, value);
        System.out.println("LinkedList : " + object);
    }
    //clear, remove, constrains, index of, last index of
    public static void scanElementLinkedList(LinkedList<String> object){
        for(int i = 0; i < object.size(); i++){
            System.out.println("Element value : " + object.get(i));
        }

        for(String j : object){
            System.out.println("Element value : " + j);
        }
    }
}
