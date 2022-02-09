package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

@Autonomous(name = "Red Auto Carousel", group = "Pushbot")

public class AutonomousRedCarousel extends LinearOpMode {
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


        /*robot.move(-25,0,0,0.3,5);
        sleep(100);
        robot.setCarousel(0.7);
        sleep(2000);
        robot.move(0,-32,0,0.5,5);
        sleep(100);
        robot.turn(75,0.5,3);
        sleep(1000);
        robot.barcodeDistance();*/
        if (23< robot.steveO.getDistance(DistanceUnit.INCH) && 26>robot.steveO.getDistance(DistanceUnit.INCH)){
            robot.move(15, 0, 0, 0.5, 3);
           sleep(100);
            robot.move(0, 0, 80, 0.3, 3);
            sleep(100);
            robot.move(25, 0, 0, 0.5, 3);
            sleep(100);
            robot.move(0,0,350,0.5,3);
            sleep(100);
            robot.setRegula1(0.8);
            sleep(100);
            robot.setBaller(-0.3);
            sleep(100);
            robot.setRegula1(-0.8);
            sleep(100);
            robot.move(0,0,-350,0.5,3);
        } else robot.move(-12,0,0,0.3,3);
        if (23< robot.steveO.getDistance(DistanceUnit.INCH) && 26>robot.steveO.getDistance(DistanceUnit.INCH)) {
            robot.move(27, 0, 0, 0.5, 3);
            sleep(100);
            robot.move(0, 0, 80, 0.3, 3);
            sleep(100);
            robot.move(25, 0, 0, 0.5, 3);
            sleep(100);
            robot.setRegula1(0.5);
            sleep(100);
            robot.setBaller(-0.3);
            sleep(100);
            robot.setRegula1(-0.5);
            sleep(100);
        } else robot.move(-12,0,0,0.3,3);
        if (23< robot.steveO.getDistance(DistanceUnit.INCH) && 26>robot.steveO.getDistance(DistanceUnit.INCH)) {
            robot.move(39, 0, 0, 0.5, 3);
            sleep(100);
            robot.move(0, 0, 80, 0.3, 3);
            sleep(100);
            robot.move(25, 0, 0, 0.5, 3);
            sleep(100);
            robot.setRegula1(0.2);
            sleep(100);
            robot.setBaller(-0.3);
            sleep(100);
            robot.setRegula1(-0.2);
            sleep(100);
        }

        robot.move(-24,24,0,0.5,5);
        sleep(100);
        robot.move(0,0,-80,0.3,3);
        sleep(100);
        robot.move(-25,-8,0,0.5,5);
        sleep(100);
        robot.setCarousel(0.7);
        sleep(1000);
        robot.setCarousel(0);
        sleep(100);
        robot.move(0,-34,0,0.5,5);








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


