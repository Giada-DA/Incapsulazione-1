import java.util.Arrays;

public class House {
    private int floorsNumbers;
    private String address;
    private String[] residentsNames;

    @Override
    public String toString() {
        return "House{" +
                "floorsNumbers=" + floorsNumbers +
                ", address='" + address + '\'' +
                ", residentsNames=" + Arrays.toString(residentsNames) +
                '}';
    }

    public int getFloorsNumbers(){
        return floorsNumbers;
    }
    public void setFloorsNumbers(int floorsNumbers){
        this.floorsNumbers = floorsNumbers;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String[] getResidentsNames(){
        return residentsNames;
    }
    public void setResidentsNames(String residentsNames){
        this.residentsNames = residentsNames.split(",");
    }


}
