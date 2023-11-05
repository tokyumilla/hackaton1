package jump2digital.Hackaton.model.service;

import jump2digital.Hackaton.model.entity.BoughtSkin;
import jump2digital.Hackaton.model.repository.BoughtSkinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BoughtSkinServiceImpl implements BoughtSkinService{

    @Autowired
    private BoughtSkinRepository boughtSkinRepository;

    @Override
    public List<BoughtSkin> findAllBoughtSkins() {
        List<BoughtSkin> boughtSkins = boughtSkinRepository.findAll();
        return boughtSkins;
    }

    @Override
    public Optional<BoughtSkin> findBoughtSkinById(Integer id) {
        Optional<BoughtSkin> boughtSkin= boughtSkinRepository.findById(id);
        if(boughtSkin.isPresent()) return boughtSkin;
        else return Optional.empty();
    }

    @Override
    public BoughtSkin saveBoughtSkin(BoughtSkin boughtSkin) {
        boughtSkinRepository.save(boughtSkin);
        return boughtSkin;
    }

    @Override
    public void deleteBoughtSkin(Integer id) {
        boughtSkinRepository.deleteById(id);
    }
}
