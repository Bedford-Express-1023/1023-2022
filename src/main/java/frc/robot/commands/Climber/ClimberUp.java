// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.Climber;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ClimberSubsystem;

public class ClimberUp extends CommandBase {
<<<<<<< Updated upstream:src/main/java/frc/robot/commands/Climber/ClimberUp.java
  /** Creates a new ClimberUp. 
 * @param m_climber*/
  public ClimberUp(ClimberSubsystem m_climber) {
=======
  ClimberSubsystem m_ClimberSubsytem;
  /** Creates a new climberUp. */
  public ClimberUp(ClimberSubsystem climberSubsytem) {
    m_ClimberSubsytem = climberSubsytem;
    addRequirements(m_ClimberSubsytem);
>>>>>>> Stashed changes:src/main/java/frc/robot/commands/Climber/climberUp.java
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}