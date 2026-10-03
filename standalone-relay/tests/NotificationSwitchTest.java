package com.example.opponotificationrelay;

import java.io.ByteArrayInputStream;
import java.util.Arrays;

/** Verify preserved feature bits, malformed snapshots and official uint32 wire vectors. */
public final class NotificationSwitchTest {
    private static int checks;
    private static void check(boolean value,String reason) {checks++;if(!value)throw new AssertionError(reason);}
    private static byte[] hex(String s) {
        byte[] out=new byte[s.length()/2];for(int i=0;i<out.length;i++)out[i]=(byte)Integer.parseInt(s.substring(2*i,2*i+2),16);return out;
    }
    private static void rejected(String text) {
        try {NotificationSwitchPolicy.parseBaseline(text);throw new AssertionError("bad snapshot accepted");}
        catch(IllegalArgumentException expected) {checks++;}
    }
    public static void main(String[] args) {
        check(NotificationSwitchPolicy.apply(0x3a000001,true,true,false)==0x3a000001,"current official saved features preserved");
        check(NotificationSwitchPolicy.apply(0x3a000001,true,true,true)==0x3e000001,"WeChat selection changes only its feature bit");
        check(NotificationSwitchPolicy.apply(0x3a000001,true,false,false)==0x32000001,"permission revocation clears master");
        check(NotificationSwitchPolicy.apply(0x3a000001,false,true,false)==0x32000001,"explicit disable clears master");
        check(NotificationSwitchPolicy.apply(0,true,true,false)==0x08000001,"mandatory low bit and master are supplied");
        check(NotificationSwitchPolicy.apply(0xffffffff,false,false,false)==0xf3ffffff,"unknown and non-owned bits survive");
        for(int baseline:new int[]{0,0x3a000001,0xffffffff,0x80000000})
            for(boolean enabled:new boolean[]{false,true})
                for(boolean authorized:new boolean[]{false,true})
                    for(boolean wechat:new boolean[]{false,true}) {
                        int value=NotificationSwitchPolicy.apply(baseline,enabled,authorized,wechat);
                        int protectedBits=~(NotificationSwitchPolicy.MAIN|NotificationSwitchPolicy.WECHAT|1);
                        check((value&protectedBits)==(baseline&protectedBits),"no accidental changes to other features");
                        check((value&1)==1,"mandatory compatibility bit survives all input states");
                    }
        check(NotificationSwitchPolicy.parseBaseline("warning\nCID84BASE1 OK 3a000001\n")==0x3a000001,"parse noisy root stdout");
        check(NotificationSwitchPolicy.parseBaseline("CID84BASE1 OK Ba000001\r\n")==0xba000001,"parse unsigned high bit and CRLF");
        for(String invalid:new String[]{"", "CID84BASE1 ERROR UNAVAILABLE\n", "CID84BASE1 OK 123", "CID84BASE1 OK 3a000001 x", "CID84BASE1 OK nothex00", "CID84BASE1 OK 3a000001\nCID84BASE1 OK 3a000001", "CID84BASE1 OK 3a000001\nCID84BASE1 ERROR TIMEOUT"}) rejected(invalid);
        int[] values={0,1,0x08000001,0x3a000001,0xba000001,0xffffffff};
        String[] officialWire={"","0801","0881808040","08818080d003","08818080d00b","08ffffffff0f"};
        for(int i=0;i<values.length;i++) {
            RelayPayloadEncoder.EventEnvelope event=RelayPayloadEncoder.encodeNotificationSwitches(values[i],"relay");
            check(event.serviceId==2 && event.commandId==84 && event.picture==null,"settings are control frames without image");
            check(Arrays.equals(event.payload,hex(officialWire[i])),"official field1 uint32 wire encoding");
        }
        try {RelayPayloadEncoder.encodeNotificationSwitches(1,"");throw new AssertionError("empty source");}
        catch(IllegalArgumentException expected) {checks++;}
        System.out.println("Notification switch checks passed: "+checks);
    }
}
