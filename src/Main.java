import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        task1(nums);

        task2(nums);

        List<String> words = new ArrayList<>(List.of("машина", "автобус", "трамвай", "самолет", "ролики",
                "мотоцикл", "автобус", "ролики", "вертолет", "трамвай", "велосипед"));
        task3(words);

        task4(words);
    }

    private static void task1(List<Integer> list){
        for (Integer i:list) {
            System.out.print(i % 2 != 0 ? i + ", " : "" );
        }
        System.out.println();
    }
    private static void task2(List<Integer> list){
        Set<Integer> set = new HashSet<>(list);
        list = new ArrayList<>(set);
        list.sort(Integer::compareTo);
        for (Integer i:list) {
            System.out.print(i % 2 == 0 ? i + ", " : "" );
        }
        System.out.println();
    }
    private static void task3(List<String> list){
        Set<String> set = new HashSet<>(list);
        System.out.println(set);
    }
    private static void task4(List<String> list){
        HashMap<String, Integer> map = new HashMap<>();
        for (String s: list) {
            map.merge(s, 1, Integer::sum);
        }
        for (Map.Entry<String, Integer> e:map.entrySet()) {
            if (e.getValue() > 1) {
                System.out.print(e.getValue() + ", ");
            }
        }
        System.out.println();
    }
}