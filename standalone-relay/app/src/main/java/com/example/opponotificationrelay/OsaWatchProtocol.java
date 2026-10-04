package com.example.opponotificationrelay;
import java.io.IOException;import java.nio.charset.StandardCharsets;import java.util.*;
/** Verified official 6.6.7 read-only OSA commands. No activation writes or automatic retries. */
public final class OsaWatchProtocol {
    private OsaWatchProtocol(){}
    public enum Operation{ACTIVATION,SENSOR,HRV_INDEX,HRV_PACKET}
    public static final class Request {
        public final Operation operation;public final int cid,start,end,index;private final byte[] body;
        private Request(Operation op,int cid,int start,int end,int index,byte[] body){this.operation=op;this.cid=cid;this.start=start;this.end=end;this.index=index;this.body=body.clone();}
        public byte[] bytes(){return body.clone();}
        public void validate(byte[] response)throws IOException{switch(operation){case ACTIVATION:activation(response);break;case SENSOR:sensor(this,response);break;case HRV_INDEX:packetIndex(this,response);break;case HRV_PACKET:hrv(this,response);break;}}
    }
    private static void range(int start,int end)throws IOException{if(start<1500000000||end<=start||(long)end-start>172800)throw new IOException("OSA_RANGE");}
    public static Request queryActivation(){return new Request(Operation.ACTIVATION,202,0,0,0,HealthProto.numbers(1,1,2,1).encode());}
    public static boolean activation(byte[] data)throws IOException{HealthProto.Node n=HealthProto.parse(data);int type=n.number(1,0),value=n.number(2,0),error=n.number(3,0);if(type!=1||value>1||error!=0)throw new IOException("OSA_ACTIVATION_RESPONSE");return value==1;}
    public static Request sensor(int start,int end)throws IOException{range(start,end);return new Request(Operation.SENSOR,101,start,end,0,HealthProto.numbers(1,start,2,end).encode());}
    public static Request hrvIndex(int start,int end)throws IOException{range(start,end);return new Request(Operation.HRV_INDEX,57,start,end,0,HealthProto.numbers(1,start,2,end).encode());}
    public static final class Index {public final int count,start;public final String session;Index(int n,int s,String id){count=n;start=s;session=id;}}
    public static Index packetIndex(Request request,byte[] data)throws IOException {
        if(request.operation!=Operation.HRV_INDEX)throw new IOException("OSA_REQUEST_KIND");HealthProto.Node n=HealthProto.parse(data);int count=n.number(1,0),start=n.number(2,0);if(count>128)throw new IOException("OSA_PACKET_LIMIT");
        if(count>0&&(start<request.start-172800L||start>request.end))throw new IOException("OSA_PACKET_RANGE");byte[] token=n.bytes(4);String id="";
        if(token!=null){if(token.length>256)throw new IOException("OSA_SESSION_ID");id=new String(token,StandardCharsets.UTF_8);if(!Arrays.equals(token,id.getBytes(StandardCharsets.UTF_8))||id.indexOf(0)>=0)throw new IOException("OSA_SESSION_ID");}return new Index(count,start,id);
    }
    public static Request hrvPacket(int index,int nextStart,int end,String session)throws IOException {
        if(index<1||index>128||nextStart<1500000000||end<nextStart||(long)end-nextStart>172800)throw new IOException("OSA_PACKET_RANGE");
        HealthProto.Node n=HealthProto.numbers(1,index,2,nextStart);if(session!=null&&!session.isEmpty()){byte[] id=session.getBytes(StandardCharsets.UTF_8);if(id.length>256||session.indexOf(0)>=0)throw new IOException("OSA_SESSION_ID");n=n.withBytes(3,id);}return new Request(Operation.HRV_PACKET,58,nextStart,end,index,n.encode());
    }
    public static final class Samples {
        public final int start,end;public final boolean more;public final int[] timestamps,values;
        Samples(int start,int end,boolean more,int[] stamps,int[] values){this.start=start;this.end=end;this.more=more;this.timestamps=stamps.clone();this.values=values.clone();}
    }
    public static Samples sensor(Request request,byte[] data)throws IOException {
        if(request.operation!=Operation.SENSOR)throw new IOException("OSA_REQUEST_KIND");HealthProto.Node n=HealthProto.parse(data);int more=n.number(1,0),start=n.number(2,0),end=n.number(3,0);List<HealthProto.Node> rows=n.messages(4);
        if(more>1)throw new IOException("OSA_HAS_MORE");if(rows.isEmpty()&&start==0&&end==0&&more==0)return new Samples(request.start,request.end,false,new int[0],new int[0]);
        if(start<request.start-172800L||end<start||end>(long)request.end+300||start<1500000000)throw new IOException("OSA_SENSOR_RANGE");int[] times=new int[rows.size()],values=new int[rows.size()];int previous=-1;
        for(int i=0;i<rows.size();i++){HealthProto.Node row=rows.get(i);long t=start+row.number(1,0)*60L;if(t>end+300L||t>Integer.MAX_VALUE||t<=previous)throw new IOException("OSA_SENSOR_TIME");times[i]=(int)t;values[i]=row.int32(2,0);previous=(int)t;}return new Samples(start,end,more==1,times,values);
    }
    public static Samples hrv(Request request,byte[] data)throws IOException {
        if(request.operation!=Operation.HRV_PACKET)throw new IOException("OSA_REQUEST_KIND");HealthProto.Node n=HealthProto.parse(data);int index=n.number(1,0),start=n.number(2,0);int[] values=n.repeatedInt32(3,2881);
        if(index!=request.index||start<1500000000||start<request.start-60L||start>request.end)throw new IOException("OSA_HRV_PACKET");long end=start+Math.max(0,values.length-1)*60L;if(end>(long)request.end+300||end>Integer.MAX_VALUE)throw new IOException("OSA_HRV_RANGE");int[] times=new int[values.length];for(int i=0;i<times.length;i++)times[i]=start+i*60;return new Samples(start,(int)end,false,times,values);
    }
}
