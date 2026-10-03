package com.example.opponotificationrelay;

import java.io.IOException;
import java.util.*;

/** Health SID 5, official 6.6.7 MCU settings (SHSettingsData / CID 197). */
public final class HealthSettingsProtocol {
    public static final int QUERY=197,SUCCESS=100000;
    private HealthSettingsProtocol() {}
    public static byte[] query(){return HealthProto.numbers(1,0).encode();}
    public static Map<HealthSetting,Integer> read(byte[] body)throws IOException{
        HealthProto.Node root=HealthProto.parse(body);EnumMap<HealthSetting,Integer> values=new EnumMap<>(HealthSetting.class);
        for(HealthSetting key:HealthSetting.values()){
            HealthProto.Node group=root.message(key.group);if(group==null)continue;
            if(key.child!=0){group=group.message(key.child);if(group==null)continue;}
            int value=group.number(key.field,0);
            if(key.toggle && value!=0 && value!=1)continue;
            values.put(key,value);
        }
        if(values.isEmpty())throw new IOException("HEALTH_NO_SETTINGS");
        return Collections.unmodifiableMap(values);
    }
    public static int acknowledgement(byte[] body)throws IOException{return HealthProto.parse(body).number(1,-1);}
    private static int get(Map<HealthSetting,Integer> values,HealthSetting key)throws IOException{Integer n=values.get(key);if(n==null)throw new IOException("HEALTH_NOT_READ");return n;}
    public static byte[] change(Map<HealthSetting,Integer> before,HealthSetting key,int value)throws IOException{
        if(key==null || !key.valid(value) || !before.containsKey(key))throw new IOException("HEALTH_INVALID_CHANGE");
        EnumMap<HealthSetting,Integer> values=new EnumMap<>(HealthSetting.class);values.putAll(before);values.put(key,value);
        switch(key.cid){
            case 176:return HealthProto.numbers(1,get(values,HealthSetting.SEDENTARY),2,9,3,21,4,get(values,HealthSetting.LUNCH)).encode();
            case 178:return HealthProto.numbers(1,value,2,key==HealthSetting.GOAL_NOTICE?1:key==HealthSetting.DAILY_REPORT?3:4).encode();
            case 180:return HealthProto.numbers(1,get(values,HealthSetting.HEART_AUTO),2,get(values,HealthSetting.HEART_TYPE)).encode();
            case 181:return HealthProto.numbers(1,get(values,HealthSetting.QUIET_HIGH),2,get(values,HealthSetting.QUIET_LOW),3,10,4,get(values,HealthSetting.QUIET)).encode();
            case 182:return HealthProto.numbers(1,get(values,HealthSetting.SPORT),2,get(values,HealthSetting.SPORT_HIGH)).encode();
            case 183:return HealthProto.numbers(1,value==1?1:2).encode();
            case 187:return HealthProto.numbers(1,get(values,HealthSetting.OXYGEN_WARN),2,get(values,HealthSetting.OXYGEN_LOW)).encode();
            default:return HealthProto.numbers(1,value).encode();
        }
    }
    public static boolean sameGroup(Map<HealthSetting,Integer> before,Map<HealthSetting,Integer> after,HealthSetting key,int value){
        if(!Integer.valueOf(value).equals(after.get(key)))return false;
        for(HealthSetting other:HealthSetting.values())if(other!=key && other.cid==key.cid && before.containsKey(other) && !before.get(other).equals(after.get(other)))return false;
        return true;
    }
}