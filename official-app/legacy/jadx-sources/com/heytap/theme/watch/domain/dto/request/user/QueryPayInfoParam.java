package com.heytap.theme.watch.domain.dto.request.user;

import com.heytap.theme.watch.domain.dto.request.AppImpInfo;
import io.protostuff.Tag;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class QueryPayInfoParam implements Serializable {
    private static final long serialVersionUID = 1807113536111198834L;

    @Tag(1)
    private List<AppImpInfo> appImpInfoList;

    public List<AppImpInfo> getAppImpInfoList() {
        return this.appImpInfoList;
    }

    public void setAppImpInfoList(List<AppImpInfo> list) {
        this.appImpInfoList = list;
    }

    public String toString() {
        return "QueryPayInfoParam{appImpInfoList=" + this.appImpInfoList + '}';
    }
}
