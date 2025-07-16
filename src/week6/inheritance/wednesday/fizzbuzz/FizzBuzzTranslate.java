package week6.inheritance.wednesday.fizzbuzz;

public class FizzBuzzTranslate {
    public static String Translate(int tens, int unit) {
        int number = tens * 10 + unit;

        boolean isCheckNumber = number < 0 || number > 100;
        if (isCheckNumber) {
            return "Invalid number";
        } else {
            boolean unitNumber = number < 10;
            if (unitNumber) {
                String Unit = getUnit(unit);
                if (Unit != null) return Unit;
            } else {
                boolean specialUnitNumber = number < 20;
                if (specialUnitNumber) {
                    String specialUnit = getSpecialUnit(unit);
                    if (specialUnit != null) return specialUnit;
                }
                else {
                    boolean TensNumber = number < 100;
                    if (TensNumber) {
                        String numberTens = getTens(tens, unit);
                        if (numberTens != null) return numberTens;
                    }
                }
            }
        }
        return String.valueOf(number);
    }

    private static String getTens(int tens, int unit) {
        String result = "";
        switch (tens) {
            case 2: result = "Hai mươi"; break;
            case 3: result = "Ba mươi"; break;
            case 4: result = "Bốn mươi"; break;
            case 5: result = "Năm mươi"; break;
            case 6: result = "Sáu mươi"; break;
            case 7: result = "Bảy mươi"; break;
            case 8: result = "Tám mươi"; break;
            case 9: result = "Chín mươi"; break;
        }

        if (unit != 0) {
            result += " " + getUnit(unit);
        }
        return result;
    }

    private static String getSpecialUnit(int unit) {
        switch (unit) {
            case 0:
                return "Mười";
            case 1:
                return "Mười một";
            case 2:
                return "Mười hai";
            case 3:
                return "Mười ba";
            case 4:
                return "Mười bốn";
            case 5:
                return "Mười lăm";
            case 6:
                return "Mười sáu";
            case 7:
                return "Mười bảy";
            case 8:
                return "Mười tám";
            case 9:
                return "Mười chín";
        }
        return null;
    }

    private static String getUnit(int unit) {
        switch (unit) {
            case 0:
                return "Không";
            case 1:
                return "Một";
            case 2:
                return "Hai";
            case 3:
                return "Ba";
            case 4:
                return "Bốn";
            case 5:
                return "Năm";
            case 6:
                return "Sáu";
            case 7:
                return "Bảy";
            case 8:
                return "Tám";
            case 9:
                return "Chín";
        }
        return null;
    }
}
