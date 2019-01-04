package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name = "CraterRight (Blocks to Java)", group = "")
public class CraterRight extends LinearOpMode {

  private DcMotor front_right;
  private DcMotor back_right;
  private DcMotor front_left;
  private DcMotor back_left;

  /**
   * This function is executed when this Op Mode is selected from the Driver Station.
   */
  @Override
  public void runOpMode() {
    front_right = hardwareMap.dcMotor.get("front_right");
    back_right = hardwareMap.dcMotor.get("back_right");
    front_left = hardwareMap.dcMotor.get("front_left");
    back_left = hardwareMap.dcMotor.get("back_left");

    // Put initialization blocks here.
    waitForStart();
    if (opModeIsActive()) {
      // Put run blocks here.
      while (opModeIsActive()) {
        // Put run blocks here.
        // Moving to the right
        front_right.setPower(0);
        back_right.setPower(0);
        front_left.setPower(0.4);
        back_left.setPower(0.4);
        sleep(1000);
        // Move forward to move off cube
        front_left.setPower(0.5);
        front_right.setPower(-0.5);
        back_right.setPower(-0.5);
        back_left.setPower(0.5);
        sleep(1400);
        // Move backward to start
        front_right.setPower(0.4);
        back_right.setPower(0.4);
        front_left.setPower(-0.4);
        back_left.setPower(-0.4);
        sleep(1250);
        // Moving to the right
        front_left.setPower(-0.5);
        back_left.setPower(-0.5);
        front_right.setPower(0);
        back_right.setPower(0);
        sleep(1400);
        // 90 Degree Turn
        front_right.setPower(-0.5);
        front_left.setPower(0);
        back_right.setPower(-0.5);
        back_left.setPower(0);
        sleep(2050);
        // Go Forward
        front_right.setPower(-0.5);
        front_left.setPower(0.5);
        back_right.setPower(-0.5);
        back_left.setPower(0.5);
        sleep(1100);
        // 45 Degree Turn
        front_right.setPower(-0.75);
        front_left.setPower(0);
        back_right.setPower(-0.75);
        back_left.setPower(0);
        sleep(1650);
        // Go Forward
        front_right.setPower(-0.3);
        front_left.setPower(0.3);
        back_right.setPower(-0.3);
        back_left.setPower(0.3);
        sleep(2500);
        telemetry.update();
        break;
      }
    }
  }
}