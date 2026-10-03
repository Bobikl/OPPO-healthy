package com.heytap.health.wallet.network.car.params;

import io.protostuff.Tag;
import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public class VerifyIssuerCardReq implements Serializable {
    private static final long serialVersionUID = -1;

    @Tag(2)
    private String appId;

    @Tag(1)
    private String cplc;

    @Tag(4)
    private String vehicleOemId;

    @Tag(3)
    private String vehiclePkgName;

    public String getAppId() {
        return this.appId;
    }

    public String getCplc() {
        return this.cplc;
    }

    public String getVehicleOemId() {
        return this.vehicleOemId;
    }

    public String getVehiclePkgName() {
        return this.vehiclePkgName;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setCplc(String str) {
        this.cplc = str;
    }

    public void setVehicleOemId(String str) {
        this.vehicleOemId = str;
    }

    public void setVehiclePkgName(String str) {
        this.vehiclePkgName = str;
    }
}
