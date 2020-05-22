package lesson12;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println(Apple.JONATHAN);
        Arrays.stream(Apple.values()).forEach(System.out::println);
        Apple apple = Apple.valueOf("WINESAP");
        switch (apple){
            case RED:
                System.out.println(" Хочет заказать"+ Apple.RED);
                break;
            case JONATHAN:
                System.out.println(" Хочет заказать"+Apple.JONATHAN);
                break;
            case GOLDEN:
                System.out.println(" Хочет заказать"+Apple.GOLDEN);
                break;
            case WINESAP:
                System.out.println(" Хочет заказать"+Apple.WINESAP);
                break;
            case UNKNOWN:
                System.out.println(" Хочет заказать"+Apple.RED);
                break;
        }
    }

    public enum Apple{
        JONATHAN,
        GOLDEN,
        RED,
        WINESAP,
        UNKNOWN
    }
    public enum OrderStatus{
        NEW,
        IN_PROGRESS,
        DONE,
        ERROR
    }
}
