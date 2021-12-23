package io.github.realyusufismail.jooq;

import io.github.yusufsdiscordbot.config.Config;

enum BasicConfig {
  ;
  static String userName() {
    return Config.getString("USERNAME");
  }

  static String password() {
    return Config.getString("PASSWORD");
  }
}
