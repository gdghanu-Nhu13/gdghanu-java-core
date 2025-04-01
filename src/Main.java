//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Bắt đầu");
        task();
        System.out.println("Kết thúc");
    }

    static void task() {
        try {
            Thread.sleep(2000);
            System.out.println("Task đã hoàn thành");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}