package Enum;

public enum EnumWithAbstractMethod {
    MONDAY {
        @Override
        public void dummyMethod() {
            System.out.println("Inside Monday");
        }
    },
    TUESDAY{@Override
            public void dummyMethod(){
        System.out.println("Inside Monday");
    }},
    SUNDAY{@Override
           public void dummyMethod(){
        System.out.println("Inside Monday");
    }};

    public abstract void dummyMethod();
}
