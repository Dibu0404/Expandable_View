package com.example.expandableview;

public class product {
    private String productname, Price, quantity, description;
private boolean expandable ;

    public boolean isExpandable() {
        return expandable;
    }

    public void setExpandable(boolean expandable) {
        this.expandable = expandable;
    }

    public product(String productname, String Price, String quantity, String description) {
        this.productname = productname;
        this.Price = Price;
        this.quantity = quantity;
        this.description = description;
        this.expandable = false;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        this.Price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Version{" +
                "productname='" + productname + '\'' +
                ", Price='" + Price + '\'' +
                ", quantity='" + quantity + '\'' +
                ", description='" + description + '\'' +
                ", expandable=" + expandable +
                '}';
    }
}

