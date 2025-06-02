package org.skypro.skyshop.basket;


import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private Product[] products;
    private int countProduct;

    public ProductBasket () {
        products = new Product[5];
        countProduct = 0;
    }

    public void addProduct(Product product) {
        if (countProduct < products.length) {
            products[countProduct] = product;
            countProduct++;
        } else {
            System.out.println("Невозможно добавить продукт");
        }
    }

    public int getTotalPrice () {
        int total = 0;
        for (int i = 0; i < countProduct; i++) {
            total += products[i].getPriceProduct();
        }
        return total;
    }
    public void printBasket() {

        int specialCount = 0;

        if (countProduct == 0) {
            System.out.println("В корзине пусто");
        } else {
            for (int i = 0; i < countProduct; i++) {
                System.out.println(products[i].toString());
                if (products[i].isSpecial()) {
                    specialCount++;
                }
            }
            System.out.println("Итого: " + getTotalPrice());
            System.out.println("Специальных товаров: " + specialCount);
        }
    }

    public boolean hasProduct (String name) {
        for (int i = 0; i < countProduct; i++) {
            if (products[i].getNameProduct().equals(name)) {
                System.out.println("Товар есть в корзине");
                return true;
            }
        }
        System.out.println("Товара нет в корзине");
        return false;
    }

    public void clearBasket () {
        for (int i = 0; i < countProduct; i++) {
            products[i] = null;
        }
        countProduct = 0;
        }
    }


