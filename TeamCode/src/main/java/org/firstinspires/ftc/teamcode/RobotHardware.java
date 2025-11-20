package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class RobotHardware {
    DcMotor leftMotor, rightMotor;

    public void init(HardwareMap HwMap) {

        leftMotor = HwMap.get(DcMotor.class, "leftMotor");
        rightMotor = HwMap.get(DcMotor.class, "rightMotor");
    }
}
