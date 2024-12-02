package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Shifting;

public class ShiftingUp extends Command {
    private final Shifting shifting;

    public ShiftingUp(Shifting shifting) {
        this.shifting = shifting;
        addRequirements(shifting);
    }

    @Override
    public void initialize() {
        shifting.increment();
    }

    @Override
    public boolean isFinished() {
        return true; // This command finishes immediately
    }
}
