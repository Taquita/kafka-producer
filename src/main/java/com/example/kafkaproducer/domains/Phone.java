package com.example.kafkaproducer.domains;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Phone {

    private Long id;

    private String number;

}
