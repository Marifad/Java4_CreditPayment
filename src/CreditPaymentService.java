public class CreditPaymentService {
    public float calculate(int sum, int period, float percent) {
        float k;
        float i;
        int n;
        n = period * 12;
        i = (percent / 12)/100;
        float value = 1 + i;
        k = (float) (i + i / (Math.pow(value, n) - 1));
        int result;
        result = (int) (k * sum);
        return result;

    }
}
