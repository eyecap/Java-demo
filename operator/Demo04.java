package operator;

public class Demo04 {
    public static void main(String[] args) {
        //+=运算
        int a=10;
        int b=20;

        a+=b;

        System.out.println(a);

        //字符串连接符+
        System.out.println(a+b);
        System.out.println(""+a+b);//从左到右 如果字符串连接符任意侧有字符则统一成字符再输出
        System.out.println(a+b+"");

        //三元运算符
        int score=80;
        String type =score<60?"不及格":"及格";

        System.out.println(type);

    }
}
