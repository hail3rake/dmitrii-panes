package homework_nr_12;

public enum FuelTypes {
    GASOLINE(true),
    DIESEL(true),
    LPG(false),
    ELECTRICITY(false);

    private final boolean isLiquidFuel;

    FuelTypes(boolean isLiquidFuel) {
        this.isLiquidFuel = isLiquidFuel;
    }

    public boolean isLiquidFuel() {
        return isLiquidFuel;
    }

    public static void main(String[] args) {

        System.out.println(FuelTypes.GASOLINE + " is liquid fuel: " + FuelTypes.GASOLINE.isLiquidFuel());
        System.out.println(FuelTypes.LPG + " is liquid fuel: " + FuelTypes.LPG.isLiquidFuel());
    }
}
