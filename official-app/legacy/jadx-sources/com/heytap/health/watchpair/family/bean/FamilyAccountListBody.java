package com.heytap.health.watchpair.family.bean;

import androidx.annotation.Keep;
import com.heytap.health.devicemanager.processor.bean.VirtualAccountData;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class FamilyAccountListBody {
    private ArrayList<VirtualAccountData> records;

    public ArrayList<VirtualAccountData> getRecords() {
        return this.records;
    }

    public void setRecords(ArrayList<VirtualAccountData> arrayList) {
        this.records = arrayList;
    }

    public String toString() {
        return "FamilyAccountListBody{list=" + this.records + '}';
    }
}
