package com.example.opponotificationrelay;
import java.util.*;import java.io.*;
public final class WatchOxygenTest {
    static int checks;static void check(boolean value){checks++;if(!value)throw new AssertionError("CHECK_"+checks);}
    public static void main(String[] args)throws Exception {
        long minute=1_700_000_000_000L;HealthProto.Node row=HealthProto.numbers(1,3).withBytes(2,new byte[]{0,(byte)(59<<2),(byte)(30<<2),0}).withBytes(3,new byte[]{(byte)((98-69)<<3),(byte)((94-69)<<3),0,(byte)((99-69)<<3)});
        TreeMap<Long,Integer> points=WatchOxygenProjection.minute(minute,row);check(points.size()==2);check(points.get(minute)==99);check(points.get(minute+59000)==94);check(points.firstKey()==minute);
        boolean rejected=false;try{WatchOxygenProjection.minute(minute,HealthProto.numbers(1,0).withBytes(2,new byte[]{0}).withBytes(3,new byte[0]));}catch(IOException e){rejected=true;}check(rejected);
        rejected=false;try{WatchOxygenProjection.minute(minute,HealthProto.numbers(1,0).withBytes(2,new byte[]{(byte)(63<<2)}).withBytes(3,new byte[]{8}));}catch(IOException e){rejected=true;}check(rejected);
        System.out.println("WatchOxygenTest: "+checks+" checks passed");
    }
}
