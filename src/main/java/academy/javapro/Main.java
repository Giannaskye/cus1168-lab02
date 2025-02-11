package academy.javapro;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create a new Tesla Model S, 2024
        // TODO: Add your code here
       Vehicle Tesla = Vehicle("Tesla","Model S",2024);

        // Step 2: Display initial status
        System.out.println("Initial Status:");
        // TODO: Display car's initial state
         Tesla;
        Tesla.isRunning();
        Tesla.isAutopilotEnabled();
        Tesla.isCharging();

        // Step 3: Start the car and test basic vehicle functions
        System.out.println("\nTesting basic vehicle functions:");
        // TODO: Start engine
        Tesla.startEngine();
        // TODO: Accelerate
        Tesla.acclerate();
        // TODO: Brake
        Tesla.brake();

        // Step 4: Test autonomous features
        System.out.println("\nTesting autonomous features:");
        // TODO: Enable autopilot
        Tesla.enableAutopilot();
        // TODO: Check if autopilot is enabled
        Tesla.isAutopilotEnabled();
        // TODO: Disable autopilot
        Tesla.disableAutopilot();

        // Step 5: Test electric features
        System.out.println("\nTesting electric features:");
        // TODO: Start charging
        Tesla.charge();
        // TODO: Check charging status
        Tesla.isCharging();

        // Step 6: Stop the car and display final status
        System.out.println("\nFinal car status:");
        // TODO: Stop engine
        Tesla.stopEngine();
        // TODO: Display final state
        Tesla.isRunning();
        Tesla.isAutopilotEnabled();
        Tesla.isCharging();
    }
}
