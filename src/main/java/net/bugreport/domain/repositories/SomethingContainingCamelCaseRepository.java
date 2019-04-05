package net.bugreport.domain.repositories;

import java.math.BigInteger;
import net.bugreport.domain.entities.SomethingContainingCamelCase;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "something_containing_camel_cases", collectionResourceRel = "something_containing_camel_cases")
public interface SomethingContainingCamelCaseRepository extends PagingAndSortingRepository<SomethingContainingCamelCase, BigInteger> {

}
