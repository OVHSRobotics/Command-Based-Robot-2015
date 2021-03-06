package info.ovhs.robotics.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DualCommand extends Subsystem {
    
	public boolean state = false;
	
	protected static DualCommand instance;
	
	public static DualCommand getInstance() {
    	if (DualCommand.instance == null) {
    		DualCommand.instance = new DualCommand();
    	}
    	
    	return DualCommand.instance;
    }
		
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void changeState() {
    	this.state = !this.state;
    }
    
    public String stateString() {
    	if (this.state) {
    		return "Conveyer Mode";
    	} else {
    		return "Rear Motor Spool Mode";
    	}
    }
    
    public boolean stateBoolean() {
    	return this.state;
    }
    
    
}

