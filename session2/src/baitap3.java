public class baitap3 {
    public static void main(String[] args) {
        System.out.println("day so nguyen to tu 0 den 100 la: ");
        for (int i = 2; i < 100; i++) {
            if (i == 2){
                System.out.print(i+" ");
            }
            else {
                boolean isPrime = true;
                for (int j = 2; j < i; j++) {
                    if (i%j==0){
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime){
                    System.out.print(i+ " ");
                }
            }
        }
    }
}
