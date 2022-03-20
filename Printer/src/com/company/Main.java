package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));

        System.out.println(printer.getPagesPrinted());

        System.out.println(printer.printPages(4) + " and " + printer.getPagesPrinted());
        System.out.println(printer.printPages(2) + " and " + printer.getPagesPrinted());

    }
}
