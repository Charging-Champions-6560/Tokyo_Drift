// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.controls.manualdrive;

import frc.robot.commands.DriveCommand;
import frc.robot.utility.NumberStepper;
import frc.robot.utility.PovNumberStepper;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.Joystick;


import static frc.robot.Constants.*;


/** Add your docs here. */
public class ManualControls implements DriveCommand.Controls {

    private final Joystick xbox;
    private final Joystick controlStation;
    
    private final Joystick backupXbox;

    private final PovNumberStepper speed;
    private final PovNumberStepper turnSpeed;


    public ManualControls(Joystick xbox, Joystick controlStation, Joystick backupXbox) {
        this.xbox = xbox;
        this.controlStation = controlStation;
        this.backupXbox = backupXbox;

        this.speed = new PovNumberStepper(
            new NumberStepper(0.5, 0.2, 1.0, 0.1),
            xbox,
            PovNumberStepper.PovDirection.VERTICAL
        );

        this.turnSpeed = new PovNumberStepper(
            new NumberStepper(0.5, 0.2, 1.0, 0.05),
            xbox,
            PovNumberStepper.PovDirection.HORIZONTAL
        );
    }

    @Override
    public double getX() {
        if(xbox.getRawButton(6))
            return -0.8;
        else if(xbox.getRawButton(5))
            return 0.8;
        else{
            return 0;
        }
            
        // return xbox.getRawAxis(ControllerIds.XBOX_R_JOY_X);
    }
    //right 6
    //left 5 

    @Override
    public double getY() {
        double backforce = xbox.getRawAxis(1);
        double fowardForce = xbox.getRawAxis(2);
        return fowardForce - backforce;
        // return -xbox.getRawAxis(ControllerIds.XBOX_L_JOY_Y);
    }

    @Override
    public double getSpeed() {
        return speed.get();
    }

    @Override
    public double getTurnSpeed() {
        return turnSpeed.get();
    }

    @Override
    public boolean getQuickTurn() {
        // TODO Auto-generated method stub
        return xbox.getRawButton(3) || xbox.getRawButton(2);
    }
    

}
