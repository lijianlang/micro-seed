package cn.ljl.demo.domain;

import java.io.Serializable;

public class Product implements Serializable {

    private Long id;
    private String name;
    private Long productId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }



    public Product(Long id, String name, Long productId) {
        this.id = id;
        this.name = name;
        this.productId = productId;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", productId=" + productId +
                '}';
    }


}
