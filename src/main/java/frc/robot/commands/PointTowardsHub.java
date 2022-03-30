package frc.robot.commands;

import frc.robot.Constants;
import frc.robot.subsystems.SwerveDriveSubsystem;

import java.util.function.DoubleSupplier;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.math.kinematics.ChassisSpeeds;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class PointTowardsHub extends CommandBase {
    private final SwerveDriveSubsystem drivetrain;
    public PIDController LimeLightRotationPID;
    DoubleSupplier fBAxis; 
    DoubleSupplier rLAxis;


    public PointTowardsHub(SwerveDriveSubsystem drivetrain, DoubleSupplier fBAxis, DoubleSupplier rLAxis) {
        this.drivetrain = drivetrain;
        this.fBAxis = fBAxis;
        this.rLAxis = rLAxis;
    }
    @Override
    public void initialize() {
        LimeLightRotationPID = new PIDController(3, 0, 0);
        LimeLightRotationPID.enableContinuousInput(-Math.PI, Math.PI);
    }

    @Override
    public void execute() {
        drivetrain.CommandVariable = "TowardsHub";
        if (NetworkTableInstance.getDefault().getTable("limelight").getEntry("tv").getDouble(0) == 1) {
            double toRotate = LimeLightRotationPID.calculate(0, -NetworkTableInstance.getDefault().getTable("limelight").getEntry("tx").getDouble(0) * Math.PI/180);
            drivetrain.drive(ChassisSpeeds.fromFieldRelativeSpeeds(fBAxis.getAsDouble() * Constants.MAX_VELOCITY_METERS_PER_SECOND, rLAxis.getAsDouble() * Constants.MAX_VELOCITY_METERS_PER_SECOND, toRotate + 0.1 * Math.signum(toRotate), drivetrain.getRotation()));
        }
    }

    @Override
    public void end(boolean interrupted) {
        // Stop the drivetrain
        drivetrain.drive(new ChassisSpeeds(0.0, 0.0, 0.0));
    }
}