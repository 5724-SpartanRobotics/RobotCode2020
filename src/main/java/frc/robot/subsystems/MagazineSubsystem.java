/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.MagazineConstants;

public class MagazineSubsystem extends SubsystemBase {

  private CANSparkMax motorBottom = new CANSparkMax(MagazineConstants.kMotorBottomID, MotorType.kBrushless);
  private CANSparkMax motorTop = new CANSparkMax(MagazineConstants.kMotorTopID, MotorType.kBrushless);
  /**
   * Creates a new ExampleSubsystem.
   */
  public MagazineSubsystem() {

  }

  public void run(double power) {
    motorBottom.set(power);
    motorTop.set(power);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
