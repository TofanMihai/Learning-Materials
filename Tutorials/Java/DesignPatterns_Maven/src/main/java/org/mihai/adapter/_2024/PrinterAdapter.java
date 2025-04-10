package org.mihai.adapter._2024;


// Adapter
class PrinterAdapter implements Printer {
    private final LegacyPrinter legacyPrinter;

    PrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    @Override
    public void print() {
        // New logic and old logic from our adaptee
        legacyPrinter.printDocument();
    }
}