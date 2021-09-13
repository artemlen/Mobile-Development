/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
		
	//1	
	System.out.println("Hello World");
	
	//2
	int a = 12;
	System.out.println("2 задание");
	System.out.println(a);
	//3
	int b = 0;
	b = b + 1;
	b++;
	System.out.println("3 задание");
	System.out.println(b);
	//4
	// 1 способ
	int c = 45;
	int d = 54;
	int g;
	g = c;
	c = d;
	d = g;
	System.out.println("4 задание (1 способ)");
	System.out.println(c);
	System.out.println(d);
	// 2 способ
	System.out.println("4 задание (2 способ)");
	int c1 = 45;
	int d1 = 54;
	c1 = c1+d1;
	d1 = c1-d1;
	c1 = c1-d1;
	System.out.println(c1);
	System.out.println(d1);
	//5
	int kat1 = 3;
	int kat2 = 4;
	double gip;
	gip = Math.sqrt (kat1*kat1+kat2*kat2);
	System.out.println("5 задание");
	System.out.println(gip);
	
	//6
	int u = 123;
	System.out.println("6 задание");
	System.out.println(u%10);
	
	//7
	int u1 = 134;
	System.out.println("7 задание");
	System.out.println((u1%100)/10);
	
	//8
	int dec = 75;
	System.out.println("8 задание");
	System.out.println(dec/10);
	
	//9
	System.out.println("9 задание");
    int x = scanner.nextInt();
	x = Math.abs(x-21);
	System.out.println(x);
	
	//10
    System.out.println("10 задание");
    int x1 = scanner.nextInt();
    int x2 = scanner.nextInt();
    System.out.println((x1+x2)/2);
    
    //11
    System.out.println("11 задание");
    int x3 = scanner.nextInt();
    int x4 = scanner.nextInt();
    System.out.println(Math.sqrt(x3 * x4));
    
    //12
    System.out.println("12 задание");
    System.out.println("Введите координату x1");
    double m1 = scanner.nextInt();
    System.out.println("Введите координату y1");
    double n1 = scanner.nextInt();
    
    System.out.println("Введите координату х2");
    double m2 = scanner.nextInt();
    System.out.println("Введите координату y2");
    double n2 = scanner.nextInt();
    double dlina = Math.sqrt(((m2-m1)*(m2-m1))+((n2-n1)*(n2-n1)));
    System.out.print("Ответ: ");
    System.out.print(dlina);
	}
}
