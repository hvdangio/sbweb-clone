package dev.hvdang.web.rest.demo;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Data
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@Entity(name = "EMPLOYEE")
class Employee {

  private @Id
  @GeneratedValue
  Long id;
  private String name;
  private String role;

  Employee(String name, String role) {
    this.name = name;
    this.role = role;
  }
}