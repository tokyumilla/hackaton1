package jump2digital.Hackaton.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name="BoughtSkins")
public class 
BoughtSkin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @Column(name = "price")
    private int price;

    @Column(name = "colour")
    private String colour;

    @Column(name = "hero")
    private String hero;

    public BoughtSkin() {
    }


    public BoughtSkin(String name, String type, int price, String colour, String hero) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.colour = colour;
        this.hero = hero;
    }

    public Integer getId() {
        return id;
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

    public String getHero() {
        return hero;
    }

    public void setHero(String hero) {
        this.hero = hero;
    }
}

