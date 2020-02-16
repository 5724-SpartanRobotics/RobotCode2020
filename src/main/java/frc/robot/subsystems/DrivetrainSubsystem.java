/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConstants;

public class DrivetrainSubsystem extends SubsystemBase {

  private CANSparkMax leftMotorMain = new CANSparkMax(DriveConstants.kMotorR1ID, MotorType.kBrushless);
  private CANSparkMax leftMotorAlt1 = new CANSparkMax(DriveConstants.kMotorR2ID, MotorType.kBrushless);
  private CANSparkMax leftMotorAlt2 = new CANSparkMax(DriveConstants.kMotorR3ID, MotorType.kBrushless);
  private CANSparkMax rightMotorMain = new CANSparkMax(DriveConstants.kMotorL1ID, MotorType.kBrushless);
  private CANSparkMax rightMotorAlt1 = new CANSparkMax(DriveConstants.kMotorL2ID, MotorType.kBrushless);
  private CANSparkMax rightMotorAlt2 = new CANSparkMax(DriveConstants.kMotorL3ID, MotorType.kBrushless);
  
  private DifferentialDrive robotDrive;

  private Solenoid shifterSolenoid = new Solenoid(DriveConstants.kShifterSolenoidID);
  private boolean isLowGear = false;

  /**
   * Creates a new ExampleSubsystem.
   */
  public DrivetrainSubsystem() {
    leftMotorMain.setIdleMode(IdleMode.kCoast);
    leftMotorAlt1.setIdleMode(IdleMode.kCoast);
    leftMotorAlt2.setIdleMode(IdleMode.kCoast);
    rightMotorMain.setIdleMode(IdleMode.kCoast);
    rightMotorAlt1.setIdleMode(IdleMode.kCoast);
    rightMotorAlt2.setIdleMode(IdleMode.kCoast);

    leftMotorAlt1.follow(leftMotorMain);
    leftMotorAlt2.follow(leftMotorMain);
    
    rightMotorAlt1.follow(rightMotorMain);
    rightMotorAlt2.follow(rightMotorMain);

    robotDrive = new DifferentialDrive(leftMotorMain, rightMotorMain);
  }

  public void arcadeDrive(double speed, double rotation) {
    robotDrive.arcadeDrive(speed, rotation);
  }

  public void shift() {
    isLowGear = !isLowGear;
    shifterSolenoid.set(isLowGear);
  }

  public void reset() {
    isLowGear = false;
    shifterSolenoid.set(isLowGear);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
