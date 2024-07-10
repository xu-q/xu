package com;

public class Demo {

    //@Test
    public void test1() {
        System.out.println(testTry());
    }

    public int testTry() {
        int a = 10;
        try {
            return 10;
        } finally {
            a -= 1;
            return 11;
        }
    }

    public static void main(String[] args) {
        String str ="aaa bbbb cccc 5.2 dd, eee, fff 3.3 hhh . www dddd.tttt 5.9. aaaaaaaaa adddddddd";
        System.out.println(str);
        str = str.replaceAll("\\.\\D|\\D\\.", "#");
        System.out.println(str);
    }

}
