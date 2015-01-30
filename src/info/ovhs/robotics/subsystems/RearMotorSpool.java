
package info.ovhs.robotics.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import info.ovhs.robotics.Constants;
import info.ovhs.robotics.RobotMap;
import info.ovhs.robotics.commands.conveyer.Hold;

/**
 *
 */
public class RearMotorSpool extends Subsystem {

	protected static RearMotorSpool instance;
	
	protected SpeedController conveyerBeltMotor = RobotMap.conveyerBeltSpeedController1;		
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public Encoder encoder = RobotMap.conveyerBeltEncoder;
	
	/**
	 * Gets instance of Conveyer Belt Subsystem or creates one if one is not present
	 * 
	 * @return Instance of Conveyer Belt Subsystem
	 */
	public static RearMotorSpool getInstance() {
		if (RearMotorSpool.instance == null) {
			RearMotorSpool.instance = new RearMotorSpool();
		}
		
		return RearMotorSpool.instance;
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    	setDefaultCommand(new Hold());
    }
    
    /**
     * Moves the Conveyer Belt forward at max speed
     * <p>
     * This can be called within commands.
     * </p>
     */
    public void forward() {
    	conveyerBeltMotor.set(Constants.MotorConstants.MOTOR_MAX_OUTPUT);
    }

    /**
     * Moves the Conveyer Belt forward at a set speed
     * <p>
     * This can be called within commands.
     * </p>
     * @param speed Speed for Conveyer Belt to move forward at
     */
    public void forward(double speed) {
    	if (speed > 0 && speed <= 1) {
    		conveyerBeltMotor.set(speed);
    	}
	}
    
    /**
     * Moves the Conveyer Belt backwards at max speed
     * <p>
     * This can be called within commands
     * </p>
     */    
    public void backward() {
    	conveyerBeltMotor.set(Constants.MotorConstants.MOTOR_MAX_OUTPUT);
    }
    
    /**
     * Moves the Conveyer Belt backwards at a set speed
     * <p>
     * This can be called within commands.
     * </p>
     * @param speed Speed for Conveyer Belt to move at; can be either positive or negative, will move backwards either way
     */
	public void backward(double speed) {
		if (speed < 0 && speed >= -1) {
			conveyerBeltMotor.set(speed);
		}
		if (speed > 0 && speed <= 1) {
			conveyerBeltMotor.set(-speed);
		}
	}
	
	/**
	 * Stops the Conveyer Belt
	 * <p>
	 * This can be called within commands
	 * </p>
	 */
	public void stop() {
		conveyerBeltMotor.set(0);
	}
	
	/**
	 * Sets the speed for the Conveyer Belt
	 * <p>
	 * This can be called within commands.
	 * </p> 
	 * @param speed
	 */
	public void setSpeed(double speed) {
		if (speed <= 1 && speed >= -1) {
			conveyerBeltMotor.set(speed);
		}	
	}
}
