package com.example.opponotificationrelay;
import java.io.IOException;
import java.util.*;

/** Bounded V2 history reads matching official TimeRangeRequest / PacketSummary. */
public final class HealthSyncProtocol {
    private HealthSyncProtocol(){}
    public enum Kind {
        ACTIVITY_SUMMARY(218,"每日活动汇总",7200), ACTIVITY(10,"活动明细",7200), HEART(12,"心率",7200), OXYGEN(85,"血氧",7200),
        SLEEP(99,"睡眠汇总",172800), SLEEP_STAGE(14,"睡眠阶段",7200), MIND(198,"身心状态",7200), MIND_INDEX(199,"身心日汇总",172800);
        public final int cid,seconds;public final String title;
        public boolean daily(){return this==ACTIVITY_SUMMARY || this==SLEEP || this==MIND_INDEX;}
        Kind(int cid,String title,int seconds){this.cid=cid;this.title=title;this.seconds=seconds;}
    }
    public static final class Request {
        public final Kind kind;public final int start,end;
        private Request(Kind kind,int start,int end){this.kind=kind;this.start=start;this.end=end;}
        public byte[] bytes(){return HealthProto.numbers(1,start,2,end).encode();}
    }
    public static Request range(Kind kind,int start,int end)throws IOException{
        if(kind==null || start<1500000000 || end<=start || (long)end-start>172800)throw new IOException("SYNC_RANGE");
        return new Request(kind,start,end);
    }
    public static final class Summary {
        public final int start,end,count,latest,lastValue;public final boolean more;
        Summary(int start,int end,int count,int latest,int lastValue,boolean more){this.start=start;this.end=end;this.count=count;this.latest=latest;this.lastValue=lastValue;this.more=more;}
    }
    private static int moment(int start,int offset,int multiplier,int end)throws IOException{
        long t=start+(long)offset*multiplier;if(offset<0 || t<start || t>(long)end+300 || t>Integer.MAX_VALUE)throw new IOException("SYNC_RECORD_TIME");return(int)t;
    }
    public static Summary parse(Request request,byte[] data)throws IOException{
        HealthProto.Node n=HealthProto.parse(data);int more=n.number(1,0),start=n.number(2,0),end=n.number(3,0);
        if(more>1)throw new IOException("SYNC_REPLY_CODE");
        List<HealthProto.Node> rows=n.messages(4);
        // Official V2 fetchers accept an empty data list with omitted/default timestamps.
        // Only a final (code 0) response is empty success; continuation/error replies still need a range.
        if(rows.isEmpty() && start==0 && end==0){
            if(more==0)return new Summary(request.start,request.end,0,0,-1,false);
            throw new IOException("SYNC_REPLY_SHAPE");
        }
        if(start<1500000000 || end<start || end>(long)request.end+300 || start<(long)request.start-172800)throw new IOException("SYNC_RESPONSE_RANGE");
        int count=0,latest=0,last=-1;
        for(HealthProto.Node row:rows){
            if(request.kind==Kind.OXYGEN){
                byte[] offsets=row.bytes(2),values=row.bytes(3);if(offsets==null || values==null || offsets.length!=values.length)throw new IOException("SYNC_OXYGEN_SHAPE");
                int minute=moment(start,row.number(1,0),60,end);
                for(int i=0;i<values.length;i++){int value=(values[i]&255)>>>3;if(value==0)continue;value+=69;int sec=((offsets[i]&255)>>>2);if(sec>59)throw new IOException("SYNC_OXYGEN_TIME");int t=moment(minute,sec,1,end);count++;if(t>=latest){latest=t;last=value;}}
            }else if(request.kind==Kind.SLEEP_STAGE){
                int t=moment(start,row.number(1,0),60,end),state=row.number(2,0);if(state>255)throw new IOException("SYNC_SLEEP_STATE");count++;if(t>=latest){latest=t;last=state;}
            }else if(request.kind==Kind.HEART){
                int value=row.number(2,0);if(value==0)continue;if(value>300)throw new IOException("SYNC_HEART_VALUE");int t=moment(start,row.number(1,0),1,end);count++;if(t>=latest){latest=t;last=value;}
            }else if(request.kind==Kind.ACTIVITY || request.kind==Kind.MIND){
                int t=moment(start,row.number(1,0),60,end);count++;if(t>=latest){latest=t;last=request.kind==Kind.ACTIVITY?row.number(7,0):row.number(4,0);}
            }else {count++;int day=row.number(1,0);if(day<1500000000 || day>(long)request.end+300)throw new IOException("SYNC_RECORD_DATE");if(day>=latest){latest=day;last=request.kind==Kind.ACTIVITY_SUMMARY?row.number(3,0):row.number(2,0);}}
        }
        return new Summary(start,end,count,latest,last,more==1);
    }
}
