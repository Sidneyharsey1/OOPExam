package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      
        TaxCategory[] taxCategories = new TaxCategory[3];

        taxCategories[0] = new Retailer();  // 18% VAT
        taxCategories[1] = new Wholesaler();  // 15% VAT
        taxCategories[2] = new Importer();  // 10% VAT


        double[] amounts = {1000, 1500, 2000};

        for (int i = 0; i < taxCategories.length; i++) {
            System.out.println("Transaction amount: " + amounts[i]);
            System.out.println("VAT for " + taxCategories[i].getClass().getSimpleName() + ": "
                    + taxCategories[i].calculateVAT(amounts[i]));
            System.out.println();
        }
    }
}
