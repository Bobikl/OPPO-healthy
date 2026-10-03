package com.heytap.health.device.deviceinfo;

import android.content.Context;
import android.graphics.Bitmap;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.core.operation.IOperationDeviceInfoService;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.mc5;
import com.oplus.aiunit.vision.ol4;

/* JADX INFO: loaded from: classes16.dex */
@Route(path = "/device_settings/connect/operation")
public class OperationDeviceInfoServiceImpl implements IOperationDeviceInfoService {
    public UserDeviceInfo i;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h1(UserDeviceInfo userDeviceInfo, int i) {
        String mac = userDeviceInfo.getMac();
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceMac = ");
        sb.append(mac);
        sb.append(",state = ");
        sb.append(i);
        if (UserDeviceInfo.isConnected(i)) {
            this.i = gl4.managerApi.j();
        }
    }

    @Override // com.heytap.health.core.operation.IOperationDeviceInfoService
    public String D5() {
        UserDeviceInfo userDeviceInfo = this.i;
        if (userDeviceInfo == null) {
            return null;
        }
        return userDeviceInfo.getDeviceName();
    }

    @Override // com.heytap.health.core.operation.IOperationDeviceInfoService
    public String Ha() {
        UserDeviceInfo userDeviceInfo = this.i;
        if (userDeviceInfo == null) {
            return null;
        }
        return userDeviceInfo.getSkuCode();
    }

    @Override // com.heytap.health.core.operation.IOperationDeviceInfoService
    public Bitmap I5() {
        UserDeviceInfo userDeviceInfo = this.i;
        if (userDeviceInfo == null) {
            return null;
        }
        return userDeviceInfo.getDeviceIcon();
    }

    @Override // com.heytap.health.core.operation.IOperationDeviceInfoService
    public String I9() {
        UserDeviceInfo userDeviceInfo = this.i;
        if (userDeviceInfo == null) {
            return null;
        }
        return userDeviceInfo.getFirmwareVersion();
    }

    @Override // com.heytap.health.core.operation.IOperationDeviceInfoService
    public int J1() {
        UserDeviceInfo userDeviceInfo = this.i;
        return (userDeviceInfo == null ? null : Integer.valueOf(userDeviceInfo.getSubDeviceType())).intValue();
    }

    @Override // com.heytap.health.core.operation.IOperationDeviceInfoService
    public long O7() {
        UserDeviceInfo userDeviceInfo = this.i;
        return (userDeviceInfo == null ? null : Long.valueOf(userDeviceInfo.getBindingTime())).longValue();
    }

    @Override // com.heytap.health.core.operation.IOperationDeviceInfoService
    public String P1() {
        UserDeviceInfo userDeviceInfo = this.i;
        if (userDeviceInfo == null) {
            return null;
        }
        return userDeviceInfo.getDeviceIconPath();
    }

    @Override // com.heytap.health.core.operation.IOperationDeviceInfoService
    public String P7() {
        UserDeviceInfo userDeviceInfo = this.i;
        if (userDeviceInfo == null) {
            return null;
        }
        return userDeviceInfo.getMac();
    }

    @Override // com.heytap.health.core.operation.IOperationDeviceInfoService
    public int S8() {
        UserDeviceInfo userDeviceInfo = this.i;
        return (userDeviceInfo == null ? null : Integer.valueOf(userDeviceInfo.getMarketMode())).intValue();
    }

    @Override // com.heytap.health.core.operation.IOperationDeviceInfoService
    public String V9() {
        UserDeviceInfo userDeviceInfo = this.i;
        if (userDeviceInfo == null) {
            return null;
        }
        return userDeviceInfo.getImei();
    }

    @Override // com.heytap.health.core.operation.IOperationDeviceInfoService
    public String ab() {
        UserDeviceInfo userDeviceInfo = this.i;
        if (userDeviceInfo == null) {
            return null;
        }
        return userDeviceInfo.getBleMac();
    }

    @Override // com.heytap.health.core.operation.IOperationDeviceInfoService
    public String b7() {
        UserDeviceInfo userDeviceInfo = this.i;
        if (userDeviceInfo == null) {
            return null;
        }
        return userDeviceInfo.getDeviceOsVersion();
    }

    @Override // com.heytap.health.core.operation.IOperationDeviceInfoService
    public int c3() {
        UserDeviceInfo userDeviceInfo = this.i;
        if (userDeviceInfo == null) {
            return -1;
        }
        return userDeviceInfo.getConnectionState();
    }

    @Override // com.heytap.health.core.operation.IOperationDeviceInfoService
    public String ca() {
        UserDeviceInfo userDeviceInfo = this.i;
        if (userDeviceInfo == null) {
            return null;
        }
        return userDeviceInfo.getAppTerminalId();
    }

    @Override // com.heytap.health.core.operation.IOperationDeviceInfoService
    public String e1() {
        UserDeviceInfo userDeviceInfo = this.i;
        if (userDeviceInfo == null) {
            return null;
        }
        return userDeviceInfo.getDeviceUniqueId();
    }

    @Override // com.heytap.health.core.operation.IOperationDeviceInfoService
    public String e6() {
        UserDeviceInfo userDeviceInfo = this.i;
        if (userDeviceInfo == null) {
            return null;
        }
        return userDeviceInfo.getModel();
    }

    @Override // com.heytap.health.core.operation.IOperationDeviceInfoService
    public String f0() {
        UserDeviceInfo userDeviceInfo = this.i;
        if (userDeviceInfo == null) {
            return null;
        }
        return userDeviceInfo.getSku();
    }

    @Override // com.heytap.health.core.operation.IOperationDeviceInfoService
    public long i3() {
        UserDeviceInfo userDeviceInfo = this.i;
        return (userDeviceInfo == null ? null : Long.valueOf(userDeviceInfo.getMarketModeTimestamp())).longValue();
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
        ol4 ol4Var = gl4.managerApi;
        UserDeviceInfo userDeviceInfoJ = ol4Var.j();
        this.i = userDeviceInfoJ;
        if (userDeviceInfoJ != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("DeviceMac = ");
            sb.append(this.i.getMac());
            sb.append(",state = ");
            sb.append(this.i.getConnectionState());
        }
        ol4Var.r(new mc5() { // from class: com.oplus.aiunit.vision.imd
            @Override // com.oplus.aiunit.vision.mc5
            public final void r(UserDeviceInfo userDeviceInfo, int i) {
                this.i.h1(userDeviceInfo, i);
            }
        });
    }

    @Override // com.heytap.health.core.operation.IOperationDeviceInfoService
    public int j9() {
        UserDeviceInfo userDeviceInfo = this.i;
        return (userDeviceInfo == null ? null : Integer.valueOf(userDeviceInfo.getDeviceType())).intValue();
    }

    @Override // com.heytap.health.core.operation.IOperationDeviceInfoService
    public String k5() {
        UserDeviceInfo userDeviceInfo = this.i;
        if (userDeviceInfo == null) {
            return null;
        }
        return userDeviceInfo.getOtaVersion();
    }

    @Override // com.heytap.health.core.operation.IOperationDeviceInfoService
    public String m3() {
        UserDeviceInfo userDeviceInfo = this.i;
        if (userDeviceInfo == null) {
            return null;
        }
        return userDeviceInfo.getBleSecretMetadata();
    }

    @Override // com.heytap.health.core.operation.IOperationDeviceInfoService
    public String m8() {
        UserDeviceInfo userDeviceInfo = this.i;
        if (userDeviceInfo == null) {
            return null;
        }
        return userDeviceInfo.getDeviceSn();
    }

    @Override // com.heytap.health.core.operation.IOperationDeviceInfoService
    public String ma() {
        UserDeviceInfo userDeviceInfo = this.i;
        if (userDeviceInfo == null) {
            return null;
        }
        return userDeviceInfo.getProjectId();
    }

    @Override // com.heytap.health.core.operation.IOperationDeviceInfoService
    public String n8() {
        UserDeviceInfo userDeviceInfo = this.i;
        if (userDeviceInfo == null) {
            return null;
        }
        return userDeviceInfo.getDeviceMarketName();
    }

    @Override // com.heytap.health.core.operation.IOperationDeviceInfoService
    public String q4() {
        UserDeviceInfo userDeviceInfo = this.i;
        if (userDeviceInfo == null) {
            return null;
        }
        return userDeviceInfo.getSkuMarketName();
    }

    @Override // com.heytap.health.core.operation.IOperationDeviceInfoService
    public String s7() {
        UserDeviceInfo userDeviceInfo = this.i;
        if (userDeviceInfo == null) {
            return null;
        }
        return userDeviceInfo.getHardwareVersion();
    }

    @Override // com.heytap.health.core.operation.IOperationDeviceInfoService
    public String u2() {
        UserDeviceInfo userDeviceInfo = this.i;
        if (userDeviceInfo == null) {
            return null;
        }
        return userDeviceInfo.getBoardId();
    }

    @Override // com.heytap.health.core.operation.IOperationDeviceInfoService
    public int va() {
        UserDeviceInfo userDeviceInfo = this.i;
        if (userDeviceInfo == null) {
            return -1;
        }
        return userDeviceInfo.getCapacityPercent();
    }

    @Override // com.heytap.health.core.operation.IOperationDeviceInfoService
    public boolean xa() {
        UserDeviceInfo userDeviceInfo = this.i;
        return (userDeviceInfo == null ? null : Boolean.valueOf(userDeviceInfo.isClickable())).booleanValue();
    }

    @Override // com.heytap.health.core.operation.IOperationDeviceInfoService
    public String z8() {
        UserDeviceInfo userDeviceInfo = this.i;
        if (userDeviceInfo == null) {
            return null;
        }
        return userDeviceInfo.getDeviceManageIdImage();
    }
}
