package info.ovhs.robotics;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.buttons.Button;

public class JoystickTriggerAsButton extends Button {
	
	GenericHID joystick;
	int axis;
	double threshold;
	
	public JoystickTriggerAsButton(GenericHID joystick, int axis, double threshold) {
        this.joystick = joystick;
        this.axis = axis;
        this.threshold = threshold;
    }
	
	@Override
	public boolean get() {
		if (Math.abs(this.joystick.getRawAxis(this.axis)) > threshold) {
			return true;
		}
		else {
			return false;
		}
	}

}