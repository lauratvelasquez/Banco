import java.util.Scanner;

public class Cliente {
    private int id;
    private String nombre;
    private String apellido;
    private String direccion;
    private String correo;
    private int celular;
    private String postal;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, int id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.direccion = direccion;
        this.correo = correo;
        this.celular = celular;
    }

    public Cliente(Cliente cl) {
        nombre = cl.nombre;
        apellido = cl.apellido;
        id = cl.id;
    }

    public Cliente(String nombre, String apellido, int id, String direccion, String correo, int celular) {

    }
    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public int adquirirProducto(){
        Scanner prod=new Scanner(System.in);
        System.out.println("Digite la opcion que desee");
        int producto=prod.nextInt();
        return producto;

    }

    public void crearCliente(){
        Scanner dts=new Scanner(System.in);
        System.out.println("Digite la cantidad de clientes a registrar");
        int cantidadClientes=dts.nextInt();
        Cliente cl[]=new Cliente[cantidadClientes];
        for(int i=0; 1< cl.length;i++){
            System.out.println("Digite sus datos");
            nombre=dts.nextLine();
            apellido=dts.nextLine();
            id=dts.nextInt();
            direccion=dts.nextLine();
            correo=dts.nextLine();
            celular=dts.nextInt();
            cl[i]=new Cliente(nombre, apellido, id, direccion, correo, celular);
        }
        System.out.println("Cliente Creado");
    }

}
