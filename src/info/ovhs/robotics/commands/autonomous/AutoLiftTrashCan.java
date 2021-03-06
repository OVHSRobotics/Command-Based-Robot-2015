package info.ovhs.robotics.commands.autonomous;

import info.ovhs.robotics.commands.CommandBase;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoLiftTrashCan extends Command {

	
	private double initialTime;
	private double time;
	private double power;
	
	public AutoLiftTrashCan(double time) {
		this(1, time);
	}
    public AutoLiftTrashCan(double power, double time) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(CommandBase.rearMotorSpool);
    	this.time = time;
    	this.power = power;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	this.initialTime = System.nanoTime();
    	CommandBase.rearMotorSpool.forward(power);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return System.nanoTime() >= this.initialTime + this.time * Math.pow(10, 9);
    }

    // Called once after isFinished returns true
    protected void end() {
    	CommandBase.rearMotorSpool.stop();
//    	new Drive(2).start();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	this.end();
    }
    
    public String toString() {
    	return "Driving for " + this.time + " seconds at " + this.power + " power";
    }
}
