package tutorial.interfaceEx;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    @Test
    public void shouldCalculateArea(){
        //Given
        Rectangle r= new Rectangle(10,20);
        //When
        double result= r.getArea();
        //Then
        Assert.assertThat(result, Is.is(200.0));
    }
    @Test
    public void shouldCalculatePerimeter(){
        //Given
        Rectangle r= new Rectangle(10,20);
        //When
        double result= r.getPerimetr();
        //Then
        Assert.assertThat(result,Is.is(60.0));
    }

}