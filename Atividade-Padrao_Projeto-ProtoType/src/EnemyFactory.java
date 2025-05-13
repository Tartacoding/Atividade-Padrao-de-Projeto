import java.util.HashMap;
import java.util.Map;

public class EnemyFactory {
    private static final Map<String, EnemyProtoType> prototypes = new HashMap<>();
    static{
        prototypes.put("Slime", new Enemy("Slime Azul", 30, 5, 2));
        prototypes.put("Slime rei", new Enemy("Slime Rei", 60, 10, 5));

    }
    public static EnemyProtoType createEnemy(String id) {
        EnemyProtoType prototype = prototypes.get(id);
        if (prototype == null) {
            throw new IllegalArgumentException("Unknow id");
        }
        return prototype.clone();
    }
}
