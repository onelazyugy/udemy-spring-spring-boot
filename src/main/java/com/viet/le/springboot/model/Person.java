package com.viet.le.springboot.model;

import lombok.*;

/**
 * Created by VTL on 2/25/18.
 */
@Data
@Getter
@Setter
@NoArgsConstructor
public class Person {
    @NonNull
    private String name;
    private String gender;
    private String age;
}
