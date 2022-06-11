// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;

public class DriveCommand extends CommandBase {

  public static interface Controls {
    double getX();
    double getY();
    double getSpeed();
    double getTurnSpeed();
    boolean getQuickTurn();
  }

  private final Drivetrain driveTrain;

  private final Controls controls;

  /** Creates a new DriveCommand. */
  public DriveCommand(Drivetrain driveTrain, Controls controls) {
    addRequirements(driveTrain);
    this.driveTrain = driveTrain;

    this.controls = controls;
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    driveTrain.getDifferentialDrive().stopMotor();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double speed = controls.getSpeed();
    double turnSpeed = controls.getTurnSpeed();

    double x = controls.getX();
    double y = controls.getY();

    if (Math.abs(x) < 0.1) {
      x = 0;
      // driveTrain.setLVelocity(0);
      // driveTrain.setRVelocity(0);
    }

    if (Math.abs(y) < 0.1) {
      y = 0;
      // driveTrain.setLVelocity(0);
      // driveTrain.setRVelocity(0);
    }

    x *= turnSpeed;

    y *= speed;

    driveTrain.setVelocity(y, x, controls.getQuickTurn());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    driveTrain.getDifferentialDrive().stopMotor();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
