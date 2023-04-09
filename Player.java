public class Player
{
    int strangeCandy = 0;
    int monsterBall = 0;
    int level = 1;
    int exp = 0;
    int maxExp = 10;
    int pokemonCount = 0;
    Pokemon playerPokemons[] = new Pokemon[6];
    Pokemon battlePokemons[] = new Pokemon[3];

    Player(Pokemon pokemon0, Pokemon pokemon1, Pokemon pokemon2)
    {
        this.playerPokemons[0] = pokemon0;
        this.playerPokemons[1] = pokemon1;
        this.playerPokemons[2] = pokemon2;
    }

    public void printInfo()
    {
        System.out.printf("레벨 : %d, %d/%d\n", this.level, this.exp, this.maxExp);
        System.out.printf("이상한사탕 : %d, 몬스터볼 : %d\n", this.strangeCandy, this.monsterBall);
    }

    public void gainExp(int amount)
    {
        this.exp += amount;
        if(this.exp >= this.maxExp)
        {
            this.exp -= this.maxExp;
            this.level++;
            System.out.printf("%d 레벨로 올랐습니다.", this.level);
        }
        this.maxExp += 2;
    }

    public void catchPokemon(Pokemon wildPokemon, int playerPokemonIndex, Pokemon myPokemon)
    {
        this.playerPokemons[playerPokemonIndex] = wildPokemon;
    }

    public void selectBattlePokemon(int playerPokemonIndex, int battlePokemonIndex)
    {
        this.battlePokemons[battlePokemonIndex] = this.playerPokemons[playerPokemonIndex];
    }
}