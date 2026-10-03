package com.example.opponotificationrelay;

/** Immutable display state. No Android dependencies or transport side effects. */
public final class DeviceUiState {
    public enum Connection { UNCONFIGURED, STOPPED, OFFICIAL, CHECKING, CONNECTING, READY, DISCONNECTED }
    public final String name, connectionText, notifications, protection;
    public final Connection connection;
    public final boolean configured;
    public final Integer batteryPercent;
    public final String operatingMode;
    public final Boolean charging;
    public final DeviceIdentity identity;
    DeviceUiState(String name,Connection connection,String text,boolean configured,String notifications,String protection) {
        this.name=name;this.connection=connection;this.connectionText=text;this.configured=configured;
        this.notifications=notifications;this.protection=protection;
        batteryPercent=null;operatingMode=null;charging=null;identity=null;
    }
    private DeviceUiState(DeviceUiState base,DeviceIdentity identity,DeviceTelemetry telemetry){
        this.identity=base.configured?identity:null;name=this.identity!=null && !identity.name.isEmpty()?identity.name:base.name;
        connection=base.connection;connectionText=base.connectionText;configured=base.configured;notifications=base.notifications;protection=base.protection;
        boolean live=connection==Connection.READY;
        batteryPercent=live?telemetry.batteryPercent:null;operatingMode=live?telemetry.mode:null;charging=live?telemetry.charging:null;
    }
    public DeviceUiState withDevice(DeviceIdentity identity,DeviceTelemetry telemetry){return new DeviceUiState(this,identity,telemetry==null?DeviceTelemetry.EMPTY:telemetry);}
    public String metrics(){return (operatingMode==null?"运行模式 —":operatingMode)+"  |  "+(batteryPercent==null?"电量 —":batteryPercent+"%"+(Boolean.TRUE.equals(charging)?" · 充电中":""));}
    public static DeviceUiState create(boolean configured, boolean watchX2, boolean enabled, int channel,
            HandoverPolicy.Presence official, boolean observing, boolean bound, boolean authorized,
            int selected, boolean restore) {
        Connection state;String message;
        if(!configured) {state=Connection.UNCONFIGURED;message="请先设置设备并读取现有配对";}
        else if(!enabled) {state=Connection.STOPPED;message="自动接管已停止";}
        else if(official==HandoverPolicy.Presence.ONLINE) {state=Connection.OFFICIAL;message="官方运行中 · 独立转发等待接管";}
        else if(!observing || official==HandoverPolicy.Presence.UNKNOWN) {state=Connection.CHECKING;message="正在确认接管条件";}
        else if(channel==3) {state=Connection.READY;message="通知通道已连接";}
        else if(channel==1 || channel==2) {state=Connection.CONNECTING;message="正在连接通知通道";}
        else if(channel==4) {state=Connection.CHECKING;message="等待独立接管";}
        else {state=Connection.DISCONNECTED;message="通知通道未连接";}
        String selection="已选择 "+Math.max(0,selected)+" 个应用";
        String permission=bound?"通知监听正常":authorized?"通知监听待恢复":"通知使用权未授权";
        return new DeviceUiState(!configured?"添加你的手表":watchX2?"OPPO Watch X2":"我的手表",state,message,
            configured,selection+" · "+permission,
            !enabled?"自动接管已停止":restore?"自动接管开启 · 自动恢复开启":"自动接管开启 · 自动恢复关闭");
    }
}
