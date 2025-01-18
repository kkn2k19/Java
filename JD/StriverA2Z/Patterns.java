import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        pattern1(n);
        System.out.println();

        pattern2(n);
        System.out.println();

        pattern3(n);
        System.out.println();

        pattern4(n);
        System.out.println();

        pattern5(n);
        System.out.println();

        pattern6(n);
        System.out.println();

        pattern7(n);
        System.out.println();

        pattern8(n);
        System.out.println();

        pattern9(n);
        System.out.println();

        pattern10(n);
        System.out.println();

        pattern11(n);
        System.out.println();

        pattern12(n);
        System.out.println();

        pattern13(n);
        System.out.println();

        pattern14(n);
        System.out.println();

        pattern15(n);
        System.out.println();

        pattern16(n);
        System.out.println();

        pattern17(n);
        System.out.println();

        pattern18(n);
        System.out.println();

        pattern19(n);
        System.out.println();

        pattern20(n);
        System.out.println();

        pattern21(n);
        System.out.println();

        pattern22(n);
        System.out.println();
    }

    public static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    public static void pattern4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2 * i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    public static void pattern8(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern9(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2 * i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern10(int n) {
        int starbelow = n - 1;
        for (int i = 0; i < 2 * n - i; i++) {
            if (i < n) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < starbelow; j++) {
                    System.out.print("*");
                }
                starbelow--;
            }
            System.out.println();
        }
    }

    public static void pattern11(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void pattern12(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }
            for (int j = 0; j < 2 * (n - i - 1); j++) {
                System.out.print(" ");
            }
            for (int j = i + 1; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern13(int n) {
        int a = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }

    public static void pattern14(int n) {
        for (int i = 0; i < n; i++) {
            char ch = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    public static void pattern15(int n) {
        for (int i = 0; i < n; i++) {
            char ch = 'A';
            for (int j = n - i; j > 0; j--) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    public static void pattern16(int n) {
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
    }

    public static void pattern17(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            for (int j = 0; j <= 2 * i; j++) {
                System.out.print(ch);
                if (j < i) {
                    ch++;
                } else {
                    ch--;
                }
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern18(int n) {
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + n - i - 1);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    public static void pattern19(int n) {
        for (int i = 0; i < 2 * n; i++) {
            if (i < n) {
                for (int j = n - i; j > 0; j--) {
                    System.out.print("*");
                }
                for (int j = 0; j < 2 * i; j++) {
                    System.out.print(" ");
                }
                for (int j = n - i; j > 0; j--) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < i - n + 1; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < 2 * (2 * n - i - 1); j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i - n + 1; j++) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }

    public static void pattern20(int n) {
        int inspace = 2; // bottom space
        for (int i = 0; i < 2 * n - 1; i++) {
            if (i < n) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                for (int j = 0; j < 2 * (n - i - 1); j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int j = 2 * n - i - 1; j > 0; j--) {
                    System.out.print("*");
                }
                for (int j = 0; j < inspace; j++) {
                    System.out.print(" ");
                }
                for (int j = 2 * n - i - 1; j > 0; j--) {
                    System.out.print("*");
                }
                inspace = inspace + 2;
                System.out.println();
            }
        }
    }

    public static void pattern21(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern22(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int left = j;
                int down = 2 * n - 2 - i;
                int right = 2 * n - 2 - j;
                System.out.print(n - Math.min(Math.min(top, down), Math.min(left, right)));
            }
            System.out.println();
        }
    }
}