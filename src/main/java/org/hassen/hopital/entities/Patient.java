package org.hassen.hopital.entities;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty
    @Size(min=4, max=30)
    private String nom;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "YYYY/MM/DD")
    private Date dateNaissance;
    private boolean malade;
    @Min(100)
    private int score;

}
