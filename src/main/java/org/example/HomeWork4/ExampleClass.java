package org.example.HomeWork4;

public class ExampleClass {
    public float triangleSquare(int a, int b, int c) throws MyException {
        if (square(a,b,c)) {
            throw new MyException ("Это ошибка - такого треугольника не бывает");
        } else {
            float p = (float) (a + b + c) / 2;
            float result = (float) Math.sqrt(p* (p-a) * (p-b) * (p-c));
return result;
        }

    }
    private boolean square(int a, int b, int c){
return a < 0 || b < 0 || c < 0 || a == 0 || b == 0 || c == 0;
    }
}
