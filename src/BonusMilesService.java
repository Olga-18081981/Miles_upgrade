public class BonusMilesService {

    public int calculate(int cost) {
        int milePerCost = 2000;

        int miles = cost / milePerCost;
        return miles;
    }
}
