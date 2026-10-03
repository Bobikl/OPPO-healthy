package com.example.opponotificationrelay;

/** Device metadata is scoped to its MAC; asset selection uses model + SKU, never notification preset. */
public final class DeviceIdentity {
    public final String model,skuCode,skuLabel,name;
    public DeviceIdentity(String model,String skuCode,String skuLabel,String name){
        this.model=clean(model,40);this.skuCode=clean(skuCode,40);this.skuLabel=clean(skuLabel,80);this.name=clean(name,80);
        if(!this.model.matches("[A-Za-z0-9_-]{1,40}") || !this.skuCode.matches("[A-Za-z0-9_-]{0,40}"))throw new IllegalArgumentException("IDENTITY");
    }
    private static String clean(String s,int max){if(s==null || s.length()>max || s.codePoints().anyMatch(Character::isISOControl))throw new IllegalArgumentException("IDENTITY_TEXT");return s.trim();}
    public boolean blueWatchX2(){return "OWW251".equals(model) && "E6E8FA21".equals(skuCode);}
}
