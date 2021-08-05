package adv.db.project.dataModels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MOVIES")
public class Movies {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "TITLE")
	private String title;
	
	@Column(name = "RELEASE_DATE")
	private String date;
	

	public Movies(String title, String date, String category) {
		super();
		this.title = title;
		this.date = date;
	}
	
	

	public Movies() {
		super();
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "Movies [id=" + id + ", title=" + title + ", date=" + date + ", category=" + "]";
	}


	
}
