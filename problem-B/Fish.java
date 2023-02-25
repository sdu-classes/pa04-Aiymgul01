class Fish extends Animal implements Pet{
    private String name;
    public Fish() {
        super(0);
    }

    public void walk() {
        System.out.println("Fish can't walk");
    }

    public void eat() {
        System.out.println("The fish eats");
    }
    public void setName(String name) {
        this.name = name;
    }
    public void play(){
        System.out.println("Fish can't play with you.");
    }
    public String getName() {
        return name;
    }
}
