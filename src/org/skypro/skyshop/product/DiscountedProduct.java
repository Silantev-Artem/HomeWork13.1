package org.skypro.skyshop.product;

public class DiscountedProduct extends Product{
    private int basePrice;
    private int discountPercent;

    public DiscountedProduct(String nameProduct, int basePrice, int discountPercent) {
        super(nameProduct);
        this.basePrice = basePrice;
        this.discountPercent = discountPercent;

    }

    @Override
    public int getPriceProduct() {
        return (basePrice * (100 - discountPercent)) /100;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public String toString() {
        return nameProduct + " : " + getPriceProduct() + " ( " + discountPercent + " %)";
    }
}
