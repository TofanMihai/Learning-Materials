package org.mihai.zz_justTesting.idk;

public class DriverClass extends MyAbstractClass implements MyInterface {

    public DriverClass(int abstractClassField) {
        super(abstractClassField);
    }

    public DriverClass() {
        super(10);

    }

    public void testingPrivateClass() {
        PrivateClass privateClass = new PrivateClass();
        String string = privateClass.newClassName;
        System.out.println(string);
    }

    public static void main(String[] args) {
        DriverClass fromDriverClass = new DriverClass();
        MyInterface fromInterface = new DriverClass();
        MyAbstractClass fromAbstract = new DriverClass();


//Am ascuns
        fromDriverClass.do1("");
        fromInterface.do1("");
        fromAbstract.do1("");


        Parent parent = new Parent();
        Parent parentFromChild = new Child();
        Child child = new Child();

        parent.write(); // parent
        parentFromChild.write(); // child
        child.write(); // child


    }

    @Override
    public void do1(String string) {
        System.out.println("Print from driver Class");
    }

    @Override
    public void do2(String string) {

    }

    private class PrivateClass {
        private String newClassName = "newClassName";

        public String getNewClassName() {
            return newClassName;
        }
    }
}
