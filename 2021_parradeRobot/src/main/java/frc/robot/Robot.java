// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  
  //Motor Controllers
  WPI_VictorSPX Cont_DriveL = new WPI_VictorSPX(11);
  WPI_VictorSPX Cont_DriveR = new WPI_VictorSPX(12);

  //Drivetrain
  DifferentialDrive drive = new DifferentialDrive(Cont_DriveL, Cont_DriveR);

  //Input devices
  XboxController Xbox = new XboxController(0);

  Double btn_DriveFB;
  Double btn_DriveSpin;

  @Override
  public void robotInit() { }

  @Override
  public void robotPeriodic() {}

  @Override
  public void autonomousInit() {}

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {}

  @Override
  public void teleopPeriodic() {

    btn_DriveFB = Xbox.getRawAxis(5);
    btn_DriveSpin = Xbox.getRawAxis(4);


    drive.arcadeDrive(-0.8*btn_DriveFB, 0.8*btn_DriveSpin);
  }

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}
}
