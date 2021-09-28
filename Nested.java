public class Nested {
    static int num1=56;
    public  Nested()
    {
        System.out.println("Welcome");
    }
        static class test{
        int num2=10;
        public test(int a, String b)
        {
            System.out.println(num2);
            System.out.println(num1);
            System.out.println("Vivek kumar verma");
        }
    }
}
 class vivek{
     public static void main(String[] args) {
         Nested.test obj=new Nested.test(2,"vivek");
         Nested obj2=new Nested();


     }

}
