/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mattresssalesreport;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class MattressSalesReport {




    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] productNames = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };

        int[][] sales = new int[3][3];

        //  sales information
        for (int i = 0; i < productNames.length; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print("Enter number of sales for month "
                        + (j + 1) + " for " + productNames[i] + ": ");

                sales[i][j] = input.nextInt();
            }

            System.out.println();
        }

        // Create Product object
        Product product = new Product(productNames, sales);

        // Create PrintProduct object
        PrintProduct report = new PrintProduct(product);

        // Display report
        System.out.println("\nPRODUCT SALES REPORT - 2026");
        System.out.println("************************************");

        report.PrintTotalSales();
        report.PrintAverageSales();
        report.PrintMostPopularProduct();

        input.close();
    }
}
    
    

