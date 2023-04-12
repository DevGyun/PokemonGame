import java.util.Scanner;

public class Scene
{
    Scanner sc;
    SceneManager sm;
    int userInput;
    Scene()
    {
        sc = new Scanner(System.in);
        sm = SceneManager.getInstance();
    }
    public void update()
    {
    }
}