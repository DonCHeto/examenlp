package pe.edu.upeu.examen.entity;
import java.sql.Date;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

	@AllArgsConstructor
	@NoArgsConstructor
	@Setter
	@Getter
	@Entity
	@Table(name = "matriculas")

	public class Matriculas {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		@Column(name = "fecha_mat")
		@Temporal(TemporalType.DATE)
		private Date fecha_mat;
		@Column(name = "horas")
		private Long horas;
		@Column(name = "nivel", length = 15)
		private String nivel;
		
		@ManyToOne
		@JoinColumn(name = "alumno_id", nullable = false)
		private Alumnos alumno;
		
		@ManyToOne
		@JoinColumn(name = "empleado_id", nullable = false)
		private Empleados empleado;
		
		@ManyToOne
		@JoinColumn(name = "grado_id", nullable = false)
		private Grados grado;
	
}