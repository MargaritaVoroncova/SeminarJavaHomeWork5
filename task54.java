// Расставить на шахматной доске 8 ферзей так, чтобы они не били друг друга

import java.util.ArrayList;
import java.util.Random;

public class task54 {

    public static void main(String[] args) {
        int[][] desk = new int[8][8];
        int letter = 3;
        int num = 2;
        desk[letter][num] = 1;
        System.out.printf("%d %d", letter, num);
        System.out.println();
        ArrayList<String> queens = new ArrayList<>();
        String que = Integer.toString(letter) + " " + Integer.toString(num);
        queens.add(que);
        desk = Desk(desk, letter, num);
        PrintArray(desk);
        String[] str = Max(desk);
        letter = Integer.parseInt(str[1]);
        num = Integer.parseInt(str[2]);

        System.out.printf("%d %d", letter, num);
        System.out.println();
        que = Integer.toString(letter) + " " + Integer.toString(num);
        queens.add(que);

        desk = Desk(desk, letter, num);
        PrintArray(desk);
        str = Max(desk);
        letter = Integer.parseInt(str[1]);
        num = Integer.parseInt(str[2]);

        System.out.printf("%d %d", letter, num);
        System.out.println();
        que = Integer.toString(letter) + " " + Integer.toString(num);
        queens.add(que);

        desk = Desk(desk, letter, num);
        PrintArray(desk);

        str = Max(desk);
        letter = Integer.parseInt(str[1]);
        num = Integer.parseInt(str[2]);

        System.out.printf("%d %d", letter, num);
        System.out.println();
        que = Integer.toString(letter) + " " + Integer.toString(num);
        queens.add(que);

        desk = Desk(desk, letter, num);
        PrintArray(desk);
        str = Max(desk);
        letter = Integer.parseInt(str[1]);
        num = Integer.parseInt(str[2]);

        System.out.printf("%d %d", letter, num);
        System.out.println();
        que = Integer.toString(letter) + " " + Integer.toString(num);
        queens.add(que);

        desk = Desk(desk, letter, num);
        PrintArray(desk);

        str = Max(desk);
        letter = Integer.parseInt(str[1]);
        num = Integer.parseInt(str[2]);

        System.out.printf("%d %d", letter, num);
        System.out.println();
        que = Integer.toString(letter) + " " + Integer.toString(num);
        queens.add(que);

        desk = Desk(desk, letter, num);
        PrintArray(desk);

        str = Max(desk);
        letter = Integer.parseInt(str[1]);
        num = Integer.parseInt(str[2]);

        System.out.printf("%d %d", letter, num);
        System.out.println();
        que = Integer.toString(letter) + " " + Integer.toString(num);
        queens.add(que);

        desk = Desk(desk, letter, num);
        PrintArray(desk);

        str = Max(desk);
        letter = Integer.parseInt(str[1]);
        num = Integer.parseInt(str[2]);

        System.out.printf("%d %d", letter, num);
        System.out.println();
        que = Integer.toString(letter) + " " + Integer.toString(num);
        queens.add(que);

        desk = Desk(desk, letter, num);
        PrintArray(desk);

        System.out.println(queens);
    }

    public static int[][] Desk(int[][] desk, int letter, int num) {
        for (int i = 0; i < desk[0].length; i++) {
            desk[i][num] = 1;
        }
        for (int i = 0; i < desk[1].length; i++) {
            desk[letter][i] = 1;
        }
        int letter1 = letter;
        int num1 = num;
        while (letter1 > 0 && num1 > 0) {
            letter1--;
            num1--;
        }
        int i = letter1;
        int j = num1;
        while (i < letter || j < num) {
            desk[i][j] = 1;
            i++;
            j++;
        }

        letter1 = letter;
        num1 = num;
        while (letter1 < 7 && num1 < 7) {
            letter1++;
            num1++;
        }
        i = letter1;
        j = num1;
        while (i > letter || j > num) {
            desk[i][j] = 1;
            i--;
            j--;
        }

        letter1 = letter;
        num1 = num;
        while (letter1 < 7 && num1 > 0) {
            letter1++;
            num1--;
        }
        i = letter1;
        j = num1;
        while (i > letter || j < num) {
            desk[i][j] = 1;
            i--;
            j++;
        }

        letter1 = letter;
        num1 = num;
        while (letter1 < 7 && num1 < 7) {
            letter1++;
            num1++;
        }
        i = letter1;
        j = num1;
        while (i > letter || j > num) {
            desk[i][j] = 1;
            i--;
            j--;
        }

        letter1 = letter;
        num1 = num;
        while (letter1 > 0 && num1 < 7) {
            letter1--;
            num1++;
        }
        i = letter1;
        j = num1;
        while (i < letter || j > num) {
            desk[i][j] = 1;
            i++;
            j--;
        }

        return desk;
    }

    public static void PrintArray(int[][] array) {
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array[1].length; j++) {
                System.out.printf("%d ", array[i][j]);
            }
            System.out.println();
        }
    }

    public static int Null(int[][] array) {
        int count = 0;
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array[1].length; j++) {
                if (array[i][j] == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static String[] Max(int[][] desk) {
        int[][] desk1 = new int[8][8];
        int letter = 0;
        int num = 0;
        ArrayList<String> nullOne = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < desk[0].length; i++) {
            for (int j = 0; j < desk[1].length; j++) {
                desk1[i][j] = desk[i][j];
            }
        }
        for (int i = 0; i < desk1[0].length; i++) {
            for (int j = 0; j < desk1[1].length; j++) {
                if (desk1[i][j] == 0) {
                    letter = i;
                    num = j;
                    desk1 = Desk(desk1, letter, num);
                    count = Null(desk1);
                    desk1 = new int[8][8];
                    for (int i1 = 0; i1 < desk[0].length; i1++) {
                        for (int j1 = 0; j1 < desk[1].length; j1++) {
                            desk1[i1][j1] = desk[i1][j1];
                        }
                    }
                }
                nullOne.add(count + " " + i + " " + j);
                count = 0;
            }
        }
        String[] str = nullOne.get(0).split(" ");
        int max = Integer.parseInt(str[0]);
        letter = Integer.parseInt(str[1]);
        num = Integer.parseInt(str[2]);
        for (int i = 0; i < nullOne.size(); i++) {
            str = nullOne.get(i).split(" ");
            int b = Integer.parseInt(str[0]);
            if (max < b) {
                max = b;
                letter = Integer.parseInt(str[1]);
                num = Integer.parseInt(str[2]);
            }
        }
        if (max > 0) {
            str[0] = Integer.toString(max);
            str[1] = Integer.toString(letter);
            str[2] = Integer.toString(num);
        } else {
            for (int i = 0; i < desk1[0].length; i++) {
                for (int j = 0; j < desk1[1].length; j++) {
                    if (desk1[i][j] == 0) {
                        str[0] = Integer.toString(max);
                        str[1] = Integer.toString(i);
                        str[2] = Integer.toString(j);
                    }
                }
            }
        }

        System.out.println(nullOne);

        return str;
    }
}