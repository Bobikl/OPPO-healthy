package com.oplus.wearable.linkservice.common.parcel;

import android.bluetooth.BluetoothAdapter;
import android.os.Parcel;
import android.os.Parcelable;
import com.heytap.health.devicemanager.util.BluetoothUtil;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.common.Module;
import com.oplus.wearable.linkservice.sdk.common.ModuleInfo;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class DeviceInfo implements Parcelable {
    public static final int CONNECT_RETRY_MAX_COUNT = 3;
    public static final int CONNECT_RETRY_MIN_COUNT = 1;
    public static final Parcelable.Creator<DeviceInfo> CREATOR = new a();
    public static final long GATT_CONNECT_LONG_TIMEOUT = 32000;
    public static final long GATT_CONNECT_SHORT_TIMEOUT = 8000;
    private boolean mAuto;
    private long mBleConnectTimeout;
    private int mBleRetryCount;
    private int mDeviceProtocol;
    private String mDisplayName;
    private ModuleInfo mMainModuleInfo;
    private String mNodeId;
    private ModuleInfo mStubModuleInfo;

    public class a implements Parcelable.Creator<DeviceInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DeviceInfo createFromParcel(Parcel parcel) {
            return new DeviceInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DeviceInfo[] newArray(int i) {
            return new DeviceInfo[i];
        }
    }

    public DeviceInfo() {
        this.mDeviceProtocol = -1;
        this.mBleConnectTimeout = GATT_CONNECT_SHORT_TIMEOUT;
        this.mBleRetryCount = 3;
    }

    private Module cloneModule(ModuleInfo moduleInfo) {
        if (moduleInfo == null) {
            return null;
        }
        moduleInfo.toModule();
        return moduleInfo.toModule();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String dump() {
        return "DeviceInfo{, mProtocol=" + this.mDeviceProtocol + ", mNodeId=" + this.mNodeId + ", mDisplayName=" + this.mDisplayName + '}';
    }

    public long getBleConnectTimeout() {
        return this.mBleConnectTimeout;
    }

    public int getBleRetryCount() {
        return this.mBleRetryCount;
    }

    public ModuleInfo getConnectedModuleInfo() {
        ModuleInfo mainModuleInfo = getMainModuleInfo();
        if (mainModuleInfo != null && mainModuleInfo.getState() == 2) {
            return mainModuleInfo;
        }
        ModuleInfo stubModuleInfo = getStubModuleInfo();
        if (stubModuleInfo == null || stubModuleInfo.getState() != 2) {
            return null;
        }
        return stubModuleInfo;
    }

    public int getDeviceProtocol() {
        return this.mDeviceProtocol;
    }

    public String getDisplayName() {
        return this.mDisplayName;
    }

    public ModuleInfo getMainModuleInfo() {
        return this.mMainModuleInfo;
    }

    public String getNodeId() {
        return this.mNodeId;
    }

    public ModuleInfo getStubModuleInfo() {
        return this.mStubModuleInfo;
    }

    public boolean isAuto() {
        return this.mAuto;
    }

    public void setAuto(boolean z) {
        this.mAuto = z;
    }

    public void setBleConnectTimeout(long j) {
        this.mBleConnectTimeout = j;
    }

    public void setBleRetryCount(int i) {
        this.mBleRetryCount = i;
    }

    public void setDeviceProtocol(int i) {
        this.mDeviceProtocol = i;
    }

    public void setDisplayName(String str) {
        this.mDisplayName = str;
    }

    public void setMainModuleInfo(ModuleInfo moduleInfo) {
        this.mMainModuleInfo = moduleInfo;
        if (moduleInfo != null) {
            String macAddress = moduleInfo.getMacAddress();
            if (BluetoothUtil.INSTANCE.g() && BluetoothAdapter.checkBluetoothAddress(macAddress)) {
                this.mDisplayName = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(macAddress).getName();
            }
        }
    }

    public void setNodeId(String str) {
        this.mNodeId = str;
    }

    public void setStubModuleInfo(ModuleInfo moduleInfo) {
        this.mStubModuleInfo = moduleInfo;
    }

    public JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("nodeId", this.mNodeId);
        ModuleInfo moduleInfo = this.mMainModuleInfo;
        if (moduleInfo != null) {
            jSONObject.put("mainMacAddress", moduleInfo.getMacAddress());
        }
        ModuleInfo moduleInfo2 = this.mStubModuleInfo;
        if (moduleInfo2 != null) {
            jSONObject.put("stubMacAddress", moduleInfo2.getMacAddress());
        }
        return jSONObject;
    }

    public Node toNode() {
        Node node = new Node(getNodeId());
        node.setDisplayName(this.mDisplayName);
        node.setMainModule(cloneModule(getMainModuleInfo()));
        node.setStubModule(cloneModule(getStubModuleInfo()));
        return node;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mDeviceProtocol);
        parcel.writeString(this.mNodeId);
        parcel.writeParcelable(this.mMainModuleInfo, i);
        parcel.writeParcelable(this.mStubModuleInfo, i);
        parcel.writeString(this.mDisplayName);
        parcel.writeLong(this.mBleConnectTimeout);
        parcel.writeInt(this.mBleRetryCount);
    }

    public DeviceInfo(Parcel parcel) {
        this.mDeviceProtocol = -1;
        this.mBleConnectTimeout = GATT_CONNECT_SHORT_TIMEOUT;
        this.mBleRetryCount = 3;
        this.mDeviceProtocol = parcel.readInt();
        this.mNodeId = parcel.readString();
        this.mMainModuleInfo = (ModuleInfo) parcel.readParcelable(ModuleInfo.class.getClassLoader());
        this.mStubModuleInfo = (ModuleInfo) parcel.readParcelable(ModuleInfo.class.getClassLoader());
        this.mDisplayName = parcel.readString();
        this.mBleConnectTimeout = parcel.readLong();
        this.mBleRetryCount = parcel.readInt();
    }
}
