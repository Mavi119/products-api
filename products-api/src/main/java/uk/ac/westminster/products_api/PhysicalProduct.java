package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because it has an id, name and price
// like every product, and it also has a weight and dimensions for shipping.
// A ShoppingCart is NOT a Product: it HAS products, so it would be a field.

public class PhysicalProduct extends Product {

    private double weightKg;
    private String dimensions;

    public PhysicalProduct() {
    }

    public PhysicalProduct(Long id, String name, double price,
                           double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}