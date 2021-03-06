package info.ovhs.robotics.commands.rearmotorspool;

import info.ovhs.robotics.Constants;
import info.ovhs.robotics.OI;
import info.ovhs.robotics.RobotMap;
import info.ovhs.robotics.commands.CommandBase;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Manual move of the rear motor spool a specified direction
 */
public class RearMove extends Command {
	
	/**
	 * Whether or not the rear motor spool is moving forward
	 */
	boolean forward = true;
	
	/**
	 * Manual move of the rear motor spool a set direction
	 * @param forward whether or not to move forward
	 */
    public RearMove(boolean forward) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(CommandBase.rearMotorSpool);
    	if (forward) {
    		this.forward = true;
    	} else {
    		this.forward = false;
    	}
    }

    /**
     *  Called just before this Command runs the first time
     */
    protected void initialize() {
    	
    }

    /**
     *  Called repeatedly when this Command is scheduled to run
     */
    protected void execute() {
    	
//    	if (CommandBase.rearMotorSpool.switchHasBeenHit) {
//    		CommandBase.rearMotorSpool.stop();
//    	} else {
    	if (this.forward) {
//    		if (!OI.operatorController.getRawButton(1)){
    			CommandBase.rearMotorSpool.forward(Constants.RearMotorSpool.MANUAL_MOVE_SPEED_UP);
    		}
//    		CommandBase.rearMotorSpool.switchHasBeenHit = false;
//    	} else if (!this.forward && !RobotMap.robotLimitSwitch.get()) {
//    		CommandBase.rearMotorSpool.backward(Constants.RearMotorSpool.MANUAL_MOVE_SPEED);
//    	} else if (!this.forward && RobotMap.robotLimitSwitch.get()) {
//    		CommandBase.rearMotorSpool.stop();
////    		CommandBase.rearMotorSpool.switchHasBeenHit = true;
//    	} 
    	else {
    		//Impossible case
    	}
//    	}
    	
//    	if (RobotMap.robotLimitSwitch.get() && !CommandBase.rearMotorSpool.switchHasBeenHit) {
//    		OI.startControllerRumble(OI.xboxController);
//    		CommandBase.rearMotorSpool.switchHasBeenHit = true;
//    	} else {
//    		OI.stopControllerRumble(OI.xboxController);
//    	}
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
}
