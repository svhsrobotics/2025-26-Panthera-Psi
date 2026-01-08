import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

//this is the final one

//unless gradle KILLS ITSELF again

public class PSI_TELEOP_IHATEBRENNAN extends LinearOpMode{
    private DcMotor right;
    private DcMotor left;
    private DcMotor launch1;
    private DcMotor launch2;
    private DcMotor Spin2Win;
    private Servo gate;
    @Override
    public void runOpMode() {
        double launcher_speed = 0.8;
        Spin2Win = hardwareMap.get(DcMotor.class, "intake");
        gate = hardwareMap.get(Servo.class, "gateServo");
        right = hardwareMap.get(DcMotor.class, "right");
        left = hardwareMap.get(DcMotor.class, "left");
        launch1 = hardwareMap.get(DcMotor.class, "launch1");
        launch2 = hardwareMap.get(DcMotor.class, "launch2");
    }
}
