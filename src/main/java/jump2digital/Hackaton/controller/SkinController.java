package jump2digital.Hackaton.controller;

import jump2digital.Hackaton.model.entity.BoughtSkin;
import jump2digital.Hackaton.model.entity.Skin;
import jump2digital.Hackaton.model.service.BoughtSkinService;
import jump2digital.Hackaton.model.service.SkinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http:localhost:9000")
@RestController
@RequestMapping("/skins")
public class SkinController {

    @Autowired
    private SkinService skinService;

    @Autowired
    private BoughtSkinService boughtSkinService;

    @GetMapping("/available")
    public ResponseEntity<List<Skin>> getAllSkins() {
        try {
            List<Skin> skins = skinService.findAllSkins();
            if (skins.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            else return new ResponseEntity<>(skins, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/{id}/buy")
    public ResponseEntity<BoughtSkin> buySkin(@PathVariable("id") int id) {
        Optional<Skin> skinData = skinService.findSkinById(id);

        if(skinData.isPresent()) {
            Skin skin = skinData.get();
            BoughtSkin boughtSkin = new BoughtSkin(skin.getName(),skin.getType(), skin.getPrice(), skin.getColour(),skin.getHero());
            return new ResponseEntity<>(boughtSkinService.saveBoughtSkin(boughtSkin),HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/myskins")
    public ResponseEntity<List<BoughtSkin>> getAllBoughtSkins (){
        try {
            List<BoughtSkin> mySkins = boughtSkinService.findAllBoughtSkins();
            if (mySkins.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            else return new ResponseEntity<>(mySkins, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}/color")
    public ResponseEntity<BoughtSkin> updateColour(@PathVariable("id") int id, @RequestBody String colour){
        Optional<BoughtSkin> boughtSkinData = boughtSkinService.findBoughtSkinById(id);
        if (boughtSkinData.isPresent()) {
            BoughtSkin boughtSkin = boughtSkinData.get();
            boughtSkin.setColour(colour);
            return new ResponseEntity<>(boughtSkinService.saveBoughtSkin(boughtSkin),HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }




}
