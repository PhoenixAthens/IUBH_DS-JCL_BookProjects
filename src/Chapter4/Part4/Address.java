package Unit_4_1.Part5;

public class Address implements Cloneable {
    private int HouseNumber;
    private String StreetName;
    private String City;
    private int ZIPCode;
    public Address(int HouseNumber,String StreetName,String City,int ZIPCode){
        this.HouseNumber=HouseNumber;
        this.StreetName=StreetName;
        this.City=City;
        this.ZIPCode=ZIPCode;
    }
    public void setHouseNumber(int newHouseNumber){
        this.HouseNumber=newHouseNumber;
    }
    public void setStreetName(String newStreetName){
        this.StreetName=newStreetName;
    }
    public void setCity(String newCity){
        this.City=newCity;
    }
    public void setZIPCode(int newZIPcode){
        this.ZIPCode=newZIPcode;
    }
    public int getHouseNumber(){
        return HouseNumber;
    }
    public String getStreetName(){
        return StreetName;
    }
    public String getCity(){
        return City;
    }
    public int getZIPCode(){
        return ZIPCode;
    }
    public String toString(){
        return "HouseNumber: "+HouseNumber+"\nStreetName: "+StreetName+"\nCity: "+City+"\nZIP Code: "+ZIPCode+"\n";
    }
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj instanceof Address){
            Address add=(Address)obj;
            return (add.HouseNumber==HouseNumber)
                    &&(add.StreetName.equals(StreetName))
                    &&(add.City.equals(City))
                    &&(add.ZIPCode==ZIPCode);
        }
        return false;
    }
    public Address clone(){
        try{
            Address add=(Address)super.clone();
            return add;
        }catch(CloneNotSupportedException ex){
            System.out.println("Error Cloning Address");
            return null;
        }
    }
}
