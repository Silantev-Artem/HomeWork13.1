package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

public class App {
        public static void main(String[] args) {

            ProductBasket basket1 = new ProductBasket();

            Product apple = new SimpleProduct("Яблоки", 80);
            Product banana = new SimpleProduct("Бананы", 100);
            Product coconut = new SimpleProduct("Кокосы", 120);
            Product duck = new DiscountedProduct("Утка", 140, 10);
            Product eggs = new FixPriceProduct("Яйца");
            Product fish = new SimpleProduct("Рыба", 180);


            basket1.addProduct(apple);
            basket1.addProduct(banana);
            basket1.addProduct(coconut);
            basket1.addProduct(duck);
            basket1.addProduct(eggs);
            basket1.addProduct(fish);

            basket1.printBasket();

            System.out.println(basket1.getTotalPrice());

            basket1.hasProduct("Утка");

            basket1.hasProduct("Рыба");

            basket1.clearBasket();

            basket1.printBasket();

            System.out.println(basket1.getTotalPrice());

            basket1.hasProduct("Утка");




        }


}
