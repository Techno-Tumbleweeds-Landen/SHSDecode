package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;



@TeleOp
public class TeleOpMain extends OpMode {
    RobotHardware rob = new RobotHardware();

    // This runs once when the user presses init
    @Override
    public void init() {
        rob.init(hardwareMap);
    }
    // This runs in a loop after the user presses play
    @Override
    public void loop() {
        rob.leftMotor.setPower(gamepad1.left_stick_y);
        rob.rightMotor.setPower(gamepad1.right_stick_y);
    }
}
