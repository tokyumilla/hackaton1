package jump2digital.Hackaton.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class SkinResponseDTO {
    private int id;
    private String name;
    private String type;
    private int price;
    private String colour;
    private String hero;

    public SkinResponseDTO(int id, String name, String type, int price, String colour, String hero) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
        this.colour = colour;
        this.hero = hero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
