package org.usfirst.frc.team4015.robot.subsystems;

import org.usfirst.frc.team4015.robot.RobotMap;
import org.usfirst.frc.team4015.robot.commands.Drive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem
{	
	public Talon left;
	public Talon right;
	
	public RobotDrive chassis;
	
	// DEFAULT CONSTRUCTOR //
	
	public Drivetrain()
	{
		left = new Talon(RobotMap.leftMotors);
		right = new Talon(RobotMap.rightMotors);	
		chassis = new RobotDrive(left, right);
	}
	
	/* =========== TANK DRIVE ===========
	 * throttle ---> move value (Y value)
	 * yaw ---> turn value (X value)
	 * ================================*/
	
	public void tankDrive(double throttle, double yaw)
	{
		chassis.arcadeDrive(throttle, yaw);
	}
	
	// STOP //
	
	public void stop()
	{
		tankDrive(0, 0);
	}

	public void initDefaultCommand()
	{
		// Set the default command for a subsystem here.
		setDefaultCommand(new Drive());
	}
}
