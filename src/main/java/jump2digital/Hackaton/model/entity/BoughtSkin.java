package jump2digital.Hackaton.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Skins")
public class 
BoughtSkin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer pk_SkinID;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "type")
    private String type;

    @Column(name = "price")
    private int price;

    @Column(name = "colour")
    private String colour;

    @Column(name = "character")
    private String character;

    public BoughtSkin() {
    }

    public BoughtSkin(String name, String type, int price, String colour, String character) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.colour = colour;
        this.character = character;
    }

    public Integer getPk_SkinID() {
        return pk_SkinID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }
}

