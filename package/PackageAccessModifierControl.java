class Base {

    public void publicMethod() {
        System.out.println("Public method accessible everywhere");
    }

    protected void protectedMethod() {
        System.out.println("Protected method accessible in subclass");
    }

    void defaultMethod() {
        System.out.println("Default method accessible only in same package");
    }

    private void privateMethod() {
        System.out.println("Private method accessible only within Base class");
    }

    public void accessPrivateInsideClass() {
        System.out.println("Accessing private method inside same class:");
        privateMethod();  
    }
}

class Derived extends Base {

    public void testAccess() {

        System.out.println("Accessing methods from Derived class:\n");

        
        publicMethod();        
        protectedMethod();     
        defaultMethod();       

        // privateMethod();    
    }
}

public class AccessModifierDemo {

    public static void main(String[] args) {

        Derived obj = new Derived();

        obj.testAccess();

        System.out.println();
        obj.accessPrivateInsideClass();
    }
}