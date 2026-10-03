package com.oplus.ocs.oms.downloader.columbus;

import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public class DownLoadInfo {
    public int apkSize;
    public String apkUrl;
    public boolean bundle;
    private String code;
    public List<String> downUrlList;
    public String md5;
    public int patchSize;
    public String patchUrl;
    private String reason;
    private String splitName;
    public String updateComment;
    public int upgradeFlag = 0;
    public int versionCode = 0;
    public String versionName;

    public int getApkSize() {
        return this.apkSize;
    }

    public String getApkUrl() {
        return this.apkUrl;
    }

    public String getCode() {
        return this.code;
    }

    public List<String> getDownUrlList() {
        return this.downUrlList;
    }

    public String getMd5() {
        return this.md5;
    }

    public int getPatchSize() {
        return this.patchSize;
    }

    public String getPatchUrl() {
        return this.patchUrl;
    }

    public String getReason() {
        return this.reason;
    }

    public String getSplitName() {
        return this.splitName;
    }

    public String getUpdateComment() {
        return this.updateComment;
    }

    public int getUpgradeFlag() {
        return this.upgradeFlag;
    }

    public int getVersionCode() {
        return this.versionCode;
    }

    public String getVersionName() {
        return this.versionName;
    }

    public boolean isBundle() {
        return this.bundle;
    }

    public void setApkSize(int i) {
        this.apkSize = i;
    }

    public void setApkUrl(String str) {
        this.apkUrl = str;
    }

    public void setBundle(boolean z) {
        this.bundle = z;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setDownUrlList(List<String> list) {
        this.downUrlList = list;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    public void setPatchSize(int i) {
        this.patchSize = i;
    }

    public void setPatchUrl(String str) {
        this.patchUrl = str;
    }

    public void setReason(String str) {
        this.reason = str;
    }

    public void setSplitName(String str) {
        this.splitName = str;
    }

    public void setUpdateComment(String str) {
        this.updateComment = str;
    }

    public void setUpgradeFlag(int i) {
        this.upgradeFlag = i;
    }

    public void setVersionCode(int i) {
        this.versionCode = i;
    }

    public void setVersionName(String str) {
        this.versionName = str;
    }

    public String toString() {
        return "DownLoadInfo{upgradeFlag=" + this.upgradeFlag + ", versionCode=" + this.versionCode + ", versionName='" + this.versionName + "', apkUrl='" + this.apkUrl + "', md5='" + this.md5 + "', apkSize=" + this.apkSize + ", patchSize=" + this.patchSize + ", patchUrl='" + this.patchUrl + "', updateComment='" + this.updateComment + "', bundle=" + this.bundle + ", downUrlList=" + this.downUrlList + '}';
    }
}
