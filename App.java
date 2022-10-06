/*
    Aluno: Luiz Fernando Vidal Gusmão
 
    Matricula: 201902224558
 */
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan= new Scanner(System.in);

        System.out.println("me diga aí quanto ta valendo essa gasolina");
        double pGasolina= scan.nextDouble();

        System.out.println("e o alcool ta quanto ?");
        double pAlcool= scan.nextDouble();

        CalculoEficiencia(pGasolina,pAlcool);

        scan.close();
    }

    public static  void CalculoEficiencia(double precoGasolina,double precoAlcool){

        if(precoAlcool < 0.7*precoGasolina)
        System.out.print("Vishhh! essa gasolina não está compensando não, melhor botar alcool");

        if(precoAlcool > 0.7*precoGasolina)
        System.out.print("Vishhh! acho que essa gasolina ta compensando mais que o alcool");

        if(precoAlcool == 0.7*precoGasolina)
        System.out.print("botando na ponta do lapis ta tudo a mesma coisa");
    }
}
