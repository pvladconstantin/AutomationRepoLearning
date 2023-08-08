package starter.EncapsCoursePart2;

import com.sun.xml.bind.v2.runtime.output.Encoded;
import net.bytebuddy.build.ToStringPlugin;

public class Main {

    public static void main(String[] args) {

        EnhancedPlayer tim = new EnhancedPlayer("Tim", 200, "Sword");
        System.out.println("Initial health is " + tim.healthRemaining());


    }
}
