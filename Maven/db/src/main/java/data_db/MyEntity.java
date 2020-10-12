package data_db;

import java.util.UUID;

public class MyEntity {
    public UUID id;
    private String name;

    public MyEntity(String name) {
        this.name = name;
    }



    public void setId(UUID id) {
        this.id = id;
    }



    @Override
    public String toString() {
        return new StringBuilder().append("MyEntity{").append("id=").append(id).append(", name='").append(name).
                append('\'').append('}').toString();
    }
}
