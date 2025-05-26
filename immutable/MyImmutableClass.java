package immutable;

/*
    Immutable class:
    cannot change object once created
    cannot extend the class so no child classes

    How to create:
    a. declare class as final
    b. no setter can have getters
    e.g. String, Wrapper.

 */
final public class MyImmutableClass {

    private final Integer id;
    private final String title;

    MyImmutableClass(Integer id, String title) {
        this.id = id;
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

}
