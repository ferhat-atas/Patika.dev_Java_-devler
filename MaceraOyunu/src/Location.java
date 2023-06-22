
public abstract class Location {
    
    private Player player;
    private String name;
    
    public Location(Player player, String name){
        
        this.player = player;
        this.name = name;
    }
    
    public abstract boolean onLocation();
    
    public Player getPleyer(){
        
        return this.player;
    }
    
    public void setPlayer(Player player){
        
        this.player = player;
    }
    
    public String getName(){
        
        return this.name;
    }
    
    public void setName(String name){
        this.name =name;
    }
    
    
}
