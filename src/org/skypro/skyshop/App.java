package org.skypro.skyshop;

import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;
import org.skypro.skyshop.search.SearchEngine;
import org.skypro.skyshop.search.Searchable;

import java.util.Arrays;

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


            SearchEngine object1 = new SearchEngine(25);

            Article appleArt = new Article("Яблочки", "Яблоки красные и зеленые - вкусные спелые и садовые");
            Article bananaArt = new Article("Бананчики", "Бананы желтые, Эквадорские, отрывать с конца");
            Article coconutArt = new Article("Кокосики", "Кокосы мощные и свежие, как ветер на Багамах");
            Article duckArt = new Article("Уточка", "Утка крякает от удовольствия");
            Article eggsArt = new Article("Яички", "Яйца не только на Пасху нужны");
            Article fishArt = new Article("Рыбка","Рыба ловись большая и маленькая");



            object1.add(apple);
            object1.add(appleArt);
            object1.add(banana);
            object1.add(bananaArt);
            object1.add(coconut);
            object1.add(coconutArt);
            object1.add(duck);
            object1.add(duckArt);
            object1.add(eggs);
            object1.add(eggsArt);
            object1.add(fish);
            object1.add(fishArt);

            ///object1.getStringRepresentation();

            System.out.println(Arrays.toString(object1.search("Яблоки")));
            System.out.println(Arrays.toString(object1.search("Бананы")));
            System.out.println(Arrays.toString(object1.search("Кокосы")));
            System.out.println(Arrays.toString(object1.search("Утка")));
            System.out.println(Arrays.toString(object1.search("Рыба")));
            System.out.println(Arrays.toString(object1.search("Яйца")));













        }


}
