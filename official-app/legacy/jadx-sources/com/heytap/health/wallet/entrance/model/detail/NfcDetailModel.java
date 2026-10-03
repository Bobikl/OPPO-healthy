package com.heytap.health.wallet.entrance.model.detail;

import androidx.annotation.Keep;
import com.heytap.health.wallet.network.car.rsp.CardInfoDTO;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class NfcDetailModel extends BaseDetailModel {
    private List<CardInfoDTO> carInfo;
    private String deleteDialog;
    private String installDeleteDialog;
    private String linkUrl;

    public List<CardInfoDTO> getCarInfo() {
        return this.carInfo;
    }

    public String getDeleteTips() {
        return this.deleteDialog;
    }

    public String getInstallDeleteTips() {
        return this.installDeleteDialog;
    }

    public String getLinkUrl() {
        return this.linkUrl;
    }

    public void setCarInfo(List<CardInfoDTO> list) {
        this.carInfo = list;
    }

    public void setDeleteTips(String str) {
        this.deleteDialog = str;
    }

    public void setInstallDeleteTips(String str) {
        this.installDeleteDialog = str;
    }

    public void setLinkUrl(String str) {
        this.linkUrl = str;
    }
}
