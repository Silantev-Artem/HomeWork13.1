package org.skypro.skyshop.product;

import org.skypro.skyshop.search.Searchable;

public abstract class Product implements Searchable {

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


    @Override
    public String getSearchTerm() {
        return nameProduct;
    }

    @Override
    public String getType() {
        return "PRODUCT";
    }

    @Override
    public String getName() {
        return nameProduct;
    }
}


