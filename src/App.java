import java.util.*;

public class App {
    public static void main (String[] args) {

    Empleado empleado1 = new Empleado();
    empleado1.nombre = "Gerson";
    empleado1.apellido = "Rodriguez";
    empleado1.ID = "0816199822323";
    empleado1.genero = "Masculino";
    empleado1.correo = "Rodri12@gmail.com";
    empleado1.direccion = "Col.Las Torres";
    empleado1.telefono = "87238712";
    empleado1.fecha_nacimiento = new Date("1998/10/23");
    empleado1.sueldo = 15000;

    Computer computer1 = new Computer();
    computer1.marca = "Dell";
    computer1.modelo = "Inspiron";
    computer1.serie = "1500";
    computer1.año = new Date("2018/07/20");
    computer1.color = "Blanco";
    computer1.ram = "16GB";
    computer1.procesador = "Core i7 11Th";
    computer1.grafica = "NVIDIA GTX 6GB GDDR6";
    computer1.resolucion = "4K";
    computer1.peso = 3.3;
    computer1.tamaño = 15.5;
    computer1.precio = 22000;
    computer1.empleado = empleado1;

    Computer computer2 = new Computer();
    computer2.marca = "HP";
    computer2.modelo = "ENVY";
    computer2.serie = "13-ad110ns";
    computer2.año = new Date("2016/09/10");
    computer2.color = "Negro";
    computer2.ram = "8GB";
    computer2.procesador = "Core i5 9Th";
    computer2.grafica = "NVIDIA GTX 2GB GDDR4";
    computer2.resolucion = "HD";
    computer2.peso = 3.1;
    computer2.tamaño = 14.5;
    computer2.precio = 19000;
    computer2.empleado = empleado1;

    Cliente cliente1 = new Cliente();
    cliente1.nombre = "Juan Carlos";
    cliente1.apellido = "Funez";
    cliente1.ID = "0816200100289";
    cliente1.direccion = "Col.Luis Andres";
    cliente1.correo = "jcfunez14@gmail.com";
    cliente1.genero = "Masculino";
    cliente1.telefono = "97145532";
    cliente1.fecha_nacimiento = new Date("2001/06/19");
    cliente1.computer = computer1; ;


    Cliente[] mis_computadoras = new Cliente[1];
    mis_computadoras[0]=cliente1;

    Computer[] mis_ventas = new Computer[2];
    mis_ventas [0] = computer1;
    mis_ventas [1] = computer2;

    System.out.println( mis_computadoras[0].Compra());

    for( int i = 0 ; i < mis_ventas.length ; i++ ){
        System.out.println( mis_ventas[i].Venta());
    }



    }
}
class Computer {
    Empleado empleado;
    String marca;
    String modelo;
    String serie;
    String color;
    Date año;
    String ram;
    String procesador;
    String sistema_operativo;
    int precio;
    String grafica;
    String resolucion;
    Double tamaño;
    Double peso;

    public String Venta(){
        String miventa = new String();
        miventa = this.empleado.nombre + " " + this.empleado.apellido + " ha hecho la venta de una computadora " + this.marca + " " +
                  this.modelo + " a Lps." + this.precio;
        return miventa;
    }

}

class Cliente{
    Computer computer;
    String nombre;
    String apellido;
    String direccion;
    String ID;
    String telefono;
    String genero;
    Date fecha_nacimiento;
    String correo;

    public String Compra(){
        String micompra = new String ();
        micompra = this.nombre + " " + this.apellido + " ha realizado con exito la compra de una computadora " + this.computer.marca
                    + " " + this.computer.modelo + " " + this.computer.procesador;
        return micompra;
    }

}

class Empleado{
    Computer computer;
    String nombre;
    String apellido;
    String ID;
    String direccion;
    String genero;
    int sueldo;
    String telefono;
    String correo;
    Date fecha_nacimiento;
}