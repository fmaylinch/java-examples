package tech.bts.javaexamples.suspects;

public class Suspect {

    // Builder pattern
    // software development patterns

    private String name;
    private String eyeColor;
    private String hairColor;
    private int height;
    private int weight;
    private int age;
    private boolean male;


    private Suspect() {
        // nothing
    }

    private Suspect(String name, String eyeColor, String hairColor, int height, int weight, int age, boolean male) {
        this.name = name;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.male = male;
    }

    public String getName() {
        return name;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public boolean isMale() {
        return male;
    }


    // Inner class
    // Are usually static.
    // If it isn't static, you need to create an object of the enclosing class first
    public static class Builder {

        // - Option 1
        // Declare all the fields again
        // private String name;
        // private String eyeColor;
        // etc.
        // Add setters for those fields.
        // And in the build method, create an object with the values in the fields.

        // - Option 2
        // Have a field of the class you want to create.
        // Create an empty object in the constructor.
        // Add setters that change properties of the field.
        // In the build method, just return that field.
        private Suspect suspect;

        public Builder() {
            this.suspect = new Suspect();
        }

        // We return the same builder for method chaining
        public Builder name(String name) {
            this.suspect.name = name;
            return this;
        }

        public Builder eyeColor(String eyeColor) {
            this.suspect.eyeColor = eyeColor;
            return this;
        }

        public Builder hairColor(String hairColor) {
            this.suspect.hairColor = hairColor;
            return this;
        }

        public Builder age(int age) {
            this.suspect.age = age;
            return this;
        }

        public Builder height(int height) {
            this.suspect.height = height;
            return this;
        }

        public Builder weight(int weight) {
            this.suspect.weight = weight;
            return this;
        }

        public Builder male(boolean male) {
            this.suspect.male = male;
            return this;
        }

        public Suspect build() {
            // Here you could set more fields and/or check that everything was set correctly
            return this.suspect;
        }
    }
}