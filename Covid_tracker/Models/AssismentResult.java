package Covid_tracker.Models;

public class AssismentResult {
    
    private int probability;

    public AssismentResult(int probability){
        this.probability=probability;
    }

    public int getProbability(){
        return this.probability;
    }

    @Override
    public String toString(){
        return "Covid probability = " + probability + "%";
    }
}
