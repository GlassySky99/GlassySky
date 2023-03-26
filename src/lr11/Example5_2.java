package lr11;

public class Example5_2 {
    public static void main(String[] args) {
        Node head = null;
        for (int i=0; i<=9;i++)
        {
            head = new Node(i,head);
        }
        Node ref = head;
        while (ref !=null)
        {
            System.out.println(" "+ ref.value);
            ref = ref.next;
        }
    }
}
