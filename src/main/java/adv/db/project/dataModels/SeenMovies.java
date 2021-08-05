package adv.db.project.dataModels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SEEN_MOVIES")
public class SeenMovies {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "MOVIE_NAME")
	private String MovieName;

	public SeenMovies() {
		super();
	}

	public SeenMovies(Integer id, String movieName) {
		super();
		MovieName = movieName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMovieName() {
		return MovieName;
	}

	public void setMovieName(String movieName) {
		MovieName = movieName;
	}

	@Override
	public String toString() {
		return "\n[id=" + id + ", MovieName=" + MovieName + "]";
	}
	
	
	
	

}
