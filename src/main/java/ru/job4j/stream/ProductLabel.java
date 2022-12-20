package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class ProductLabel {
    public List<String> generateLabels(List<Product> products) {
        return products.stream()
                .filter(product -> (product.getStandard() - product.getActual()) <= 3)
                .filter(product -> (product.getStandard() - product.getActual()) >= 0)
                .map(p -> new Label(p.getName(), p.getPrice() / 2))
                .map(e -> e.toString())
                .collect(Collectors.toList());

    }
}