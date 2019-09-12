package Agenda;


import Modelo.Odontologo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sun.tools.jar.CommandLine;

@Configuration
@Slf4j
public class cargarBaseDatos {
@Bean
    CommandLineRunner initDataBase(agendaOdontologo agendaOdontologo){
    return args -> {
        log.info("Cargar "+ agendaOdontologo.save(new Odontologo("Martin","Fernandez","Ortodoncia")));
        log.info("Cargar "+ agendaOdontologo.save(new Odontologo("Josue","Orzolini","Implantología")));

    };
    }
}
