public class CodeBat {



        public String backAround(String str){
            String[] chars = str.split("(?!^)");
            String finalString = chars[chars.length-1];
            for (int i = 0; i < chars.length; i++){
                finalString += chars[i];
            }
            finalString += chars[chars.length-1];
            return finalString;
        }
    }

