import java.util.Scanner;

public class PokemonGame
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.println("--포켓몬 게임--");
            System.out.println("1 대전모드");
            System.out.println("2 수집모드");
            System.out.println("3 내정보");
            System.out.println("4 종료");
        }
        scanner.close();
    }
}