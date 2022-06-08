import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class menu {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Product> products = new ArrayList<>();
    public void Menu(){
        System.out.println("----Chương Trình Quản lý sản phẩm----");
        System.out.println("1.Xem danh sách sản phẩm:");
        System.out.println("2.Thêm mới:");
        System.out.println("3.Cập Nhật:");
        System.out.println("4.Xóa:");
        System.out.println("5.Sắp xếp:");
        System.out.println("6.Tìm sản phẩm có giá đắt nhất");
        System.out.println("7.Đọc từ file:");
        System.out.println("8.Ghi từ file:");
        System.out.println("9.Thoát:");
        System.out.println("Chọn chức năng: ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                showAll();
                break;
            case 2:
                addProducts();
                break;
            case 3:
                edit();
                break;
            case 4:
                delete();
                break;
            case 5:
                System.out.println("Chọn chức năng:");
                System.out.println("1.Sắp xếp  giá tăng dần:");
                System.out.println("2.Sắp xếp giá giảm dần:");
                System.out.println("3.Thoát");
                int choice1 = Integer.parseInt(scanner.nextLine());
                switch (choice1) {
                    case 1:
                        products.sort(new SortTangDan());
                        break;
                    case 2:
                        products.sort(new SortGiamDan());
                        break;
                    case 3:
                        System.exit(0);
                        break;
                    default:
                        System.err.println("lựa chọn sai");
                }
                break;
            case 6 :
                giamax();
            case 7:

                products=Reader();
                break;
            case 8:
                write();
                break;
            case 9:
                System.exit(0);
                break;
        }
    }
    public Product creatProducts(){
        int id = 0;
        String name = null;
        int gia = 0;
        int amount = 0;
        String describe =null;
        try {
            System.out.println("Nhập mã sản phẩm:");
            id = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập tên sản phẩm:");
            name = scanner.nextLine();
            System.out.println("Nhập giá sản phẩm :");
            gia = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập số lượng cần thêm:");
            amount =  Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập mô tả về sản phẩm:");
            describe = scanner.nextLine();
        } catch (NumberFormatException e) {
            System.err.println("Nhập lại đi sai rồi");
        }
        return new Product(id,name,gia,amount,describe);
    }

    private void delete() {
        System.out.println("Nhập mã của sản phẩm muốn xóa:");
        int id = Integer.parseInt(scanner.nextLine());
        Product product = null;
        for (Product value : products) {
            if (value.getId() == id) {
                product = value;
                break;
            }
        }
        if (product != null) {
            products.remove(product);
        } else {
            System.err.println("không có id ");
        }
    }

    private void edit() {
        System.out.println("Nhập mã sản phẩm muốn sửa:");
        int id = Integer.parseInt(scanner.nextLine());
        boolean isExisted = false;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                isExisted = true;
                products.remove(i);
                addProducts();
                break;

            }
        }
        if (!isExisted) {
            System.err.println("id không tồn tại");

        }
    }

    private void addProducts() {
        products.add(creatProducts());
    }

    private void showAll() {
        for (Product a : products
        ) {
            System.out.println(a);

        }
    }

    private void write() {
        ObjectOutputStream output;
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream("danhsachsanpham.csv");
            output = new ObjectOutputStream(fileOutputStream);

            output.writeObject(products);
            output.flush();
            output.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Ghi file thành công");
    }

    private ArrayList<Product> Reader() {
        ObjectInputStream inputStream;
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream("danhsachsanpham.csv");
            inputStream = new ObjectInputStream(fileInputStream);
            return (ArrayList<Product>) inputStream.readObject();

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public void giamax(){

    }

}

