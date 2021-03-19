package contests;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }
}

class SinglyLinkedList {
    public SinglyLinkedListNode head;
    public SinglyLinkedListNode tail;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertNode(int nodeData) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
        }

        this.tail = node;
    }
}

class SinglyLinkedListPrintHelper {
    public static void printList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }
}

class Result {

    /*
     * Complete the 'fold_linked_list' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts INTEGER_SINGLY_LINKED_LIST List as parameter.
     */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

    public static SinglyLinkedListNode fold_linked_list(SinglyLinkedListNode List) {
    List<SinglyLinkedListNode> l = new ArrayList<>();
    SinglyLinkedListNode tmp = List;
    while(List!=null)
        {l.add(List);List =List.next;}
    l.forEach(n->System.out.println(n.data));
    int swtch = 0;
    int len = l.size();
    for(int i = 0;i<len;i++)
    {int inext;
     inext = len-i-1;
     if(i>=len/2)
         inext++;
     if (i==len/2)
         l.get(i).next = null;
     else
         l.get(i).next = l.get(inext);
     System.out.println(i+"->"+inext);
        //l.get(i).next = l.get(i+len/2+1-i%2);swtch = 1-swtch;
    }
     return tmp;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        SinglyLinkedList l = new SinglyLinkedList();

        int lCount = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, lCount).forEach(i -> {
            try {
                int lItem = Integer.parseInt(bufferedReader.readLine().trim());

                l.insertNode(lItem);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        SinglyLinkedListNode result = Result.fold_linked_list(l.head);

        SinglyLinkedListPrintHelper.printList(result, " ", bufferedWriter);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

