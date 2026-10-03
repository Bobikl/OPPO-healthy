package com.example.opponotificationrelay;

/** Root 辅助进程的窄协议，不将 su/ART 的普通输出解释为离线。 */
public final class ObserverMessage {
    public static final String PREFIX = "OAFMON1";
    public final String type, reason;
    public final long request;
    public final HandoverPolicy.Presence presence;
    public final int binders;
    private ObserverMessage(String t, long r, HandoverPolicy.Presence p, int b, String why) {
        type=t; request=r; presence=p; binders=b; reason=why;
    }
    public static ObserverMessage parse(String line) {
        if (line == null || !line.startsWith(PREFIX + " ")) return null;
        if (line.length() > 256) throw new IllegalArgumentException("oversized observer message");
        String[] p=line.split(" ");
        if (p.length == 2 && "READY".equals(p[1])) return new ObserverMessage("READY",0,null,0,"");
        if (p.length == 3 && ("ERROR".equals(p[1]) || "DIRTY".equals(p[1])))
            return new ObserverMessage(p[1],0,null,0,p[2]);
        if (p.length == 6 && "STATE".equals(p[1])) {
            long request=Long.parseLong(p[2]); int count=Integer.parseInt(p[4]);
            if(request < 0 || count < 0 || count > 4) throw new IllegalArgumentException("observer range");
            return new ObserverMessage("STATE",request,HandoverPolicy.Presence.valueOf(p[3]),count,p[5]);
        }
        throw new IllegalArgumentException("invalid observer protocol");
    }
}
