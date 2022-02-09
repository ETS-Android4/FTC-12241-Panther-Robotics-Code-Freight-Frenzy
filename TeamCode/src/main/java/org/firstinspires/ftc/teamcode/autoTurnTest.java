package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous(name = "turn test", group = "Pushbot")

public class autoTurnTest extends LinearOpMode {
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



        robot.turn(90,0.5,1);

/*
        robot.forward(-24,1,3);
        sleep(100);
        robot.setCarousel(0.7,6);
        sleep(6000);
        robot.turn(90,0.5,1);
        sleep(1000);
        robot.forward(36,1,4);
        sleep(100);
        robot.turn(90,0.5,1);
        sleep(1000);
        robot.barcodeDistance();*/



        //robot.distance();


        /*
        robot.turn(-45,-0.5,0.6);
        sleep(1000);
        robot.forward(20,-0.5,6);
        sleep(1000);
        robot.setCarousel(0.8,5);
        sleep(5000);
        robot.turn(45,0.5,0.6);
        sleep(1000);
        robot.forward(5,0.5,3);
*/



        runtime.reset();
        while (opModeIsActive() && (runtime.seconds()<1.0)){


            telemetry.addData("Path","Leg 2:%2.5f S Elapsed", runtime.seconds());
            telemetry.update();



        }

    }
}


