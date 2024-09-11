package pe.edu.upeu.examen.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

	@AllArgsConstructor
	@NoArgsConstructor
	@Setter
	@Getter
	@Entity
	@Table(name = "cursos")

public class Cursos {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		@Column(name = "nombre", length = 15)
		private String nombre;
		@Column(name = "horas")
		private Long horas;
		
		@ManyToOne
		@JoinColumn(name = "grado_id", nullable = false)
		private Grados grado;
}