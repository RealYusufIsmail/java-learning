package learning.json;

import java.util.Map;

public class Minecraft {
  private String item;
  private String nbt;
  private String result;
  private Map<String, String> enchantments; // map


  String setItem(String item) {
    this.item = item;
    return item;
  }

  String setNbt(String nbt) {
    this.nbt = nbt;

    return nbt;
  }


  private void setEnchantments(Map<String, String> enchantments) {
    this.enchantments = enchantments;
  }


  public void setRecipe(String item, String nbt) {
    setRecipe(item, nbt);
  }

  public void setRecipe(String item, String nbt, String result) {
    setRecipe(item, nbt);
    setResult(result);
  }

  public void setRecipe(String item, String nbt, String result, Map<String, String> enchantments) {
    setRecipe(item, nbt);
    setResult(result);
    setEnchantments(enchantments);
  }

  private void setResult(String result) {
    this.result = result;
  }
}
