
/**
 * Escreva a descrição da classe Aluno aqui.
 * 
 * @author Gelly Viana Mota
 * @version 08/03/17.
 */
public class Aluno
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private Prova prova1;
    private Prova prova2;

    /**
     * COnstrutor para objetos da classe Aluno
     */
    public Aluno(Prova prva1, Prova prva2)
    {
        prova1 = prva1;
        prova2 = prva2;
    }
    
    public double calcularMedia(){
        double valorTotal = (prova1.calcularNotaTotal() + prova2.calcularNotaTotal())/2;
        if(valorTotal >= 0){
            return valorTotal;
        }
        else{
            return -1;
        }
    }
   
}
