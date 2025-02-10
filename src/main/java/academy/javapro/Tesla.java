package academy.javapro;

public class Tesla extends Vehicle implements Electric, Autonomous {
    private boolean autopilotEnabled;
    private boolean charging;

    // TODO: Create constructor that takes model and year
   public void  Car(model,year){
        this.model = model;
        this.year = year;
   }
    // TODO: Set make to "Tesla"
   setMake(Vehicle Tesla);
    // TODO: Initialize autopilotEnabled and charging to false
autopilotEnabled = false;
charging = false;
    // TODO: Implement all required methods from Vehicle, Electric, and Autonomous
    // Each method should include appropriate print statements
//basic vehicle functions 
Vehicle startEngine(){
    if( startEngine==true){
    System.out.println( make + model +" started");
}else{
         System.out.println( make + model +" stopped");
    }    
   Vehicle acclerate(){
        System.out.println( make + model + " is accelerating...");
   }
Vehicle brake(){
    System.out.println( make + model +" is braking...");
}
Vehicle isRunning(){
    System.out.println("Running: "+ getisRunning())"
// testing autonomous features
Autonomous enableAutoPilot(){
    if (enableAutoPilot == true){
    System.out.println("Autopilot is enabled");
    }else{
   System.out.println("Autopilot is disabled");
}
}    
// testing eletric functions 
Electric charging(){
    if (charging == true){
    System.out.println(make + model + "is now charging");
    System.out.println("Charging Status: " );
        return charging();
    else{
        System.out.println(make + model + "is not charging");
        System.out.println("Charging Status: " );
        return charging();


