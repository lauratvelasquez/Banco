public class CuentaCorriente extends Cuenta {

        private double balance;
        private double actualizarBalance;
        private double sobregiro;
        private double disponible;

        public CuentaCorriente(double balanceInicial, double sobre) {

            super("Corriente");
            this.sobregiro = sobre;
            this.disponible = balanceInicial + sobre;

        }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getSobregiro() {
        return sobregiro;
    }

    public void setSobregiro(double sobregiro) {
        this.sobregiro = sobregiro;
    }

    public double getDisponible() {
        return disponible;
    }

    public void setDisponible(double disponible) {
        this.disponible = disponible;
    }

    @Override
        public boolean retirarMonto(double monto) {
            this.disponible = this.getBalance() + this.sobregiro;
            if (monto <= (this.disponible)) {
                this.disponible = this.disponible - monto;
                this.actualizarBalance(monto * -1);
                System.out.println("Transacción realizada correctamente.");
                System.out.println("Usted ha retirado $" + monto + "Su nuevo saldo es: $" + this.getBalance());
                if (this.getBalance() < 0)
                    System.out.println("Su saldo es insuficiente");
            } else
                System.out.println("No se pudo realizar la transacción");
        return false;
    }

}
