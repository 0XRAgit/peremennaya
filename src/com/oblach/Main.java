package com.oblach;


import sun.misc.VM;

public class Main {

    public static void main(String[] args) {

	    byte bytePer=1; // 1 байт. от -128 до 127

        short shortPer=2; // 2 байта. от -32768 до 327673

        int intPer=4; // 4 байта. от -2147483648 до 2147483647

        long longPer=8; // 8 байт. от -9223372036854775808 до 9223372036854775807

        float floatPer=4.0f; // 4 байта. от 1,4*10^45 до 3,4*10^38

        double doublePer=8.6; // 8 байт. от 4,9*10^324 до 1,8*10^308

        char charPer='2'; // Unicode ASCII, 2 байта.

        boolean booleanPer=true; // 1 байт.

        String stringPer="А Игорёк - мусор!"; // Пустой, не нуловый = 24 байта. Каждый уникальный символ в строке + 16 байт.

        System.out.println(bytePer);

        System.out.print(shortPer);
        System.out.print(intPer);

        System.out.println("\nlongPer = "+longPer);

        System.out.println("\nПросто текст\n");

        System.out.println("intPer+longPer="+(longPer+intPer));
        System.out.println("intPer+longPer="+longPer+intPer);

        System.out.println("\nfloatPer="+floatPer);

        System.out.println("\ndoublePer="+(byte)doublePer);

        System.out.println(charPer);
        System.out.println("Нас было "+charPer+" человеков");

        charPer='A';

        System.out.println("\n"+charPer);
        System.out.println("Нас было "+charPer+" человеков");

        System.out.println("charPer="+(int)charPer);
        System.out.println("charPer+1="+(char)(121));

        System.out.println("int*double="+longPer*floatPer);

        System.out.println("\n12+3="+(12+3));
        System.out.println("12-3="+(12-3.0));
        System.out.println("12*3="+(12*3));
        System.out.println("13/3="+(13/3));
        System.out.println("13/3="+(13/3.0));

        intPer=13/3;
        System.out.println("\nintPer="+intPer);

        System.out.println("\n13%3="+(13%3.0));

        int firstNumber=77; boolean example=true;

        firstNumber+=3;
        System.out.println("\nfirstNumber="+firstNumber);

        firstNumber*=10;
        System.out.println("\nfirstNumber*=10 = "+firstNumber);

        System.out.println("\nfirstNumber+1 = "+(firstNumber+1));
        System.out.println("firstNumber = "+firstNumber);

        System.out.println("\n++firstNumber = "+(++firstNumber));
        System.out.println("firstNumber = "+firstNumber);

        System.out.println("\nfirstNumber++ = "+(firstNumber++));
        System.out.println("firstNumber = "+firstNumber);

        System.out.println("\n--firstNumber = "+(--firstNumber));
        System.out.println("firstNumber = "+firstNumber);

        System.out.println("\nfirstNumber-- = "+(firstNumber--));
        System.out.println("firstNumber = "+firstNumber);
    }
}

    /*
	1) Объявить три переменные типа int и присвоить первой числовое значение,
	вторая переменная равна первой переменной увеличенной на 3, а третья переменная
	равна сумме первых двух.

	2)Создайте 4 переменные с разными типами данных и
	предложите пользователю ввести в них значения.
	После ввода, отобразите их на экране.

	3)Вывести на экран текст в таком виде одним методом:

	Не те
	бляди,
	что хлеба
	ради
	спереди
	и сзади
	дают нам
	ебти,
	Бог их прости!
	А те бляди -
	лгущие,
	деньги
	сосущие,
	еть
	не дающие -
	вот бляди
	сущие,
	мать их ети!
			(c) В. В. Маяковский

	4)Пользователь должен ввести 2 числа.
	Вам надо показать на экран произведение этих чисел, сумму и разницу.
	Покажите так же среднее арифметическое этих введенных чисел.

*/
