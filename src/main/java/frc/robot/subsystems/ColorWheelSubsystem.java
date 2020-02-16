/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ColorWheelConstants;

public class ColorWheelSubsystem extends SubsystemBase {
  
  private VictorSPX colorWheelMotor = new VictorSPX(ColorWheelConstants.kMotorID);
  private Solenoid toggleSolenoid = new Solenoid(ColorWheelConstants.kSolenoidID);
  private boolean isUp = false;

  /**
   * Creates a new ExampleSubsystem.
   */
  public ColorWheelSubsystem() {
    colorWheelMotor.setNeutralMode(NeutralMode.Brake);
  }

  public void run(double velocity) {
    colorWheelMotor.set(ControlMode.PercentOutput, velocity);
  }

  public void flip() {
    isUp = !isUp;
    toggleSolenoid.set(isUp);
  }

  public void reset() {
    isUp = false;
    toggleSolenoid.set(isUp);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
