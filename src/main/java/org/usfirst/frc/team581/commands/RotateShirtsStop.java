package org.usfirst.frc.team581.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team581.robot.Robot;

public class RotateShirtsStop extends Command {

  public RotateShirtsStop() {

  }

  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  protected void execute() {
    // System.out.println("---> Double forward");
    Robot.turret.rotateShirtsStop();
  }

  // Make this return true when this Command no longer needs to run execute()
  protected boolean isFinished() {
    return true;
  }

  // Called once after isFinished returns true
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  protected void interrupted() {
  }

}
