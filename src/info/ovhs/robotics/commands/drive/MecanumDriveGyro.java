package info.ovhs.robotics.commands.drive;

import info.ovhs.robotics.Robot;
import info.ovhs.robotics.commands.CommandBase;

/**
 * Mecanum Drive Mode with the gyro
 */
public class MecanumDriveGyro extends CommandBase {

	/**
	 * Mecanum Drive Mode with the gyro
	 */
    public MecanumDriveGyro() {
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
//    	driveTrain.mecanumDriveController(RobotMap.robotGyro.getAngle());
    	driveTrain.mecanumDriveController(0);
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
    	return "Driving mecanum style with xbox controller";
    }
}
