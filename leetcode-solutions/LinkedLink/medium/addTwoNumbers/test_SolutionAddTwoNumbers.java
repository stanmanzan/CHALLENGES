import java.util.ArrayList;
import java.util.List;

public class test_SolutionAddTwoNumbers {

    // Método para convertir un array en una lista enlazada
    public static ListNode arrayToListNode(int[] array) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        for (int num : array) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummyHead.next;
    }

    // Método para convertir una lista enlazada en un array
    public static int[] listNodeToArray(ListNode node) {
        List<Integer> resultList = new ArrayList<>();
        while (node != null) {
            resultList.add(node.val);
            node = node.next;
        }
        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }
        return resultArray;
    }

    public static void main(String[] args) {
        SolutionAddTwoNumbers solution = new SolutionAddTwoNumbers();
        
        // Prueba 1
        int[] array1 = {2, 4, 3}; // Representa el número 342
        int[] array2 = {5, 6, 4}; // Representa el número 465
        ListNode l1 = arrayToListNode(array1);
        ListNode l2 = arrayToListNode(array2);
        ListNode resultNode = solution.addTwoNumbers(l1, l2);
        int[] resultArray = listNodeToArray(resultNode);
        System.out.print("Resultado: ");
        for (int num : resultArray) {
            System.out.print(num + " "); // Debe imprimir: 7 0 8 
        }
        System.out.println();

        // Prueba 2
        int[] array3 = {9,9,9,9,9,9,9}; 
        int[] array4 = {9,9,9,9}; 
        l1 = arrayToListNode(array3);
        l2 = arrayToListNode(array4);
        resultNode = solution.addTwoNumbers(l1, l2);
        resultArray = listNodeToArray(resultNode);
        System.out.print("Resultado: ");
        for (int num : resultArray) {
            System.out.print(num + " "); 
        }
        System.out.println();
    }
}
