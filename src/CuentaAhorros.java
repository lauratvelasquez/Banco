public class CuentaAhorros extends Cuenta{

    private float interes;
    private float balanceInicial;
    private String tipo;

        public CuentaAhorros(double balanceInicial, float intereses){

            super( "Ahorros");
            this.interes=intereses;

        }

        public void actualizarSaldo(){
            double saldo;
            saldo=(super.getBalance()*this.interes)/100;
            super.actualizarBalance(saldo);
        }
}
