package com.example.opponotificationrelay;

import java.util.Locale;

/** 官方 AccessoryPreferences/DiscoveryData 的已配对记录；不猜测或生成密钥。 */
public final class PairingRecord {
    public final String deviceId, alias, mac;
    private PairingRecord(String id,String alias,String mac) {this.deviceId=id;this.alias=alias;this.mac=mac;}
    public static PairingRecord find(String discovery,String mac) {
        if(mac==null || !mac.matches("(?i)([0-9a-f]{2}:){5}[0-9a-f]{2}")) throw new IllegalArgumentException("MAC_INVALID");
        PairingRecord found=null;
        for(String record:discovery.split("_")) {
            String[] p=record.split(";",-1);
            if(p.length!=7 || !mac.equalsIgnoreCase(p[1]) || !"2".equals(p[3]) || !"1".equals(p[6])) continue;
            if(hex(p[0]).length!=6 || hex(p[2]).length!=6) throw new IllegalArgumentException("RECORD_INVALID");
            PairingRecord next=new PairingRecord(p[0].toUpperCase(Locale.ROOT),p[2].toUpperCase(Locale.ROOT),mac.toUpperCase(Locale.ROOT));
            if(found!=null && (!found.deviceId.equals(next.deviceId) || !found.alias.equals(next.alias)))
                throw new IllegalArgumentException("RECORD_AMBIGUOUS");
            found=next;
        }
        if(found==null) throw new IllegalArgumentException("PAIRING_NOT_FOUND");
        return found;
    }
    public static byte[] hex(String text) {
        if(text==null || text.length()%2!=0 || !text.matches("[0-9a-fA-F]+")) throw new IllegalArgumentException("HEX_INVALID");
        byte[] result=new byte[text.length()/2];
        for(int i=0;i<result.length;i++) result[i]=(byte)Integer.parseInt(text.substring(i*2,i*2+2),16);
        return result;
    }
}
