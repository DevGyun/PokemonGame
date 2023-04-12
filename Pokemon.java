public class Pokemon
{
    String name, type;
    int damage, hp, maxHp, level; 

    Pokemon(Dictionary dict)
    {
        
    }
    enum PokemonStat
    {
        이상해씨("이상해씨", "LEAF", 2, 10),
        이상해풀("이상해풀", "LEAF", 2, 10)
        final String name, type;
        final int damage, hp, maxHp, level;
        PokemonStat(String name, String type, int damage, int maxHp)
        {
            this.name = name;
            this.type = type;
            this.damage = damage;
            this.maxHp = maxHp;
            this.level = level;
        }
    }
}