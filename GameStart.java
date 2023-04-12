public class GameStart extends Scene
{
    public void update()
    {
        System.out.println("----- Pokemon Game -----");
        System.out.println("Made By KimTaeGyun");
        System.out.println("Press any ke to start");
        sc.next();
        sm.changeScene(SceneNames.SELECT_FIRST_POKEMON);
    }    
}
