package com.example.opponotificationrelay;

/** CID84 全量位图：保留基线的其余位，更新独立版负责的选项。 */
public final class NotificationSwitchPolicy {
    public static final int MAIN = 0x08000000;
    public static final int WECHAT = 0x04000000;
    public static final int SCREEN_ON=0x02000000, WRIST_OFF=0x80000000;
    private NotificationSwitchPolicy() { }
    public static int apply(int baseline,boolean enabled,boolean authorized,boolean wechatSelected,
                            boolean screenOnPush,Boolean wristOffPush) {
        int value=apply(baseline,enabled,authorized,wechatSelected);
        value=screenOnPush?value|SCREEN_ON:value&~SCREEN_ON;
        if(wristOffPush!=null)value=wristOffPush?value|WRIST_OFF:value&~WRIST_OFF;
        return value;
    }
    public static int apply(int baseline, boolean enabled, boolean authorized, boolean wechatSelected) {
        int value = baseline | 1;
        value = enabled && authorized ? value | MAIN : value & ~MAIN;
        return wechatSelected ? value | WECHAT : value & ~WECHAT;
    }
    public static int parseBaseline(String output) {
        Integer result=null;
        for(String line:output.split("\\r?\\n")) {
            if(line.startsWith("CID84BASE1 ERROR ")) throw new IllegalArgumentException("notification baseline read failed");
            if(!line.startsWith("CID84BASE1 OK ")) continue;
            if(result!=null || !line.matches("CID84BASE1 OK [0-9a-fA-F]{8}"))
                throw new IllegalArgumentException("invalid notification baseline");
            result=Integer.parseUnsignedInt(line.substring(14),16);
        }
        if(result==null) throw new IllegalArgumentException("notification baseline unavailable");
        return result;
    }
}
