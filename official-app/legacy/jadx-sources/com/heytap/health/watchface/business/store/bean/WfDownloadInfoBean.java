package com.heytap.health.watchface.business.store.bean;

import androidx.annotation.Keep;
import java.util.Objects;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class WfDownloadInfoBean {
    public static final int SOURCE_PKG_GENERAL = 0;
    public static final int SOURCE_PKG_NFC = 1;
    private boolean isLocalModified;
    private boolean isUpdate;
    private boolean isWatch3;
    private String jumpUrl;
    private String key;
    private long masterId;
    private int payStatus;
    private String previewUrl;
    private String resMd5;
    private String resUrl;
    private int size;
    private int source;
    private int styleIndex;
    private String uniqueId;
    private String version;
    private long versionId;
    private String watchKey;
    private String wfName;

    public WfDownloadInfoBean(String str) {
        this.uniqueId = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.uniqueId, ((WfDownloadInfoBean) obj).uniqueId);
    }

    public String getJumpUrl() {
        return this.jumpUrl;
    }

    public String getKey() {
        return this.key;
    }

    public long getMasterId() {
        return this.masterId;
    }

    public int getPayStatus() {
        return this.payStatus;
    }

    public String getPreviewUrl() {
        return this.previewUrl;
    }

    public String getResMd5() {
        return this.resMd5;
    }

    public String getResUrl() {
        return this.resUrl;
    }

    public int getSize() {
        return this.size;
    }

    public int getSource() {
        return this.source;
    }

    public int getStyleIndex() {
        return this.styleIndex;
    }

    public String getUniqueId() {
        return this.uniqueId;
    }

    public String getVersion() {
        return this.version;
    }

    public long getVersionId() {
        return this.versionId;
    }

    public String getWatchKey() {
        return this.watchKey;
    }

    public String getWfName() {
        return this.wfName;
    }

    public int hashCode() {
        return Objects.hash(this.uniqueId);
    }

    public boolean isLocalModified() {
        return this.isLocalModified;
    }

    public boolean isNoPay() {
        return this.payStatus == 0;
    }

    public boolean isUpdate() {
        return this.isUpdate;
    }

    public boolean isWatch3() {
        return this.isWatch3;
    }

    public void setJumpUrl(String str) {
        this.jumpUrl = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setLocalModified(boolean z) {
        this.isLocalModified = z;
    }

    public void setMasterId(long j2) {
        this.masterId = j2;
    }

    public void setPayStatus(int i) {
        this.payStatus = i;
    }

    public void setPreviewUrl(String str) {
        this.previewUrl = str;
    }

    public void setResMd5(String str) {
        this.resMd5 = str;
    }

    public void setResUrl(String str) {
        this.resUrl = str;
    }

    public void setSize(int i) {
        this.size = i;
    }

    public void setSource(int i) {
        this.source = i;
    }

    public void setStyleIndex(int i) {
        this.styleIndex = i;
    }

    public void setUniqueId(String str) {
        this.uniqueId = str;
    }

    public void setUpdate(boolean z) {
        this.isUpdate = z;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public void setVersionId(long j2) {
        this.versionId = j2;
    }

    public void setWatch3(boolean z) {
        this.isWatch3 = z;
    }

    public void setWatchKey(String str) {
        this.watchKey = str;
    }

    public void setWfName(String str) {
        this.wfName = str;
    }

    public String toString() {
        return "WfDownloadInfoBean{masterId=" + this.masterId + ", versionId=" + this.versionId + ", downUrl='" + this.resUrl + "', resMd5='" + this.resMd5 + "', size=" + this.size + ", uniqueId='" + this.uniqueId + "', version='" + this.version + "', wfName='" + this.wfName + "', payStatus=" + this.payStatus + ", isUpdate=" + this.isUpdate + ", isLocalModified=" + this.isLocalModified + '}';
    }

    public WfDownloadInfoBean(String str, String str2, String str3, int i, int i2) {
        this.uniqueId = str;
        this.version = str2;
        this.resUrl = str3;
        this.styleIndex = i;
        this.size = i2;
    }

    public WfDownloadInfoBean(String str, String str2, String str3, String str4, int i, int i2, String str5, String str6, int i3, String str7) {
        this.resUrl = str3;
        this.resMd5 = str4;
        this.size = i;
        this.uniqueId = str;
        this.version = str2;
        this.styleIndex = i2;
        this.wfName = str5;
        this.previewUrl = str6;
        this.payStatus = i3;
        this.jumpUrl = str7;
    }
}
