/**
 * This class creates objects using overloaded constructors
 * @author--Zheng Wang
 */
public class OverloadConstructorImplementationTest {
    public static void main(String[] args) {
        OverloadConstructorImplementation defaultTime = new OverloadConstructorImplementation();
        OverloadConstructorImplementation oneParameterTime = new OverloadConstructorImplementation(2);
        OverloadConstructorImplementation twoParameterTime = new OverloadConstructorImplementation(21,34);
        OverloadConstructorImplementation threeParameterTime = new OverloadConstructorImplementation(12,25,42);
        OverloadConstructorImplementation objectTime = new OverloadConstructorImplementation(threeParameterTime);

        System.out.println("Constructed with: ");
        display("with default arguments", defaultTime);
        display("with one parameter", oneParameterTime);
        display("with two parameter", twoParameterTime);
        display("with three parameter", threeParameterTime);
        display("with object time", objectTime);

        try {
            OverloadConstructorImplementation someTime = new OverloadConstructorImplementation(27,74,99);
        }catch(IllegalArgumentException e){
            System.out.printf("%nException while initializing someTime: %s%n", e.getMessage());
        }
    }

    private static void display(String description, OverloadConstructorImplementation obj) {
        System.out.printf("%n%s%n %s%n %s%n", description,obj.toUniversalString(), obj.toString());
    }
}
