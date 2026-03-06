public class Character {

    private int id;
    private String name;
    private int health;
    private int attackPower;

    public Character(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    //Getter
    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attackPower;
    }

    //Setter

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAttack(int attackPower) {
        this.attackPower = attackPower;
    }

    public void showCharacter() {
        System.out.println("id     : " + id);
        System.out.println("Nama   : " + name);
        System.out.println("HP     : " + health);
        System.out.println("Attack : " + attackPower);
        System.out.println("-----------------------");
    }
}