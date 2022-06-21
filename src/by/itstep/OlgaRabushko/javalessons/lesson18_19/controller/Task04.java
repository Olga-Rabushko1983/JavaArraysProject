package by.itstep.OlgaRabushko.javalessons.lesson18_19.controller;

import by.itstep.OlgaRabushko.javalessons.lesson18_19.modelLogic.ArraySorter;
import by.itstep.OlgaRabushko.javalessons.lesson18_19.modelLogic.ArrayWorker;
import by.itstep.OlgaRabushko.javalessons.lesson18_19.util.ArrayInitializer;
import by.itstep.OlgaRabushko.javalessons.lesson18_19.util.Convertor;
import by.itstep.OlgaRabushko.javalessons.lesson18_19.view.Printer;

import java.util.Scanner;

public class Task04 { public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int size;
    do {
        Printer.print("Input size of array");
        size = scanner.nextInt();
    }
    while (size <= 0);
    int[] array = new int[size];
    //ArrayInitializer.userInit(array);
    ArrayInitializer.randomeInt(array);

    Printer.print("Array before sort:"+ Convertor.toString(array));
    ArraySorter.selectedSortAcs(array);
    Printer.print("\nArray after sort:"+Convertor.toString(array));

    ArrayWorker.reverse(array);
    Printer.print("\nArray after reverse:"+Convertor.toString(array));
}
}

