
public class Review01 {

    public static void main(String[] args) {
        double price = 1765;
        double taxRate = 8;
        double result;
        result = tax (price, taxRate);
        System.out.println((int)price + "円の商品の税込み価格は" + (int)(price + result) +"円（消費税は" + (int)result + "円）です。");

    }
    public static double tax (double price, double taxRate) {
        double result= price/100 * taxRate;
        return result;
        }
}



