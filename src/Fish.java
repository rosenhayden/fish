public class Fish {
    int health;
    int weight;
    int volume;
    String breed;
    int livingDepth;
    String name;
    boolean inSchool;
    int schoolSize;
    boolean isRare;

    public boolean isRare() {
        return isRare;
    }

    public void setRare(boolean rare) {
        isRare = rare;
    }

    public Fish(int health, int weight, String breed, int livingDepth, String name, boolean inSchool, int schoolSize, boolean isRare) {
        this.health = health;
        this.weight = weight;
        this.volume = volume;
        this.breed = breed;
        this.livingDepth = livingDepth;
        this.name = name;
        this.inSchool = inSchool;
        this.schoolSize = schoolSize;
        this.isRare = isRare;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getLivingDepth() {
        return livingDepth;
    }

    public void setLivingDepth(int livingDepth) {
        this.livingDepth = livingDepth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isInSchool() {
        return inSchool;
    }

    public void setInSchool(boolean inSchool) {
        this.inSchool = inSchool;
    }

    public int getSchoolSize() {
        return schoolSize;
    }

    public void setSchoolSize(int schoolSize) {
        this.schoolSize = schoolSize;
    }


    public int powerLevel() {
        int power = (getHealth() + getWeight() + getVolume()) * getSchoolSize() + getWeight();
        return power;
    }
    public boolean isGoodCatch() {
        return (isRare == true && livingDepth > 100 && weight > 16);
    }
}

