package lesson15;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class MainArrayDeque {
    public static void main(String[] args) {
        //ArrayDeque - очередь, которая может работать в режимах FIFO(очередь) LIFO(stack)
        //ArrayDeque не допускает null
        //ArrayDeque быстрее чем LinkedList
        ArrayDeque<String> names = new ArrayDeque<>();

        //Очередь (FIFO)
        //names.offerLast(); - добавление эл-та в конец очереди
        //names.pollFirst(); - удалить и вернуть первый эл-т
        //names.peekFirst(); - просмотреть первый эл-т(без удаления)

        //Example Fifo:
        //names.offerLast("Anton");
        //names.offerLast("Boris");
        //names.offerLast("Cris");
        //System.out.println(names.pollFirst());

        //Стек (LIFO)
        //names.push(); - добавить эл-т в стек
        //names.pop(); - удалить и вернуть последний добавленный в стек
        //names.peek(); - посмотреть последний добавленный эл-т в стеке

        //Example
        //names.push("Anton");
        //names.push("Boris");
        //names.push("Cris");
        //names.pop();
        //System.out.println(names.peek());

        System.out.println(names);
        //names.offerFirst() - добавить в начало
        //names.offerLast() - добавить в конец
        //names.pollFirst() - удалить из начала
        //names.pollLast() - удалить из конца
        //names.peekFirst() - посмотреть начало
        //names.peekLast() - посмотреть конец
    }
}
