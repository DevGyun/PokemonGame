public class _SelectFirstPokemon extends Scene
{
    public void update()
    {
        Pokemon p1 = new Pokemon(PokemonStat.이상해씨, 1);
        Pokemon p2 = new Pokemon(PokemonStat.파이리, 1);
        Pokemon p3 = new Pokemon(PokemonStat.꼬부기, 1);
        System.out.println("Select your start pokemon");
        System.out.printf("1 : %s, 2 : %s, 3 : %s", p1.name, p2.name, p3.name);
        switch(sc.nextInt())
        {
            case 1:
                
        }
    }
}
