public class Pokemon
{
    String name;
    int code;
    int level;
    int hp;
    int maxHp;
    int damage;

    Pokemon(int code, int level)
    {
        this.code = code;
        this.level = level;
        switch(code)
        {
            case 0:
            this.name = "파이리";
            this.maxHp = 10;
            this.damage = 1;
            break;

            case 1:
            this.name = "꼬북이";
            this.maxHp = 10;
            this.damage = 1;
            break;
        }
        this.hp = this.maxHp;
    }
    
    void levelUp()
    {
        this.level++;
        System.out.printf("%s 의 레벨이 %d 레벨로 올랐습니다.\n", this.name, this.level);
    }
}