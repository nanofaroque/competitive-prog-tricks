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
    public void test(){
        System.out.println((1/49)*49);
        Assertions.assertEquals(1,((1/49)*49));
    }

}
