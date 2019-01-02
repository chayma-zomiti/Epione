package entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Reclamation database table.
 * 
 */
@Entity
public class Reclamation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String description;

	public Reclamation() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Reclamation(int id, String description) {
		super();
		this.id = id;
		this.description = description;
	}
	public Reclamation( String description) {
		
		this.description = description;
	}

}