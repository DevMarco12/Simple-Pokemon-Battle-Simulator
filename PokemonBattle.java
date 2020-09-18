import java.util.Scanner;
import java.util.Random;

public class PokemonBattle
{
  Scanner ler = new Scanner(System.in);
  private int firstChoice;

  void BattleSimulation(Pokemon first, Pokemon second)
  {
    System.out.println("A batalha entre " + first.getNome() + " e " + second.getNome() + " está prestes a começar!");

    do
    {
      System.out.print("\n" + "Digite 1 para usar o ataque do seu " + first.getNome() + ": ");
      firstChoice = ler.nextInt();
    
        if(first.getVida() <= 0 || second.getVida() <= 0)
        {
          if(first.getVida() == 0 && second.getVida() == 0)
          {
            System.out.println("Os dois morreram..."); 
          }
          else if(first.getVida() == 0)
          {
            System.out.println("O " + first.getNome() + " morreu...");
          }
          else if(second.getVida() == 0)
          {
            System.out.println("O " + second.getNome() + " morreu...");
          }
          break;
        }

      switch (firstChoice){
        case 1:
        int slash = (int)(Math.random() * 20 + 1);
        System.out.println("\n" + "Vida do " + second.getNome() + " = " + second.getVida());
        System.out.println(first.getNome() + " ataca com " + "SLASH " + "o pokémon inimigo " + second.getNome() +
        " | dano: " + slash);
        second.TakeDamage(slash);
        System.out.println("Vida do " + second.getNome() + " = " + second.getVida()+ "\n");

        if (second.getVida() == 0)
        {
          break;
        }

        System.out.println("Agora é a vez de " + second.getNome() + " atacar..." + "\n");
        int bubble = (int)(Math.random() * 20 + 1);

        System.out.println("Vida do " + first.getNome() + " = " + first.getVida());
        System.out.println(second.getNome() + " ataca com " + "BUBBLE " + "o pokémon inimigo " + first.getNome() +
        " | dano: " + bubble);
        first.TakeDamage(bubble);
        System.out.println("Vida do " + first.getNome() + " = " + first.getVida());
        break;

        default:
          System.out.println("Ops... ataque inválido!");
        break;
      } 
    } while (first.getVida() > 0 || second.getVida() > 0);

    System.out.println("-- A Batalha Pokémon acabou... --");
  }
}