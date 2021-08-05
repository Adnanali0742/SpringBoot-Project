package adv.db.project.dataModels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ADDRESS")
public class Address {
	
	@Id
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "COUNTRY")
	private String countryName;
	
	@Column(name = "AREA")
	private String area;
	
	@Column(name = "CITY")
	private String city;
	
	@Column(name = "STREET")
	private String street;
	
	@Column(name = "STREET_NUMBER")
	private String number;

	public Address(Integer id, String countryName, String area, String city, String street, String number) {
		super();
		this.id = id;
		this.countryName = countryName;
		this.area = area;
		this.city = city;
		this.street = street;
		this.number = number;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", countryName=" + countryName + ", area=" + area + ", city=" + city + ", street="
				+ street + ", number=" + number + "]";
	}
	
	

}
