package org.mihai.adapter._2024;

public class DriverClass {

    public static void main(String[] args) {
        LegacyPrinter legacyPrinter = new LegacyPrinter();

        Printer printerAdapter = new PrinterAdapter(legacyPrinter);
        printerAdapter.print();
    }
}
