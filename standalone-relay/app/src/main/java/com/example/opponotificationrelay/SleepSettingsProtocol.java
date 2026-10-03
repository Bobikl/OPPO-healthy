package com.example.opponotificationrelay;

import java.io.IOException;
import java.util.*;

/** Official 6.6.7 sleep commands, packed hour/minute times and bounded schedules. */
public final class SleepSettingsProtocol {
    private SleepSettingsProtocol(){}
    public static int pack(int minutes){if(minutes<0 || minutes>=1440)throw new IllegalArgumentException("SLEEP_TIME");return (minutes/60<<8)|(minutes%60);}
    public static int minutes(int packed){int h=packed>>>8,m=packed&255;if(h>23 || m>59 || packed<0)throw new IllegalArgumentException("SLEEP_TIME");return h*60+m;}
    public static String time(int packed){int n=minutes(packed);return String.format(Locale.ROOT,"%02d:%02d",n/60,n%60);}
    private static void bit(int n)throws IOException{if(n!=0 && n!=1)throw new IOException("SLEEP_SWITCH");}
    public static final class Rest {
        public final int id,bed,wake,days,type;public final boolean excludeHoliday;
        public Rest(int id,int bed,int wake,int days,int type,boolean excludeHoliday)throws IOException{
            try{minutes(bed);minutes(wake);}catch(IllegalArgumentException e){throw new IOException("SLEEP_TIME",e);}
            if(id<=0 || bed==wake || days<1 || days>127 || type<0 || type>3)throw new IOException("SLEEP_REST");
            this.id=id;this.bed=bed;this.wake=wake;this.days=days;this.type=type;this.excludeHoliday=excludeHoliday;
        }
    }
    public static final class Request {
        public final int cid;private final byte[] payload;private final Integer accord,sync;
        private Request(int cid,byte[] payload,Integer accord,Integer sync){this.cid=cid;this.payload=payload.clone();this.accord=accord;this.sync=sync;}
        public byte[] bytes(){return payload.clone();}
        public boolean isRead(){return cid==204;}
        public boolean accepts(byte[] body)throws IOException{
            if(cid==204){mode(body);return true;}
            HealthProto.Node n=HealthProto.parse(body);
            if(cid==205 && (n.has(2)||n.has(3)||n.has(4)||n.has(5))){mode(body);return (accord==null || accord==n.number(2,0)) && (sync==null || sync==n.number(4,0));}
            // Some firmware returns the resulting SleepSetting instead of an IntReply.
            // Accept only a complete schedule response whose settings match this transaction.
            if(cid==206 && n.has(2)){
                HealthProto.Node expected=HealthProto.parse(payload);
                if(n.number(1,0)!=expected.number(1,0))return false;
                return restSignatures(n).equals(restSignatures(expected));
            }
            return n.number(1,-1)==HealthSettingsProtocol.SUCCESS;
        }
    }
    private static List<String> restSignatures(HealthProto.Node root)throws IOException{
        List<String> result=new ArrayList<>();
        for(HealthProto.Node r:root.messages(2)){
            StringBuilder b=new StringBuilder();for(int i=1;i<=9;i++)b.append(r.number(i,0)).append(':');result.add(b.toString());
        }
        Collections.sort(result);return result;
    }
    public static byte[] mode(byte[] data)throws IOException{
        HealthProto.Node n=HealthProto.parse(data);
        if(!n.has(2) && !n.has(3) && !n.has(4) && !n.has(5) && n.number(1,0)<1000000000)throw new IOException("SLEEP_MODE_FORMAT");
        bit(n.number(2,0));bit(n.number(3,0));bit(n.number(4,0));return data.clone();
    }
    public static Request syncMode(int accord,int sync,int syncAt)throws IOException{
        bit(accord);bit(sync);if(syncAt<0)throw new IOException("SLEEP_CLOCK");
        // CID 204 merges phone-owned accord/sync fields while querying the current sleep state.
        return new Request(204,HealthProto.numbers(1,0,2,accord,3,0,4,sync,5,syncAt).encode(),null,null);
    }
    public static Request modeChange(byte[] current,int accord,int sync,int now)throws IOException{
        bit(accord);bit(sync);HealthProto.Node n=HealthProto.parse(mode(current));if(now<1000000000)throw new IOException("SLEEP_CLOCK");
        n=n.withNumber(1,now).withNumber(2,accord);
        if(n.number(4,0)!=sync)n=n.withNumber(4,sync).withNumber(5,now);
        return new Request(205,n.encode(),accord,sync);
    }
    public static Request rest(List<Rest> items)throws IOException{
        if(items==null || items.size()>35)throw new IOException("SLEEP_REST_LIMIT");
        Set<Integer> ids=new HashSet<>();int[] perDay=new int[7];List<HealthProto.Node> nodes=new ArrayList<>();
        for(Rest r:items){if(!ids.add(r.id))throw new IOException("SLEEP_REST_DUPLICATE");
            // Conservative official single-rest-per-day form (SleepRestRepository + ash.m).
            // Keep the user's full schedule; refuse overlaps instead of silently selecting a winner.
            for(int day=0;day<7;day++)if((r.days&(1<<day))!=0){
                if(++perDay[day]>1)throw new IOException("SLEEP_REST_DAILY_LIMIT");
                nodes.add(HealthProto.numbers(1,r.id,2,r.bed,3,r.wake,4,2,8,1<<day,9,r.excludeHoliday?1:0));
            }
        }
        return new Request(206,HealthProto.numbers(1,1).withMessages(2,nodes).encode(),null,null);
    }
    public static Request goal(int packed)throws IOException{
        int n;try{n=minutes(packed);}catch(IllegalArgumentException e){throw new IOException("SLEEP_GOAL",e);}
        if(n<30 || n>1320 || n%15!=0)throw new IOException("SLEEP_GOAL");return new Request(210,HealthProto.numbers(1,packed).encode(),null,null);
    }
    public static Request bed(int on,int before)throws IOException{bit(on);int m;try{m=minutes(before);}catch(IllegalArgumentException e){throw new IOException("SLEEP_BED_TIME",e);}if(m>180)throw new IOException("SLEEP_BED_TIME");return new Request(208,HealthProto.numbers(1,before,2,on).encode(),null,null);}
    public static Request stayUp(int on,int time)throws IOException{bit(on);try{minutes(time);}catch(IllegalArgumentException e){throw new IOException("SLEEP_STAY_UP_TIME",e);}return new Request(78,HealthProto.numbers(1,time,2,on).encode(),null,null);}
    public static Request music(int on)throws IOException{bit(on);return new Request(207,HealthProto.numbers(1,on).encode(),null,null);}
}
