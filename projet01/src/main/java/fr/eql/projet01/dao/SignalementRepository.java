package fr.eql.projet01.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eql.projet01.entity.Signalement;

public interface SignalementRepository extends JpaRepository<Signalement, Long>{

}
