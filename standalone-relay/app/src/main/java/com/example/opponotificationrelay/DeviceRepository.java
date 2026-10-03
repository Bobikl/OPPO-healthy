package com.example.opponotificationrelay;
import android.content.Context;

/** UI reads cached snapshots; entry requests bounded metadata/status refresh through their owners. */
public final class DeviceRepository {
    private final Context context;
    private final RfcommWearTransport transport;
    public DeviceRepository(Context context) {
        this.context=context.getApplicationContext();transport=RfcommWearTransport.getInstance(this.context);
    }
    public void onVisible(){DeviceIdentityStore.refresh(context,false,null);transport.requestDeviceStatus();}
    public DeviceUiState snapshot() {
        OfficialHealthMonitor.Snapshot official=OfficialHealthMonitor.snapshot();
        String mac=RelayConfig.getTargetMac(context);
        return DeviceUiState.create(android.bluetooth.BluetoothAdapter.checkBluetoothAddress(mac),
            RelayConfig.getProtocolCid(context)==RelayPayloadEncoder.COMMAND_POST_PARSED,
            RelayForegroundService.enabled(context),transport.getState(),official.presence,official.listening,
            RelayNotificationListenerService.bound,ListenerRecovery.authorized(context),
            RelayConfig.selectedApps(context).size(),RelayConfig.autoRestore(context)).withDevice(DeviceIdentityStore.read(context),transport.deviceTelemetry());
    }
}
