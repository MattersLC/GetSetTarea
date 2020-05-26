package GetSet;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("*************Bienvenido a tu programa*************");
        System.out.println();
        System.out.print("Digita la cantidad de empleados a ingresar: ");
        int CantEmp = sc.nextInt();
        int EmpEdit;
        String nombre[] = new String [CantEmp];
        String apellido[] = new String [CantEmp];
        int edad[] = new int [CantEmp];

        //Pedir nombre
        sc.nextLine();
        for (int i=0; i<CantEmp; i++) {
            System.out.print("Ingresa el nombre del empleado #"+(i+1)+": ");
            nombre[i] = sc.nextLine();
            System.out.print("Ingresa el apellido del empleado #"+(i+1)+": ");
            apellido[i] = sc.nextLine();
            System.out.print("Ingresa la edad del empleado #"+(i+1)+": ");
            edad[i] = sc.nextInt();
            sc.nextLine();
            System.out.println();
        }

        //mostrar empleados
        System.out.println("Tus empleados agregados son: ");
        for (int i=0; i<CantEmp; i++) {
            empleado e1 = new empleado(nombre[i], apellido[i], edad[i]);
            e1.datos();
        }
        System.out.println();
        
        //Modificar un empleado
        System.out.println("¿Deseas modificar un empleado?");
        System.out.println("1._ Sí.");
        System.out.println("2._ No.");
        System.out.println("Digita el número de opción: ");
        int opcMod = sc.nextInt();

        switch (opcMod) {
            case 1:
                System.out.println("¿Qué número de empleado deseas modificar?");
                for (int i=0; i<CantEmp; i++) {
                    System.out.println((i+1)+"._ "+nombre[i]+" "+apellido[i]+" "+edad[i]);
                }
                sc.nextLine();
                System.out.print("Digite su respuesta: ");
                EmpEdit = sc.nextInt();
                int modificar = EmpEdit-1;
                sc.nextLine();
                System.out.print("Digite el nuevo nombre del empleado #"+EmpEdit+": ");
                nombre[modificar] = sc.nextLine();
                System.out.print("Digite el nuevo apellido del empleado #"+EmpEdit+": ");
                apellido[modificar] = sc.nextLine();
                System.out.print("Digita la nueva edad del empleado #"+EmpEdit+": ");
                System.out.println("");
                System.out.println("El empleado corregido es: "+nombre[modificar]+" "+apellido[modificar]);
                System.out.println("");
                System.out.println("Tus empleados agregados son: ");
                for (int i=0; i<CantEmp; i++) {
                    empleado e1 = new empleado(nombre[i], apellido[i], edad[i]);
                    e1.datos();
                }
                System.out.println();
                break;
            case 2:
                System.out.println("Vuelva pronto.");
                System.out.println();
                break;
            default:
                System.out.println("No es una opción válida.");
                break;
        }
    }
}