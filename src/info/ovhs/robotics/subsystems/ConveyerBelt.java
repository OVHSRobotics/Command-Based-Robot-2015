
package info.ovhs.robotics.subsystems;

import info.ovhs.robotics.Constants;
import info.ovhs.robotics.RobotMap;
import info.ovhs.robotics.commands.conveyer.Hold;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * The conveyer belt subsystem on the robot
 */
public class ConveyerBelt extends Subsystem {

	/**
	 * Instance of the Conveyer Belt Subsystem
	 */
	protected static ConveyerBelt instance;
	/**
	 * Speed controller for the Conveyer Belt Motor
	 */
	protected SpeedController conveyerBeltMotor = RobotMap.conveyerBeltSpeedController;		
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	/**
	 * Conveyer Belt Encoder
	 */
	public Encoder encoder = RobotMap.conveyerBeltEncoder;
	/**
	 * Initial encoder value
	 */
	public double initialEncoderValue;
	
	/**
	 * Gets instance of Conveyer Belt Subsystem or creates one if one is not present
	 * 
	 * @return Instance of Conveyer Belt Subsystem
	 */
	public static ConveyerBelt getInstance() {
		if (ConveyerBelt.instance == null) {
			ConveyerBelt.instance = new ConveyerBelt();
		}
		
		return ConveyerBelt.instance;
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
    	//setDefaultCommand(new HoldPID());
    	setDefaultCommand(new Hold());
    }
    
    /**
     * Moves the Conveyer Belt forward at max speed
     * <p>
     * This can be called within commands.
     * </p>
     */
    public void forward() {
    	conveyerBeltMotor.set(Constants.Motors.MOTOR_MAX_OUTPUT);
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
    	conveyerBeltMotor.set(Constants.Motors.MOTOR_MAX_OUTPUT);
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
	 * @param speed Speed to set the conveyer belt at
	 */
	public void setSpeed(double speed) {
		if (speed <= 1 && speed >= -1) {
			conveyerBeltMotor.set(speed);
		}
	}
}

