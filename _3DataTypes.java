public class _3DataTypes {
    public static void main(String[] args) {
        //Numeric DT - short -byte - int ,long
        byte num1 = 127;
        long newNum = num1;//implicit conversion DT
        System.out.println("newNum: "  + newNum);
//        byte num1 = 128;
        System.out.println(num1);
        short num2 = 500;
//        short num2 = 50000;
        System.out.println(num2);
        int num3 = 500000000;
        long num4 = 635363633;
        System.out.println(num3);
        System.out.println(num4);
        float  num5 = 3.14f;
        System.out.println(num5);
        double num6 = 3.14524524524524;
        System.out.println(num6);
        boolean eligibleToVote = true;
        System.out.println(eligibleToVote);
        char fisrtCharacter = 'a';
        System.out.println("My First Character is: " + fisrtCharacter);
//        explicit conversion DT
        long value1 = 123456789;
        int value2 = (int)value1;
        System.out.println(value1);
    }
}
