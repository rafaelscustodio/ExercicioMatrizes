import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("STREET FIGHTER\n");
    String[] roteiro = new String[11];
    int y = 0;
    String[][] player = new String[2][6];
    for(int i = 0; i < 2; i++){
      for(int j = 0; j < 6; j++){
        System.out.print("Digite o nome do personagem: ");
        player[i][j] = sc.nextLine();
      }      
    }
    System.out.println("\nPersonagens do jogo: ");
    for(int i = 0; i < 2; i++){
      for(int j = 0; j < 6; j++){
        System.out.print(player[i][j] + " // ");
      }
      System.out.println();
    
    }    
    System.out.print("\nEscolha um personagem: ");
    String personagem = sc.nextLine();
    System.out.println("\nSeu personagem é: " + personagem);
    for(int i = 0; i < 2; i++){
      for(int j = 0; j < 6; j++){
        if(!player[i][j].equals(personagem)) {
          roteiro[y] = player[i][j];
          y++;
        }
      }
    }
    System.out.println("\nSuas lutas: ");
    for(int i = 0; i < y; i++){      
      System.out.println(personagem + " vs " + roteiro[i]);
    }
    sc.close();
  } 
}