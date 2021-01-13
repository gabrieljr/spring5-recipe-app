package gabriel.junior.spring5recipeapp.repositories;

import gabriel.junior.spring5recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
