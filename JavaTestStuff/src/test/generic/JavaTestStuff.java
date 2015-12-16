package test.generic;

// Importing a static method instead of the entire class
import static test.packages.PackageTest.*;

public class JavaTestStuff {

    static int operation = 2;
    
    public static void main(String[] args) {
        switch (operation) {
            case 1:
                HelloWorld.main();
            case 2:
                packageTest();
        }
    }

}
