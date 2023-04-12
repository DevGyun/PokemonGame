public class Trainer
{
    static Trainer trainer;
    public static Trainer getInstance()
    {
        if(trainer == null)
            trainer = new Trainer();
        return trainer;
    }
    private Trainer()
    {}
    
    int candy = 0, monsterBall = 0;
    int level = 1, exp = 0, maxExp = 10;
}