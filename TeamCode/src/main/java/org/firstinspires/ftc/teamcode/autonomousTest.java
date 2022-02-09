package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

@Autonomous (name = "autonomous Pump", group = "Pushbot")

public class autonomousTest extends LinearOpMode {
    ftc2021 robot = new ftc2021();
    private ElapsedTime runtime  = new ElapsedTime();
    static final double FORWARD_SPEED = 0.6;
    static final double TURN_SPEED = 0.5;
    static final double STRAFE_SPEED = 0.6;


    @Override
    public void runOpMode() {
        robot.init(hardwareMap, telemetry);



        telemetry.addData("Status","Ready to run");
        telemetry.update();


        runtime.reset();

        waitForStart();

        robot.frontLeft.setPower(FORWARD_SPEED);
        robot.backLeft.setPower(FORWARD_SPEED);
        robot.frontRight.setPower(FORWARD_SPEED);
        robot.backRight.setPower(FORWARD_SPEED);
        runtime.reset();


        robot.forward(20,-0.5,5);



        runtime.reset();
        while (opModeIsActive() && (runtime.seconds()<1.0)){


            telemetry.addData("Path","Leg 2:%2.5f S Elapsed", runtime.seconds());
            telemetry.update();



        }

    }
}
