import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import java.util.*;

public class Main {
    private Map<String, Set<String>> phoneBook;

    public Main() {
        phoneBook = new HashMap<>();
    }

    // Добавление нового номера телефона для имени
    public void addPhoneNumber(String name, String phoneNumber) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, new HashSet<>());
        }
        phoneBook.get(name).add(phoneNumber);
    }

    // Вывод телефонной книги, отсортированный по убыванию числа телефонов
    public void printSortedPhoneBook() {
        List<Map.Entry<String, Set<String>>> entries = new ArrayList<>(phoneBook.entrySet());
        entries.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));

        for (Map.Entry<String, Set<String>> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Main phoneBook = new Main();
        phoneBook.addPhoneNumber("Alice", "123456");
        phoneBook.addPhoneNumber("Alice", "654321");
        phoneBook.addPhoneNumber("Bob", "111111");
        phoneBook.addPhoneNumber("Bob", "222222");
        phoneBook.addPhoneNumber("Bob", "333333");
        phoneBook.addPhoneNumber("Charlie", "444444");

        phoneBook.printSortedPhoneBook();
    }
}
