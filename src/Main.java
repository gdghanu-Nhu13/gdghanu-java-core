import java.util.*;

class ListComparison {
    public static void main(String[] args) {
        // Khởi tạo
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Thêm phần tử
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        // Truy xuất phần tử
        System.out.println("ArrayList get(1): " + arrayList.get(1)); // Nhanh
        System.out.println("LinkedList get(1): " + linkedList.get(1)); // Chậm hơn

        // Xóa phần tử ở giữa
        arrayList.remove(1);
        linkedList.remove(1);

        System.out.println("ArrayList sau khi xóa: " + arrayList);
        System.out.println("LinkedList sau khi xóa: " + linkedList);
    }
}
