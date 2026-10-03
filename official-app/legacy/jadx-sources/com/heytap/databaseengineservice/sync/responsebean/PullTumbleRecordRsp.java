package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class PullTumbleRecordRsp {
    private int hasMore;
    private List<TumbleRecordListBean> tumbleRecordList;

    @Keep
    public static class TumbleRecordListBean {
        private String deviceUniqueId;
        private int state;
        private long timestamp;

        public String getDeviceUniqueId() {
            return this.deviceUniqueId;
        }

        public int getState() {
            return this.state;
        }

        public long getTimestamp() {
            return this.timestamp;
        }

        public void setDeviceUniqueId(String str) {
            this.deviceUniqueId = str;
        }

        public void setState(int i) {
            this.state = i;
        }

        public void setTimestamp(long j2) {
            this.timestamp = j2;
        }
    }

    public int getHasMore() {
        return this.hasMore;
    }

    public List<TumbleRecordListBean> getTumbleRecordList() {
        return this.tumbleRecordList;
    }

    public void setHasMore(int i) {
        this.hasMore = i;
    }

    public void setTumbleRecordList(List<TumbleRecordListBean> list) {
        this.tumbleRecordList = list;
    }
}
