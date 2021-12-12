package learning.json;

import java.util.List;

public class Minecraft {
  String item;
  String result;
  List<String> test;
  Test2 test2;

  public void setItem(String item) {
    this.item = item;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public void setNbt(List<String> test) {
    this.test = test;
  }

  public void setTest2(Test2 test2) {
    this.test2 = test2;
  }
}


class Test2 {
  Baz test3;

  public void setBaz(Baz test3) {
    this.test3 = test3;
  }
}


class Baz {
  List<Foobar> test5;
  int HideFlags;

  public void setFoobar(List<Foobar> foobar) {
    this.test5 = foobar;
  }

  public void setHideFlags(int HideFlags) {
    this.HideFlags = HideFlags;
  }
}


class Foobar {
  String id;
  int lvl;

  public void setId(String id) {
    this.id = id;
  }

  public void setLvl(int lvl) {
    this.lvl = lvl;
  }
}
