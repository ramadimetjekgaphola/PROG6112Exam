/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mattresssalesreport;

/**
 *
 * @author Student
 */
public class PrintProduct {
   
    private Product product;

    // Constructor
    public PrintProduct(Product product) {
        this.product = product;
    }

    // Print total sales
    public void PrintTotalSales() {
        System.out.println("TOTAL PRODUCT SALES: "
                + product.GetTotalProductsSold());
    }

    // Print average sales
    public void PrintAverageSales() {
        System.out.println("AVERAGE PRODUCT SALES: "
                + product.GetAverageProductSold());
    }

    // Print most popular product
    public void PrintMostPopularProduct() {
        System.out.println("MOST POPULAR PRODUCT: "
                + product.GetMostPopularProduct());
    }

}
    

