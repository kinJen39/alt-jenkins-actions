/**
 * Represents a person with a name and age.
 */
class Person {
    String name
    int age
    
    /**
     * Constructs a new Person object with the specified name and age.
     * 
     * @param name The name of the person.
     * @param age  The age of the person.
     */
    Person(String name, int age) {
        this.name = name
        this.age = age
    }
    
    /**
     * Returns the name of the person.
     *
     * @return The name of the person.
     */
    String getName() {
        return name
    }
    
    /**
     * Sets the name of the person.
     *
     * @param name The name of the person.
     */
    void setName(String name) {
        this.name = name
    }
    
    /**
     * Returns the age of the person.
     *
     * @return The age of the person.
     */
    int getAge() {
        return age
    }
    
    /**
     * Sets the age of the person.
     *
     * @param age The age of the person.
     */
    void setAge(int age) {
        this.age = age
    }
}
