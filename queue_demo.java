
import java.util.Scanner;

class queueException  extends Exception{
    public  void Error(){
        System.out.print("queue is full");
    }
}
class queue{
    int front;
    int rear;
    int q[];
    queue(int n){
        q=new int[n];
    }
    void insert(int ele)throws queueException{
        if(rear==q.length)
        {
            throw new queueException();
        }
        if(front==-1)
        front=0;
        q[rear++]=ele;

    }
    int delete()
    {
        int ele;
        if(front==-1)
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        if(front==rear)
        {
            ele=q[front];
            rear=front=-1;
        }
        else{
            ele=q[front++];
        }
        return ele;

    }
    void display()
    {
        int i;
        if(front==-1)
        {
            System.out.println("queue is empty");
            return;
        }
        for(i=front;i<rear;i++)
        System.out.println(q[i]+"\t");
    }
}
        class queue_demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ;
        System.out.println("enter a size");
        int size =sc.nextInt();
        queue Queue=new queue(size);
        try{
            while(true){
                System.out.println("\n 1.Insert \n 2.Delete \n 3.Display \n");
                System.out.println("choice");
                int choice = sc.nextInt();
                switch(choice){
                    case 1:System.out.println("number");
                    Queue.insert(sc.nextInt());
                    break;
                    case 2:System.out.println("deleted item is:"+Queue.delete());
                    break;
                    case 3:Queue.display();
                    break;
                }
            }
        }    
        catch(queueException e){
            e.Error();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("queue is empty");
        }
    }
}
