package generics;

class Fruit<T, K, R> {
    private T id;
    private K age;
    private R name;


    public Fruit(T id, K age, R name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public K getAge() {
        return age;
    }

    public void setAge(K age) {
        this.age = age;
    }

    public R getName() {
        return name;
    }

    public void setName(R name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "id=" + id +
                ", age=" + age +
                ", name=" + name +
                '}';
    }
}
