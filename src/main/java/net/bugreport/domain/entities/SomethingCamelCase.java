package net.bugreport.domain.entities;

import java.math.BigInteger;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.rest.core.annotation.RestResource;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SomethingCamelCase {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private BigInteger id;

  @RestResource(path = "something_containing_camel_cases", rel = "something_containing_camel_cases")
  @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL, mappedBy = "somethingCamelCase")
  private List<SomethingContainingCamelCase> somethingContainingCamelCases;

}
