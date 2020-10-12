package data_service;

import data_db.Db;
import data_db.DbSetting;
import data_db.MyEntity;

import java.util.UUID;

public class MyService {

     DbSetting dbSetting = new DbSetting("name", "password");
     String name = "myService";
     Db db = new Db(dbSetting);

    public String getName() {
        return name;
    }

    public MyEntity setMyEntity(MyEntity myEntity) {
        myEntity.setId(UUID.randomUUID());
        db.setMyEntity(myEntity);
        return myEntity;
    }

    public MyEntity getMyEntity() {
        return db.getMyEntity();
    }
}
