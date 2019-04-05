package net.bugreport.domain.entities;

import java.math.BigInteger;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NaturalId;
import org.springframework.data.rest.core.annotation.RestResource;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SomethingContainingCamelCase {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private BigInteger id;

  @NaturalId
  @ManyToOne(optional = false)
  @JoinColumn(nullable = false, name = "something_camel_case")
  @RestResource(path = "something_camel_case", rel = "something_camel_case")
  private SomethingCamelCase somethingCamelCase;

}
