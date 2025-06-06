package org.skypro.skyshop.product;

public class FixPriceProduct extends Product {
    private static final int FIXED_PRICE = 100;

    public FixPriceProduct (String nameProduct) {
        super(nameProduct);
    }

    @Override
    public int getPriceProduct() {
        return FIXED_PRICE;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public String toString() {
        return nameProduct + " : Фиксированная цена " + FIXED_PRICE;
    }
}
