package fr.inria;

import fr.inria.targets.GetterSetterTarget;
import fr.inria.targets.SingletonTarget;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        playWithSingleton();

        GetterSetterTarget g = new GetterSetterTarget(1, "Hello");
        g.print();
    }

    public static void playWithSingleton() {
        SingletonTarget i1 = new SingletonTarget();
        SingletonTarget i2 = new SingletonTarget();
        SingletonTarget i3 = new SingletonTarget();
        System.out.println("There are currently " + SingletonTarget.getNbInstances() + " instances of SingletonTarget.");
    }
}
