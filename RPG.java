package NivelIntermediario.Desafios.Exemplos;

public class RPG {
    public static void main(String[] args) {


        Orc orc = new Orc();

        System.out.println("\n");
        orc.nome = "Gorak, o Destruidor";
        orc.idade = 237;
        orc.posicaoHierarquia = "General";

        System.out.println(orc);

        orc.usarFuria();
        orc.estadoPersonagem();
        orc.usarGrito();
        orc.usarAutoDestruicao();

    }

}

//Classe abstrata que define O QUE É A RAÇA ORC
abstract class ABS_ORCs {

    String nome;
    String posicaoHierarquia;
    int idade;

    @Override
    public String toString() {
        return "Nome: " + nome + "\nIdade: " + idade + "\nPosição Hieranquica: " + posicaoHierarquia + "\n";
    }
}

//Interface que define o conjunto de regras
//No caso, quais habilidades um ORC possui
interface ITOrc {

    //Almenta a força e regeneração
    String furia();

    //Almenta a força e velocidade de feras aliadas
    String grito();

    //Uma explosão massiva
    String autoDestruicao();
}

//Classe Auxiliar TRAITS, que definem o comportamento das regras
class OrcTraits implements ITOrc{

    @Override
    public String furia() {
        return "FÚRIA!";
    }

    @Override
    public String grito() {
        return "GRITO!";
    }

    @Override
    public String autoDestruicao() {
        return "AUTO DESTRUIÇÃO!";
    }

}

class Orc extends ABS_ORCs implements ITOrc{

    private OrcTraits habilidade = new OrcTraits();

    @Override
    public String furia() {
        return habilidade.furia();
    }

    @Override
    public String grito() {
        return habilidade.grito();
    }

    @Override
    public String autoDestruicao() {
        return habilidade.autoDestruicao();
    }

    public void usarFuria(){
        System.out.println("\n" + nome + " está ativando a habilidade " + habilidade.furia());
        System.out.println("Habilidade " + habilidade.furia() + " aumenta a força e regeneração!");
    }

    public void usarGrito(){
        System.out.println("\n" + nome + " está ativando a habilidade " + habilidade.grito());
        System.out.println(habilidade.grito() + " aumenta a força e velocidade de feras aliadas!");
    }

    public void usarAutoDestruicao(){
        System.out.println("\n" + nome + " está ativando a habilidade " + habilidade.autoDestruicao());
        System.out.println(habilidade.autoDestruicao() + " causa uma explosão massiva!");
    }

    public void estadoPersonagem(){
        System.out.println("Estado atual: \n" + habilidade.furia());
        System.out.println("Habililidade FÚRIA ficará ativa até o fim do combate!");
    }
}