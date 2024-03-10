/*
what will be the type of result in the following Java Code?

byte b = 4;
char c = 'a';
short s = 512;
int i = 1000;
float f = 3.14f;
double d = 99.9954;

result = (f*b) + (i%c) - (d*s);
(Hint : Look at the largest data type among these).
*/

Double will take place always as it is the largest!!!!

In the provided Java code, when you perform arithmetic operations with mixed types, the result type is determined by a process called type promotion. 
The result of an expression involving more than one numeric type is determined according to the widest of the types used.

Let's break down the types in the given expression:

f×b: Here, f is a float and b is a byte. The result will be promoted to a float.

i%c: Here, i is an int and c is a char. The char will be promoted to int for the arithmetic, so the result will be of type int.

d×s: Here, d is a double and s is a short. The result will be promoted to a double.

Given the above, the final types for each sub-expression are:

float
int
double
The result of an expression involving a float and an int is a float.
But, the result of an expression involving a float and a double (or just a double) is a double.

So, the type of result in the expression:

result=(f×b)+(i%c)−(d×s)
will be a double.

Remember, the hint provided was crucial: "Look at the largest data type among these".
The largest data type among all involved is double, so that's the type for the overall expression.






