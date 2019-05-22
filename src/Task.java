public class Task {
    public static <string> void main(String[] args) {

        //1 одна зміна кожного типу

        byte a = 1;
        System.out.println(1);

        short b = 2;
        System.out.println(2);

        int c = 3;
        System.out.println(c);

        long d = 4;
        System.out.println(d);

        float e = 5.36667f;
        System.out.println(e);

        double f = 6.52d;
        System.out.println(f);

        char g = 97;
        System.out.println(g);

        String h = "8";
        System.out.println(h);

        boolean k = false;
        System.out.println(k);

        //2 максимальне та мінімальне значення  типів даних

        System.out.println("Byte max = "+Byte.MAX_VALUE);
        System.out.println("Byte min = "+Byte.MIN_VALUE);

        System.out.println("Short max "+Short.MAX_VALUE);
        System.out.println("Short min "+Short.MIN_VALUE);

        System.out.println("Integer max = "+Integer.MAX_VALUE);
        System.out.println("Integer min = "+Integer.MIN_VALUE);

        System.out.println("Long max = "+Long.MAX_VALUE);
        System.out.println("Long min = "+Long.MIN_VALUE);

        System.out.println("Float max = "+Float.MAX_VALUE);
        System.out.println("Float min = "+Float.MIN_VALUE);

        System.out.println("Double max = "+Double.MAX_VALUE);
        System.out.println("Double min = "+Double.MIN_VALUE);

        System.out.println("Character max = "+Character.MAX_VALUE);
        System.out.println("Character min = "+Character.MIN_VALUE);


        // 3 масив з інтами

        int arr [] = {-5,17,78,-95,35,4,45,0,6,11};

        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i<arr.length; i++){
            if(arr[i] < min) min = arr[i];
            if(arr[i] > max) max = arr[i];

        }
        System.out.println(min);
        System.out.println(max);
    }
}