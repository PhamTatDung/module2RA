public class baitap9 {
    public static void main(String[] args) {
        int[] arr = {9, 4, 2, 4, 1, 2, 6, 4, 1, 8, 3, 12};
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max2 = max;
                max = arr[i];
            } else if (arr[i] > max2 && arr[i] != max) {
                max2 = arr[i];
            }
        }
        if (max2!=Integer.MIN_VALUE){
            System.out.println("Số lớn thứ 2 trong mảng là: "+max2);
        }
        else {
            System.out.println("Không tìm được số lơns thứ 2");
        }

    }
}
