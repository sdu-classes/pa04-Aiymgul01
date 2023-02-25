public class Rabbit extends Animal implements Pet{
    String name;

    public Rabbit(String name){
        super(4);
        this.name = name;
    }
    public Rabbit(){
        this("Koyanshyk");
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
    public void eat(){
        System.out.println(this.name + " eat carrots");
    }
    @Override
    public void play(){
        System.out.println(this.name + " is playing");
    }
}
