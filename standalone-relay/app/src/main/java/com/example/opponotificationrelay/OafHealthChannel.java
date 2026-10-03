package com.example.opponotificationrelay;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;

/** On-demand health settings service on the existing OAF connection; writes never replay. */
public final class OafHealthChannel {
    public static final String PROFILE="wear:health2";
    public static final int LOCAL_AGENT=32103;
    private static final long TIMEOUT=15000,FRESH=60000;
    public interface Events {long now();void changed();void status(String message);}
    public static final class Snapshot {
        public final Map<HealthSetting,Integer> values;
        public final long revision,readAt;
        public final boolean busy,connected;
        public final String message;
        Snapshot(Map<HealthSetting,Integer> values,long revision,long readAt,boolean busy,boolean connected,String message){this.values=values;this.revision=revision;this.readAt=readAt;this.busy=busy;this.connected=connected;this.message=message;}
        public boolean writable(long now){return connected && !busy && readAt>0 && now>=readAt && now-readAt<FRESH;}
        public static Snapshot unavailable(String message){return new Snapshot(Collections.emptyMap(),0,0,false,false,message);}
    }
    private final OafWire wire;private final Events events;
    private static final class Frame {final int session;final byte[] data;Frame(int session,byte[] data){this.session=session;this.data=data.clone();}}
    private final ArrayDeque<Frame> outbox=new ArrayDeque<>();private final Object writeLock=new Object();
    // Called while holding only the short-lived state monitor; Bluetooth I/O happens in flush().
    private void send(int session,byte[] data)throws IOException{if(outbox.size()>=16)throw new IOException("HEALTH_SEND_QUEUE_FULL");outbox.addLast(new Frame(session,data));}
    private void flush()throws IOException{
        synchronized(writeLock){try{while(true){Frame frame;synchronized(this){if(closed){outbox.clear();return;}frame=outbox.pollFirst();}if(frame==null)return;wire.send(frame.session,frame.data);}}
            catch(IOException failure){synchronized(this){fail("健康连接发送失败，本次操作未确认");}throw failure;}}
    }
    private int peer,session=-1,requested,nextSession=40,phase;
    private long deadline,revision,readAt;
    private boolean wanted,started,connecting,closed,refreshRequested,retire;
    private String message="尚未读取手表设置";
    private Map<HealthSetting,Integer> values=Collections.emptyMap(),before;
    private HealthSetting changeKey;private int changeValue;
    public interface SleepReply {void complete(boolean accepted,byte[] response,String message);}
    private SleepSettingsProtocol.Request sleepRequest;private SleepReply sleepReply;
    private HealthSyncProtocol.Request historyRequest;private SleepReply historyReply;
    public synchronized boolean history(HealthSyncProtocol.Request request,SleepReply reply){
        if(closed || session<32 || retire || phase!=0 || refreshRequested || request==null || reply==null)return false;
        historyRequest=request;historyReply=reply;phase=9;changed("正在读取手表健康记录…");return true;
    }
    private void finishHistory(boolean ok,byte[] body,String message){
        SleepReply callback=historyReply;historyReply=null;historyRequest=null;
        if(callback!=null)callback.complete(ok,body==null?new byte[0]:body.clone(),message);
    }

    public synchronized boolean sleep(SleepSettingsProtocol.Request request,SleepReply reply){
        if(closed || session<32 || retire || phase!=0 || refreshRequested || request==null || reply==null)return false;
        sleepRequest=request;sleepReply=reply;phase=7;changed(request.isRead()?"正在同步睡眠模式…":"正在同步作息设置…");return true;
    }
    private void finishSleep(boolean accepted,byte[] response,String msg){
        SleepReply reply=sleepReply;sleepReply=null;sleepRequest=null;
        if(reply!=null)reply.complete(accepted,response==null?new byte[0]:response.clone(),msg);
    }
    // phase: 0 idle, 1 query queued, 2 awaiting query, 3 write queued, 4 awaiting ack, 5 verify queued, 6 awaiting verification.
    public OafHealthChannel(OafWire wire,Events events){this.wire=wire;this.events=events;}
    private static byte[] text(String s){return s.getBytes(StandardCharsets.UTF_8);}
    private static boolean occupied(int n,int... ids){for(int id:ids)if(id==n)return true;return false;}
    public synchronized int reserved(){return session>=32?session:connecting?requested:-1;}
    public synchronized boolean matches(int sid){return !closed && sid>=32 && sid==session;}
    public synchronized Snapshot snapshot(){return new Snapshot(values,revision,readAt,phase!=0 || connecting || refreshRequested,!closed && !retire && session>=32,message);}
    public synchronized void close(){outbox.clear();finishHistory(false,null,"连接已断开");finishSleep(false,null,"手表连接已断开，本次操作未确认");closed=true;session=-1;connecting=false;phase=0;refreshRequested=false;values=Collections.emptyMap();before=null;changeKey=null;readAt=0;revision++;}
    private void changed(String msg){message=msg;events.status(msg);events.changed();}
    public synchronized void refresh(){if(closed || phase!=0 || connecting)return;wanted=true;refreshRequested=true;changed("正在读取手表设置…");}
    public synchronized boolean change(HealthSetting key,int value,long expected){
        long now=events.now();if(closed || session<32 || phase!=0 || refreshRequested || revision!=expected || readAt==0 || now<readAt || now-readAt>=FRESH)return false;
        try{HealthSettingsProtocol.change(values,key,value);}catch(IOException invalid){return false;}
        before=values;changeKey=key;changeValue=value;phase=3;changed("正在保存“"+key.label+"”…");return true;
    }
    public synchronized long waitMillis(long normal){return phase!=0 || connecting || refreshRequested?Math.min(normal,1000):normal;}
    public void peer(int agent,String profile,int... occupied)throws IOException{try{synchronized(this){if(PROFILE.equals(profile) && agent>0){peer=agent;if(wanted)connect(occupied);}}}finally{flush();}}
    public void start(int... occupied)throws IOException{try{synchronized(this){
        if(closed || !wanted)return;
        if(retire && session>=32){send(1,OafCrypto.concat(new byte[]{3},OafWire.be16(peer),OafWire.be16(LOCAL_AGENT),text(PROFILE+";")));session=-1;retire=false;}
        if(!refreshRequested && phase==0)return;
        if(!started){started=true;send(2,OafCrypto.concat(new byte[]{1,3,0,0,0,0,1},text(PROFILE+";")));deadline=events.now()+TIMEOUT;}
        connect(occupied);
    }}finally{flush();}}
    private void connect(int... occupied)throws IOException{
        if(closed || !wanted || peer==0 || connecting || session>=32 || !refreshRequested)return;
        do{requested=nextSession++;if(nextSession>1023)nextSession=40;}while(occupied(requested,occupied));
        connecting=true;deadline=events.now()+TIMEOUT;
        send(1,OafCrypto.concat(new byte[]{1},OafWire.be16(peer),OafWire.be16(LOCAL_AGENT),text(PROFILE+";"),OafWire.be16(1),OafWire.be16(requested),OafWire.be16(1),new byte[]{4,2,0}));
    }
    public void control(byte[] data,int end,int... occupied)throws IOException{try{synchronized(this){
        if(closed)return;int command=data[0]&255,p=end+1;
        if(command==1){
            if(p+2>data.length)return;int count=OafWire.u16(data,p);p+=2;
            boolean accept=session<32 && !connecting && phase==0 && count==1 && p+7<=data.length && OafWire.u16(data,1)==LOCAL_AGENT;
            int sid=accept?OafWire.u16(data,p):-1;accept=accept && sid>=32 && sid<=1023 && !occupied(sid,occupied) && OafWire.u16(data,p+2)==1;
            send(1,OafCrypto.concat(new byte[]{2},Arrays.copyOfRange(data,3,5),Arrays.copyOfRange(data,1,3),text(PROFILE+";"),new byte[]{(byte)(accept?0:1)},OafWire.be16(accept?1:0),accept?OafWire.be16(sid):new byte[0]));
            if(accept){peer=OafWire.u16(data,3);established(sid);}
        }else if(command==2){
            if(!connecting || p+3>data.length || OafWire.u16(data,1)!=LOCAL_AGENT || OafWire.u16(data,3)!=peer)return;
            connecting=false;
            if(data[p]==0 && p+5<=data.length && OafWire.u16(data,p+1)==1 && OafWire.u16(data,p+3)==requested && !occupied(requested,occupied))established(requested);
            else fail("手表健康设置服务暂不可用，请稍后刷新");
        }else if(command==3){
            if(OafWire.u16(data,1)!=LOCAL_AGENT || OafWire.u16(data,3)!=peer)return;
            session=-1;fail("健康设置连接已关闭，请刷新后重试");
            send(1,OafCrypto.concat(new byte[]{4},Arrays.copyOfRange(data,3,5),Arrays.copyOfRange(data,1,3),text(PROFILE+";"),new byte[]{0}));
        }else if(command==5){fail("健康设置服务需要额外鉴权");}
    }}finally{flush();}}
    private void established(int sid){
        if(session!=sid){session=sid;values=Collections.emptyMap();readAt=0;revision++;}
        connecting=false;deadline=0;retire=false;events.changed();
    }
    private void fail(String msg){outbox.clear();finishHistory(false,null,msg);finishSleep(false,null,msg);phase=0;refreshRequested=false;connecting=false;started=false;deadline=0;before=null;changeKey=null;values=Collections.emptyMap();readAt=0;revision++;retire=session>=32;changed(msg);}
    public void pump()throws IOException{try{synchronized(this){
        if(closed)return;long now=events.now();
        if(deadline!=0 && now>=deadline){if(sleepRequest!=null){fail("手表未确认作息设置，请核对后重试");return;}fail(changeKey==null?"读取超时，请刷新重试":"未确认保存结果，请刷新核对手表设置");return;}
        if(session<32 || retire)return;
        if(refreshRequested && phase==0){refreshRequested=false;phase=1;}
        if(phase==1 || phase==5){int next=phase==5?6:2;phase=next;deadline=now+TIMEOUT;send(session,OafCrypto.concat(new byte[]{0,(byte)HealthSettingsProtocol.QUERY},HealthSettingsProtocol.query()));}
        else if(phase==9){phase=10;deadline=now+TIMEOUT;send(session,OafCrypto.concat(new byte[]{0,(byte)historyRequest.kind.cid},historyRequest.bytes()));}
        else if(phase==7){phase=8;deadline=now+TIMEOUT;send(session,OafCrypto.concat(new byte[]{0,(byte)sleepRequest.cid},sleepRequest.bytes()));}
        else if(phase==3){byte[] body=HealthSettingsProtocol.change(before,changeKey,changeValue);phase=4;deadline=now+TIMEOUT;send(session,OafCrypto.concat(new byte[]{0,(byte)changeKey.cid},body));}
    }}finally{flush();}}
    public synchronized void receive(byte[] data){
        if(closed || session<32 || retire || data.length<2 || data[0]!=0)return;int cid=data[1]&255;
        try{
            byte[] body=Arrays.copyOfRange(data,2,data.length);
            if(phase==10 && historyRequest!=null && cid==historyRequest.kind.cid){
                phase=0;deadline=0;retire=true;started=false;values=Collections.emptyMap();readAt=0;revision++;
                finishHistory(true,body,"已收到手表健康响应");changed("已收到手表健康响应");return;
            }
            if(phase==8 && sleepRequest!=null && cid==sleepRequest.cid){
                boolean accepted=sleepRequest.accepts(body);phase=0;deadline=0;
                String result=accepted?(sleepRequest.isRead()?"手表已返回睡眠模式":"手表已确认作息设置"):"手表未接受作息设置（命令 "+cid+"，返回码 "+HealthProto.parse(body).number(1,-1)+"）";
                if(!sleepRequest.isRead()){retire=true;started=false;values=Collections.emptyMap();readAt=0;revision++;}
                finishSleep(accepted,body,result);changed(result);return;
            }
            if(cid==HealthSettingsProtocol.QUERY && (phase==2 || phase==6)){
                Map<HealthSetting,Integer> result=HealthSettingsProtocol.read(body);boolean verified=phase==6;
                boolean match=!verified || HealthSettingsProtocol.sameGroup(before,result,changeKey,changeValue);
                values=result;revision++;readAt=events.now();phase=0;deadline=0;before=null;changeKey=null;
                changed(verified?(match?"已保存，并从手表读取确认":"手表返回的设置与请求不同，请核对当前值"):"已从手表读取设置");
            }else if(changeKey!=null && cid==changeKey.cid && phase==4){
                if(HealthSettingsProtocol.acknowledgement(body)!=HealthSettingsProtocol.SUCCESS){fail("手表未接受本次设置，请刷新后重试");return;}
                phase=5;deadline=0;changed("手表已响应，正在读取确认…");
            }
        }catch(IOException invalid){fail("手表返回的数据无法确认，请刷新重试");}
    }
}