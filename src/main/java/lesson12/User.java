package lesson12;

import lombok.*;

import java.io.Serializable;

@Builder
@ToString
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
String name ;
    int age;
String surname;
int salary;
}
