import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        //1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
       System.out.println("Task1");
       String[] arrStr = {"A", "B", "C", "D", "E"};
       Integer[] arrInt = {1, 2, 3, 4, 5, 6};

       swap(arrInt, 0, 4);
       swap(arrStr, 1, 2);

       // 2. Написать метод, который преобразует массив в ArrayList;
        System.out.println("Task2");
        arrToArrList(arrStr);

        //3. Большая задача:
        //a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)
        //b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
        //c. Для хранения фруктов внутри коробки можете использовать ArrayList;
        //d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
        //e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той, которую подадут в compare в качестве параметра, true - если их веса равны, false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
        //f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку(помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами), соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;
        //g. Не забываем про метод добавления фрукта в коробку.

        System.out.println("Task3");
        Box<Fruit> box1 = new Box<>();
        Box<Orange> boxOrange = new Box<>();
        Box<Apple> boxApple = new Box<>();
        //Добавим в коробку для апельсинов 1 апельсин
        System.out.println("Вес boxOrange до добавления яблока = " + boxOrange.getWeight());
        boxOrange.addFruit(new Orange());
        System.out.println("Вес boxOrange после добавления 1 яблока = " + boxOrange.getWeight());
        boxOrange.transfer(box1);
        System.out.println("Вес boxOrange после перекладывания яблока в box1 = " + boxOrange.getWeight());
        System.out.println("Вес box1 после перекладывания яблока из boxOrange = " + box1.getWeight());
        System.out.println();
        //Добавим в коробку для яблок 3 яблока
        System.out.println("Вес boxApple до добавления апельсинов = " + boxApple.getWeight());
        boxApple.addFruit(new Apple());
        boxApple.addFruit(new Apple());
        boxApple.addFruit(new Apple());
        System.out.println("Вес boxApple после добавления 3х апельсинов= " + boxApple.getWeight());
        Box<Fruit> box2 = new Box<>();
        boxApple.transfer(box2);
        System.out.println("Вес boxApple после перекладывания апельсинов в box2 = " + boxApple.getWeight());
        System.out.println("Вес box2 после перекладывания апельсинов из boxApple = " + box2.getWeight());
    }

    public static void swap(Object[] arr, int j1, int j2)
    {
        System.out.println("Array before swap: " + Arrays.toString(arr));
        Object temp = arr[j1];
        arr[j1] = arr[j2];
        arr[j2] = temp;
        System.out.println("Array after swap: " + Arrays.toString(arr));
    }

    public static  <T> void arrToArrList(T[] arr){
        ArrayList<T> arrayList = new ArrayList<>(Arrays.asList(arr));
        System.out.println(arrayList);
    }
}
