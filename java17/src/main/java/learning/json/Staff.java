package learning.json;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class Staff {
  private String name;
  private int age;
  private String[] position; // array
  private List<String> skills; // list
  private Map<String, BigDecimal> salary; // map

  // getters and setters
  void setName(String name) {
    this.name = name;
  }

  void setAge(int age) {
    this.age = age;
  }

  void setPosition(String[] position) {
    this.position = position;
  }

  void setSalary(Map<String, BigDecimal> salary) {
    this.salary = salary;
  }

  void setSkills(List<String> skills) {
    this.skills = skills;
  }

  void retrieveSkill(String skill) {
    for (String s : skills) {
      if (s.equals(skill)) {
        System.out.println("Found " + skill);
      }
    }
  }
}
