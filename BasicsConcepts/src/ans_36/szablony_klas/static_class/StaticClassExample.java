package ans_36.szablony_klas.static_class;

public class StaticClassExample {
    private Integer i;

    public static class StaticInnerClass{
        private String s1;
        private String s2;

        public void method(){
            System.out.println(this.s1);
        }
    }

    public class InnerClass{
        void method(){
            System.out.println("InnerClass");
        }
    }
}
