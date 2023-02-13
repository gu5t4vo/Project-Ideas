package beginner.bin2dec.business;

public class Bin {
    private final String sequel;

    public Bin(String sequel){
        this.sequel = checkSequel(sequel);
    }

    private String checkSequel(String bin){
        for (String number: bin.split("")){
            if (!number.equals("1") && !number.equals("0")){
                return "error";
            }
        }

        return bin;
    }

    public String toString(){
        return sequel;
    }
}
