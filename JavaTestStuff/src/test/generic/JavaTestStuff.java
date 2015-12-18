package test.generic;

// Importing all static methods and static final fields in the class instead of the entire class
import test.access.modifiers.Potato;
import test.access.modifiers.Vegetable;
import static test.packages.PackageTest.*;

public class JavaTestStuff {

    static int operation = 5;
    
    static Vegetable vegetable = new Vegetable();
    static Potato potato = new Potato();
    static Tomato tomato = new Tomato();
    
    public static void main(String[] args) {
        switch (operation) {
            case 1:
                HelloWorld.main();
            case 2:
                packageTest();
            case 3:
                vegetable.main(40);
            case 4:
                potato.main(40);
            case 5:
                tomato.main(40);
        }
    }

}
