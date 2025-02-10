package academy.javapro;

public interface Autonomous {
    void enableAutopilot(){
    isAutopilotEnabled()= true;
 }

    void disableAutopilot(){
isAutopilotEnabled()= false;
}


    boolean isAutopilotEnabled();
}
