/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author Student
 */
public class ProductTest {
    



    String[] productNames = {
        "Cozy Nights Monarch",
        "Restonic Barbados",
        "Sealy Phuket"
    };

    int[][] sales = {
        {25, 18, 20},
        {15, 10, 12},
        {18, 15, 20}
    };

    // Unit Test 1
    
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {

        Product product = new Product(productNames, sales);

        int result = product.GetTotalProductsSold();

        assertEquals(153, result);
    }

    // Unit Test 2
    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {

        Product product = new Product(productNames, sales);

        double result = product.GetAverageProductSold();

        assertEquals(17.0, result, 0.001);
    }
}
    
