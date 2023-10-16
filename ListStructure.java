public class ListStructure {
    Node head = null;
    Node tail = null;

    void ekle(int x){
        Node eleman = new Node();
        eleman.data = x;
        eleman.next = null;
        if(head == null){
            head = eleman;
            tail = eleman;
            System.out.println("Liste oluşturuldu, ilk eleman eklendi.");
        }else{
            tail.next = eleman;
            tail = eleman;
            System.out.println("Listenin sonuna yeni bir eleman eklendi.");
        }
    }

    void yazdir(){
        Node temp = head;
        System.out.print("BAŞ -> ");
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print(" SON");
    }
}