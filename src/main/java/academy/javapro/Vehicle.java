package academy.javapro;

public abstract class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    protected boolean isRunning;

    // TODO: Add constructor
    public Vehicle(make,model,year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
    // TODO: Add abstract methods
    public abstract void startEngine();
    public abstract void stopEngine();
    public abstract void brake();
    public abstract void accelerate();
    // TODO: Add getters/setter
        public Vehicle getMake(){
            return this.make;
        }
        public Vehicle getModel(){
            return this.model;
        }
        public Vehicle getYear(){
            return this.year;
        }
        public Vehicle isRunning(){
            return false;
        }
    
    public void setMake(Vechicle make){
        this.make = make;
    }
    public void setModel(Vehicle model){
            this.model = model;
    }
    public void setYear(Vehicle year){
        this.year = year;
    }
    public void setIsRunning(isRunning){
        this.isRunning = isRunning;

    }
        
}
