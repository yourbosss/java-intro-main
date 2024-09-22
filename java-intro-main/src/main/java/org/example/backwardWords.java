package org.example;

public class backwardWords {
    public static String backwardWord(String backward) {
        int length = backward.length(); //длина строки.
        StringBuilder backwardWord = new StringBuilder();
        for (int i = length - 1; i >= 0; i--) { //цикл для реверсирования строки.
            backwardWord.append(backward.charAt(i));
        }
        return backwardWord.toString();
    }

    public static void main(String[] args) {
        String backward = "make install"; //возращает результат.
        System.out.println(backwardWord(backward));
    }
}
