import java.util.Scanner;
public class timgiatritrongmang {
    public static void main(String[] args) {
        String[] students = {"A", "B", "C", "D", "E", "F", "Z"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chữ: ");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Position of the students in the list " + input_name + " is: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found" + input_name + " in the list.");
        }
    }
}
