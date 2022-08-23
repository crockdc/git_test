public class Main {
    public static void main(String[] args) {
        BubbleSort bubbles = new BubbleSort(4);
        bubbles.addNum(3);
        bubbles.addNum(2);
        bubbles.addNum(1);
        bubbles.addNum(6);
        bubbles.addNum(5);
        bubbles.addNum(4);

        bubbles.sort();

        System.out.println(bubbles);
        /*ArrayIns insertionSortArray = new ArrayIns(4);
        insertionSortArray.insert(2);
        insertionSortArray.insert(1);
        insertionSortArray.insert(4);
        insertionSortArray.insert(3);
        insertionSortArray.display();
        insertionSortArray.insertionSort();
        insertionSortArray.display();*/
    }
}