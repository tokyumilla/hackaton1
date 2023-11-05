package jump2digital.Hackaton.model.service;

import jump2digital.Hackaton.model.entity.Skin;
import jump2digital.Hackaton.model.repository.SkinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SkinServiceImpl implements SkinService{

    @Autowired
    private SkinRepository skinRepository;

    @Override
    public List<Skin> findAllSkins() {
        return skinRepository.findAll();
    }

    @Override
    public Optional<Skin> findSkinById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Skin save(Skin skin) {
        return skinRepository.save(skin);
    }

    @Override
    public void save(List<Skin> skins) {
        skinRepository.saveAll(skins);
    }
}
