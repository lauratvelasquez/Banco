public class Cuenta {
        private String nombre;
        private String numeroCuenta;
        private double saldo;

    public Cuenta(String corriente) {
    }
        public Cuenta(String nombre, String numeroCuenta, double saldo) {
            this.nombre = nombre;
            this.numeroCuenta = numeroCuenta;
            this.saldo = saldo;
        }

        public Cuenta(Cuenta c) {
            nombre = c.nombre;
            numeroCuenta = c.numeroCuenta;
            saldo = c.saldo;
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //método consignar
    public boolean consignar(double n) {
        boolean consignarCorrecto = true;
        if (n < 0) {
            consignarCorrecto = false;
        } else {
            saldo = saldo + n;
        }
        return consignarCorrecto;
    }

    //método retirar
    public boolean retirarMonto(double n) {
        boolean retirarC = true;
        if (n < 0) {
            retirarC = false;
        } else if (saldo >= n) {
            saldo -= n;
        } else {
            retirarC = false;
        }
        return retirarC;
    }

    //método transferir
    public boolean transferir(Cuenta c, double n) {
        boolean valorExacto = true;
        if (n < 0) {
            valorExacto = false;
        } else if (saldo >= n) {
            retirarMonto(n);
            c.consignar(n);
        } else {
            valorExacto = false;
        }
        return valorExacto;
    }

    protected void actualizarBalance(double v) {
    }

    protected double getBalance() {
        return 0;
    }
}