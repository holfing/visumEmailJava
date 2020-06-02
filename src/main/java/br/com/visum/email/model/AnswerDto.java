package br.com.visum.email.model;

import java.io.Serializable;
import java.util.List;

/**
 * @author Visum
 *
 */
public class AnswerDto implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Answer> answers;
	/**
	 * @return the answers
	 */
	public List<Answer> getAnswers() {
		return answers;
	}
	/**
	 * @param answers the answers to set
	 */
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	
	
	
}
