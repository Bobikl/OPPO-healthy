package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class PullSportHealthDataRspBody<T> {
    private List<T> resultList;

    public List<T> getResultList() {
        return this.resultList;
    }

    public void setResultList(List<T> list) {
        this.resultList = list;
    }

    public String toString() {
        return "PullSportHealthDataRspBody{resultList=" + this.resultList + '}';
    }
}
