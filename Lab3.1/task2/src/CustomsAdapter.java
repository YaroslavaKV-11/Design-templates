import com.vehiclecalculator.Vehicle;
import com.vehiclecalculator.VehicleCalculator;

public class CustomsAdapter implements Customs {
    private final VehicleCalculator calculator;
    private final float dollarRate;

    public CustomsAdapter(VehicleCalculator calculator, float dollarRate) {
        this.calculator = calculator;
        this.dollarRate = dollarRate;
    }

    @Override
    public float vehiclePrice(Auto auto) {
        Vehicle vehicle = convertToVehicle(auto);
        calculator.setVehicle(vehicle);

        String priceString = calculator.calculatePrice();
        priceString = priceString.replace("USD", "").trim();

        float priceInDollars = Float.parseFloat(priceString);
        return priceInDollars * dollarRate;
    }

    @Override
    public float tax(Auto auto) {
        float priceInUah = vehiclePrice(auto);
        return priceInUah * 0.2f;
    }

    public float totalPrice(Auto auto) {
        return vehiclePrice(auto) + tax(auto);
    }

    private Vehicle convertToVehicle(Auto auto) {
        float damageLevel = auto.isDamaged() ? 0.7f : 0.0f;

        return new Vehicle(
                auto.getAge(),
                auto.getModel(),
                damageLevel,
                auto.getMileage()
        );
    }
}