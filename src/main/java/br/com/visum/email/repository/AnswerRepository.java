package br.com.visum.email.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.visum.email.model.Answer;


/**
 * @author visum
 *
 */
public interface AnswerRepository extends JpaRepository<Answer, Long> {

}
