// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final class ControllerIds {
        public static final int FIRST_DRIVER_CONTROLLER = 0;
        public static final int SECOND_DRIVER_CONTROL_STATION = 1;
        public static final int SECOND_DRIVER_CONTROLLER = 2;

        public static final int XBOX_L_JOY_X = 0;
        public static final int XBOX_L_JOY_Y = 1;

        public static final int XBOX_R_JOY_X = 4;
        public static final int XBOX_R_JOY_Y = 5;

        public static final int XBOX_L_BUMPER = 5;
        public static final int XBOX_R_BUMPER = 6;

        public static final int XBOX_L_TRIGGER = 2;
        public static final int XBOX_R_TRIGGER = 3;

        public static final int XBOX_Y_BUTTON = 4;
        public static final int XBOX_X_BUTTON = 3;
        public static final int XBOX_B_BUTTON = 2;
        public static final int XBOX_A_BUTTON = 1;

        public static final int DRIVER_STATION_TOGGLE_1 = 2;
        public static final int DRIVER_STATION_TOGGLE_2 = 5;
        public static final int DRIVER_STATION_TOGGLE_3 = 6;
        public static final int DRIVER_STATION_TOGGLE_4 = 9;

        public static final int DRIVER_STATION_BUTTON_1 = 4;
        public static final int DRIVER_STATION_BUTTON_2 = 1;
        public static final int DRIVER_STATION_BUTTON_3 = 3;

        public static final int DRIVER_STATION_X_AXIS = 0;
        public static final int DRIVER_STATION_Y_AXIS = 1;
    }

    public static final class RobotIds {
        
        //TODO: Negative Motor controller ids are tbd
        public static final int DRIVETRAIN_R_FRONT_MOTOR = 3;
        public static final int DRIVETRAIN_R_BACK_MOTOR = 2;

        public static final int DRIVETRAIN_L_FRONT_MOTOR = 4;
        public static final int DRIVETRAIN_L_BACK_MOTOR = 6;
    }

}
