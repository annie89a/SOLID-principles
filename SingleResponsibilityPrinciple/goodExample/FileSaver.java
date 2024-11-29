package com.fundSOLID.SingleResponsibilityPrinciple.goodExample;

import java.io.FileWriter;
import java.io.IOException;

public class FileSaver {
    public void saveToFile(String report, String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(report);
            System.out.println("Report saved to file: " + filePath);
        } catch (IOException e) {
            System.err.println("Error saving report to file: " + e.getMessage());
        }
    }
}
