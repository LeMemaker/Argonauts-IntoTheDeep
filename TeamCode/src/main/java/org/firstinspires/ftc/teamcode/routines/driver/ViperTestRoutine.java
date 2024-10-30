package org.firstinspires.ftc.teamcode.routines.driver;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.routines.Routine;
import org.firstinspires.ftc.teamcode.subsystems.ViperSystem;

@TeleOp(name = "ViperTest")
public class ViperTestRoutine extends Routine {
    public ViperSystem viperSystem;

    @Override
    public void onInit() {
        super.onInit();
        viperSystem = new ViperSystem(this);
    }

    @Override
    public void onStart() {
        super.onStart();
    }
}
