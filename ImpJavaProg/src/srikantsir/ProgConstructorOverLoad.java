package srikantsir;

public class ProgConstructorOverLoad {
        String name;
        ProgConstructorOverLoad() {
         System.out.println("Constructor method called.");
          }
         ProgConstructorOverLoad(String t) {
                  this.name = t; //local to instance variable
        }
        public static void main(String[] args) {
           ProgConstructorOverLoad cpp  = new ProgConstructorOverLoad();
           ProgConstructorOverLoad java = new ProgConstructorOverLoad("Java");
           cpp.setName("C++");
           java.getName();
           cpp.getName();
        }
        void setName(String t) {
                 this.name = t;
        }
        void getName() {

            System.out.println("Language name: " + name);
          }
}






