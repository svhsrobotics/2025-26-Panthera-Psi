import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

//this is the final one

//unless gradle KILLS ITSELF again

public class ScheduleExecutorTest extends LinearOpMode {


    @Override
    public void runOpMode() throws InterruptedException {
        waitForStart();
        ScheduledExecutorService executorService = Executors.newSingleThreadExecutor();
        Runnable runnableTask = () -> System.out.println("Task is running: " + System.currentTimeMillis());

    }
}