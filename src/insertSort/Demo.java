package insertSort;

public class Demo {
    public static void insertSort(int[] list) {
        int pos, x;
        for (int i = 1; i < list.length; i++) { //đoạn array[0] đã sắp xếp
            x = list[i];
            pos = i;
            while (pos > 0 && x < list[pos - 1]) {
                list[pos] = list[pos - 1]; // đổi chỗ
                pos--;
            }
            list[pos] = x;
        }
    }

    static int[] arrlist = {5, 3, 4, 5, 7, 8, 7, 9, 23, 2, 65, 6, 8};

    public static void main(String[] args) {
        insertSort(arrlist);
        for (int i = 0; i < arrlist.length; i++) {
            System.out.print(arrlist[i] + "\t");
        }
    }
}
