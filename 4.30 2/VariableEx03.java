class Variable {
    // this
    String data1 = "data1";

    void printVariable1() {
        System.out.println("this : " + this);
        this.printVariable2();
    }

    void printVariable2() {
        System.out.println("printVariable2() 호출");

    }

}

public class VariableEx03 {
    public static void main(String[] args) {
        Variable v = new Variable();
        v.printVariable1();
        v.printVariable2();
        System.out.println("v : " + v);

        Variable v1 = new Variable();
        System.out.println("v1 : " + v1);
        v1.printVariable1();
    }
}