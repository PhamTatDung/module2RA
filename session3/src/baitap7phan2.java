public class baitap7phan2 {
    public static void main(String[] args) {
        String str1 = "Pham ";
        String str2 = "Tat Dung";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str1);
        stringBuilder.append(str2);
        String result = stringBuilder.toString();
        System.out.println("chuỗi sau khi nối: "+result);
    }
}
