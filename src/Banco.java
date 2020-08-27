public class Banco {

        private String nombre;
        private int numeroClientes;
        private Cliente cliente[];

        public Banco(String nom){



            this.nombre=nombre;
            this.numeroClientes=0;

            this.cliente=new Cliente[10];
        }

        public void anadirCliente(String nombre, String apellido, int id){

            if (numeroClientes<10){

                Cliente client=new Cliente();
                cliente[numeroClientes]=client;
                numeroClientes=numeroClientes++;
            }
            else

                System.out.println("Error");

        }
        public static void main(String[] arguments){
            Banco banco1=new Banco("Banco");

        }
}
