import java.util.Scanner;

public class dupliremove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first element in Node : ");
        int finfo = sc.nextInt();
        Singlylinkedlist a = new Singlylinkedlist();
        a.Atfirst(finfo);
        int i = -1;

        while (i != 0) {

            System.out.println();
            System.out.println("Enter 1 for insert at top,\nEnter 2 for delete duplicate element,\nEnter 3 for display all elements,\nEnter any thing else for terminate the programe :");
            i = sc.nextInt();
            System.out.println();
            if(i==1){
                System.out.print("Enter a new node data :");
                finfo = sc.nextInt();
                a.Atfirst(finfo);
            }
            else if(i==2){
                a.deleteduplicate();
            }
            else if(i==3){
                a.Display();
            }
            else{
                break;
            }

        }
    }
}

class Singlylinkedlist {
    static Node first = null;
    void Atfirst(int info){
        Node newnode = new Node(info);
            newnode.link=first;
            first = newnode;
    }
    void Display() {
        Node save = first;
        while (save != null) {
            System.out.print(save.info + ",");
            save = save.link;
        }

    }
    void deleteduplicate() {
        if(first == null){
            System.out.println("Node is empty.");
        }
        else{
            Node save = first.link;
            Node temp = first;
            while (temp.link != null) {
                if(save.link == null){
                    if(temp.info == save.info){
                        temp.link = null;
                    }
                    else{
                        temp = temp.link;
                        save = temp.link;
                    }
                }
                if(save.link.link==null){
                    if(temp.info == save.link.info){
                        save.link = null;
                    }
                    else{
                        temp = temp.link;
                        save = temp.link;
                    }
                }
                else{
                    if(temp.info == save.link.info){
                        save.link = save.link.link;
                    }
                    else {
                        save = save.link;
                    }
                }
            }
        }
        
        

    }
}

class Node {
    int info;
    Node link;

    Node(int info) {
        this.info = info;
        this.link = null;
    }
}