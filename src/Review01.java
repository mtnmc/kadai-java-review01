
public class Review01 {

    public static void main(String[] args) {
        int price = 1500;
        double taxRate = 0.1;
        int result;
        result = tax (price, taxRate);
        System.out.println(price + "円の商品の税込み価格は" + (price + result) +"円（消費税は" + result + "円）です。");

    }
    public static int tax (int price, double taxRate) {
        int result= (int)(price * taxRate);
        return result;
        }
}



