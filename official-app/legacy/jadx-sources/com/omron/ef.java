package com.omron;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.ScanFilter;
import android.os.ParcelUuid;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@TargetApi(21)
public class ef {
    public List<ScanFilter> a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ScanFilter.Builder().build());
        return arrayList;
    }

    public List<ScanFilter> a(ee eeVar) {
        if (eeVar == null) {
            return a();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(eeVar);
        return a(arrayList);
    }

    public List<ScanFilter> a(List<ee> list) {
        if (list == null || list.isEmpty()) {
            return a();
        }
        ArrayList arrayList = new ArrayList();
        for (ee eeVar : list) {
            ScanFilter.Builder builder = new ScanFilter.Builder();
            if (eeVar.c() != null) {
                builder.setServiceUuid(new ParcelUuid(eeVar.c()));
            }
            if (!TextUtils.isEmpty(eeVar.a()) && BluetoothAdapter.checkBluetoothAddress(eeVar.a())) {
                builder.setDeviceAddress(eeVar.a());
            }
            if (!TextUtils.isEmpty(eeVar.b())) {
                builder.setDeviceName(eeVar.b());
            }
            arrayList.add(builder.build());
        }
        return arrayList;
    }
}
