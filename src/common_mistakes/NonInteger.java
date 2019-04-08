package common_mistakes;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NonInteger {
    NonInteger nonInteger;
    @BeforeEach
    public void init(){
        nonInteger=new NonInteger();
    }
    @Test
    public void testForWrongImplementation(){
        System.out.println((1/49)*49);
        Assertions.assertNotEquals(1,((1/49)*49));
    }
    @Test
    public void testCorrectWay(){
        float res=(float) 1/49;
        System.out.println(res);
        Assertions.assertEquals(1,res*49);
    }

}
