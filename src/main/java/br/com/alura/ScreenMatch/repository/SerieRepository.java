package br.com.alura.ScreenMatch.repository;

import br.com.alura.ScreenMatch.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerieRepository extends JpaRepository <Serie, Long> {
}
