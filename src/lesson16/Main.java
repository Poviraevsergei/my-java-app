package lesson16;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Коллекции(Основные) Map: HashMap, TreeMap, LinkedHashMap, Hashtable;
        User user1 = new User();
        user1.name = "A";

        User user2 = new User();
        user2.name = "B";

        //Кэш
        HashMap<Integer, User> users = new HashMap<>();

        //добавление (ключи уникальные, значения могут дублироваться!)
        users.put(1, user1);
        users.put(2, user2);
        users.put(null, user2);

        //Получение ключей
        Set<Integer> keys = users.keySet();
        System.out.println(keys);

        HashSet<Integer> keysFromMap = new HashSet<>(keys);

        //Получение всех значений
        Collection<User> allUsers = users.values();
        System.out.println(allUsers);
        //Преобразование в ArrayList
        ArrayList<User> valuesFromMap = new ArrayList<>(users.values());


        //удалить
        users.remove(2);
        users.remove(2, new User());

        //заменить
        users.replace(1, new User());
        users.replace(2, user2,  new User());

        //получение значение по ключу
        User user = users.get(1);
        user = users.getOrDefault(10, user1);

        System.out.println(user.name);

        //есть ли ключ/значения
        users.isEmpty();

        //есть ли подходящий ключ/значение
        System.out.println(users.containsKey(1));
        System.out.println(users.containsValue(1));

        System.out.println(user);

        //очистить мапу
        users.clear();
    }
}
