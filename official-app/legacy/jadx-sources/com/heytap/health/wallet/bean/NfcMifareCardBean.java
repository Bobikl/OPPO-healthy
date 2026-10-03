package com.heytap.health.wallet.bean;

import android.nfc.Tag;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class NfcMifareCardBean {
    private String atqa;
    private String id;
    private boolean isCpuCard;
    private boolean isEncrypt;
    boolean isMifareClassic;
    private String sak;
    private int sectorCount;
    private SparseArray<SectorInfo> sectorInfos;
    private Tag tag;
    private int type;

    public String getAtqa() {
        return this.atqa;
    }

    public String getId() {
        return this.id;
    }

    public String getSak() {
        return this.sak;
    }

    public int getSectorCount() {
        return this.sectorCount;
    }

    public SparseArray<SectorInfo> getSectorInfos() {
        return this.sectorInfos;
    }

    public Tag getTag() {
        return this.tag;
    }

    public int getType() {
        return this.type;
    }

    public boolean isAvailable() {
        return (TextUtils.isEmpty(this.sak) || TextUtils.isEmpty(this.atqa)) ? false : true;
    }

    public boolean isCpuCard() {
        return this.isCpuCard;
    }

    public boolean isEncrypt() {
        return this.isEncrypt;
    }

    public boolean isMifareClassic() {
        return this.isMifareClassic;
    }

    public void setAtqa(String str) {
        this.atqa = str;
    }

    public void setCpuCard(boolean z) {
        this.isCpuCard = z;
    }

    public void setEncrypt(boolean z) {
        this.isEncrypt = z;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setMifareClassic(boolean z) {
        this.isMifareClassic = z;
    }

    public void setSak(String str) {
        this.sak = str;
    }

    public void setSectorCount(int i) {
        this.sectorCount = i;
    }

    public void setSectorInfos(SparseArray<SectorInfo> sparseArray) {
        this.sectorInfos = sparseArray;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

    public void setType(int i) {
        this.type = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id=");
        sb.append(this.id);
        sb.append(" sak=");
        sb.append(this.sak);
        sb.append(" atqa=");
        sb.append(this.atqa);
        sb.append(" isCpuCard=");
        sb.append(this.isCpuCard);
        sb.append(" isEncrypt=");
        sb.append(this.isEncrypt);
        sb.append("type =");
        sb.append(this.type);
        sb.append("sectorCount=");
        sb.append(this.sectorCount);
        sb.append("  sectorInfosCount = ");
        SparseArray<SectorInfo> sparseArray = this.sectorInfos;
        sb.append(sparseArray == null ? 0 : sparseArray.size());
        return sb.toString();
    }
}
