package tech.bts.javaexamples.products;

import tech.bts.javaexamples.classes.util.StringUtil;

import java.util.Arrays;
import java.util.List;

public class DisplayProducts {

    public static void main(String[] args) {

        Product p1 = new Product("iphone", 1000, true);
        Product p2 = new Product("tv", 500, false);
        Product p3 = new Product("mouse", 20, true);

        List<Product> products = Arrays.asList(p1, p2, p3);

        int columnWidth = 15;

        List<String> fieldNames = Arrays.asList("Name", "Price", "Available");

        String title = "";
        for (String fieldName : fieldNames) {
            title += StringUtil.padRight(fieldName, columnWidth);
        }

        String line = StringUtil.repeat("-", columnWidth * fieldNames.size());

        System.out.println(title);
        System.out.println(line);


        for (Product product : products) {

            String productLine =
                    StringUtil.padRight(product.getName(), columnWidth)
                            + StringUtil.padRight("" + product.getPrice(), columnWidth)
                            + StringUtil.padRight("" + product.isAvailable(), columnWidth);

            System.out.println(productLine);
        }
    }
}
