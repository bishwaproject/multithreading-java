package multithreading_java.HOME_AUTOMATION;

class MotionSensor {
    private LightSensor lightSensor;
    public MotionSensor(LightSensor lightSensor){
        this.lightSensor = lightSensor;
    }
    public boolean waitForMotion() throws InterruptedException{
        // Simulate waiting for motion detection
        Thread.sleep(2000);
        return true; //Return true to indicate motion is detected
        
    }
    public void detectMotion()throws InterruptedException{
        //Simulate detecting motion
        Thread.sleep(1000);
        System.out.println("Motion detected");
        lightSensor.notifyMotionDetection();//notify the light sensor of motion detection
    }    
}
