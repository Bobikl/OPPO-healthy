package com.heytap.health.watchpair.watchconnect.pair.common.datacommon;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes19.dex */
public class LaSparseArray implements Serializable {
    private static final String TAG = "LaSparseArray";
    private static final long serialVersionUID = 3128594851129501738L;
    public String name;
    public transient SparseIntArray commandSIA = new SparseIntArray();
    public transient SparseArray<Object> strucSA = new SparseArray<>();
    private LinkedHashSet<Byte> setServiceId = new LinkedHashSet<>();
    private LinkedHashMap<Byte, Byte> commandResultMap = new LinkedHashMap<>();
    private LinkedHashMap<Byte, LinkedHashMap<Byte, Byte>> strutMap = new LinkedHashMap<>();

    public LinkedHashMap<Byte, Byte> getCommandResultMap() {
        return this.commandResultMap;
    }

    public String getName() {
        return this.name;
    }

    public LinkedHashSet<Byte> getSetServiceId() {
        return this.setServiceId;
    }

    public SparseArray<Object> getStrucSA() {
        return this.strucSA;
    }

    public LinkedHashMap<Byte, LinkedHashMap<Byte, Byte>> getStrutMap() {
        return this.strutMap;
    }

    public void setCommandResultMap(LinkedHashMap<Byte, Byte> linkedHashMap) {
        this.commandResultMap = linkedHashMap;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setSetServiceId(LinkedHashSet<Byte> linkedHashSet) {
        this.setServiceId = linkedHashSet;
    }

    public void setStrucSA(SparseArray<Object> sparseArray) {
        this.strucSA = sparseArray;
    }

    public void setStrutMap(LinkedHashMap<Byte, LinkedHashMap<Byte, Byte>> linkedHashMap) {
        this.strutMap = linkedHashMap;
    }
}
