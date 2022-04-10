package com.needle.utlis;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;


@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SearchMapper {
    private @Getter @Setter
    String table;
    private @Getter @Setter
    List fields;
    private @Getter @Setter
    List search;


}
