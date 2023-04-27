package Task;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task07 {
    private Map<String, Set<String>> phoneBook;

    public Task07() {
        phoneBook = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, new HashSet<>());
        }
        phoneBook.get(name).add(phoneNumber);
    }

    public Set<String> getPhoneNumbers(String name) {
        return phoneBook.getOrDefault(name, new HashSet<>());
    }


}


