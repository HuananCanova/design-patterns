package Reflection;


import lombok.Data;

public class Product {
    private Long id;
    private String name;
    private String description;
    private boolean available;
    private int quantity;

    public Product(Long id, String name, String description, int quantity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.quantity = quantity;

        if (this.quantity > 0){
            this.available = true;
        }else{
            this.available = false;
        }
    }

    @JSON
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @JSON
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @JSON
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @JSON
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    @JSON
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
