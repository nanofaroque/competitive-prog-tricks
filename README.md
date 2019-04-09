# competitive-prog-tricks
This repository will contains common mistake in competitive programming. 

### How to beat integer overflow
wrong:

```
   int a=50000;
   int b=50000;
   int c=a*b;
```

Value of c is not 2500000000 because c can not be fit into 32 bit

wrong:
```
   int a=50000;
   int b=50000;
   long c=a*b;
```
It is also wrong because after computing c, it converts c into a long value
But compute the result is not possible for the size of int. 

Remember 
```
int*int=int;
long*long=long;
```

Correct way: 
1. Have at least one factor of long type
```
long a=50000;
long b=50000;
long c=a*b;
```
2. Explicitly casting
```
int a=50000;
long b=50000;
long c=(long)a*b;
```
* Keep in mind that twice the memory, most likely slower
* Always check the limit

Wrong: 
Sum could lead to overflow as well

```
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

```

### Rational Numbers
```$xslt
Assertions.assertNotEquals(1,((1/49)*49));
```
Why? Because 1/49 grows so fast. Ratio of two rational number grows so fast and does not fit into an integer.
To have better precision, we should use **float**

Here is a full code snippet

```$xslt

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

```
