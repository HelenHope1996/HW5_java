// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, 
// что 1 человек может иметь несколько телефонов.
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class task1{
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }

    }
   
    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Петров", 895326134, bookPhone);
        addNumber("Самсонов", 1234, bookPhone);
        addNumber("Петров", 5874123, bookPhone);
        addNumber("Береснев", 891154879, bookPhone);
        addNumber("Васильев", 54789123, bookPhone);
        addNumber("Петров", 89227459, bookPhone);
        addNumber("Самсонов", 94578612, bookPhone);
        printBook(bookPhone);
       }
}