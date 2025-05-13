public class Main {
    public static void main(String[] args) {
        EnemyProtoType enemy = new Enemy("Deus Slime", 300, 70, 500);
        enemy.displayInfo();
        enemy.attack();
        enemy.defense();

        System.out.println("\nIntroduzindo o inimigo!\n");

        EnemyProtoType enemyClone = enemy.clone();
        enemyClone.displayInfo();
        enemyClone.attack();
        enemyClone.defense();
    }
}