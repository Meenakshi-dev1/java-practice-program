package encapsulation;

public class Animal {
    private String name;
    private String category;
    private int legs;
    public void run(){
        System.out.println("running");
    }
    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }
    public void setCategory(String category){
        this.category=category;
    }

    public String getCategory(){
        return this.category;
    }
        
        
    }
    

