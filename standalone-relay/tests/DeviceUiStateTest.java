package com.example.opponotificationrelay;

/** Display claims must respect ownership/permission state, including stale transport callbacks. */
public final class DeviceUiStateTest {
    private static int checks;
    private static void ok(boolean value){checks++;if(!value)throw new AssertionError("Device state check "+checks);}
    private static DeviceUiState state(boolean configured,boolean enabled,int channel,HandoverPolicy.Presence official,boolean observing){
        return DeviceUiState.create(configured,true,enabled,channel,official,observing,true,true,3,true);
    }
    public static void main(String[] args){
        for(int channel=0;channel<=4;channel++) {
            // A stale READY signal must never override a user Stop, missing device, or official ownership.
            ok(state(false,true,channel,HandoverPolicy.Presence.OFFLINE,true).connection==DeviceUiState.Connection.UNCONFIGURED);
            ok(state(true,false,channel,HandoverPolicy.Presence.OFFLINE,true).connection==DeviceUiState.Connection.STOPPED);
            ok(state(true,true,channel,HandoverPolicy.Presence.ONLINE,true).connection==DeviceUiState.Connection.OFFICIAL);
            ok(state(true,true,channel,HandoverPolicy.Presence.UNKNOWN,true).connection==DeviceUiState.Connection.CHECKING);
            ok(state(true,true,channel,HandoverPolicy.Presence.OFFLINE,false).connection!=DeviceUiState.Connection.READY);
        }
        ok(state(true,true,3,HandoverPolicy.Presence.OFFLINE,true).connection==DeviceUiState.Connection.READY);
        ok(state(true,true,1,HandoverPolicy.Presence.OFFLINE,true).connection==DeviceUiState.Connection.CONNECTING);
        ok(state(true,true,2,HandoverPolicy.Presence.OFFLINE,true).connection==DeviceUiState.Connection.CONNECTING);
        ok(state(true,true,0,HandoverPolicy.Presence.OFFLINE,true).connection==DeviceUiState.Connection.DISCONNECTED);
        ok(state(true,true,4,HandoverPolicy.Presence.OFFLINE,true).connection==DeviceUiState.Connection.CHECKING);
        // Notification permission and binding are separate from the authenticated watch channel.
        DeviceUiState missingPermission=DeviceUiState.create(true,true,true,3,HandoverPolicy.Presence.OFFLINE,true,false,false,0,false);
        ok(missingPermission.connection==DeviceUiState.Connection.READY);
        ok(missingPermission.notifications.contains("未授权"));
        ok(missingPermission.notifications.contains("0 个应用"));
        DeviceUiState unbound=DeviceUiState.create(true,true,true,3,HandoverPolicy.Presence.OFFLINE,true,false,true,8,true);
        ok(unbound.notifications.contains("待恢复"));
        ok(unbound.notifications.contains("8 个应用"));
        ok(unbound.batteryPercent==null && unbound.operatingMode==null);
        ok(!state(false,true,0,HandoverPolicy.Presence.UNKNOWN,false).configured);
        DeviceUiState generic=DeviceUiState.create(true,false,false,0,HandoverPolicy.Presence.UNKNOWN,false,false,false,0,false);
        ok(!generic.name.contains("X2"));
        ok(generic.protection.contains("已停止"));
        System.out.println("PASS device page display safety checks="+checks);
    }
}
