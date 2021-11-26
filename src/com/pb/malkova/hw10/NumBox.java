package com.pb.malkova.hw10;

public class NumBox<T extends Number> {
    private final T[] numbers;
    private final int size;
    private double sum;
    private int length;

    public NumBox(int size) {
        numbers = (T[]) new Number[size];
        this.size = size;
        this.length = 0;
        this.sum = 0;
    }

    public void add(T num) throws ArrayIndexOutOfBoundsException {
        if (length() >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        numbers[length] = num;
        sum += num.doubleValue();
        length++;
    }

    public T get(int index) {
        return numbers[index];
    }

    public int length() {
        return length;
    }

    public double average() {
        double average = 0;
        if (numbers.length > 0) {
            sum();
        }
        average = sum / length;
        return average;
    }

    public double sum() {
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i].doubleValue();
        }
        return sum;
    }

    public T max() {
        T max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].doubleValue() > max.doubleValue()) {
                max = numbers[i];
            }
        }
        return max;

    }

    public void print() {
        System.out.println("Максимальный размер: " + size + ", текущий размер: " + length);
        for (int i = 0; i < length; i++) {
            if (i > 0) System.out.print(", ");
            System.out.print(this.get(i));
        }
        System.out.println();
        System.out.println("Максимальный элемент: " + max());
        System.out.println("Сумма всех элементов: " + sum());
        System.out.println("Среднее значение: " + average());

    }
}
