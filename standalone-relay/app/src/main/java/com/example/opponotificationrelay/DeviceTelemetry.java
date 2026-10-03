package com.example.opponotificationrelay;

/** In-memory values from one live RFCOMM connection; never persisted as current status. */
public final class DeviceTelemetry {
    public static final long MAX_AGE=15*60*1000L,REFRESH_INTERVAL=10*60*1000L,FOREGROUND_INTERVAL=30000L;
    public static final DeviceTelemetry EMPTY=new DeviceTelemetry(null,null,null,0,0);
    public final Integer batteryPercent;public final Boolean charging;public final String mode;
    public final long batteryAt,modeAt;
    DeviceTelemetry(Integer battery,Boolean charging,String mode,long batteryAt,long modeAt){batteryPercent=battery;this.charging=charging;this.mode=mode;this.batteryAt=batteryAt;this.modeAt=modeAt;}
    public DeviceTelemetry battery(DeviceStatusProtocol.Battery value,long now){return new DeviceTelemetry(value.percent,value.charging,mode,now,modeAt);}
    public DeviceTelemetry mode(DeviceStatusProtocol.Mode value,long now){return new DeviceTelemetry(batteryPercent,charging,value.display(),batteryAt,now);}
    public DeviceTelemetry fresh(long now){boolean b=batteryAt>0 && now>=batteryAt && now-batteryAt<=MAX_AGE,m=modeAt>0 && now>=modeAt && now-modeAt<=MAX_AGE;
        return new DeviceTelemetry(b?batteryPercent:null,b?charging:null,m?mode:null,b?batteryAt:0,m?modeAt:0);}
}
