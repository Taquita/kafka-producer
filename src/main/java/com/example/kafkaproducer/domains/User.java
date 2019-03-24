package com.example.kafkaproducer.domains;

import lombok.*;

import java.util.List;

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

    private List<Phone> phones;

}
