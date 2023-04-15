public class Pokemon
{
    String name, type;
    int damage, hp, maxHp, level; 
    Pokemon(PokemonStat dict, int level)
    {
        this.name = dict.name;
        this.type = dict.type;
        this.damage = dict.damage + level * 1;
        this.hp = this.maxHp = dict.maxHp + level * 5;
        this.level = level;
    }
    public void levelUp()
    {
        this.level++;
        System.out.printf("%s is now LEVEL %d",this.name, this.level);
    }
    public void heal(int amount)
    {
        this.hp += amount;
        if(this.hp >= this.maxHp)
            this.hp = this.maxHp;
        System.out.printf("%s has healed. now HP %d / %d", this.name, this.hp, this.maxHp);
    }
}
enum PokemonStat
{
    이상해씨("이상해씨", "LEAF", 2, 10),
    이상해풀("이상해풀", "LEAF", 3, 20),
    이상해꽃("이상해꽃", "LEAF", 4, 30),
    파이리("파이리", "FIRE", 2, 10),
    리자드("리자드", "FIRE", 3, 20),
    리자몽("리자몽", "FIRE", 4, 30),
    꼬부기("꼬부기", "WATER", 2, 10),
    어니부기("어니부기", "WATER", 3, 20),
    거북왕("거북왕", "WATER", 4, 30);

    final String name, type;
    final int damage, maxHp;
    PokemonStat(String name, String type, int damage, int maxHp)
    {
        this.name = name;
        this.type = type;
        this.damage = damage;
        this.maxHp = maxHp;
    }
}