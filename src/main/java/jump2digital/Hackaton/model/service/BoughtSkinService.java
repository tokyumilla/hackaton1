package jump2digital.Hackaton.model.service;

import jump2digital.Hackaton.model.entity.BoughtSkin;

import java.util.List;
import java.util.Optional;

public interface BoughtSkinService {

    List<BoughtSkin> findAllBoughtSkins();
    BoughtSkin saveBoughtSkin (BoughtSkin boughtSkin);
    void deleteBoughtSkin (Integer id);


}
