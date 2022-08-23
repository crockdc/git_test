public class BubbleSort {
        private int count;
        private int size;
        private int[] list;

        public BubbleSort(int size) {
            this.size = size;
            this.count = 0;
            list = new int[size];
        }
        public void addNum(int num) {
            if (count == this.size) {
                this.size *= 2;
                int[] list2 = new int[this.size];
                for (int i = 0; i < count; i++) {
                    list2[i] = list[i];
                }
                list = list2;
            }
            list[count] = num;
            count++;
        }

        public void sort() {
            for (int i = count; i > 0; i--) {
                for (int j = 0; j < count; j++)
                    if (list[j] > list[j + 1]) {
                        int temp = list[j];
                        list[j] = list[j + 1];
                        list[j + 1] = temp;

                }
            }
        }
        public String toString() {
            String string = "";
            for (int i = 0; i < count; i++) {
                string += list[i] + " ";
            }
            return string;
        }
    }

