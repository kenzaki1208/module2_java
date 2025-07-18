package week6.inheritance.friday.exercise.using_queue_to_demerging;

public class Employee {
    private String hoTen;
    private String gioiTinh;
    private String ngaySinh;

    public Employee(String hoTen, String gioiTinh, String ngaySinh) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
    }

    public String getSex() {
        return gioiTinh;
    }

    public void setSex(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return hoTen + "," + gioiTinh + "," + ngaySinh;
    }

    public static Employee parse(String line) {
        String[] parts = line.split(",");
        return new Employee(parts[0], parts[1], parts[2]);
    }
}
