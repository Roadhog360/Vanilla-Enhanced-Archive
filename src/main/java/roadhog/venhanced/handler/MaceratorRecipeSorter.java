package roadhog.venhanced.handler;

import java.util.Comparator;

import net.minecraft.item.crafting.IRecipe;

public class MaceratorRecipeSorter implements Comparator {

	final MaceratorRecipes Macerator;
	
	public MaceratorRecipeSorter(MaceratorRecipes MaceratorCraftingManager) {
		this.Macerator = MaceratorCraftingManager;
	}
	
	public int compareRecipes(IRecipe irecipe1, IRecipe irecipe2) {
		return irecipe1 instanceof MaceratorShapelessRecipes ? 1: (irecipe2 instanceof MaceratorShapelessRecipes ? -1 : (irecipe2.getRecipeSize() < irecipe1.getRecipeSize() ? -1 : (irecipe2.getRecipeSize() > irecipe1.getRecipeSize() ? 1 : 0)));
	}
	
	@Override
	public int compare(Object o1, Object o2) {
		return this.compareRecipes((IRecipe)o1, (IRecipe)o2);
	}

}