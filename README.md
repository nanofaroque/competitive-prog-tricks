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


