package ans_36.szablony_klas.anonymous_class;

public class Main {
    public static void main(String[] args) {
        InterfaceExample interfaceExample = new InterfaceExample(){
            @Override
            public void method1() {
                System.out.println("method1");
            }

            @Override
            public void method2() {
                System.out.println("method2");
            }
        };
    }
}
