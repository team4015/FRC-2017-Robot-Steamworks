package org.usfirst.frc.team4015.robot.robotModes;

import org.usfirst.frc.team4015.robot.commands.DriveToBaseLine;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class Auto extends CommandGroup
{
	// CONSTRUCTOR //
	
	public  Auto()
	{
		addSequential(new DriveToBaseLine());
    }
	
}
