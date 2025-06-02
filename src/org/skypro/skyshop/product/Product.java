package org.skypro.skyshop.product;

public abstract class Product {

    protected String nameProduct;
    ///private int priceProduct;

    public Product(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getNameProduct() {
        return this.nameProduct;
    }

    public abstract int getPriceProduct();

    public abstract boolean isSpecial();

    @Override
    public abstract String toString();
}


