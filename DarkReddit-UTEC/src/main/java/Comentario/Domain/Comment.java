package Comentario.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Comment {
    @Id
    @GeneratedValue
    private Long id;
}
