public class test111 {
    public static void main(String[] args) {
        int j,i;
        Rep:
        for(i=8;i>1;i--){
            for(j =1;j<=9;j++){
                if(j==5)break;
                if(i==6)break Rep;
            }
            System.out.println(j*i+"");
        }
        System.out.println("<>");
    }
}
