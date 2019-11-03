package tutorial.interfaceEx;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {
    @Test
    public void shouldCalculateArea(){
        //Given
        Circle c1= new Circle(3);
        //When
            double result= c1.getArea();
        //Then
        Assert.assertThat(result,Is.is(28.274333882308138));
    }
    @Test
    public void shouldCalculatePerimeter(){
        //Given
        Circle c1= new Circle(3);
        //When
        double result= c1.getPerimetr();
        //Then
        Assert.assertThat(result,Is.is(18.84955592153876));
    }
}