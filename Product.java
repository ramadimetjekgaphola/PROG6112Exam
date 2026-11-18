/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mattresssalesreport;

/**
 *
 * @author Student
 */
    public class Product implements IProduct {

    // Declaration of variables
    private String[] productNames;
    private int[][] sales;

    // Constructor
    public Product(String[] productNames, int[][] sales) {
        this.productNames = productNames;
        this.sales = sales;
    }

    // Calculation
    @Override
    public int GetTotalProductsSold() {

        int total = 0;

        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
        }

        return total;
    }

    //  average products sold
    @Override
    public double GetAverageProductSold() {

        int total = GetTotalProductsSold();
        int count = 0;

        for (int i = 0; i < sales.length; i++) {
            count += sales[i].length;
        }

        return (double) total / count;
    }

    //   popular product
  
    
    @Override
public String GetMostPopularProduct() {

    int highest = 0;
    int index = 0;

    for (int i = 0; i < sales.length; i++) {

        for (int j = 0; j < sales[i].length; j++) {

            if (sales[i][j] > highest) {
                highest = sales[i][j];
                index = i;
            }
        }
    }

    return productNames[index] + " (" + highest + ")";
}
    }


