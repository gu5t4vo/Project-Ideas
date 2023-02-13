package beginner.bin2dec.business;


public abstract class Rules {

    public static Bin toBin(int num){
        String bin = "";

        while (num >= 1){

            bin = bin.concat(String.format("%d", num % 2));
            num = num/2;

        }

        bin = reverse(bin);

        return new Bin(bin);
    }

    public static int toDec(Bin bin){

        int dec = 0;
        int power = 0;

        String reverseBin = reverse(bin.toString());

        for (String num: reverseBin.split("")){
            int number = Integer.parseInt(num);
            dec += number * Math.pow(2, power);
            power++;
        }

        return dec;
    }

    private static String reverse(String txt){
        String save = "";

        for (int i = txt.length()-1; i >= 0; i--){
            save = save.concat(String.valueOf(txt.charAt(i)));
        }

        return save;
    }


}
