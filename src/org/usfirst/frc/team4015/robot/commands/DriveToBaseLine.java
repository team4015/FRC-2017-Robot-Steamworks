package org.usfirst.frc.team4015.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team4015.robot.Robot;

/* ===================================================
 * This command drives the robot in a straight line
 * to the baseline in the autonomous period.
 * The compressor will run in preparation for teleop.
 * =================================================*/

public class DriveToBaseLine extends Command
{
	public DriveToBaseLine()
	{
		// Use requires() here to declare subsystem dependencies
		requires(Robot.drivetrain);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize()
	{
		Robot.drivetrain.stop();
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute()
	{
		Robot.drivetrain.left.set(0.13);
		Robot.drivetrain.right.set(-0.13);
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished()
	{
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end()
	{
		Robot.drivetrain.stop();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted()
	{
		Robot.drivetrain.stop();
	}
}