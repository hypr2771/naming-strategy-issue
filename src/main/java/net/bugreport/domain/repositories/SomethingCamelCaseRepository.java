package net.bugreport.domain.repositories;

import java.math.BigInteger;
import net.bugreport.domain.entities.SomethingCamelCase;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "something_camel_cases", collectionResourceRel = "something_camel_cases")
public interface SomethingCamelCaseRepository extends PagingAndSortingRepository<SomethingCamelCase, BigInteger> {

}
