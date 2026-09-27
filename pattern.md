# Java Pattern Printing — Important Problems with Solutions

> All programs use `n` as the number of rows/size.

---

## 1. Solid Square

```text
****
****
****
****
```

```java
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= n; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

---

## 2. Right Triangle

```text
*
**
***
****
```

```java
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

---

## 3. Inverted Triangle

```text
****
***
**
*
```

```java
for (int i = n; i >= 1; i--) {
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
```

---

## 4. Number Triangle

```text
1
12
123
1234
```

```java
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(j);
    }
    System.out.println();
}
```

---

## 5. Same Number Triangle

```text
1
22
333
4444
```

```java
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(i);
    }
    System.out.println();
}
```

---

## 6. Floyd's Triangle

```text
1
23
456
78910
```

```java
int num = 1;

for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(num + " ");
        num++;
    }
    System.out.println();
}
```

---

## 7. 0-1 Triangle

```text
1
01
101
0101
```

```java
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        if ((i + j) % 2 == 0)
            System.out.print("1");
        else
            System.out.print("0");
    }
    System.out.println();
}
```

---

## 8. Full Pyramid

```text
   *
  ***
 *****
*******
```

```java
for (int i = 1; i <= n; i++) {

    for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
    }

    for (int j = 1; j <= 2 * i - 1; j++) {
        System.out.print("*");
    }

    System.out.println();
}
```

---

## 9. Inverted Pyramid

```text
*******
 *****
  ***
   *
```

```java
for (int i = n; i >= 1; i--) {

    for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
    }

    for (int j = 1; j <= 2 * i - 1; j++) {
        System.out.print("*");
    }

    System.out.println();
}
```

---

## 10. Diamond

```text
   *
  ***
 *****
*******
 *****
  ***
   *
```

```java
// Upper half
for (int i = 1; i <= n; i++) {

    for (int j = 1; j <= n - i; j++)
        System.out.print(" ");

    for (int j = 1; j <= 2 * i - 1; j++)
        System.out.print("*");

    System.out.println();
}

// Lower half
for (int i = n - 1; i >= 1; i--) {

    for (int j = 1; j <= n - i; j++)
        System.out.print(" ");

    for (int j = 1; j <= 2 * i - 1; j++)
        System.out.print("*");

    System.out.println();
}
```

---

## 11. Hollow Square

```text
****
*  *
*  *
****
```

```java
for (int i = 1; i <= n; i++) {

    for (int j = 1; j <= n; j++) {

        if (i == 1 || i == n || j == 1 || j == n)
            System.out.print("*");
        else
            System.out.print(" ");
    }

    System.out.println();
}
```

---

## 12. Hollow Rectangle

```text
******
*    *
*    *
******
```

```java
int rows = 4;
int cols = 6;

for (int i = 1; i <= rows; i++) {

    for (int j = 1; j <= cols; j++) {

        if (i == 1 || i == rows || j == 1 || j == cols)
            System.out.print("*");
        else
            System.out.print(" ");
    }

    System.out.println();
}
```

---

## 13. Hollow Triangle

```text
*
**
* *
*  *
*****
```

```java
for (int i = 1; i <= n; i++) {

    for (int j = 1; j <= i; j++) {

        if (j == 1 || j == i || i == n)
            System.out.print("*");
        else
            System.out.print(" ");
    }

    System.out.println();
}
```

---

## 14. Hollow Pyramid

```text
   *
  * *
 *   *
*******
```

```java
for (int i = 1; i <= n; i++) {

    for (int j = 1; j <= n - i; j++)
        System.out.print(" ");

    for (int j = 1; j <= 2 * i - 1; j++) {

        if (j == 1 || j == 2 * i - 1 || i == n)
            System.out.print("*");
        else
            System.out.print(" ");
    }

    System.out.println();
}
```

---

## 15. Hollow Diamond

```text
   *
  * *
 *   *
*     *
 *   *
  * *
   *
```

```java
// Upper half
for (int i = 1; i <= n; i++) {

    for (int j = 1; j <= n - i; j++)
        System.out.print(" ");

    for (int j = 1; j <= 2 * i - 1; j++) {

        if (j == 1 || j == 2 * i - 1)
            System.out.print("*");
        else
            System.out.print(" ");
    }

    System.out.println();
}

// Lower half
for (int i = n - 1; i >= 1; i--) {

    for (int j = 1; j <= n - i; j++)
        System.out.print(" ");

    for (int j = 1; j <= 2 * i - 1; j++) {

        if (j == 1 || j == 2 * i - 1)
            System.out.print("*");
        else
            System.out.print(" ");
    }

    System.out.println();
}
```

---

## 16. Palindrome Number Pyramid

```text
   1
  121
 12321
1234321
```

```java
for (int i = 1; i <= n; i++) {

    for (int j = 1; j <= n - i; j++)
        System.out.print(" ");

    for (int j = 1; j <= i; j++)
        System.out.print(j);

    for (int j = i - 1; j >= 1; j--)
        System.out.print(j);

    System.out.println();
}
```

---

## 17. Alphabet Triangle

```text
A
AB
ABC
ABCD
```

```java
for (int i = 1; i <= n; i++) {

    for (int j = 1; j <= i; j++) {
        System.out.print((char)('A' + j - 1));
    }

    System.out.println();
}
```

---

## 18. Repeated Alphabet Triangle

```text
A
BB
CCC
DDDD
```

```java
for (int i = 1; i <= n; i++) {

    for (int j = 1; j <= i; j++) {
        System.out.print((char)('A' + i - 1));
    }

    System.out.println();
}
```

---

## 19. Continuous Alphabet Triangle

```text
A
BC
DEF
GHIJ
```

```java
char ch = 'A';

for (int i = 1; i <= n; i++) {

    for (int j = 1; j <= i; j++) {
        System.out.print(ch);
        ch++;
    }

    System.out.println();
}
```

---

## 20. Alphabet Pyramid

```text
   A
  ABC
 ABCDE
ABCDEFG
```

```java
for (int i = 1; i <= n; i++) {

    for (int j = 1; j <= n - i; j++)
        System.out.print(" ");

    for (int j = 1; j <= 2 * i - 1; j++)
        System.out.print((char)('A' + j - 1));

    System.out.println();
}
```

---

## 21. Palindrome Alphabet Pyramid

```text
   A
  ABA
 ABCBA
ABCDCBA
```

```java
for (int i = 1; i <= n; i++) {

    for (int j = 1; j <= n - i; j++)
        System.out.print(" ");

    for (int j = 1; j <= i; j++)
        System.out.print((char)('A' + j - 1));

    for (int j = i - 1; j >= 1; j--)
        System.out.print((char)('A' + j - 1));

    System.out.println();
}
```

---

## 22. Butterfly Pattern

```text
*      *
**    **
***  ***
********
***  ***
**    **
*      *
```

```java
// Upper half
for (int i = 1; i <= n; i++) {

    for (int j = 1; j <= i; j++)
        System.out.print("*");

    for (int j = 1; j <= 2 * (n - i); j++)
        System.out.print(" ");

    for (int j = 1; j <= i; j++)
        System.out.print("*");

    System.out.println();
}

// Lower half
for (int i = n; i >= 1; i--) {

    for (int j = 1; j <= i; j++)
        System.out.print("*");

    for (int j = 1; j <= 2 * (n - i); j++)
        System.out.print(" ");

    for (int j = 1; j <= i; j++)
        System.out.print("*");

    System.out.println();
}
```

---

## 23. Rhombus

```text
   ****
  ****
 ****
****
```

```java
for (int i = 1; i <= n; i++) {

    for (int j = 1; j <= n - i; j++)
        System.out.print(" ");

    for (int j = 1; j <= n; j++)
        System.out.print("*");

    System.out.println();
}
```

---

## 24. X Pattern

```text
*   *
 * *
  *
 * *
*   *
```

```java
for (int i = 1; i <= n; i++) {

    for (int j = 1; j <= n; j++) {

        if (j == i || j == n - i + 1)
            System.out.print("*");
        else
            System.out.print(" ");
    }

    System.out.println();
}
```

---

## 25. Plus Pattern

```text
  *
  *
*****
  *
  *
```

```java
for (int i = 1; i <= n; i++) {

    for (int j = 1; j <= n; j++) {

        if (i == n / 2 + 1 || j == n / 2 + 1)
            System.out.print("*");
        else
            System.out.print(" ");
    }

    System.out.println();
}
```

---

## 26. Pascal's Triangle

```text
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1
```

```java
for (int i = 0; i < n; i++) {

    for (int j = 0; j < n - i; j++)
        System.out.print(" ");

    int value = 1;

    for (int j = 0; j <= i; j++) {

        System.out.print(value + " ");

        value = value * (i - j) / (j + 1);
    }

    System.out.println();
}
```

---

## 27. Reverse Number Triangle

```text
1234
123
12
1
```

```java
for (int i = n; i >= 1; i--) {

    for (int j = 1; j <= i; j++)
        System.out.print(j);

    System.out.println();
}
```

---

## 28. Sandglass Pattern

```text
*******
 *****
  ***
   *
  ***
 *****
*******
```

```java
// Upper
for (int i = n; i >= 1; i--) {

    for (int j = 1; j <= n - i; j++)
        System.out.print(" ");

    for (int j = 1; j <= 2 * i - 1; j++)
        System.out.print("*");

    System.out.println();
}

// Lower
for (int i = 2; i <= n; i++) {

    for (int j = 1; j <= n - i; j++)
        System.out.print(" ");

    for (int j = 1; j <= 2 * i - 1; j++)
        System.out.print("*");

    System.out.println();
}
```

---

## 29. Concentric Number Pattern

For `n = 4`:

```text
4444444
4333334
4322234
4321234
4322234
4333334
4444444
```

```java
int size = 2 * n - 1;

for (int i = 0; i < size; i++) {

    for (int j = 0; j < size; j++) {

        int top = i;
        int left = j;
        int right = size - 1 - j;
        int bottom = size - 1 - i;

        int min = Math.min(
                    Math.min(top, bottom),
                    Math.min(left, right)
                  );

        System.out.print(n - min);
    }

    System.out.println();
}
```

---

# 🔥 Most Important for Placement

If you have very little time, master these first:

```text
1. Solid Square
2. Right Triangle
3. Inverted Triangle
4. Full Pyramid
5. Inverted Pyramid
6. Diamond
7. Hollow Square
8. Hollow Pyramid
9. Hollow Diamond
10. Number Triangle
11. Floyd's Triangle
12. 0-1 Triangle
13. Pascal's Triangle
14. Palindrome Pyramid
15. Alphabet Triangle
16. Alphabet Pyramid
17. Butterfly
18. X Pattern
19. Rhombus
20. Concentric Number Pattern
```

# 🧠 Pattern Formula Cheat Sheet

```text
Right Triangle
stars = i

Inverted Triangle
stars = n - i + 1

Pyramid
spaces = n - i
stars  = 2 * i - 1

Inverted Pyramid
spaces = n - i
stars  = 2 * i - 1

Diamond
Upper + Lower Pyramid

Hollow
Print * only on boundary

X Pattern
j == i || j == n - i + 1

Plus Pattern
i == middle || j == middle

Palindrome
Increasing + Decreasing

Butterfly
left stars + spaces + right stars

Concentric Pattern
distance from nearest boundary
```

# 🎯 Golden Rule

Almost every pattern can be solved using:

```java
for (int i = 1; i <= n; i++) {

    // spaces

    // stars / numbers / characters

    // condition

    System.out.println();
}
```

**Pattern printing ka main focus:**
`Rows → Spaces → Columns → Condition`
