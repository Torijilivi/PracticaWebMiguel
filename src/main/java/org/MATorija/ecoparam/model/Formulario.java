package org.MATorija.ecoparam.model;

import jakarta.validation.constraints.*;
import lombok.*;
import org.MATorija.ecoparam.validation.CoincidenciaClaves;
import org.MATorija.ecoparam.validation.Email_Telefono;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
@CoincidenciaClaves
@Email_Telefono
public class Formulario {

    @NotBlank
    private String nombre;
    @NotBlank
    @Size(min = 6, max = 12)
    @Pattern(regexp = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!#$%&]).*$\n")
    private String clave;
    @NotBlank
    @Size(min = 6, max = 12)
    @Pattern(regexp = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!#$%&]).*$\n")
    private String confirmarClave;
    @NotEmpty
    private String genero;
    @NotNull
    private String url;
    @NotNull
    @Pattern(regexp = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+[.][A-Z|a-z]+")
    private String email;
    @NotNull
    private String prefijoTelefonico;
    @NotNull
    private String telefono;
    @NotNull
    private String siglasPais;
    @NotNull
    private String comentarios;

//    @Past
//    @Min(18)
//    @DateTimeFormat(pattern = "dd/mm/yyyy")
//    @NotBlank
    private LocalDate fechaNacimiento;

    @NotNull
    private Integer edad;
    private List<String> musicasSeleccionadas;
    private List<String> aficionesSeleccionadas;
    @NotNull
    private List<String> archivos;

    private Boolean aceptarLicencia;
}
