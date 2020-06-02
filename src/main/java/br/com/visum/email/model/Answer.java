package br.com.visum.email.model;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * @author Visum
 *
 */
@Entity
public class Answer implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long idAnswer;
	private long idQuestion;
	private String typeAnswer;
	private String textAwser;
	
	
	public Answer() {
		
	}


	/**
	 * @return the idAnswer
	 */
	public long getIdAnswer() {
		return idAnswer;
	}


	/**
	 * @param idAnswer the idAnswer to set
	 */
	public void setIdAnswer(long idAnswer) {
		this.idAnswer = idAnswer;
	}


	/**
	 * @return the idQuestion
	 */
	public long getIdQuestion() {
		return idQuestion;
	}


	/**
	 * @param idQuestion the idQuestion to set
	 */
	public void setIdQuestion(long idQuestion) {
		this.idQuestion = idQuestion;
	}


	/**
	 * @return the typeAnswer
	 */
	public String getTypeAnswer() {
		return typeAnswer;
	}


	/**
	 * @param typeAnswer the typeAnswer to set
	 */
	public void setTypeAnswer(String typeAnswer) {
		this.typeAnswer = typeAnswer;
	}


	/**
	 * @return the textAwser
	 */
	public String getTextAwser() {
		return textAwser;
	}


	/**
	 * @param textAwser the textAwser to set
	 */
	public void setTextAwser(String textAwser) {
		this.textAwser = textAwser;
	}

}
