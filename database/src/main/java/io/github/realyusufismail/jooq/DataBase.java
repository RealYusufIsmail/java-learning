package io.github.realyusufismail.jooq;

import ch.qos.logback.classic.Logger;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static io.github.realyusufismail.jooq.public_.Tables.USERS;


public class DataBase {
  private static final Logger LOG = (Logger) org.slf4j.LoggerFactory.getLogger(DataBase.class);

  public static void main(String[] args) {
    try (Connection connection = DriverManager.getConnection("jdbc:h2:~/datbase/local-db",
        BasicConfig.userName(), BasicConfig.password())) {
      DSLContext create = DSL.using(connection);

      // language=h2
      Result<Record> records = create.fetch("select id, email from users");
      for (Record dataBaseRecord : records) {
        String email = dataBaseRecord.get(USERS.EMAIL);
        Integer id = dataBaseRecord.get(USERS.ID);
        LOG.info("'{}'" + " " + "'{}'", id, email);
        System.out.println(id + " " + email);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
