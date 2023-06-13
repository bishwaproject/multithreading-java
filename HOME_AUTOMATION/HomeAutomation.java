package multithreading_java.HOME_AUTOMATION;

public class HomeAutomation {
    public static void main(String[] args) {
        LightSensor lightSensor = new LightSensor();
        MotionSensor motionSensor = new MotionSensor(lightSensor);
        
        Thread lightThread = new Thread(() -> {
            try {
                boolean isMotionDetected = motionSensor.waitForMotion(); // Wait for motion detection from the motion sensor
                if (isMotionDetected) {
                    lightSensor.detectLight(); // Simulate light detection
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread motionThread = new Thread(() -> {
            try {
                motionSensor.detectMotion(); // Simulate motion detection
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        lightThread.start();
        motionThread.start();
        
    }
}
