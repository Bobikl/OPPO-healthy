package com.example.opponotificationrelay;

/** Bounds retained text before UTF-8 allocation; identifiers are never shortened. */
public final class MessageBudget {
    public static final int MAX_APDU_BYTES=20480;
    public static final int MAX_QUEUE_BYTES=512*1024;
    public static final int MAX_IDENTIFIER_BYTES=2048;
    public static final int MAX_TITLE_BYTES=1024, MAX_BODY_BYTES=8192, MAX_SUB_BYTES=512, MAX_LABEL_BYTES=256;
    private MessageBudget() {}
    public static final class Rejected extends IllegalArgumentException {
        public Rejected(String reason) {super(reason);}
    }
    private static int width(CharSequence s,int i) {
        char c=s.charAt(i);
        if(Character.isHighSurrogate(c)) {
            if(i+1>=s.length() || !Character.isLowSurrogate(s.charAt(i+1))) throw new Rejected("通知包含无效文本");
            return 4;
        }
        if(Character.isLowSurrogate(c)) throw new Rejected("通知包含无效文本");
        return c<128?1:c<2048?2:3;
    }
    public static String identifier(String s,int max) {
        if(s==null) return "";
        int size=0;
        for(int i=0;i<s.length();) {
            int n=width(s,i);size+=n;
            if(size>max) throw new Rejected("通知标识超过长度上限");
            i+=n==4?2:1;
        }
        return s;
    }
    public static String text(CharSequence s,int max) {
        if(s==null) return "";
        if(max<3) throw new IllegalArgumentException("text budget");
        int size=0, prefix=0;
        for(int i=0;i<s.length();) {
            int n=width(s,i);
            if(size+n>max) return s.subSequence(0,prefix).toString()+"…";
            size+=n;i+=n==4?2:1;
            if(size<=max-3) prefix=i;
        }
        return s.toString();
    }
    public static void validate(RelayPayloadEncoder.EventEnvelope e) {
        if(e==null || e.payload==null || e.sourcePackage==null || e.sourcePackage.isEmpty() || e.serviceId!=2 || e.commandId<0 || e.commandId>65535
                || e.payload.length>MAX_APDU_BYTES-(e.commandId<255?2:4))
            throw new Rejected("通知超过手表消息上限");
        identifier(e.sourcePackage,256);
        if(e.picture!=null) {
            if(e.commandId!=RelayPayloadEncoder.COMMAND_POST_PARSED || e.picture.commandId!=RelayPayloadEncoder.COMMAND_PICTURE
                    || e.picture.picture!=null || !e.sourcePackage.equals(e.picture.sourcePackage))
                throw new Rejected("图标与通知来源不匹配");
            validate(e.picture);
        }
    }
    public static long envelopeBytes(RelayPayloadEncoder.EventEnvelope e) {
        return 128L+e.payload.length+2L*e.sourcePackage.length()
            +(e.picture==null?0:128L+e.picture.payload.length+2L*e.picture.sourcePackage.length());
    }
}
