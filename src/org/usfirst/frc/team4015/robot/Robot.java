package org.usfirst.frc.team4015.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

// SUBSYSTEM IMPORTS //

import org.usfirst.frc.team4015.robot.subsystems.Drivetrain;
import org.usfirst.frc.team4015.robot.subsystems.Pneumatics;
import org.usfirst.frc.team4015.robot.subsystems.Winch;

// ROBOT MODES (COMMAND GROUP) IMPORTS //

import org.usfirst.frc.team4015.robot.robotModes.Teleop;
import org.usfirst.frc.team4015.robot.robotModes.Auto;

/* =============================================================================
 * The RoboRIO will automatically run the methods in this class depending on
 * which part of the match is being played.
 * ============================================================================*/

// Test

public class Robot extends IterativeRobot
{
	// SUBSYSTEM DECLARTION //
	
	public static Drivetrain drivetrain;
	public static Pneumatics pneumatics;
	public static Winch winch;
	
	// DECALARE ROBOT MODES (COMMAND GROUPS) //
	
	Command teleop;
	Command auto;
	
	/* ===================================
	 * This function is run when the robot 
	 * is first started up.
	 * ==================================*/
	
	@Override
	public void robotInit()
	{
		// SUBSYSTEM INSTANTIATION //
		
		drivetrain = new Drivetrain();
		pneumatics = new Pneumatics();
		winch = new Winch();
		
		// INSTANTIATE ROBOT MODES (COMMAND GROUPS) //
		
		teleop = new Teleop();
		auto = new Auto();
	}

	/* =================================================
	 * This function is called once each time the robot 
	 * enters Disabled mode. You can use it to reset any 
	 * subsystem information you want to clear when the 
	 * robot is disabled.
	 * ================================================*/
	
	@Override
	public void disabledInit()
	{

	}

	@Override
	public void disabledPeriodic()
	{
		// Run Scheduler to manage Commands / CommandGroups
		Scheduler.getInstance().run();
	}

	/* ===============================================================
	 * This method is called at the beginning of the autonomous period
	 * ==============================================================*/
	
	@Override
	public void autonomousInit()
	{
		// START AUTONOMOUS COMMAND GROUP //
		
		if (auto != null)
		{
			auto.start();
		}
	}

	/* ======================================================
	 * This function is called periodically during autonomous
	 * =====================================================*/
	
	@Override
	public void autonomousPeriodic()
	{
		// Run Scheduler to manage Commands / CommandGroups
		Scheduler.getInstance().run();
	}
	
	/* ================================================
	 * This method is called at the beginning of teleop
	 * ==============================================*/

	@Override
	public void teleopInit()
	{	
		// STOP AUTONOMOUS COMMAND GROUP //
		
		if (auto != null)
		{
			auto.cancel();
		}
		
		// START TELEOP COMMAND GROUP //
		
		if (teleop != null)
		{
			teleop.start();
		}
	}

	/* ===================================================
	 * This function is called periodically during teleop
	 * ==================================================*/
	
	@Override
	public void teleopPeriodic()
	{
		// Run Scheduler to manage Commands / CommandGroups
		Scheduler.getInstance().run();
	}

	/* =====================================================
	 * This function is called periodically during test mode
	 * ====================================================*/
	
	@Override
	public void testPeriodic()
	{
		LiveWindow.run();
	}
}
