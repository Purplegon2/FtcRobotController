package org.firstinspires.ftc.teamcode.utility;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Utility;
import com.seattlesolvers.solverslib.hardware.motors.Motor;
import com.seattlesolvers.solverslib.hardware.motors.MotorEx;

@Utility(name = "Motor Test", description = "Moves the motor named '" + MotorTest.ID + '\'')
public class MotorTest extends LinearOpMode {
    public static final String ID = "testMotor";

    @Override
    public void runOpMode() {
        final MotorEx motor = new MotorEx(hardwareMap, ID);
        motor.setRunMode(Motor.RunMode.RawPower);
        waitForStart();

        while (!isStopRequested()) {
            motor.set(0.4D);
        }

        motor.stopMotor();
    }
}
