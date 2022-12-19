package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductLabel {
    public String[] generateLabels(List<Product> products) {
        return products.stream()
                .flatMap(Stream::ofNullable)
                .sorted()
                .filter(product -> (product.getStandard() - product.getActual()) < 3)
                .filter(product -> (product.getStandard() - product.getActual()) > 0)
                .map(product -> product.getPrice()/2)
                .collect(Collectors.toList());

    }
}
