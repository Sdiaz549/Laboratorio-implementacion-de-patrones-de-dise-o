package biblioteca;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<ObservadorReserva> observadores = List.of(
                new NotificadorEstudiante(),
                new RegistroEventos()
        );

        ReservaFacade fachada = new ReservaFacade(
                new RepositorioSalasMemoria(),
                new RepositorioReservasMemoria(),
                observadores);

        fachada.realizarReserva(
                new Estudiante("E001", "Laura"),
                LocalDate.now().plusDays(7),
                LocalTime.of(14, 0),
                2,
                4,
                new SeleccionPorCapacidad()
        ).ifPresent(System.out::println);
    }
}
