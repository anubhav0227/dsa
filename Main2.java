import java.util.*;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data= data;
        this.next= null;
    }
}

class LL{
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

    static void traverse(){
        if(head==null){
            System.out.println("empty");
        }
        else{
            Node temp =head;
            while(temp!=null){
                System.out.print(temp.data);
                temp=temp.next;
            }
        }
    }

    public static void reverseNode(){
        Node prev = null;
        Node curr = head;
        while(curr!=null){
            Node temp = curr.next;
            curr.next = prev;
            prev=curr;
            curr=temp;
        }
        
        head = prev;
    }

    public static void removeAt(int r){
        if(head==null){
            System.out.println("not exist");
        }
        else{
            Node temp = head;
            Node curr =temp;
            int c =0;
            while(temp.next!=null){
                if(temp.data==r){
                    curr.next=temp.next;
                    c++;
                }
                curr = temp;
                temp=temp.next;
            }
            if(c==0){
                System.out.println("NOT FOUND");
            }
            else{
                System.out.println("deleted");
            }
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE NO OF NODES: ");
        int n = sc.nextInt();
        for(int i =0; i<n; i++){
            LL.add(sc.nextInt());
        }
        System.out.println("------before delete--");
        LL.traverse();
        System.out.println();
        // System.out.print("enter value you want to delte: ");
        // int v = sc.nextInt();
        // System.out.println(); 
        // LL.removeAt(v);     
        // System.out.println("----after delte---");
        // LL.traverse();
        LL.reverseNode();
        LL.traverse();
    }
}
