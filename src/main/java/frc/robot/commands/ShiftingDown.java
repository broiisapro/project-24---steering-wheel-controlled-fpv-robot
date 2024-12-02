package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Shifting;

public class ShiftingDown extends Command {
    private final Shifting shifting;

    public ShiftingDown(Shifting shifting) {
        this.shifting = shifting;
        addRequirements(shifting);
    }

    @Override
    public void initialize() {
        shifting.decrement();
    }

    @Override
    public boolean isFinished() {
        return true; // This command finishes immediately
    }
}
