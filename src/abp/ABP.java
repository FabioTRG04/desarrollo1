package abp;

import java.time.LocalDate;  
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.util.Scanner;

public class ABP {

    public static void main(String xyz[]) {
        
        String fechaalta, fechabaja, otroc, fechaaltai = null, buscardni , enter;
        double salariot = 0.0;
        int años = 0, meses = 0, dias = 0,i = 1, menu=0;
        int salario = 0;
        int trienios = 0;
        double irpf = 0;
        boolean salir=false;
        Scanner entrada2 = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        Scanner entrada1 = new Scanner(System.in);
        Scanner entrada3 = new Scanner(System.in);
        Scanner entrada4 = new Scanner(System.in);
        String[] empleados = new String[7] ;
        
        while(!salir){
            System.out.println("\n---- MENU ----");
        
            System.out.println("\n1. Registrar Empleado");
            System.out.println("2. Buscar Datos De Empleado");
            System.out.println("3. Salir");
            System.out.print("-> ");
            menu = entrada.nextInt();
        
       
        
            switch (menu){
        
                case 1:
                
                    // DATOS DE EMPLEADO
        
                    System.out.println("\n=== INTRODUCIR DATOS DE EMPLEADO ===");
            
                    System.out.print("\nintroducir DNI: ");
                    empleados[0] = entrada1.nextLine();
            
                    System.out.print("introducir NOMBRE: ");
                    empleados[1] = entrada1.nextLine();
            
                    System.out.print("introducir APELLIDO: ");
                    empleados[2] = entrada1.nextLine();
            
                    System.out.print("introducir TELEFONO: ");
                    empleados[3] = entrada1.nextLine();
            
                    System.out.print("introducir DIRECCION: ");
                    empleados[4] = entrada1.nextLine();
            
                    System.out.print("introducir NUEMRO DE CUENTA: ");
                    empleados[5] = entrada1.nextLine();
    
                    do{    
                        //DATOS DE CONTRATO
        
                        System.out.println("\n === INTRODUCIR DATOS DE CONTRATO N " + i + " ===");
        
        
                        //FECHA DE CONTRARTO
                        System.out.print("\n Elegir 1. Fecha Definida o 2. Fecha Indefinida: ");
                        int fecha = entrada.nextInt();
        
        
        
        
                       
                        if(fecha == 1){
                            System.out.print("\nINTRODUCIR FECCHA ALTA EN FORMATO : AÑO-MES-DIA : ");
                            fechaalta = entrada2.nextLine();
        
                
                            System.out.print("INTRODUCIR FECCHA BAJA EN FORMATO : AÑO-MES-DIA : ");
                            fechabaja = entrada2.nextLine();

                            LocalDate d1 = LocalDate.parse(fechaalta, DateTimeFormatter.ISO_LOCAL_DATE);  
                            LocalDate d2 = LocalDate.parse(fechabaja, DateTimeFormatter.ISO_LOCAL_DATE);
            
                            Period period = Period.between(d1, d2);
            
                            años = Math.abs(period.getYears());
                            meses = Math.abs(period.getMonths());
                            dias = Math.abs(period.getDays());  
                        }
                        else{
                            
                        }
                         
                                
                            
        
                        //CATEGORIA    
            
                        System.out.print("\nCATEGORIA ASOCIADA: ");
                        String categoria = entrada3.nextLine();
        
        
                        //PUESTO
        
                        System.out.println("\nPUESTO O CARGO DE DESTINO: ");
                        System.out.println("jefe");
                        System.out.println("gerente");
                        System.out.println("coordinador");
                        System.out.println("encargado");
                        System.out.print("--> ");
                        String puesto = entrada3.nextLine();
                
                        if( puesto.equalsIgnoreCase("jefe")){
                            salario = 550000;
                            irpf = salario * 0.43;
                        }
                        if( puesto.equalsIgnoreCase("gerente")){
                            salario = 450000;
                            irpf = salario * 0.37;
                        }
                        if( puesto.equalsIgnoreCase("coordinador")){
                            salario = 250000;
                            irpf = salario * 0.28;
                        }
                        if( puesto.equalsIgnoreCase("encargado")){
                            salario = 150000;
                            irpf = salario * 0.24;
                        }
        
                        //DURACION DE PUESTO
        
                        System.out.println(" == DURACION DE PUESTO == ");
        
                        System.out.print("\nFECHA DE COMIEZO DE CARGO INTRODUCIRLA EN FORMATO : AÑO-MES-DIA : ");
                        String fechacargoe = entrada3.nextLine();

                        System.out.print("FECHA DE FINALIZADO DE CARGO INTRODUCIRLA EN FORMATO : AÑO-MES-DIA : ");
                        String fechacargos = entrada3.nextLine();
        
                        LocalDate d3 = LocalDate.parse(fechacargoe, DateTimeFormatter.ISO_LOCAL_DATE);
                        LocalDate d4 = LocalDate.parse(fechacargos, DateTimeFormatter.ISO_LOCAL_DATE);
        
                        Period period = Period.between(d3 , d4);
                
                        int añosc = Math.abs(period.getYears());
                        int mesesc = Math.abs(period.getMonths());
                        int diasc = Math.abs(period.getDays());

        
                        // SALIDA O FACTURA DE DATOS
        
                        System.out.println("\n ---- NOMINA EMITIDA MENSUALMENTE ----");
        
                        System.out.println("\n -DAT System.out.println(\"\\n ---- NOMINA EMITIDA MENSUALMENTE ----\");OS DE PERSONAL-");
        
                        System.out.println("\n Nombre: " + empleados[1]);
                        System.out.println("Apellido: " + empleados[2]);
                        System.out.println("DNI: " + empleados[0]);
                        System.out.println("Telefono: " + empleados[3]);
                        System.out.println("Direccion: " + empleados[4]);
                        System.out.println("Nmero De Cuenta: " + empleados[5]);
        
                        System.out.println("\n -DATOS DE CONTRATO-");
        
                        System.out.println("\nCategoria: " + categoria );
        
                        System.out.println("Salario Mensual: " + salario + "$ pesos");
        
                        if (fecha == 1){
            
                            System.out.println("TIEMPO TOTAL TRABAJADO: " + años + " AÑOS, " + meses + " MESES, " + dias + " DIAS");
                        }
                        else{
                            System.out.println("Tiempo Total En Empresa: Indefinido");
                            System.out.println("Tiempo De Comiezo: " + fechaaltai );
                        }
        
                        if(años >= 3){
            
                            trienios = salario * 5 / 100;
                        }
            
                        System.out.println("Complemento De Trienios: " + trienios + "aumeta 5 porciento del salario cada tres años pasados. ");
        
                        System.out.println("Tiempo De Puesto: " + añosc + " AÑOS " + mesesc + " MESES " + diasc + " DIAS ");
        
        
                        double ss = salario * 4.7 / 100;
                        double desempleo = salario * 4.7 / 100;
                        double formacionp = salario * 4.7 / 100;
        
                        System.out.println("Aportaciones a la s.s: " + ss + "$ pesos");
                        System.out.println("Desempleo: " + desempleo + "$ pesos");
                        System.out.println("Formacion Profecional: " + formacionp + "$ pesos");
                        System.out.println("IRPF: " + irpf + "$ pesos");
        
                        salariot = salario + ss + desempleo + formacionp + irpf ;
        
                        System.out.println("Salario Mensual + Complementos : " + salariot + "$ pesos");
        
                        System.out.print("\n Deceas Firmar Otro Contrato si , no: ");
                        otroc = entrada4.nextLine();
        
                        i ++;
                    }while( otroc.equalsIgnoreCase ("si"));
                    
                    System.out.print("\nPresionar Enter Para Regressar Al Menu: ");
                    enter = entrada4.nextLine();
                    
                break ; 
            
            
                case 2:
                
                    System.out.println("\n=== Busqueda De Empleado ===");
                
                    System.out.print("\n Introducir DNI De Empleado a buscar: ");
                    buscardni = entrada4.nextLine();
                
                    if(buscardni == empleados[0]){
                        System.out.println(" === Busqueda Encontrada === ");
                    
                        System.out.println("\n -DATOS DE PERSONAL-");
        
                        System.out.println("\n Nombre: " + empleados[1]);
                        System.out.println("Apellido: " + empleados[2]);
                        System.out.println("DNI: " + empleados[0]);
                        System.out.println("Telefono: " + empleados[3]);
                        System.out.println("Direccion: " + empleados[4]);
                        System.out.println("Nmero De Cuenta: " + empleados[5]);
                    
                    
                        System.out.println("\n -DATOS DE CONTRATO-");
        

                        System.out.println("Salario Mensual: " + salario + "$ pesos");
                        System.out.println("Complemento De Trienios: " + trienios + "aumeta 5 porciento del salario cada tres años pasados. ");
                        System.out.println("Salario Mensual + Complementos : " + salariot + "$ pesos");
                    }
                    else{
                        System.err.println("                 *DNI INCORRECTO* ");
                        System.err.println(" esposible que el dni ingresado no este registrado");
                    }
                    
                    System.out.print("\nPresionar Enter Para Regressar Al Menu: ");
                    enter = entrada4.nextLine();
                    
                break ; 
                
                case 3:
                    salir = true;
                break;
            }       
        }      
    }        
}    
  
