package tutorial.interfaceEx;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void shouldCalculateArea(){
        //Given
        Triangle t1= new Triangle(3,4);
        //When
        double result= t1.getArea();
        //Then
        Assert.assertThat(result, Is.is(6.0));
    }
    @Test
    public void shouldCalculatePerimeter(){
        //Given
        Triangle t1= new Triangle(3,4);
        //When
        double result= t1.getPerimetr();
        //Then
        Assert.assertThat(result, Is.is(12.0));
    }
}
