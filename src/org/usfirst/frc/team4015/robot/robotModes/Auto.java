package org.usfirst.frc.team4015.robot.robotModes;

import org.usfirst.frc.team4015.robot.commands.DriveToBaseLine;
import edu.wpi.first.wpilibj.command.CommandGroup;

/* ===================================================
 * This CommandGroup calls the autonomous command to
 * drive to the base line.
 * =================================================*/

public class Auto extends CommandGroup
{
	// CONSTRUCTOR //
	
	public  Auto()
	{
		addSequential(new DriveToBaseLine());
    }
	
}
