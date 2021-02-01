package gabriel.junior.spring5recipeapp.services;

import gabriel.junior.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
