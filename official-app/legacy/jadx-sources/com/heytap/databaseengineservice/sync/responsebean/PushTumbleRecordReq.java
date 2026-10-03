package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class PushTumbleRecordReq {

    @SerializedName("tumbleRecordList")
    private List<PullTumbleRecordRsp.TumbleRecordListBean> tumbleRecordList;

    public PushTumbleRecordReq(List<PullTumbleRecordRsp.TumbleRecordListBean> list) {
        this.tumbleRecordList = list;
    }

    public List<PullTumbleRecordRsp.TumbleRecordListBean> getTumbleRecordList() {
        return this.tumbleRecordList;
    }

    public void setTumbleRecordList(List<PullTumbleRecordRsp.TumbleRecordListBean> list) {
        this.tumbleRecordList = list;
    }
}
