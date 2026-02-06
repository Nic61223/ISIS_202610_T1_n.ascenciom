package co.edu.uniandes.dse.TallerPersistencia.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class PeliculaEntity extends BaseEntity {
    
    private Long id;
    private String titulo;
    private String anioLanzamiento;
    
    @ManyToOne
    private DirectorEntity director;
}
