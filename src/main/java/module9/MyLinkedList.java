package module9;

public class MyLinkedList<V> {
   static class Node<V> {
        Object value;
        Node prev;
        Node next;

        Node(V value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        this.size = 0;
    }

    public void add(V value) {
        Node node = new MyLinkedList.Node(value);
        if (size == 0) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
    }

    public void clear() {
        size = 0;
        tail = null;
        head = null;
    }

    public int size() {
        return size;
    }

    public V get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Не верный индекс");
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return (V) current.value;
    }


    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Не верный индекс");
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            if (current.next != null) {
                current.next.prev = current.prev;
            } else {
                tail = current.prev;
            }
            size--;
        }

    }

}


//    Написать свой класс MyLinkedList как аналог классу LinkedList.

//    Нельзя использовать массив. Каждый элемент должен быть отдельным объектом-посредником(Node - нода)
//    который хранит ссылку на предыдущий и следующий элемент коллекции (двусвязный список).
//
//    Методы
//
//    add(Object value) добавляет элемент в конец
//    remove(int index) удаляет элемент под индексом
//    clear() очищает коллекцию
//    size() возвращает размер коллекции
//    get(int index) возвращает элемент под индексом

