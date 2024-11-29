package com.fundSOLID.SingleResponsibilityPrinciple.goodExample;

public class Main {
    public static void main(String[] args) {
        //Note: here, each class has a single responsibility
        // Step 1: Generate the report
        ReportGenerator reportGenerator = new ReportGenerator();
        String report = reportGenerator.generateReport();

        // Step 2: Save the report to a file
        FileSaver fileSaver = new FileSaver();
        String filePath = "report.txt"; // Specify file path
        fileSaver.saveToFile(report, filePath);

        // Step 3: Print the report
        Printer printer = new Printer();
        printer.print(report);
    }
}
