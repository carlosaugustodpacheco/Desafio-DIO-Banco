public class Main {

    public static void main(String[] args) {
        Cliente Guto = new Cliente();
        Guto.setNome("Guto");

        Conta cc = new ContaCorrente(Guto);
        cc.depositar(100);

        Conta cp = new ContaPoupanca(Guto);
        cc.transferir(10,cp);

    cc.imprimirExtrato();
    cp.imprimirExtrato();
    }
}
