package dev.fernandooliveira.adimn.catalog.domain.category;

import java.time.Instant;
import java.util.UUID;

public class Category {

    private String id;
    private String name;
    private String description;
    private boolean active;
    private Instant createdAt;
    private Instant updateAt;
    private Instant deleteAt;

    private Category(String id,
                     final String name,
                     final String description,
                     final boolean active,
                     final Instant createdAt,
                     final Instant updateAt,
                     final Instant deleteAt
    ) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.active = active;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
        this.deleteAt = deleteAt;
    }

    public static Category newCategory(final String aName, final String aDescription, final boolean isActive){
        final var id = UUID.randomUUID().toString();
        final  var now = Instant.now();
        return new Category(id, aName, aDescription, isActive, now, now, null);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isActive() {
        return active;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getUpdateAt() {
        return updateAt;
    }

    public Instant getDeleteAt() {
        return deleteAt;
    }
}
