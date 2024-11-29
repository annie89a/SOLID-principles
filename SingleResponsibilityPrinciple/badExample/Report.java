package com.fundSOLID.SingleResponsibilityPrinciple.badExample;

class Report {
    //Note: in this way,  this class has multiple responsibilities, producing a bloated class
    public String generateReport() {
        return "Report Data";
    }

    public void saveToFile(String report) {
        // Save report to file
    }

    public void print(String report) {
        // Print the report
    }
}
