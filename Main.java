import java.util.*;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

class LL {
    static Node head;

    public static void add(int data){
        Node newnode = new Node(data);
        if(head==null){
            head=newnode;
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }


    public static void traverse(){
        if(head==null){
            System.out.println("NOT_EXIST");
        }
        else{
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp=temp.next;
                
            }
        }
    }

    public static void insertAtIndex(int data, int pos){
        Node newnode = new Node(data);
        if(head==null){
            System.out.println("CREATED");
            head = newnode;
        }
        else{
            Node temp = head;
             while(pos-2>=0){
                temp= temp.next;
                pos--;
             }
             Node nodenext = temp.next;
             temp.next=newnode;
             newnode.next=nodenext;
        }
    }

}

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF NODES: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int d = sc.nextInt();
            LL.add(d);
        }
        System.out.println("------BEFORE INSERTION------");
        LL.traverse();
        System.out.println("------AFTER INSERTION--------");
        int n1 = sc.nextInt();
        int p = sc.nextInt();
        LL.insertAtIndex(n1,p);
        LL.traverse();
    }
}
