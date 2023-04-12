public class PokemonGame
{
    public static void main(String[] args)
    {
        SceneManager sm = SceneManager.getInstance();
        while(true)
        {
            sm.sceneUpdate();
        }
    }
}