import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HorariosClases {

    public static void main(String[] args) {
        List<String> horariosDisponibles = obtenerHorariosDisponibles();
        List<String> horariosOcupados = obtenerHorariosOcupados();

        System.out.println("Bienvenido al sistema de horarios de clases");

        // Solicitar el nombre del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Estos son los horarios de clases disponibles:");
        for (String horario : horariosDisponibles) {
            System.out.println(horario);
        }

        System.out.println("Por favor, ingresa el horario que deseas seleccionar:");
        String horarioSeleccionado = scanner.nextLine();

        if (horariosDisponibles.contains(horarioSeleccionado)) {
            System.out.println("¡Excelente elección, " + nombre + "! Has seleccionado el siguiente horario:");
            System.out.println(horarioSeleccionado);
        } else if (horariosOcupados.contains(horarioSeleccionado)) {
            System.out.println("Lo siento, " + nombre + ", el horario seleccionado no está disponible.");
        } else {
            System.out.println("Lo siento, " + nombre + ", el horario ingresado no es válido.");
        }

        System.out.println("¡Gracias por usar nuestro sistema de horarios de clases, " + nombre + "!");
    }

    public static List<String> obtenerHorariosDisponibles() {
        List<String> horariosDisponibles = new ArrayList<>();
        horariosDisponibles.add("Lunes 8:00 - 10:00");
        horariosDisponibles.add("Martes 14:00 - 16:00");
        horariosDisponibles.add("Miércoles 10:00 - 12:00");
        // Agrega más horarios disponibles si es necesario
        return horariosDisponibles;
    }

    public static List<String> obtenerHorariosOcupados() {
        List<String> horariosOcupados = new ArrayList<>();
        horariosOcupados.add("Martes 10:00 - 12:00");
        horariosOcupados.add("Miércoles 8:00 - 10:00");
        // Agrega más horarios ocupados si es necesario
        return horariosOcupados;
    }
}