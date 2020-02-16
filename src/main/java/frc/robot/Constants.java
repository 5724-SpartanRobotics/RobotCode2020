/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    public static final class DriveConstants {
        public static final int kMotorR1ID = 14;
        public static final int kMotorR2ID = 17;
        public static final int kMotorR3ID = 19;
        public static final int kMotorL1ID = 15;
        public static final int kMotorL2ID = 12;
        public static final int kMotorL3ID = 13;

        public static final int kJoystickFwd = 3;
        public static final int kJoystickRev = 2;
        public static final int kJoystickRotate = 0;

        public static final int kShiftBtn = 6;
        public static final int kClimbBtn = 8;

        public static final int kShifterSolenoidID = 2;
    }

    public static final class MagazineConstants {
        public static final int kMotorBottomID = 9;
        public static final int kMotorTopID = 20; 

        public static final int kMagazineJoystick = 5;

        public static final int kSolenoidID = 0;
    }

    public static final class IntakeConstants {
        public static final int kMotorIntakeID = 32;
        public static final int kSolenoidID = 3;
        public static final int kIntakeJoystick = 1;
        public static final int kExtendBtn = 3;
    }

    public static final class ColorWheelConstants {
        public static final int kMotorID = 31;
        public static final int kSolenoidID = 1;
        public static final int kColorWheelLeftPOV = 270;
        public static final int kColorWheelRightPOV = 90;
        public static final int kFlipBtn = 2;
    }

    public static final class ClimbConstants {
        public static final int kHookMotorID = 16;
        public static final int kWenchMotor1ID = 30;
        public static final int kWenchMotor2ID = 33;

        public static final int kHookUpBtn = 0;
        public static final int kHookDownBtn = 0;
    }
}
