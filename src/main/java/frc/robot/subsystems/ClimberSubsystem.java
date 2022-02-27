// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ClimberSubsystem extends SubsystemBase {
<<<<<<< Updated upstream:src/main/java/frc/robot/subsystems/climberSubsystem.java
public final WPI_TalonFX climberMotor = new WPI_TalonFX(67);
  /** Creates a new climberSubsystem. */
=======
  public final WPI_TalonFX climberMotor = new WPI_TalonFX(71);
  /** Creates a new climberSubsytem. */
>>>>>>> Stashed changes:src/main/java/frc/robot/subsystems/ClimberSubsystem.java
  public ClimberSubsystem() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void climberUp(){
  climberMotor.set(ControlMode.PercentOutput, 0.5);
  }

  public void climberDown(){
    climberMotor.set(ControlMode.PercentOutput, -0.5);
  }

  public void climberOff(){
    climberMotor.stopMotor();
  }
}
