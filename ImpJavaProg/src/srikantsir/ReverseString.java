package srikantsir;

public class ReverseString {
    public static void main(String[] args) {
        ReverseString ob=new ReverseString();
        ob.reverseSt("naresh");
        ob.reverseSt("india");
        ob.reverWithStrBuffer("dev");

    }
    public void reverseSt(String original){
        String reverse="";
        int length=original.length();
        for (int i = length - 1 ; i >= 0 ; i-- )
            reverse = reverse + original.charAt(i);
        System.out.println("reverse of entred string:"+reverse);
    }
    public void reverWithStrBuffer(String myString){
        StringBuffer sb=new StringBuffer(myString);
        System.out.println(sb.reverse());


    }
}
