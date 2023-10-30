public class baitap8phan2 {
    public static void main(String[] args) {
        String str = "hoc vien fukuoka";
        System.out.println("chuỗi đầu vào: "+str);
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.replace(9, str.length(), "RA");
        System.out.println("chuỗi sau khi thay thế: "+stringBuilder.toString());
    }
}
