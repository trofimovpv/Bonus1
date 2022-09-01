public class BonusMilesService {

    public int calculate(int cost) {
        int bonus = 20;
        int price = cost;
        int miles = price / bonus;

        return miles;
    }

}
