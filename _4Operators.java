public class _4Operators {
    public static void main(String[] args) {
        //arithmatic Operators
        int solvedThisWeek = 25;
        int solvedLastWeek =15;
        int total = solvedThisWeek + solvedLastWeek;
        int difference = solvedThisWeek - solvedLastWeek;
        int projected = solvedThisWeek * 4;
        int average= solvedThisWeek /7;
        int reminder = solvedThisWeek % 7;
        System.out.println(total);
        System.out.println(difference);
        System.out.println(projected);
        System.out.println(average);
        System.out.println(reminder);

        //Relational op
        int a = 45;
        int b = 50;
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        //Logical op
        boolean completeDSA = true;
        boolean completeCore = false;
        System.out.println(completeDSA && completeCore);
        System.out.println(completeDSA || completeCore);
        System.out.println(!completeCore);

        //assingment op
        int syed = 100;
        syed +=  20; // syed = syed + 20
        System.out.println(syed);
        syed = syed - 10;
        System.out.println(syed);
        syed = syed * 2;
        System.out.println(syed);
        syed =  syed/4;
        System.out.println(syed);
        syed = syed%30;
        System.out.println(syed);

    }
}
