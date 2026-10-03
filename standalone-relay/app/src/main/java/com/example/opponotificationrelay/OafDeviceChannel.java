package com.example.opponotificationrelay;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/** Optional read-only service, multiplexed alongside notification on the existing OAF socket. */
public final class OafDeviceChannel {
    public static final String PROFILE="wear:devicemanager2";
    public static final int LOCAL_AGENT=32102;
    public interface Events {void status(String value);void changed();long now();}
    private final OafWire wire;private final Events events;private final String mac;private final int role;
    private int peer,requested,sequence,latestReplay;private volatile int session=-1;private boolean started,connecting;private volatile boolean closed;
    private long lastQuery;private volatile DeviceTelemetry telemetry=DeviceTelemetry.EMPTY;
    public OafDeviceChannel(OafWire wire,Events events,String mac,int role){if(!DeviceStatusProtocol.validMac(mac) || (role!=1 && role!=2))throw new IllegalArgumentException("DEVICE_CHANNEL");this.wire=wire;this.events=events;this.mac=mac;this.role=role;}
    private static byte[] text(String s){return s.getBytes(StandardCharsets.UTF_8);}
    public synchronized int reserved(){return session>=32?session:connecting?requested:-1;}
    private static boolean occupied(int sid,int... ids){for(int id:ids)if(sid==id)return true;return false;}
    public synchronized boolean matches(int sid){return !closed && session>=32 && sid==session;}
    public DeviceTelemetry snapshot(){return !closed && session>=32?telemetry.fresh(events.now()):DeviceTelemetry.EMPTY;}
    public synchronized void close(){closed=true;session=-1;telemetry=DeviceTelemetry.EMPTY;}
    public synchronized void peer(int agent,String profile,int... occupied)throws IOException{
        if(PROFILE.equals(profile) && agent>0){peer=agent;if(started)connect(occupied);}
    }
    public synchronized void start(int... occupied)throws IOException{
        if(started || closed)return;started=true;
        wire.send(2,OafCrypto.concat(new byte[]{1,3,0,0,0,0,1},text(PROFILE+";")));
        connect(occupied);
    }
    private void connect(int... occupied)throws IOException{
        if(closed || !started || peer==0 || connecting || session>=32)return;
        requested=32;while(occupied(requested,occupied))requested++;
        connecting=true;
        wire.send(1,OafCrypto.concat(new byte[]{1},OafWire.be16(peer),OafWire.be16(LOCAL_AGENT),text(PROFILE+";"),
            OafWire.be16(1),OafWire.be16(requested),OafWire.be16(1),new byte[]{4,2,0}));
        events.status("设备状态服务正在协商");
    }
    public synchronized void control(byte[] data,int end,int... occupied)throws IOException{
        if(closed)return;int command=data[0]&255,p=end+1;
        if(command==1){
            if(p+2>data.length)return;int count=OafWire.u16(data,p);p+=2;
            boolean accept=count==1 && p+7<=data.length && OafWire.u16(data,1)==LOCAL_AGENT;
            int sid=accept?OafWire.u16(data,p):-1;
            accept=accept && sid>=32 && sid<=1023 && !occupied(sid,occupied) && OafWire.u16(data,p+2)==1;
            wire.send(1,OafCrypto.concat(new byte[]{2},Arrays.copyOfRange(data,3,5),Arrays.copyOfRange(data,1,3),text(PROFILE+";"),new byte[]{(byte)(accept?0:1)},OafWire.be16(accept?1:0),accept?OafWire.be16(sid):new byte[0]));
            if(accept){peer=OafWire.u16(data,3);established(sid);}
        }else if(command==2){
            if(!connecting || p+3>data.length || OafWire.u16(data,1)!=LOCAL_AGENT || OafWire.u16(data,3)!=peer)return;
            int result=data[p]&255;connecting=false;
            if(result==0 && p+5<=data.length && OafWire.u16(data,p+1)==1 && OafWire.u16(data,p+3)==requested
                    && !occupied(requested,occupied))established(requested);
            else events.status("设备状态服务暂不可用（通知继续工作）");
        }else if(command==3){
            if(OafWire.u16(data,1)!=LOCAL_AGENT || OafWire.u16(data,3)!=peer)return;
            wire.send(1,OafCrypto.concat(new byte[]{4},Arrays.copyOfRange(data,3,5),Arrays.copyOfRange(data,1,3),text(PROFILE+";"),new byte[]{0}));
            session=-1;telemetry=DeviceTelemetry.EMPTY;events.changed();events.status("设备状态服务已关闭");
        }else if(command==5){events.status("设备状态服务需要额外鉴权，保留未知状态");}
    }
    private void established(int sid){
        if(session!=sid){session=sid;telemetry=DeviceTelemetry.EMPTY;lastQuery=0;sequence=0;latestReplay=0;}
        connecting=false;events.status("设备状态服务已建立");events.changed();
    }
    /** Caller holds the transport's ownership/connection checks; no periodic threads here. */
    public synchronized void refresh(boolean foreground)throws IOException{
        if(!started || closed || session<32)return;long now=events.now();
        long interval=foreground?DeviceTelemetry.FOREGROUND_INTERVAL:DeviceTelemetry.REFRESH_INTERVAL;
        if(lastQuery!=0 && now>=lastQuery && now-lastQuery<interval)return;
        lastQuery=now;sequence=sequence==Integer.MAX_VALUE?1:sequence+1;
        wire.send(session,OafCrypto.concat(new byte[]{0,8},DeviceStatusProtocol.batteryRequest(mac)));
        wire.send(session,OafCrypto.concat(new byte[]{0,35},DeviceStatusProtocol.modeRequest(sequence,role)));
        events.status("设备状态只读查询已发送 CID=8/35");
    }
    public synchronized void receive(byte[] data){
        if(closed || session<32 || data.length<2 || data[0]!=0)return;
        int cid=data[1]&255;if(cid!=8 && cid!=35)return;
        try{
            byte[] body=Arrays.copyOfRange(data,2,data.length);long now=events.now();
            if(cid==8)telemetry=telemetry.battery(DeviceStatusProtocol.battery(body,mac),now);
            else{
                DeviceStatusProtocol.Mode mode=DeviceStatusProtocol.mode(body);
                if(mode.requestSequence!=0 && mode.requestSequence!=sequence)return;
                if(mode.replaySequence!=0 && latestReplay!=0 && mode.replaySequence<latestReplay)return;
                if(mode.replaySequence!=0)latestReplay=mode.replaySequence;
                telemetry=telemetry.mode(mode,now);
            }
            events.status(cid==8?"收到手表电量 "+telemetry.batteryPercent+"% charging="+telemetry.charging:"收到手表运行模式 "+(telemetry.mode==null?"未知":telemetry.mode));
            events.changed();
        }catch(IOException invalid){events.status("忽略格式无效的设备状态 CID="+cid);}
    }
}
