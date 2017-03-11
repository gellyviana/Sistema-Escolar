
/**
 * Escreva a descrição da classe Prova aqui.
 * 
 * @author Gelly Viana Mota.
 * @version 08/03/17.
 */
public class Prova
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private double nota1;
    private double nota2;

    /**
     * Construtor para objetos da classe Prova
     */
    public Prova()
    {
        // inicializa variáveis de instância
        nota1 = 0.0;
        nota2 = 0.0;
    }
    
    public void setNota(double valor1, double valor2){
        if(valor1 >= 0 && valor2 >= 0){
            nota1 = valor1;
            nota2 = valor2;
        }
        else{
            System.out.println("Aluno não pode receber notas negativas");
        }
    }
    
    //public double getNota(){
    //    return nota;
   // }
    
    public double calcularNotaTotal(){
        double resultado = (nota1+nota2)/2;
        if(resultado <= 10.0){
            return resultado;
        }
        else{
            return -1;
        }
    }
}
