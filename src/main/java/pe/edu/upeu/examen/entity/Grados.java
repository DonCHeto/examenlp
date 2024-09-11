package pe.edu.upeu.examen.entity;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
	@Table(name = "grados")

public class Grados {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		@Column(name = "grado_sec", length = 15)
		private String grado_sec;
		@Column(name = "grado_nivel", length = 15)
		private String grado_nivel;
		
		
		@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "grado")
		@JsonIgnore
		private Set<Matriculas> matriculas;
		
		@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "grado")
		@JsonIgnore
		private Set<Cursos> cursos;

}