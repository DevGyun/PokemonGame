public class SceneManager
{
    static SceneManager sceneManager;
    private SceneManager()
    {
    }
    public static SceneManager getInstance()
    {
        if(sceneManager == null)
            sceneManager = new SceneManager();
        return sceneManager;
    }

    Scene currentScene = new _GameStart();
    public void changeScene(SceneNames sceneName)
    {
        switch(sceneName)
        {
            case GAME_START:
                currentScene = new _GameStart();
                break;
            case SELECT_FIRST_POKEMON:
                currentScene = new _SelectFirstPokemon();
                break;
            case BATTLE:
                break;
            case COLLECT:
                break;
            case MY_INFORMATION:
                break;
            case SAVE:
                break;
            case LOAD:
                break;
        }
    }
    public void sceneUpdate()
    {
        currentScene.update();
    }
}