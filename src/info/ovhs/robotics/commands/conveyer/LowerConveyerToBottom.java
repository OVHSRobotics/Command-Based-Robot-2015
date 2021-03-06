package info.ovhs.robotics.commands.conveyer;

import info.ovhs.robotics.Constants;
import info.ovhs.robotics.commands.CommandBase;

/**
 * Lowers the conveyer to the bottom by using the initial Encoder Distance
 *
 */
public class LowerConveyerToBottom extends CommandBase {
	
	/**
	 * Lowers the conveyer to the bottom by using the initial Encoder Distance
	 */
    public LowerConveyerToBottom() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(CommandBase.conveyerBelt);
    }

    /**
     *  Called just before this Command runs the first time
     */
    protected void initialize() {
    	// Turn the motor on
    	double percentSpeed = 100;
    	CommandBase.conveyerBelt.backward(percentSpeed / 100 * -Constants.Motors.MOTOR_MAX_OUTPUT);
    }

    /**
     *  Called repeatedly when this Command is scheduled to run
     */
    protected void execute() {
    }

    /**
     *  Make this return true when this Command no longer needs to run execute()
     */
    protected boolean isFinished() {
    	// Encoder reaches threshold
    	return CommandBase.conveyerBelt.encoder.getDistance() <= CommandBase.conveyerBelt.initialEncoderValue;
    }

    /**
     *  Called once after isFinished returns true
     */
    protected void end() {
    	// Turn motor off
    	CommandBase.conveyerBelt.stop();
    }

    /**
     *  Called when another command which requires one or more of the same subsystems is scheduled to run
     */
    protected void interrupted() {
    	// Turn motor off
    	CommandBase.conveyerBelt.stop();
    }
}
