package common_mistakes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IntegerOverflow {
    @Test
    public void sumOverflowTestNegativeOutput(){
        System.out.println(overflowSumNegative());
        Assertions.assertTrue(overflowSumNegative()<0);
    }

    @Test
    public void sumOverflowTestPositiveOutput(){
        System.out.println(overflowSumPositive());
        Assertions.assertTrue(overflowSumPositive()>Integer.MAX_VALUE);
    }

    public int overflowSumNegative(){
        int a=50000;
        int b=50000;
        int res=0;

        for (int i = 0; i <b ; i++) {
            res+=a;
        }
        return res;
    }

    public long overflowSumPositive(){
        int a=50000;
        int b=50000;
        long res=0;

        for (int i = 0; i <b ; i++) {
            res+=a;
        }
        return res;
    }
}
