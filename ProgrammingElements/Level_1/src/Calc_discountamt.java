public class Calc_discountamt {

        public static void main(String[] args) {
            double fee = 125000;
            double discountPercent = 10;

            double discount = (fee * discountPercent) / 100;
            double discountedFee = fee - discount;

            System.out.println(
                    "The original course fee is INR " + fee + "\n" +
                            "The discount is INR " + discount + "\n" +
                            "The discounted price the student will pay is INR " + discountedFee
            );
        }
    }


