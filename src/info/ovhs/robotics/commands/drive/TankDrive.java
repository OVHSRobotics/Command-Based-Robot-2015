

package info.ovhs.robotics.commands.drive;

import info.ovhs.robotics.Robot;
import info.ovhs.robotics.commands.CommandBase;

/**
 * Tank Drive Mode
 */
public class  TankDrive extends CommandBase {
	
	/**
	 * Tank Drive Mode
	 */
    public TankDrive() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);

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
    	driveTrain.tankDriveController();
    }

    /**
     *  Make this return true when this Command no longer needs to run execute()
     */
    protected boolean isFinished() {
        return false;
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
    	return "Drive tank-style on the xbox controller";
    }
}
