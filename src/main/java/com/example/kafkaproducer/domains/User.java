package com.example.kafkaproducer.domains;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long id;

    private String name;

    private String cpf;

}
