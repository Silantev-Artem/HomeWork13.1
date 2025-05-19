package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
        public static void main(String[] args) {

            ProductBasket basket1 = new ProductBasket();

            Product apple = new Product("Яблоки", 80);
            Product banana = new Product("Бананы", 100);
            Product coconut = new Product("Кокосы", 120);
            Product duck = new Product("Утка", 140);
            Product eggs = new Product("Яйца", 160);
            Product fish = new Product("Рыба", 180);


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

            /// я затопил соседей снизу своими слезами и сломал всё стекло соседям сверху от мощи криков, пока делал это домашнее задание((. Надеюсь, оно того стоило.


        }


}
