//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //syncFuntionExample();
        asyncFuntionExample();
    }
    static void asyncFuntionExample() {
        System.out.println("Bắt đầu");

        Thread thread = new Thread(() -> doTaskAsync());

        thread.start();

        System.out.println("Kết thúc");
    }
    static void doTaskAsync() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Tác vụ đã hoàn thành");
    }
    static void syncFuntionExample(){
        System.out.println("Bắt đầu");
        doTask();
        System.out.println("Kết thúc");
    }
    static void doTask() {
        try {
            Thread.sleep(2000);
            System.out.println("Task đã hoàn thành");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}