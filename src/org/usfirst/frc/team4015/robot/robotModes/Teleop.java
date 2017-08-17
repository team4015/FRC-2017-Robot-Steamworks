package org.usfirst.frc.team4015.robot.robotModes;

import org.usfirst.frc.team4015.robot.commands.Drive;
import org.usfirst.frc.team4015.robot.commands.MoveRamp;
import org.usfirst.frc.team4015.robot.commands.ToggleCompressor;
import org.usfirst.frc.team4015.robot.commands.ClimbRope;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class Teleop extends CommandGroup
{
	// CONSTRUCTOR //
	
	public  Teleop()
	{	
    	addParallel(new Drive());
    	addParallel(new MoveRamp());
    	addParallel(new ClimbRope());
    	
    	// Uncomment for manual compressor control
    	addParallel(new ToggleCompressor());
    }
	
}
