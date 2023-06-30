public class Lasagna {
    
    public int expectedMinutesInOven(){
        return 40;
    }
   
    public int remainingMinutesInOven(int actual_time){
        return expectedMinutesInOven()-actual_time;
    }
   
    public int preparationTimeInMinutes(int layers){
        return 2*layers;
    }
    
public int totalTimeInMinutes(int layers, int actual_time){
    return preparationTimeInMinutes(layers) + actual_time;
    
}
    

}
