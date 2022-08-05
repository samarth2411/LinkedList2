package com.LinkedList;
import java.util.Scanner;

public class LinkedList1 {
    public static class Node{
        Node next;
        int data;

        public Node( int data) {

            this.data = data;
            next = null;

        }
    }
    public static class LinkedList{
       static Node head ;
       static Node tail;

        static Node create1(){

           Node n1 = new Node(10);
           Node n2 = new Node(20);
           Node n3 = new Node(30);
           Node n4 = new Node(40);
           Node n5 = new Node(50);

           n1.next = n2;
           n2.next = n3;
           n3.next = n4;
           n4.next = n5;
            return n1;
        }
        static Node create2(){
            tail = head;
            System.out.println("Enter the number of nodes you want to enter");

            Scanner sc = new Scanner(System.in);
            int Nodes = sc.nextInt();


            for(int i=0;i<Nodes ;i++){
                System.out.println("Enter the "+i+" "+"element");
                int element = sc.nextInt();
                Node node = new Node(element);
                if(head == null){
                   head = node;
                   tail = head;

                }
                else{
                    tail.next = node;
                    tail = tail.next;

                }
            }
            return head;
        }
      static  void print(Node head){
           Node temp = head;
           while(temp!=null){
               System.out.print(temp.data+" ");
               temp=temp.next;
           }
       }
        static Node delete(int position){
            if(position==0){
                head = head.next;
                return head;
            }
            else{
                int count = 0;
                Node temp = head;
                while(count < position-1 && temp!=null){
                   temp = temp.next;
                   count++;
                }
                if(temp!=null && temp.next!=null){
                    temp.next = temp.next.next;
                }
            }
            return head;


        }


        public static void main(String[] args) {
            Node head = create2();
            print(head);
            System.out.println();
            Scanner sc = new Scanner(System.in);
           System.out.println("Enter the position you want to delete");
            int position = sc.nextInt();
            System.out.println("After Deleting");
            head = delete(position);
            print(head);
        }

    }


}

