
import java.util.*;
public class linkedlist
{
Node head=null;

class Node
{
int data;
Node next;
Node(int d)
{
    data=d;
    next=null;
}
}
void printlist()
{
    Node d=head;
    while(d!=null)
    {
    System.out.print(d.data+" ");
    d=d.next;
    }
}
void findlargest()
{
    int temp=-999;
Node t=head;
while(t!=null)
{
if (t.data>temp)
{
temp=t.data;
}
t=t.next;
}
System.out.println("\n Largest element in linked list : "+temp);
}
void push(int data)
{
Node o=new Node(data);
o.next=head;
head=o;
}
void findsmallest()
{
int temp=999;
Node t=head;
while(t!=null)
{
if (t.data<temp)
{
temp=t.data;
}
t=t.next;
}
System.out.println("\n Smallest element in linked list : "+temp);
}
public static void main(String g[])
{
linkedlist obj=new linkedlist();
obj.push(23);
obj.push(234);
obj.push(1);
obj.push(24);
obj.push(29);
obj.printlist();
obj.findlargest();
obj.findsmallest();
}
}





