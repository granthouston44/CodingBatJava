public class CodeBat {


    public String backAround(String str) {
        String[] chars = str.split("(?!^)");
        String finalString = chars[chars.length - 1];
        for (int i = 0; i < chars.length; i++) {
            finalString += chars[i];
        }
        finalString += chars[chars.length - 1];
        return finalString;
    }

    public boolean or35(int n) {
        return (n % 3 == 0 || n % 5 == 0);

    }

    public String front22(String str) {
        String[] resultArray = str.split("(?!^)");
        String result = "";
        if (resultArray.length >= 2) {
            result = resultArray[0] + resultArray[1];
            for (int i = 0; i < resultArray.length; i++) {
                result += resultArray[i];
            }
            return result + resultArray[0] + resultArray[1];
        }
        result = resultArray[0] + resultArray[0] + resultArray[0];
        return result;
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == true && !vacation == true) {
            return false;
        }
        return true;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        boolean trouble = false;
        if (aSmile == true && bSmile == false) {
            trouble = false;
        }
        if ((aSmile == false && bSmile == false) || (aSmile == true && bSmile == true)) {
            trouble = true;
        }
        return trouble;
    }
        /*
        A better way to do this would be
        if (aSmile && bSmile) {
        return true;
            }
        if (!aSmile && !bSmile) {
        return true;
            }
        return false;

        or the big brain move would be
        return (aSmile == bSmile)
        the code will automatically try and evaluate this statement as a boolean
        we know that trouble will only be true if both monkeys are false, or both true
        therefore, if either one of them is different it will return false - i.e. no trouble

         */

        public int sumDouble(int a, int b) {
            int sum = a + b;
            if(a == b){
                sum *= 2;
            }
            return sum;
        }

    public int diff21(int n) {
        int sum = 21-n;
        if(n > 21){
            sum *= 2;
        }
        return Math.abs(sum);
    }


    public boolean parrotTrouble(boolean talking, int hour) {
        boolean outOfHours = (hour < 7 || hour > 20);
        return (talking && outOfHours);
    }

    public boolean makes10(int a,int b){
            return (a == 10 || b == 10 || a + b == 10);
    }

    public boolean nearHundred(int n) {
        return (Math.abs(100-n) <= 10 || Math.abs(200-n) <= 10);
    }

    public boolean posNeg(int a, int b, boolean negative) {
        boolean result = false;
        if(negative == false){
            if(a < 0 && b < 0) {
                result = false;
            }
            else if(a <0 || b <0){
                result = true;
            }
        }
        else if (negative == true){
            if (a < 0 && b < 0) {
                result = true;
            }
            else{
                result = false;
            }
        }
        return result;
    }




}

