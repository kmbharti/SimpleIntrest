class HelloWorld {
   static int b=20;//static variable
    int a=10;//instance variable
    public static void main(String[] args) {
        int c=30;//local variable
        System.out.println("Try programiz.pro");
         System.out.println(c);
         System.out.println(HelloWorld.b);
         HelloWorld hw=new HelloWorld();
         System.out.println(hw.a);
    }
}