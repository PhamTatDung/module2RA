package employee;

import java.util.Scanner;

public class Main {
    protected static Employee[] employees = new Employee[100];
    protected static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("********************** Quản Lý Nhân Viên **********************");
            System.out.println(
                    "\t1. Hiển thị danh sách nhân viên\n" +
                            "\t2. Thêm nhân viên\n" +
                            "\t3. Sửa thông tin nhân viên\n" +
                            "\t4. Xoá nhân viên\n" +
                            "\t5. Thoát\n"
            );
            System.out.println("Nhập lựa chọn từ Menu trên: ");
            byte choice = Byte.parseByte(sc.nextLine());
            switch (choice) {
                case 1:
                    showAllEmployee();
                    break;
                case 2:
                    createEmployee();
                    break;
                case 3:
                    System.out.println("Nhập mã nhân viên cần sửa");
                    int idEdit = Integer.parseInt(sc.nextLine());
                    updateEmployee(idEdit);
                    break;
                case 4:
                    System.out.println("Nhập mã nhân viên cần xóa");
                    int idDel = Integer.parseInt(sc.nextLine());
                    deleteEmployee(idDel);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không tồn tại!");
                    break;
            }
        }
    }

    public static void createEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng nhân viên: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        if (quantity > employees.length - count) {
            System.out.println("Số lượng nhân viên vượt quá!");
            return;
        }
        for (int i = 0; i < quantity; i++) {
            Employee newEmployee = new Employee();
            System.out.println("Nhập thông tin nhân viên thứ " + (i + 1) + ": ");
            System.out.println("Nhập mã số nhân viên: ");
            newEmployee.setEmployeeId(Integer.parseInt(scanner.nextLine()));
            System.out.println("Nhập tên nhân viên: ");
            newEmployee.setEmployeeName(scanner.nextLine());
            System.out.println("Nhập tuổi nhân viên: ");
            newEmployee.setAge(Integer.parseInt(scanner.nextLine()));
            System.out.println("Nhập giới tính: ");
            newEmployee.setGender(scanner.nextLine().equalsIgnoreCase("Nam"));
            System.out.println("Nhập hệ số : ");
            newEmployee.setRate(Double.parseDouble(scanner.nextLine()));
            newEmployee.setSalary(newEmployee.calSalary());
            employees[count++] = newEmployee;
        }
        System.out.println("Thêm thành công!");

    }

    public static void showAllEmployee() {
        if (count == 0) {
            System.out.println("Danh sách sinh viên trống");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    public static void updateEmployee(int idEdit) {
        Scanner scanner = new Scanner(System.in);
        int index = getIndex(idEdit);
        if (index == -1) {
            System.out.println("Không tìm thấy nhân viên!");
            return;
        }
        System.out.println("********************** Thông tin cũ **********************");
        System.out.println(employees[index]);
        System.out.println("Nhập thông tin mới: ");
        System.out.println("Nhập tên nhân viên: ");
        employees[index].setEmployeeName(scanner.nextLine());
        System.out.println("Nhập tuổi nhân viên: ");
        employees[index].setAge(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập giới tính: ");
        employees[index].setGender(scanner.nextLine().equalsIgnoreCase("Nam"));
        System.out.println("Nhập hệ số : ");
        employees[index].setRate(Double.parseDouble(scanner.nextLine()));
        employees[index].setSalary(employees[index].calSalary());
        System.out.println("Cập nhật thành công");

    }
    public static void deleteEmployee(int idDel){
        int index = getIndex(idDel);
        if(index==-1){
            System.out.println("Không tìm thấy nhân viên!");
            return;
        }
        for (int i = index+1; i <count ; i++) {
            employees[i-1] = employees[i];
        }
        employees[count-1]= null;
        count--;
        System.out.println("Xóa thành công");
    }
    public static int getIndex(int id) {
        for (int i = 0; i < count; i++) {
            if (id == employees[i].getEmployeeId()) {
                return i;
            }
        }
        return -1;
    }

}

