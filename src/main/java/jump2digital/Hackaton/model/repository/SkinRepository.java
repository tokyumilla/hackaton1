package jump2digital.Hackaton.model.repository;

import jump2digital.Hackaton.model.entity.Skin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkinRepository extends JpaRepository<Skin, Integer> {
}
