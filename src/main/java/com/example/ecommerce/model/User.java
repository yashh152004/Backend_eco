
package com.example.ecommerce.model;

import jakarta.persistence.*;
        import lombok.Data;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String email;

    private String password;

    private String role; // e.g., "CUSTOMER", "ADMIN"
}

