/**
 * 
 */
package entity;

import jakarta.persistence.Entity;

import jakarta.persistence.Table;

/**
 * 
 */
@Entity
@Table(name ="Messages")
public class Messages {
	
	
	private int Id;
	private String Messages;
	/**
	 * @param id
	 * @param helloWorld
	 */
	public Messages(int id, String messages) {
		super();
		Id = id;
		Messages = messages;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return Id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		Id = id;
	}
	/**
	 * @return the helloWorld
	 */
	public String getHelloworld() {
		return Messages;
	}
	/**
	 * @param helloWorld the helloWorld to set
	 */
	public void setmessages(String messages) {
		Messages = messages;
	}
	@Override
	public String toString() {
		return "Messages [Messages=" + Messages + "]";
	}
	
	
	
	

}
