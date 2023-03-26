package base;

public class Demo06 {

            //类变量 static
    static double salary = 2500;
    static final double PI=3.14;
            //实例变量：从属于对象,默认值
    String name;
    int age;
            //main方法
        public static void main(String[] args) {
        /*  //int a,b,c;
            //int a=1,b=2,c=3;
            String name="qinjiang";
            char x='X';
            double pi=3.14;
            */

            //局部变量
            int i=10;
            System.out.println(i);

            //变量类型 变量名字=new Demo08();
            Demo06 demo06=new Demo06();
            System.out.println(demo06.age);

            //类变量 static
            System.out.println(salary);
            //常量
            System.out.println(PI);

        }
        //其他方法
        public void add() {

        }

}