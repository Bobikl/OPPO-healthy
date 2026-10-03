package com.heytap.health.wallet.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class CardInfo {
    private String atqa;
    private String data;
    private boolean encrypted;
    private String inverseId;
    private String originalInformation;
    private String sak;
    private int sectorCount;
    private String uid;
    private String valueSectors;

    public String getAtqa() {
        return this.atqa;
    }

    public String getData() {
        return this.data;
    }

    public String getInverseId() {
        return this.inverseId;
    }

    public String getOriginalInformation() {
        return this.originalInformation;
    }

    public String getSak() {
        return this.sak;
    }

    public int getSectorCount() {
        return this.sectorCount;
    }

    public String getUid() {
        return this.uid;
    }

    public String getValueSectors() {
        return this.valueSectors;
    }

    public boolean isEncrypted() {
        return this.encrypted;
    }

    public void setAtqa(String str) {
        this.atqa = str;
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setEncrypted(boolean z) {
        this.encrypted = z;
    }

    public void setInverseId(String str) {
        this.inverseId = str;
    }

    public void setOriginalInformation(String str) {
        this.originalInformation = str;
    }

    public void setSak(String str) {
        this.sak = str;
    }

    public void setSectorCount(int i) {
        this.sectorCount = i;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public void setValueSectors(String str) {
        this.valueSectors = str;
    }

    public String toString() {
        return "CardInfo{uid='" + this.uid + "', data='" + this.data + "', atqa='" + this.atqa + "', sak='" + this.sak + "', sectorCount=" + this.sectorCount + ", encrypted=" + this.encrypted + ", originalInformation='" + this.originalInformation + "', inverseId=" + this.inverseId + ", valueSectors=" + this.valueSectors + '}';
    }
}
