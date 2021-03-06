package info.ovhs.robotics;

public final class Constants {
	
	public static final boolean AUTO_ON = true;

	public static final int DRIVE_TRAIN_GEAR_RATIO = 1;	
	
	public static final int ROBOT_WEIGHT = 120;
	
	public static final boolean VERBOSE_OUTPUT = true;
	
	public static final class Autonomous {
		
		public static final class DefaultAuto {
			
			public static final class Step1LiftCan {
				
				public static final double POWER = 1;
			
				public static final double TIME_SECONDS = 4.5;
			}
			
			public static final class Step2DriveForwardWithAI {
				
				public static final class Drive {
								
					public static final double POWER = .4;
				
					public static final double TIME_SECONDS = 1.1;
					
					public static final boolean FORWARD = true;
				}
				
				public static final class AI {
					
					public static final double POWER = 1;
					
					public static final boolean IN = true;
				}
			}
		
			public static final class Step3Strafe {
				
				public static final double FRONT_RIGHT_POWER = 1;
				
				public static final double FRONT_LEFT_POWER = 1;
				
				public static final double REAR_RIGHT_POWER = .8;
				
				public static final double REAR_LEFT_POWER = .8;
				
				public static final double TIME_SECONDS = 3.0;
				
				public static final boolean RIGHT = false;
			}
		
			public static final class Step4DriveBackwardWithAI {
				
				public static final class Drive {
								
					public static final double POWER = .4;
				
					public static final double TIME_SECONDS = .75;
					
					public static final boolean FORWARD = false;
				}
				
				public static final class AI {
					
					public static final double POWER = 1;
					
					public static final boolean IN = false;
				}
			}
		}
		
		public static final class AltAuto1 {
			
			public static final class Step1LiftCan {
				
				public static final double POWER = 1.00;
				
				public static final double TIME_SECONDS = 6;
			}
			
//			public static final class Step2LiftCanWithAI {
//				
//				public static final class LiftCan {
//				
//					public static final double POWER = 1;
//
//					public static final double TIME_SECONDS = 3.75;
//				}
//				
//				public static final class AI {
//					
//					public static final double POWER = .25;
//					
//					public static final boolean IN = false;
//				}
//			}
			
			public static final class Step2DriveForwardWithAI {
				
				public static final class Drive {
								
					public static final double POWER = .4;
				
					public static final double TIME_SECONDS = 1.1;
					
					public static final boolean FORWARD = true;
				}
				
				public static final class AI {
					
					public static final double POWER = 1;
					
					public static final boolean IN = true;
				}
			}
		
			public static final class Step3Strafe {
				
				public static final double FRONT_RIGHT_POWER = 1;
				
				public static final double FRONT_LEFT_POWER = 1;
				
				public static final double REAR_RIGHT_POWER = .8;
				
				public static final double REAR_LEFT_POWER = .8;
				
				public static final double TIME_SECONDS = 2.0;
				
				public static final boolean RIGHT = false;
			}
		
			public static final class Step4DriveBackwardWithAI {
				
				public static final class Drive {
								
					public static final double POWER = .4;
				
					public static final double TIME_SECONDS = .75;
					
					public static final boolean FORWARD = false;
				}
				
				public static final class AI {
					
					public static final double POWER = 1;
					
					public static final boolean IN = false;
				}
			}
		}
	}
	
	public static final class OperatorControls {
		
		public static final int MAX_JOYSTICK_AXIS = 1;
		
		public static final int MIN_JOYSTICK_AXIS = -1;
		
		public static final int MIN_TRIGGER_AXIS = 0;
		
		public static final int MAX_TRIGGER_AXIS = 1;
		
		public static final class Controller {
			
			public static final class Xbox {
			
				public static final class Axes {
				
					public static final int LEFT_STICK_X = 0;
					
					public static final int LEFT_STICK_Y = 1;
					
					public static final int LEFT_TRIGGER = 2;
					
					public static final int RIGHT_TRIGGER = 3;
					
					public static final int RIGHT_STICK_X = 4;
					
					public static final int RIGHT_STICK_Y = 5;
				}
				
				public static final class Buttons {
				
					public static final int A = 1;
					
					public static final int B = 2;
					
					public static final int X = 3;
					
					public static final int Y = 4;
					
					public static final int LEFT_BUMPER = 5;
					
					public static final int RIGHT_BUMPER = 6;
					
					public static final int BACK = 7;
					
					public static final int START = 8;
					
					public static final int LEFT_STICK = 9;
					
					public static final int RIGHT_STICK = 10;
				}
				
				public static final class POV {
					
					public static final int CENTER = -1;
				
					public static final int UP = 0;
					
					public static final double UP_THRESHOLD = 0;
					
					public static final int RIGHT = 90;
					
					public static final int RIGHT_THRESHOLD = 0;
					
					public static final int DOWN = 180;
					
					public static final int DOWN_THRESHOLD = 0;
					
					public static final int LEFT = 270;
	
					public static final int LEFT_THRESHOLD = 0;
				}
				
				public static final class Deadzone {
					
					public static final double LEFT_X_CENTER = -0.043;
					
					public static final double LEFT_Y_CENTER = -0.039;
					
					public static final double RIGHT_X_CENTER = -0.125;
					
					public static final double RIGHT_Y_CENTER = 0;
					
					public static final double LEFT_X = 0.10;
					
					public static final double LEFT_Y = 0.07;
					
					public static final double RIGHT_X = 0.10;
					
					public static final double RIGHT_Y = 0.10;
				}
				
				public static final class ScalingValue {
					
					public static final double LEFT_X = 3;
					
					public static final double LEFT_Y = 3;
					
					public static final double RIGHT_X = 3;
					
					public static final double RIGHT_Y = 3;
				}
			}
			
			public static final class OperatorController {
				
				public static final class Axes {
					
					public static final int X = 0;
					
					public static final int Y = 1;
					
					public static final int Z = 2;
				}
				
				public static final class Buttons {
				
					public static final int OPERATOR_CONTROL_1 = 1;
					
					public static final int OPERATOR_CONTROL_2 = 2;
					
					public static final int OPERATOR_CONTROL_3 = 3;
					
					public static final int OPERATOR_CONTROL_4 = 4;
					
					public static final int OPERATOR_CONTROL_5 = 5;
					
					public static final int OPERATOR_CONTROL_6 = 6;
					
					public static final int OPERATOR_CONTROL_7 = 7;
					
					public static final int OPERATOR_CONTROL_8 = 8;
					
					public static final int OPERATOR_CONTROL_9 = 9;
					
					public static final int OPERATOR_CONTROL_10 = 10;
					
					public static final int OPERATOR_CONTROL_11 = 11;
				}
				
				public static final class Deadzone {
					
					public static final double X_CENTER = -0.043;
					
					public static final double Y_CENTER = -0.039;
					
					public static final double Z_CENTER = 0;
					
					public static final double X = 0.19;
					
					public static final double Y = 0.12;
					
					public static final double Z = 0.00;
				}
				
				public static final class ScalingValue {
					
					public static final double X = 1;
					
					public static final double Y = 1;
					
					public static final double Z = 1;
				}
			}
		}
	}
	
	public static final class FieldElements {
		
		public static final double TRASHCAN_HEIGHT_INCHES = 28.8;
		
		public static final double TRASHCAN_HEIGHT_FEET = Constants.FieldElements.TRASHCAN_HEIGHT_INCHES / 12;
	
		public static final double TRASHCAN_WEIGHT_POUNDS = 8.65;
	
		public static final double TOTE_HEIGHT_INCHES = 12.1;
		
		public static final double TOTE_HEIGHT_FEET = Constants.FieldElements.TOTE_HEIGHT_INCHES / 12;
	
		public static final double TOTE_WEIGHT_POUNDS = 7.8;
		
		public static final double TOTE_WIDTH_BOTTOM = 14.7;
	}

	public static final class ConveyerBelt {
		
		public static final double SPROCKET_DIAMETER_INCHES = 2.504;

		public static final double SPROCKET_RADIUS_INCHES = Constants.ConveyerBelt.SPROCKET_DIAMETER_INCHES/2;
	
		public static final double SPROCKET_CIRCUMFRENCE_INCHES = Constants.ConveyerBelt.SPROCKET_DIAMETER_INCHES * Math.PI;	
		
		public static final double SPROCKET_TO_MIDDLE_GEAR_RATIO = 2.504/1.751;
		
		public static final double MIDDLE_GEAR_TO_GEARBOX_GEAR_RATIO = 22/16;
		
		public static final double MANUAL_MOVE_SPEED = 1.00;
		
		public static final class Encoder {
		
			public static final double GEARBOX_PULSES_PER_REVOLUTION = 497;
			
			public static final double GEARBOX_REVOLUTIONS_PER_PULSE = 1/Constants.ConveyerBelt.Encoder.GEARBOX_PULSES_PER_REVOLUTION;
		
			public static final double DISTANCE_PER_PULSE = Constants.ConveyerBelt.SPROCKET_CIRCUMFRENCE_INCHES * Constants.ConveyerBelt.SPROCKET_TO_MIDDLE_GEAR_RATIO * Constants.ConveyerBelt.MIDDLE_GEAR_TO_GEARBOX_GEAR_RATIO * Constants.ConveyerBelt.Encoder.GEARBOX_REVOLUTIONS_PER_PULSE;
			
			public static final boolean REVERSED = false;
			
			public static final double RESET_THRESHOLD = 3;
		}
	}
	
	public static final class Motors {
		
			public static final double MOTOR_MAX_OUTPUT = 1.0;
			
			public static final boolean LEFT_REAR_DRIVE_REVERSED = false;
			
			public static final boolean RIGHT_REAR_DRIVE_REVERSED = true;
			
			public static final boolean LEFT_FRONT_DRIVE_REVERSED = true;
			
			public static final boolean RIGHT_FRONT_DRIVE_REVERSED = false;
	}
	
	public static final class Ports {
		
		public static final class Joystick {
			
			public static final int XBOX_CONTROLLER = 0;

			public static final int OPERATOR_CONTROLLER = 1;
		}
		
		public static final class PWM {
			
			public static final int CONVEYER_BELT_MOTOR = 4;
			
			public static final int FRONT_LEFT_DRIVE_MOTOR = 0;
		
			public static final int REAR_LEFT_DRIVE_MOTOR = 1;
			
			public static final int FRONT_RIGHT_DRIVE_MOTOR = 2;
			
			public static final int REAR_RIGHT_DRIVE_MOTOR = 3;
			
			public static final int REAR_MOTOR = 5;
			
			public static final int ACTIVE_INPUT_MOTOR_LEFT = 6;
			
			public static final int ACTIVE_INPUT_MOTOR_RIGHT = 7;
		}
		
		public static final class DIO {
			
			public static final int CONVEYER_BELT_ENCODER_A = 8;
		
			public static final int CONVEYER_BELT_ENCODER_B = 7;
			
			public static final int REAR_MOTOR_ENCODER_A = 6;
		
			public static final int REAR_MOTOR_ENCODER_B = 5;
			
			public static final int AUTONOMOUS_SWITCH_A = 0;
			
			public static final int AUTONOMOUS_SWITCH_B = 1;
			
			public static final int LIMIT_SWITCH = 2;
		}
		
		public static final class Analog {
			
			public static final int DRIVE_BASE_GYRO = 0;
			
			public static final int GYRO_TEMP_SENSOR = 1;
			
		}
	}

	public static final class RearMotorSpool {
		
		public static final double SPROCKET_DIAMETER_FEET = 1;
		
		public static final double SPROCKET_DIAMETER_INCHES = Constants.RearMotorSpool.SPROCKET_DIAMETER_FEET * 12;
	
		public static final double SPROCKET_RADIUS_FEET = Constants.RearMotorSpool.SPROCKET_DIAMETER_FEET/2;
	
		public static final double SPROCKET_RADIUS_INCHES = Constants.RearMotorSpool.SPROCKET_DIAMETER_INCHES/2;

		public static final double SPROCKET_CIRCUMFRENCE_FEET = Constants.RearMotorSpool.SPROCKET_DIAMETER_FEET * Math.PI;
		
		public static final double SPROCKET_CIRCUMFRENCE_INCHES = Constants.RearMotorSpool.SPROCKET_DIAMETER_INCHES * Math.PI;
		
		public static final double SPROCKET_TO_GEARBOX_GEAR_RATIO = 36/16;
		
		public static final double MANUAL_MOVE_SPEED_UP = 1.00;
		
		public static final double MANUAL_MOVE_SPEED_DOWN = 0.75;
		
		public static final class Encoder {
			
			public static final double DISTANCE_PER_PULSE = Constants.RearMotorSpool.SPROCKET_CIRCUMFRENCE_FEET * Constants.RearMotorSpool.SPROCKET_TO_GEARBOX_GEAR_RATIO * Constants.RearMotorSpool.Encoder.GEARBOX_REVOLUTIONS_PER_PULSE;
						
			public static final double GEARBOX_PULSES_PER_REVOLUTION = 497;
			
			public static final double GEARBOX_REVOLUTIONS_PER_PULSE = 1/Constants.RearMotorSpool.Encoder.GEARBOX_PULSES_PER_REVOLUTION;
					
			public static final boolean REVERSED = true;
			
			public static final double RESET_THRESHOLD = 3;
		}	
	}
	
	public static final class ActiveIntake {
		
		public static final double AUTO_MOVE_SPEED = .85;
		
		public static final double SPIN_MOVE_SPEED_LEFT = .5;
		
		public static final double SPIN_MOVE_SPEED_RIGHT = .15;
	}
}
