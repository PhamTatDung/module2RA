public class bai5 {
    public static void main(String[] args) {
        int n = 1;
        while (!(n % 5 == 0 && n % 7 == 0 && n % 11 == 0)) {
            n++;
        }
        System.out.println("Số Nguyên Dương Nhỏ Nhất Chia Hết Cho cả 5, 7, 11 la: " + n);
    }
}
