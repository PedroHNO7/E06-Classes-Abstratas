public class ContaUniversitaria extends Conta{

    public ContaUniversitaria(int numero, String senha, double saldo, Cliente dono, double limite) {

        super(numero, senha, saldo, dono, limite);

    }

    public void setLimite(){

        if(limite <= 500){
            this.limite = limite;
            System.out.println("Limite da Conta Universitaria permitido!");

        } else{
            System.out.println("Erro, limite da Conta Universitaria superior ao permitido.");
        }

    }
}
