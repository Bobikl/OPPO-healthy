package com.heytap.health.operation.medal.bean;

import androidx.annotation.Keep;
import com.heytap.health.operations.bean.MedalListBean;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
@Keep
public class MedalAllListBean implements Serializable {
    private List<MedalListBean> medalList;
    private String medalNameEN;
    private String medalNameZN;
    private int medalSort;

    public List<MedalListBean> getMedalList() {
        return this.medalList;
    }

    public String getMedalNameEN() {
        return this.medalNameEN;
    }

    public String getMedalNameZN() {
        return this.medalNameZN;
    }

    public int getMedalSort() {
        return this.medalSort;
    }

    public void setMedalList(List<MedalListBean> list) {
        this.medalList = list;
    }

    public void setMedalNameEN(String str) {
        this.medalNameEN = str;
    }

    public void setMedalNameZN(String str) {
        this.medalNameZN = str;
    }

    public void setMedalSort(int i) {
        this.medalSort = i;
    }
}
