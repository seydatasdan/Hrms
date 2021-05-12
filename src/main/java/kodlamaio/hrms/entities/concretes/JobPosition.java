package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity   //implement ettiğimiz kısım için yazıyoruz, implement etmeye gerek kalmadı
@Table(name="job_positions")

public class JobPosition {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)  //parantez içini eklememizin sebebi db de id yi identity çalıştırması için
	
	@Column(name="id")
	private int id;
	
	
	@Column(name="title")
	private String title;
	
	public JobPosition() {
		
	}
	
	
	public JobPosition(int id, String title) {
		
		this.id = id;
		this.title = title;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}
		
}
