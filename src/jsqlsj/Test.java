package jsqlsj;


import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        fun i = new fun();
        jiafa s1 = new jiafa();
        jianfa s2 = new jianfa();
        chengfa s3 = new chengfa();
        chufa s4 = new chufa();
        System.out.println("��������Ҫ�������������:");
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        @SuppressWarnings("resource")
		Scanner scanner2 = new Scanner(System.in);
        int str = scanner.nextInt();
        int str2 = scanner2.nextInt();
        int a = str;
        int b = str2;
        System.out.println("����������Ҫ����ķ�ʽ(+��-��*��/):");
        @SuppressWarnings("resource")
		Scanner scanner3 = new Scanner(System.in);
        String zifu1 = scanner3.next();
        scanner3.nextLine();
        while(true) {
            if (zifu1.equals("+")) {
                System.out.print("�ӷ����:");
                i.func(s1, a, b);
                break;
            } else if (zifu1.equals("-")) {
                System.out.print("�������:");
                i.func(s2, a, b);
                break;

            } else if (zifu1.equals("*")) {
                System.out.print("�˷����:");
                i.func(s3, a, b);
                break;
            } else if (zifu1.equals("/")) {
                System.out.print("�������:");
                i.func(s4, a, b);
                break;

            }
            else {
                System.out.println("�Ƿ�����!");
                break;
            }
        }

    }
}
interface Ijisuanqi {
    int jisuan(int a, int b);
}
class fun {
    public void func(Ijisuanqi per, int a, int b) {
        System.out.println(per.jisuan(a, b));
    }

}
class jiafa implements Ijisuanqi {
    public int jisuan(int a, int b) {
        return a + b;
    }
}
class jianfa implements Ijisuanqi {
    public int jisuan(int a, int b) {
        return a - b;
    }
}
class chengfa implements Ijisuanqi {
    public int jisuan(int a, int b) {
        return a * b;
    }
}
class chufa implements Ijisuanqi {
    public int jisuan(int a, int b) {
        if (b == 0) {

            return -1;
        } else {
            return a / b;
        }
    }
}