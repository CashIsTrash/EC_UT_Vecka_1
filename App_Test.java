package se.lexicon.Konstantinos;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class App_Test
{

    @Test
    public void test_add(){
        // Arrange
        double n1 = 5;
        double n2 = 10;
        double expectedResult = 15;

        // Act
        double actualResult = App.add( n1, n2);

        // Assert
        Assert.assertEquals(expectedResult, actualResult,0.01);
    }

    @Test
    public void test_subtract(){
        // Arrange
        double n1 = 10;
        double n2 = 7;
        double expectedResult = 3;

        //Act
        double actualResult = App.subtract(n1,n2);

        //Assert
        Assert.assertEquals(expectedResult,actualResult, 0.01);
    }

    @Test
    public void test_multiply(){
        //Arrange
        double n1 = 10;
        double n2 = 5;
        double expectedResult = 50;

        // Act
        double actualResult = App.multiply(n1, n2);

        //Assert
        Assert.assertEquals(expectedResult, actualResult, 0.01);
    }

    @Test
    public void test_divide(){
        // Arrange
        double n1 = 100;
        double n2 = 10;
        double expectedResult = 10;

        // Act
        double actualResult = App.divide(n1, n2);

        // Assert
        Assert.assertEquals(expectedResult, actualResult,0.01);
    }


}
