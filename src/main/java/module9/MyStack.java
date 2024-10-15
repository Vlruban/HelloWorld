package module9;

public class MyStack <V>{
    private MyStack<V>[] stackArray;
    private int top;

    public MyStack(int indexLength) {
        stackArray = new MyStack[indexLength];
        top = -1;
    }

    public void push(V value) {
        if (top == stackArray.length - 1) {
            System.out.println("Стек переполнен");
            return;
        }
        stackArray[++top] = (MyStack<V>) value;
    }

    public V pop() {
        if (top == -1) {
            System.out.println("Стек пуст");
            return null;
        }
        return (V)stackArray[top--];
    }

    public V peek() {
        if (top == -1) {
            System.out.println("Стек пуст");
            return null;
        }
        return (V)stackArray[top];
    }

    public void remove(int index) {
        if (index < 0 || index > top) {
            System.out.println("Неверный индекс");
            return;
        }
        for (int i = index; i < top; i++) {
            stackArray[i] = stackArray[i + 1];
        }
        top--;
    }

    public void clear() {
        top = -1;
    }

    public int size() {
        return top + 1;
    }





//    Написать свой класс MyStack как аналог классу Stack, который работает по принципу LIFO (last-in-first-out).
//
//    Можно делать либо с помощью Node либо с помощью массива.
//
//    Методы
//
//    push(Object value) добавляет элемент в конец
//    remove(int index) удаляет элемент под индексом
//    clear() очищает коллекцию
//    size() возвращает размер коллекции
//    peek() возвращает первый элемент в стеке (LIFO)
//    pop() возвращает первый элемент в стеке и удаляет его из коллекции
}
