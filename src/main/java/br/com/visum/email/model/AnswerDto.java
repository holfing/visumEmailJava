package br.com.visum.email.model;

import java.io.Serializable;
import java.util.ArrayList;
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
	
	/**
	 * @param dto
	 * @return
	 */
	public List<Answer> converte (AnswerDto dto) {
		List<Answer> answers = new ArrayList<Answer>();
		
		for (Answer it : dto.getAnswers()) {
			Answer itAnswer = new Answer();
			itAnswer.setIdQuestion(it.getIdQuestion());
			itAnswer.setTypeAnswer(it.getTypeAnswer());
			itAnswer.setTextAwser(it.getTextAwser());
			
			answers.add(itAnswer);
		}
		
		return answers;
	} 
	
	
	
}
