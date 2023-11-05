package jump2digital.Hackaton.model.service;

import jump2digital.Hackaton.model.entity.BoughtSkin;
import jump2digital.Hackaton.model.entity.Skin;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface SkinService {
    List<Skin> findAllSkins();
    Optional<Skin> findSkinById(Integer id);
    Skin save (Skin skin);
    void save (List<Skin> skins);




}
