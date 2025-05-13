public class Enemy implements EnemyProtoType {
    private String type;
    private int health;
    private int strenght;
    private int resistence;


    public Enemy(String type, int health, int strenght, int resistence){
        this.type = type;
        this.health = health;
        this.strenght = strenght;
        this.resistence = resistence;
    }

    @Override
    public void attack(){
        System.out.println(type + " atacou causando " + strenght + " de dano");
    }

    @Override
    public void defense() {
        System.out.println(type + " defendeu do ataque, sofreu " + (resistence - 60) + " de dano");
    }

    @Override
    public void displayInfo(){
        System.out.println("Inimigo: " + type + "\nVida: " + health + "\nForça: " + strenght);
    }

    @Override
    public EnemyProtoType clone(){
        return new Enemy(type, health, strenght, resistence);// Função que ira criar um novo inimigo com as mesmas caracteristicas
    }
}
