// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.TalonFXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ElevatorDropConstants;

public class ArmDropSubsystem extends SubsystemBase {
  private final TalonFX m_ArmDropMotor = new TalonFX(ElevatorDropConstants.kElevatorDropID);
  private final DigitalInput elevatorArmLimitSwitch = new DigitalInput(0);
  /** Creates a new ArmDropSubsystem. */
  public ArmDropSubsystem() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void ArmDropMotorSpeed (double aSpeed) {
    m_ArmDropMotor.set(TalonFXControlMode.PercentOutput, aSpeed);
  }
}
