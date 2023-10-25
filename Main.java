// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // LinkedList
        LinkedList<String> animals = new LinkedList<>();
        // 1 - Operator add
        LinkedListADT.addElement(animals);
        LinkedListADT.addElementWithIndex(animals, 0, "Tiger");
        LinkedListADT.getElementByIndex(animals, 2);
        LinkedListADT.scanElementLinkedList(animals);

        /* Stack */
        Stack<Integer> numbers = new Stack<>();
        // 1 - push stack
        StackADT.stackPush(numbers);
        // 2 - pop stack
        StackADT.stackPop(numbers);
        // 3 - peek stack
        StackADT.stackPeek(numbers);
        // 4 - search stack
        StackADT.stackSearch(numbers, -12);
        // 5 - is empty stack
        StackADT.checkEmptyStack(numbers);
        // 6 - stack size
        StackADT.stackSize(numbers);

        /* Queue Linked List */
        Queue<String> fruits = new LinkedList<>();
        QueueLinkedListADT.queueAdd(fruits);
        Queue<Integer> number = new LinkedList<>();
        QueueLinkedListADT.queueOffer(number);
        QueueLinkedListADT.queuePeek(number);
        QueueLinkedListADT.queuePoll(number);
        QueueLinkedListADT.queueContain(number, 8);
        QueueLinkedListADT.forQueue(number);

        /* Cac thuat toan xap xep*/

        /* 1 - Bubble Sort */
        int[] randomNumbers = {100,3,1,20,5,4};
        BubbleSortALU.bubbleSort(randomNumbers, randomNumbers.length);
        BubbleSortALU.printResult(randomNumbers);

        /* 2 - Insertion Sort */
        InsertionSortALU.insertionSort(randomNumbers);
        InsertionSortALU.printResult(randomNumbers);

        /* 3 - Selection Sort */
        SelectionSortALU.selectionSort(randomNumbers);
        SelectionSortALU.printResult(randomNumbers);

        /* 4 - Merge Sort */
        MergeSortALU.sort(randomNumbers, 0, randomNumbers.length - 1);
        MergeSortALU.printResult(randomNumbers);
    }
}
