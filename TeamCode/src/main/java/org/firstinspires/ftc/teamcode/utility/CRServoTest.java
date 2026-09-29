package org.firstinspires.ftc.teamcode.utility;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Utility;
import com.seattlesolvers.solverslib.hardware.motors.CRServoEx;

@Utility(name = "Continuous Rotation Servo Test", description = "Moves the servo named '" + CRServoTest.ID + '\'')
public class CRServoTest extends LinearOpMode {
    public static final String ID = "testCRServo";

    @Override
    public void runOpMode() {
        final CRServoEx servo = new CRServoEx(hardwareMap, ID);
        waitForStart();

        while (!isStopRequested()) {
            servo.set(0.4D);
        }

        servo.stop();
    }
}
