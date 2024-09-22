package org.example;

import java.util.Arrays;
import java.util.HashMap;

public class MyHashMap<K, V> {
    private MyHashMap map[] = new MyHashMap[0];


    public void put(Object key, Object value) {
        if (Arrays.asList(map).contains(key)) {
            System.out.println("Данный ключ уже использует");
        } else {
            map = Arrays.copyOf(map, map.length + 2);
            map[map.length - 2] = (MyHashMap) key;
            map[map.length - 1] = (MyHashMap) value;
        }
    }

    public void remove(Object key) {
        if (!Arrays.asList(map).contains(key)) {
            System.out.println("Данный ключ не найден");
        } else {
            int indexKey = 0;
            MyHashMap[] temp = new MyHashMap[map.length - 2];
            for (Object o : map) {
                if (o == key) {
                    break;
                }
                indexKey++;
            }
            for (int i = 0; i < map.length; i++) {
                if (indexKey != i && indexKey + 1 != i) {
                    temp[i] = map[i];
                }
            }
            map = Arrays.copyOf(temp, temp.length);
        }
    }

    public void clear() {
        map = Arrays.copyOf(map, 0);
    }

    public int size() {
        return map.length / 2;
    }

    public MyHashMap get(Object key) {
        int indexKey = 0;
        for (Object o : map) {
            if (o == key) {
                break;
            }
            indexKey++;
        }
        return map[indexKey + 1];
    }


//    Написать свой класс MyHashMap как аналог классу HashMap.
//
//    Нужно делать с помощью односвязной Node.
//
//    Не может хранить две ноды с одинаковых ключами одновременно.
//
//            Методы
//
//    put(Object key, Object value) добавляет пару ключ + значение
//    remove(Object key) удаляет пару по ключу
//    clear() очищает коллекцию
//    size() возвращает размер коллекции
//    get(Object key) возвращает значение(Object value) по ключу


}
