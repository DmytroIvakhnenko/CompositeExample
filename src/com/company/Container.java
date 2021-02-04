package com.company;

import java.util.List;

public class Container implements Product{
    private final List<Product> productList;

    public Container(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public double getWeight() {
        return productList.stream().mapToDouble(Product::getWeight).sum();
    }
}
