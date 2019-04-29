package conditionalStatments;

public class NestedIfElse {
    public static void main(String[] args) {
        NestedIfElse l1 = new NestedIfElse();
        l1.compare2(12,34,56);
        l1.compare2(12,64,56);
        l1.compare2(112,64,56);
        l1.compare2(112,664,56);
    }

    public void compare2(int a, int b, int c) {
        if(a>b && a>c) {
            System.out.println(a+" is greatest number");
        } else if(b>a && b>c) {
            System.out.println(b+" is greatest number");
        } else {
            System.out.println(c+" is greatest number");
        }
    }
}
