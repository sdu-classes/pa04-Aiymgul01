public class Fish extends Animal implements Pet{
    String name;

    public Fish(String name){
        super(0);
        this.name = name;
    }

    public Fish(){
        this("Nemo");
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public void setName(String name){
        this.name = name;
    }
    @Override
    public void play(){
        System.out.println("Fishes are playing");
    }
    @Override 
    public void walk(){
        System.out.println("Fishes they do not have legs and can not walk :)");
    }
    @Override
    public void eat(){
        System.out.println("Fishes are eating water insects");
    }
}
