import br.com.jogo.Boss;
import br.com.jogo.Heroi;
import br.com.jogo.Personagens;
import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Jogo {
    public static void main(String[] args) {
        Heroi vidaHeroi = new Heroi();
        Boss vidaBoss = new Boss();
        int tentativasDeCurar = 0;
        int tentativasDeAtaque = 0;
        while (vidaBoss.getVida() > 0 && vidaHeroi.getVida() > 0) {


            String Boss = "       Vida: " + vidaBoss.getVida() + "         \n" +
                    "       / \\, | ,        .--.\n" +
                    "      |    =|= >      /.--.\\\n" +
                    "       \\ /` | `       |====|\n" +
                    "        `   |         |`::`|\n" +
                    "            |     .-;`\\..../`;.-.\n" +
                    "           /\\\\/  /  |...::...|  \\\n" +
                    "           |:'\\ |   /'''::'''\\   |\n" +
                    "            \\ /\\;-,/\\   ::   /\\--; \n" +
                    "            |\\ <` >  >._::_.<,<__>\n" +
                    "            | `\"\"`  /   ^^   \\\n" +
                    "            |       |        |\n" +
                    "            |       |        |\n";


            String menu = """ 
                    Sua Vida é de: """ + vidaHeroi.getVida() + """
                    \n
                    Escolha a opção de Ação:
                    (Lembre-se, a cada escolha sua você sofre alguma consequência pelo Boss)
                    (As consequências são aleatorias.)
                    1 - Curar + 500
                    2 - Atacar com espada (Dano 250 )
                    3 - Atacar com raio (Dano 250 )
                    4 - Atacar com fogo (Dano 500 )
                    """;
            System.out.println(Boss);
            System.out.println(menu);

            Scanner teclado = new Scanner(System.in);
            int acaoDigitada = teclado.nextInt();

            switch (acaoDigitada) {
                case 1:

                    if (tentativasDeCurar < 3) {
                        vidaHeroi.aplicarCura();
                        tentativasDeCurar++;
                        System.out.println("Cura aplicada! Você ainda tem " + (3 - tentativasDeCurar) + " curas.");
                    } else {
                        System.out.println("Você não tem mais curas!");
                    }
                    break;
                case 2:
                    vidaBoss.receberDano(vidaHeroi.getPoder());
                    System.out.println("Você atacou com espada!");
                    int numeroSorteado = (int) (Math.random() * 4);
                    switch (numeroSorteado) {
                        case 0:
                            vidaHeroi.receberDano(vidaBoss.getTerceiroPoder());
                            System.out.println("Você também recebeu danos especiais!");
                            break;
                        case 1:
                            vidaHeroi.receberDano(vidaBoss.getTerceiroPoder());
                            System.out.println("Você também recebeu danos especiais!");
                            break;
                        case 2:
                            vidaHeroi.receberDano(vidaBoss.getSegundoPoder());
                            System.out.println("Você também recebeu danos!");
                            break;
                        case 3:
                            vidaHeroi.receberDano(vidaBoss.getPoder());
                            System.out.println("Você também recebeu danos!");
                            break;
                        default:
                            vidaHeroi.receberDano(vidaBoss.getSemAcao());
                            System.out.println("Se livrou!");
                            break;
                    }

                    break;
                case 3:
                    vidaBoss.receberDano(vidaHeroi.getSegundoPoder());
                    System.out.println("Você atacou com raio!");
                    int numeroSegundoSorteado = (int) (Math.random() * 51
                    );
                    switch (numeroSegundoSorteado) {
                        case 0:
                            vidaHeroi.receberDano(vidaBoss.getSegundoPoder());
                            System.out.println("Você também recebeu danos!");
                            break;
                        case 1:
                            vidaHeroi.receberDano(vidaBoss.getTerceiroPoder());
                            System.out.println("Você também recebeu danos especiais!");
                            break;
                        case 2:
                            vidaHeroi.receberDano(vidaBoss.getSegundoPoder());
                            System.out.println("Você também recebeu danos!");
                            break;
                        case 3:
                            vidaHeroi.receberDano(vidaBoss.getPoder());
                            System.out.println("Você também recebeu danos!");
                            break;
                        default:
                            vidaHeroi.receberDano(vidaBoss.getSemAcao());
                            System.out.println("Se livrou!");
                            break;
                    }

                    break;
                case 4:


                    vidaBoss.receberDano(vidaHeroi.getTerceiroPoder());
                    System.out.println("Você atacou com fogo!");
                    int numeroTerceiroSorteado = (int) (Math.random() * 5);
                    switch (numeroTerceiroSorteado) {
                        case 0:
                            vidaHeroi.receberDano(vidaBoss.getSemAcao());
                            System.out.println("Você não recebeu danos!");
                            tentativasDeAtaque++;
                            break;
                        case 1:
                            vidaHeroi.receberDano(vidaBoss.getTerceiroPoder());
                            System.out.println("Você também recebeu danos especiais!");
                            tentativasDeAtaque++;
                            break;
                        case 2:
                            vidaHeroi.receberDano(vidaBoss.getSemAcao());
                            System.out.println("Você não recebeu danos!");
                            tentativasDeAtaque++;
                            break;
                        case 3:
                            vidaHeroi.receberDano(vidaBoss.getPoder());
                            System.out.println("Você não recebeu danos!");
                            tentativasDeAtaque++;
                            break;
                        case 4:
                            if(tentativasDeAtaque > 3)
                            {
                                System.out.println(" O BOSS DECOROU O SEU DANO!");
                                vidaHeroi.receberDano(vidaBoss.getPoder());
                            } else if (tentativasDeAtaque > 2) {
                                System.out.println("Cuidado o boss pode decorar os seus danos!");
                                        vidaHeroi.receberDano(vidaBoss.getPoder());
                            }else{
                                vidaHeroi.receberDano(vidaBoss.getSemAcao());
                            }
                            break;
                        default:
                            vidaHeroi.receberDano(vidaBoss.getSemAcao());
                            System.out.println("Se livrou!");
                            break;
                    }
                    break;
                default:
                    System.out.println("Você não escolheu nenhuma opção!" +
                            "sofrerá consequencias!");
                    vidaHeroi.receberDano(vidaBoss.getPoder());
            }

        }

        if(vidaBoss.getVida() <= 0 ){
            System.out.println("""
                Parabéns Fim de jogo vc venceu!!!!!
                """);
        }

        if (vidaHeroi.getVida() <= 0 ){
            System.out.println("O Boss sobreviveu com: " + vidaBoss.getVida() + " de vida!");
            System.out.println("Fim de jogo, Tente Novamente.");

        }

if (
        vidaHeroi.getVida() <= 0 && vidaBoss.getVida() <= 0
){
    System.out.println("Você matou o boss, mas custou a sua propria vida ");
}

    }
}