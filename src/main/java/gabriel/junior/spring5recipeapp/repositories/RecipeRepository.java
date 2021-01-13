package gabriel.junior.spring5recipeapp.repositories;

import gabriel.junior.spring5recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
