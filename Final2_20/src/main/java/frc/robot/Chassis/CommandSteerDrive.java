/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.Chassis;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.*;

public class CommandSteerDrive extends Command {
  public CommandSteerDrive() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.tankDriveSubsystem);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {

  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    Robot.tankDriveSubsystem.steerDrive();
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return !Robot.oi.joy1.getRawButton(OI.steerButton);
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.tankDriveSubsystem.drive(0,0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    
  }
}
