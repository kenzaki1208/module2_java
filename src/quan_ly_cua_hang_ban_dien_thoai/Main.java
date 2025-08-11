package quan_ly_cua_hang_ban_dien_thoai;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static final PhoneManagement management = new PhoneManagement();
    private static final Scanner scanner = new Scanner(System.in);
    private static int currentId = management.getMaxId() + 1;

    public static void main(String[] args) {
        int choice;

        Menu();
        do {
            choice = readIntInRange("Chọn chức năng: ", 1, 5);
            switch (choice) {
                case 1:
                    System.out.println();
                    addNewPhone();
                    break;
                case 2:
                    System.out.println();
                    deletePhone();
                    break;
                case 3:
                    System.out.println();
                    showAllPhones();
                    break;
                case 4:
                    System.out.println();
                    searchPhone();
                    break;
                case 5:
                    System.out.println("Đang thoát ...");
                    break;
                default:
                    // Will not reach here due to validation
                    break;
            }
        } while (choice != 5);
    }

    private static void searchPhone() {
        String keyword = readNonEmptyString("Nhập từ khóa tìm kiếm: ");
        List<Phone> phones = management.search(keyword);
        if (phones.isEmpty()) {
            System.out.println("Không tìm thấy sản phẩm");
        } else {
            for (Phone p : phones) {
                System.out.println(p.displayInfo());
            }
        }
    }

    private static void showAllPhones() {
        for (Phone p : management.getAll()) {
            System.out.println(p);
        }
        System.out.println();
        management.displayAll();
    }

    private static void deletePhone() {
        int id = readInt("Nhập ID điện thoại cần xóa: ");
        if (management.deletePhone(id)) {
            System.out.println("Xóa thành công !");
        } else {
            System.out.println("Không tìm thấy sản phẩm");
        }
    }

    private static void addNewPhone() {
        System.out.println("Chọn loại điện thoại: ");
        System.out.println("1. Chính hãng");
        System.out.println("2. Xách tay");
        int type = readIntInRange("Chọn [1-2]: ", 1, 2);

        String name = readNonEmptyString("Tên điện thoại: ");
        double price = readDouble("Giá tiền: ");
        int quantity = readIntMin("Số lượng: ", 0);
        String manufacturer = readNonEmptyString("Nhà sản xuất: ");

        Phone phone;

        if (type == 1) {
            int warrantyPeriod = readIntMin("Thời gian bảo hành (tháng): ", 0);
            String warrantyScope = readNonEmptyString("Phạm vi bảo hành: ");
            phone = new GenuinePhone(currentId++, name, price, quantity, manufacturer, warrantyPeriod, warrantyScope);
        } else {
            String portableCountry = readNonEmptyString("Quốc gia xách tay: ");
            String portableStatus = readNonEmptyString("Tình trạng: ");
            phone = new PortablePhone(currentId++, name, price, quantity, manufacturer, portableCountry, portableStatus);
        }

        management.addPhone(phone);
        System.out.println("Thêm mới thành công !");
    }

    private static void Menu() {
        System.out.println("CHƯƠNG TRÌNH QUẢN LÝ ĐIỆN THOẠI");
        System.out.println("1. Thêm mới");
        System.out.println("2. Xóa");
        System.out.println("3. Xem danh sách điện thoại");
        System.out.println("4. Tìm kiếm");
        System.out.println("5. Thoát");
        System.out.println();
    }

    // Helper methods for robust input handling
    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) {
                System.out.println("Vui lòng nhập số nguyên.");
                continue;
            }
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Giá trị không hợp lệ. Hãy nhập số nguyên.");
            }
        }
    }

    private static int readIntInRange(String prompt, int min, int max) {
        while (true) {
            int value = readInt(prompt);
            if (value < min || value > max) {
                System.out.println("Vui lòng nhập số trong khoảng " + min + " đến " + max + ".");
                continue;
            }
            return value;
        }
    }

    private static int readIntMin(String prompt, int min) {
        while (true) {
            int value = readInt(prompt);
            if (value < min) {
                System.out.println("Vui lòng nhập số lớn hơn hoặc bằng " + min + ".");
                continue;
            }
            return value;
        }
    }

    private static double readDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) {
                System.out.println("Vui lòng nhập số.");
                continue;
            }
            try {
                return Double.parseDouble(line);
            } catch (NumberFormatException e) {
                System.out.println("Giá trị không hợp lệ. Hãy nhập số (ví dụ: 12345.67).");
            }
        }
    }

    private static String readNonEmptyString(String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = scanner.nextLine().trim();
            if (!s.isEmpty()) {
                return s;
            }
            System.out.println("Giá trị không được để trống.");
        }
    }

}
