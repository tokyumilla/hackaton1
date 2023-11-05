package jump2digital.Hackaton.model.repository;

import jump2digital.Hackaton.model.entity.BoughtSkin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoughtSkinRepository extends JpaRepository<BoughtSkin,Integer> {
}
