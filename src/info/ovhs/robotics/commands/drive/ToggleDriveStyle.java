package info.ovhs.robotics.commands.drive;

import info.ovhs.robotics.Robot;
import info.ovhs.robotics.commands.CommandBase;

/**
 * Toggles the drive style for the robot
 */
public class ToggleDriveStyle extends CommandBase {

	/**
	 * Toggles the drive style for the robot
	 */
    public ToggleDriveStyle() {
        // Use requires() here to declare subsystem dependencies
        requires(CommandBase.driveTrain);
    }

    /**
     *  Called just before this Command runs the first time
     */
    protected void initialize() {
    	Robot.print(toString());
    }

    /**
     *  Called repeatedly when this Command is scheduled to run
     */
    protected void execute() {
    	CommandBase.driveTrain.changeDefaultDriveStyle();
    }

    /**
     *  Make this return true when this Command no longer needs to run execute()
     */
    protected boolean isFinished() {
        return true;
    }

    /**
     *  Called once after isFinished returns true
     */
    protected void end() {
    }

    /**
     *  Called when another command which requires one or more of the same subsystems is scheduled to run
     */
    protected void interrupted() {
    }
    
    /**
     * String representation of the command
     */
    public String toString() {
    	return "Toggling drive style";
    }
}
