package me.cosmi.mad.entity;

public final class User {
    private final String name;
    private final String description;
    private final int id;
    private boolean isFollowing;

    public User(
            final String name,
            final String description,
            final int id,
            final boolean isFollowing) {
        this.name = name;
        this.description = description;
        this.id = id;
        this.isFollowing = isFollowing;
    }

    public static UserBuilder builder() {
        return new User.UserBuilder();
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public int getId() {
        return this.id;
    }

    public boolean isFollowing() {
        return this.isFollowing;
    }

    public void setIsFollowing(final boolean isFollowing) {
        this.isFollowing = isFollowing;
    }

    public final static class UserBuilder {
        private String name;
        private String description;
        private int id;
        private boolean isFollowing;

        public UserBuilder setName(final String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setDescription(final String description) {
            this.description = description;
            return this;
        }

        public UserBuilder setId(final int id) {
            this.id = id;
            return this;
        }

        public UserBuilder setIsFollowing(final boolean isFollowing) {
            this.isFollowing = isFollowing;
            return this;
        }

        public User complete() {
            return new User(name, description, id, isFollowing);
        }
    }
}
