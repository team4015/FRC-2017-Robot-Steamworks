package org.usfirst.frc.team4015.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team4015.robot.RobotMap;
import org.usfirst.frc.team4015.robot.subsystems.pneumaticsControl.Piston;
import edu.wpi.first.wpilibj.Compressor;

public class Pneumatics extends Subsystem
{
	public Compressor compressor;
	public Piston ramp;
	
	// CONSTRUCTOR //
	
	public Pneumatics()
	{
		compressor = new Compressor();
		
		ramp = new Piston(RobotMap.rampPistonLeft, RobotMap.rampPistonRight);
		
		// Compressor automatic refill on by default
		// (when pressure is below switch threshold)
		compressor.setClosedLoopControl(true);
	}
	
	// TOGGLE COMPRESSOR //
	
	public void toggleCompressor()
    {
	    if (compressor.enabled() == false)
	    {
	    	compressor.setClosedLoopControl(true);
	    }
	    else
	    {
	    	compressor.setClosedLoopControl(false);
	    	compressor.stop();
	    }
    }

	public void initDefaultCommand()
	{
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}