public class palindrome {

    public static boolean palindromee(String s){
        int ed=s.length()-1;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(ed)){
                return false;
            }
            ed--;
        }
        
        return true;
    }
    public static void main(String[] args) {
        String s="cooc";
        System.out.println(palindromee(s));
    }
}
