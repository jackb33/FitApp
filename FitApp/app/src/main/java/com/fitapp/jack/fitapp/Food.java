package com.fitapp.jack.fitapp;

/**
 * Created by JackB on 7/18/2017.
 */

public class Food{
    private String name;
    private String servingType;
    private short servingSize;
    private short calorieContent;
    private short proteinContent;
    private short carbContent;
    private short fatContent;
    private short sodiumContent;
    public String getName(){return name;}
    public String getservingType(){return servingType;}
    public short getServingSize(){return servingSize;}
    public short getCalorieContent(){return calorieContent;}
    public short getProteinContent(){return proteinContent;}
    public short getCarbContent(){return carbContent;}
    public short getFatContent(){return fatContent;}
    public short getSodiumContent(){return sodiumContent;}

    public void setName(String n){name= n;}
    public void setServingInfo(String st, short ss){servingType= st; servingSize= ss;}
    public void setCalorieContent(short cc){calorieContent= cc;}
    public void setProteinContent(short pc){proteinContent= pc;}
    public void setCarbContent(short cac){carbContent= cac;}
    public void setFatContent(short fc){fatContent= fc;}
    public void setSodiumContent(short sc){sodiumContent= sc;}

    public Food(String n, String st, short ss, short cc, short pc, short cac, short fc, short sc){
        setName(n);
        setServingInfo(st, ss);
        setCalorieContent(cc);
        setProteinContent(pc);
        setCarbContent(cac);
        setFatContent(fc);
        setSodiumContent(sc);
    }
}
