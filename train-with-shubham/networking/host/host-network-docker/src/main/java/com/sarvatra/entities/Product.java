package com.sarvatra.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "product_table")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String productName;

    @Column(name = "prod_type")
    private String productType;

    private BigDecimal price;

    private Integer quantity;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @Override
    public String toString() {
        return "{\n" +
               "  \"id\": " + id + ",\n" +
               "  \"product-name\": \"" + productName + "\",\n" +
               "  \"product-type\": \"" + productType + "\",\n" +
               "  \"price\": " + price + ",\n" +
               "  \"quantity\": " + quantity + ",\n" +
               "  \"createdAt\": \"" + createdAt + "\",\n" +
               "  \"updatedAt\": \"" + updatedAt + "\"\n" +
               "}";
    }

}
