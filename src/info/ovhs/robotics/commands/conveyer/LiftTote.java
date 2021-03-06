package info.ovhs.robotics.commands.conveyer;

import info.ovhs.robotics.Constants;
import info.ovhs.robotics.commands.CommandBase;
import edu.wpi.first.wpilibj.command.Command;

/**
 *Lifts a tote
 */
public class LiftTote extends Command {
	
	/**
	 * Initial distance for conveyer belt encoder
	 */
	private double initialDistance;
	/**
	 * Percent speed to move the conveyer at when lifting the totes
	 */
	private double percentSpeed;
	
	/**
	 * Lifts a tote at 85% power
	 */
	public LiftTote() {
		this(85);
	}
	
	/**
	 * Lifts a tote at a set speed
	 * 
	 * @param percentSpeed Speed to lift tote at
	 */
    public LiftTote(double percentSpeed) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(CommandBase.conveyerBelt);
    	this.percentSpeed = percentSpeed;
    }

    /**
     *  Called just before this Command runs the first time
     */
    protected void initialize() {
    	this.initialDistance = CommandBase.conveyerBelt.encoder.getDistance();
    	// Turn on motor
    	CommandBase.conveyerBelt.forward(this.percentSpeed / 100 * Constants.Motors.MOTOR_MAX_OUTPUT);
    }

    /**
     *  Called repeatedly when this Command is scheduled to run
     */
    protected void execute() {
    	// Do nothing
    }

    /**
     *  Make this return true when this Command no longer needs to run execute()
     */
    protected boolean isFinished() {
    	// Command is done when encoder reaches certain amount of ticks
        return CommandBase.conveyerBelt.encoder.getDistance() >= this.initialDistance + Constants.FieldElements.TOTE_HEIGHT_INCHES;
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