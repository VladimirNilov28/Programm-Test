
package programm.test;

import java.util.Random;
import java.util.Scanner;

public class ProgrammTest {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    
    public static void main(String[] args) {
        int userAns1 = -1, userAns2 = -1, userAns3 = -1, userAns4 = -1, userAns5 = -1,max = 10, min = 0,
                a = -1, b = -1, ex1 = -1, ex2 = -1, ex3 = -1, ex4 = -1, ex5 = -1,
                c1 = -1, c2 = -1, c3 = -1, c4 = -1, c5 = -1, d = 1;
        System.out.println("Тест проверки знания таблицы умножения");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        while (d == 1){
            a = random.nextInt(max - min + 1);
            b = random.nextInt(max - min + 1);
            System.out.printf(a+" * "+b+" = ");
            userAns1 = scanner.nextInt();
            ex1 = (int)a*(int)b;
            if (userAns1 == ex1){
                c1=1;
                System.out.println(ProgrammTest.ANSI_GREEN + "Правильно" + ProgrammTest.ANSI_RESET);
            }
            else{
                c1=0;
                System.out.println(ProgrammTest.ANSI_RED + "Неправильно" + ProgrammTest.ANSI_RESET);
            }

            a = random.nextInt(max - min + 1);
            b = random.nextInt(max - min + 1);
            System.out.printf(a+" * "+b+" = ");
            userAns2 = scanner.nextInt();
            ex2 = (int)a*(int)b;
            if (userAns2 == ex2){
                c2=1;
                System.out.println(ProgrammTest.ANSI_GREEN + "Правильно" + ProgrammTest.ANSI_RESET);
            }
            else{
                c2=0;
                System.out.println(ProgrammTest.ANSI_RED + "Неправильно" + ProgrammTest.ANSI_RESET);
            }

            a = random.nextInt(max - min + 1);
            b = random.nextInt(max - min + 1);
            System.out.printf(a+" * "+b+" = ");
            userAns3 = scanner.nextInt();
            ex3 = (int)a*(int)b;
            if (userAns3 == ex3){
                c3=1;
                System.out.println(ProgrammTest.ANSI_GREEN + "Правильно" + ProgrammTest.ANSI_RESET);
            }
            else{
                c3=0;
                System.out.println(ProgrammTest.ANSI_RED + "Неправильно" + ProgrammTest.ANSI_RESET);
            }

            a = random.nextInt(max - min + 1);
            b = random.nextInt(max - min + 1);
            System.out.printf(a+" * "+b+" = ");
            userAns4 = scanner.nextInt();
            ex4 = (int)a*(int)b;
            if (userAns4 == ex4){
                c4=1;
                System.out.println(ProgrammTest.ANSI_GREEN + "Правильно" + ProgrammTest.ANSI_RESET);
            }
            else{
                c4=0;
                System.out.println(ProgrammTest.ANSI_RED + "Неправильно" + ProgrammTest.ANSI_RESET);
            }

            a = random.nextInt(max - min + 1);
            b = random.nextInt(max - min + 1);
            System.out.printf(a+" * "+b+" = ");
            userAns5 = scanner.nextInt();
            ex5 = (int)a*(int)b;
            if (userAns5 == ex5){
                c5=1;
                System.out.println(ProgrammTest.ANSI_GREEN + "Правильно" + ProgrammTest.ANSI_RESET);
            }
            else{
                c5=0;
                System.out.println(ProgrammTest.ANSI_RED + "Неправильно" + ProgrammTest.ANSI_RESET);
            }
            int mark = (int)c1+(int)c2+(int)c3+(int)c4+(int)c5;
            if (mark == 5){
                System.out.println("Ваша оценка 5, молодец!");
            }
            else if (mark == 4 | mark == 3){
                System.out.println("Ваша оценка"+ mark +",надо бы еще поучить");
            }
            else{
                System.out.println("Ваша оценка "+ mark +",cрочно нужно учить таблицу умножения!");
            }
            System.out.println("Хотите ли перепройти тест?\n"+"1 - да\n"+"2 - нет\n");
            d = scanner.nextInt();
        }        
    }
    
}
