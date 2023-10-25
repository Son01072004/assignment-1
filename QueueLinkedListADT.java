import java.util.Queue;

public class QueueLinkedListADT {
    // add Queue
    public static void queueAdd(Queue<String> queue){
        queue.add("apple");
        queue.add("banana");
        queue.add("cherry");
        queue.add("lemon");
        System.out.println("Queue : " + queue);
    }
    // offer queue
    public static void queueOffer(Queue<Integer> queue){
        for (int i = 0; i <= 10; i++){
            queue.offer(i);
        }
        System.out.println("Queue LinkedList : " + queue);
    }
    // Peek queue
    public static void queuePeek(Queue<Integer> queue){
        int accessElement = queue.peek();
        System.out.println("accessElement Queue LinkedList : " + accessElement);
        System.out.println("Queue LinkedList : " + queue);
    }
    // poll queue : remove element in Queue
    public static void queuePoll(Queue<Integer> queue){
        int element = queue.poll();
        System.out.println("Poll element in queue : " + element);
        System.out.println("Queue : " + queue);
    }

    // search element in Queue
    public static  void queueContain(Queue<Integer> queue, int value){
        boolean check = queue.contains(value);
        if(!check){
            System.out.println(value + " is not found");
        } else {
            System.out.println(value + " is found");
        }
    }
    // for ... Queue
    public static void forQueue(Queue<Integer> queue){
//        for( int j = 0; j < queue.size(); j++){
//         System.out.println("value Element Queue " + queue.peek());
//        }
        for(int i : queue){
            System.out.println(i);
        }
    }
}
