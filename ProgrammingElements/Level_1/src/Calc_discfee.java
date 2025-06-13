public class Calc_discfee {

        public static void main(String[] args) {
            double fee = 125000;
            double discountPercent = 10;

            double discount = (fee * discountPercent) / 100;
            double discountedPrice = fee - discount;

            System.out.println("The discount amount is INR " + discount +
                    "\nThe discounted price the student will pay is INR " + discountedPrice);
        }
    }

