public class h {
    public static void main(String[] args) {
        int n=5;
        int var=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(var);
                if(var==1){
                    var=0;
                }else{
                    var=1;
                }
            }
            System.out.println();
        }
    }
    
}
