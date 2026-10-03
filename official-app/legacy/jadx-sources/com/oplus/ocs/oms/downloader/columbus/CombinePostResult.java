package com.oplus.ocs.oms.downloader.columbus;

import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public class CombinePostResult {
    private List<DownLoadInfo> data;
    private String msg;
    private String status;
    private boolean success;

    public List<DownLoadInfo> getData() {
        return this.data;
    }

    public String getMsg() {
        return this.msg;
    }

    public String getStatus() {
        return this.status;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setData(List<DownLoadInfo> list) {
        this.data = list;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setSuccess(boolean z) {
        this.success = z;
    }

    public String toString() {
        return "CombinePostResult{success=" + this.success + ", status='" + this.status + "', msg='" + this.msg + "', data=" + this.data + '}';
    }
}
