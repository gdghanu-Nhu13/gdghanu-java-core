//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
enum PizzaStatus {
    order(5),
    prepare(10),
    delivery(15);
    int time;
    // mỗi gtri enum là 1 instance cuar enum đó
    PizzaStatus(int time) {
        this.time = time;
    }
}

class EnumExample {
    public static void main(String[] args) {
        PizzaStatus status = PizzaStatus.order;
        if(status == PizzaStatus.order) {
            System.out.println("Pizza has already ordered");
        }
        // neu muon in ra tat ca ptu
        for(PizzaStatus s : PizzaStatus.values()) {
            System.out.println(s);
        }
        // neu muon cac trang thai order co time nhat dinh co the dung field
        System.out.println(PizzaStatus.delivery.time);
        // khi tạo các trường dl cho enum cần dùng final đam bảo gtri các trường ko thay đổi

    }
}
// nói chung enum là mục đich đảm bảo các gtri ko thay đổi