package Queue;

public class Queue {
    int[] queue=new int[5];
    int size;
    int front;
    int rear;
    public void enQueue(int data){
        queue[rear]=data;
        rear=rear+1;
        size++;


    }
    public int deQueue(int i){
        int data=queue[front];
        front++;
        size--;
        return data;


    }

    public void show(){
        System.out.println("Elements : ");
        for(int i=0; i<size; i++){
            //System.out.println(queue[i] + " ");//for enqueue
            System.out.println(queue[front+i] + " ");// for dequeue

        }
        //printing all the elements
        System.out.println();
        for(int n : queue){
            System.out.println(n + " ");
        }

    }

    public static void main(String[] args) {
        Queue queue1=new Queue();
        queue1.enQueue(5);
        queue1.enQueue(3);
        queue1.enQueue(4);
        queue1.deQueue(5);
        queue1.deQueue(3);
        queue1.enQueue(9);
        queue1.enQueue(7);

        queue1.show();


    }
}
