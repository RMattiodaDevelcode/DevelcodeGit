package br.com.develcode.data.crud;

import br.com.develcode.common.model.GiftModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GiftRepository extends JpaRepository<GiftModel, Long> {
}
