public class baitap6phan2 {
    public static void main(String[] args) {
        String str = "bai tap chuoi";
        System.out.println("chuỗi đầu vào: "+str);
        StringBuilder stringBuilder = new StringBuilder(str);
        str = stringBuilder.insert(8, "insert ").toString();
        System.out.println("chuỗi sau khi chèn: "+str);
    }
}
