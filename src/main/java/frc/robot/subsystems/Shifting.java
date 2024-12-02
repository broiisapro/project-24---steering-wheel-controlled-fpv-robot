package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shifting extends SubsystemBase {
    public static double counter;
    public static double gear;
    public static double turnSpeed;

    public Shifting() {
        counter = 0;
    }

    public void increment() {
        counter++;
        if (counter == 0)
        {
            gear = 0;
        }
        else if (counter == 1)
        {
            gear = 0.6;
        }
        else if (counter == 2)
        {
            gear = 0.8;
        }
        else if (counter == 3)
        {
            gear = 1;
        }
        else if (counter > 3)
        {
            counter = 3;
            gear = 1.0;
        }
        System.out.println("gear: " + counter);

    }

    public void decrement() {
        counter--;
        if (counter < 0)
        {
            counter = -1;
            gear = -.7;
        }
        else if (counter == 0)
        {
            gear = 0;
        }
        else if (counter == 1)
        {
            gear = 0.6;
        }
        else if (counter == 2)
        {
            gear = 0.8;
        }
        else if (counter == 3)
        {
            gear = 1;
        }
        System.out.println("gear: " + counter);
    }

    public double getCounter() {
        return gear;
    }
}
