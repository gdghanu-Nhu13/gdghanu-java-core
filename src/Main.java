/*
import java.util.*;

 class ListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Nhu");
        names.add("Linh");
        names.add("Anh");
        names.add("Nhu"); // Trùng lặp vẫn được chấp nhận

        System.out.println("List: " + names);
        // ở list muốn in riêng từng thứ tự các tên cũng có thể dùng cách này
        names.get(0);
    }
}
*/

/*import java.util.*;

class SetExample {
    public static void main(String[] args) {
        Set<String> uniqueNames = new HashSet<>();
        uniqueNames.add("Nhu");
        uniqueNames.add("Linh");
        uniqueNames.add("Anh");
        uniqueNames.add("Nhu"); // Bị loại bỏ vì đã tồn tại

        System.out.println("Set: " + uniqueNames);

        // ở set thường thì nó ko duy trì trật tự các thứ tự nên các ptu không có chỉ số, nên để truy cậvafavaof ptu của
        set thì tường phải lọc qua toàn bộ set, v để làm đc thì dùng foreach
      uniqueNames.forEach(name -> System.out.println(name));

        uniqueNames.remove("Nhu"); xóa
        System.out.println(uniqueNames.contains(Nhu)); ktra xem nhu co trong set không
        System.out.printl(uniqueNames.size()); ktra xem độ lớn của set
        System.out.println(uniqueNames.isEmpty()); ktra xem set có rỗng ko, nếu trả về true thì là rỗng

nói chung dùng set khi mà muốn loại bỏ các phần tử trùng lawpj, và ko quan tâm thứ tự
}*/

/*import java.util.*;

class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Nhu");
        students.put(2, "Linh");
        students.put(3, "Anh");
        students.put(1, "Minh"); // Ghi đè giá trị của key 1

        System.out.println("Map: " + students);
    }
}*/


