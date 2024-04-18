public class Debug {
    public static void main(String[] args)//String[]等价于String...
    {
        System.out.println("==============args start============");
        for(int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        System.out.println("===============args end=============");
    }
}
