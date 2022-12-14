package com.godoro.OF010.inventory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {


        Category categoryA = new Category(321, "Beyaz Eşya");
//        List<Product> productList = new ArrayList<>();
//        categoryA.setProductList(productList);
        categoryA.setProductList(new ArrayList<Product>());//Üstteki iki satır, bunun uzun hali.



        Product product0 = new Product(401,"Buzdolabı",900);
        product0.setCategory(categoryA);

        Product product1 = new Product(402,"Çamaşır Makinesi",750);
        product1.setCategory(categoryA);

        Product product2 = new Product(403,"Bulaşık Makinesi",600);
        product2.setCategory(categoryA);


        categoryA.getProductList().add(product0); //Category'nin product listesini al ve product ekle.
        categoryA.getProductList().add(product1);
        categoryA.getProductList().add(product2);


        System.out.println(categoryA.getCategoryId());
        System.out.println(categoryA.getCategoryName());
        System.out.println("----------------------");

/*        for (Product product : categoryA.getProductList()) {
            System.out.println(product.getProductId() + " "
                    + product.getProductName() + " " + product.getSalesPrice());
        }*/

        categoryA.getProductList().stream()
                .map(Product::getProductName)
                .forEach(System.out::println);

        List<String> products = categoryA.getProductList().stream()
                .flatMap(product -> Stream.of(product.getProductName(),Long.toString(product.getProductId())))
                //.forEach(System.out::println);
                .toList();

        products.stream()
                .forEach(System.out::println);

    }

}
