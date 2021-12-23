package io.github.realyusufismail.jooq;

import ch.qos.logback.classic.Logger;
import io.github.yusufsdiscordbot.config.Config;
import jooq.public_.tables.Users;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static jooq.public_.Tables.USERS;

public class DataBase {
  private static final Logger LOG = (Logger) org.slf4j.LoggerFactory.getLogger(DataBase.class);

  public static void main(String[] args) {
    try (Connection connection =
        DriverManager.getConnection("jdbc:h2:file:/Users/YusufIsmail/OneDrive/sqldb/sql",
                BasicConfig.userName(),BasicConfig.password())) {
      DSLContext create = DSL.using(connection);

      // language=h2
      Result<Record> records = create.fetch("select id, email from users");
      for (Record record : records) {
        String email = record.get(USERS.EMAIL);
        Integer id = record.get(USERS.ID);
        LOG.info("'{}'" + " " + "'{}'", id, email);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
