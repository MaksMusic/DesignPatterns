package Builder;

public class Auto {
    String model;
    int price;
    double weight;

    @Override
    public String toString() {
        return "Auto{" + "model='" + model + '\'' + ", price=" + price + ", weight=" + weight + '}';
    }
}

interface AutoBuilder{
    AutoBuilder setModel (String model);
    AutoBuilder setPrice (int price);
    AutoBuilder setWeight (double weight);
    Auto build();

}

class AutoBuilderIml implements AutoBuilder{
    Auto auto = new Auto();

    @Override
    public AutoBuilder setModel(String model) {
        auto.model = model;
        return this;
    }

    @Override
    public AutoBuilder setPrice(int price) {
        auto.price = price;
        return this;
    }

    @Override
    public AutoBuilder setWeight(double weight) {
        auto.weight = weight;
        return this;
    }

    @Override
    public Auto build() {
        return auto;
    }
}
