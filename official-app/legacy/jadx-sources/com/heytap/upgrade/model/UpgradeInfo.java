package com.heytap.upgrade.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class UpgradeInfo implements Serializable {
    public static final int FLAG_FORCE_UPGRADE = 2;
    public static final int FLAG_NORMAL_UPGRADE = 0;
    public static final int FLAG_NO_UPGRADE = 1;
    public static final int FLAG_WEAK_UPGRADE = 3;
    private static final long serialVersionUID = 6607111838563006918L;
    public long apkSize;

    @Deprecated
    public String apkUrl;
    public boolean bundle;
    public ArrayList<String> downUrlList;
    public String md5;
    public List<SplitFileInfoDto> splitFileList;
    public String upgradeComment;
    public int upgradeFlag;
    public int versionCode;
    public String versionName;

    public long getApkFileSize() {
        return this.apkSize;
    }

    public String getApkUrl(int i) {
        if (this.downUrlList.size() <= 0) {
            return this.apkUrl;
        }
        if (i < this.downUrlList.size()) {
            return this.downUrlList.get(i);
        }
        ArrayList<String> arrayList = this.downUrlList;
        return arrayList.get(i % arrayList.size());
    }

    public long getDownloadFileSize() {
        if (!this.bundle) {
            return this.apkSize;
        }
        List<SplitFileInfoDto> list = this.splitFileList;
        long size = 0;
        if (list != null && !list.isEmpty()) {
            Iterator<SplitFileInfoDto> it = this.splitFileList.iterator();
            while (it.hasNext()) {
                size += it.next().getSize();
            }
        }
        return size;
    }

    public String getFileMD5(String str) {
        if (!this.bundle) {
            return this.md5;
        }
        for (SplitFileInfoDto splitFileInfoDto : this.splitFileList) {
            if (str.equals(splitFileInfoDto.getSplitName())) {
                return splitFileInfoDto.getMd5();
            }
        }
        return "";
    }

    public String getMd5() {
        return this.md5;
    }

    public List<SplitFileInfoDto> getSplitFileList() {
        return this.splitFileList;
    }

    public String getUpgradeComment() {
        return this.upgradeComment;
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

    public boolean isUpgradeAvailable() {
        return (this.versionName == null || this.upgradeFlag == 1) ? false : true;
    }

    public UpgradeInfo setApkFileSize(long j2) {
        this.apkSize = j2;
        return this;
    }

    public UpgradeInfo setBundle(boolean z) {
        this.bundle = z;
        return this;
    }

    public UpgradeInfo setDownUrlList(ArrayList<String> arrayList) {
        this.downUrlList = arrayList;
        return this;
    }

    public UpgradeInfo setMd5(String str) {
        this.md5 = str;
        return this;
    }

    public UpgradeInfo setSplitFileList(List<SplitFileInfoDto> list) {
        this.splitFileList = list;
        return this;
    }

    public UpgradeInfo setUpgradeComment(String str) {
        this.upgradeComment = str;
        return this;
    }

    public UpgradeInfo setUpgradeFlag(int i) {
        this.upgradeFlag = i;
        return this;
    }

    public UpgradeInfo setVersionCode(int i) {
        this.versionCode = i;
        return this;
    }

    public UpgradeInfo setVersionName(String str) {
        this.versionName = str;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UpgradeInfo:{upgradeFlag:");
        sb.append(this.upgradeFlag);
        sb.append(", versionCode:");
        sb.append(this.versionCode);
        sb.append(", versionName:");
        sb.append(this.versionName);
        sb.append(", upgradeComment:");
        sb.append(this.upgradeComment);
        sb.append(", apkFileMD5:");
        sb.append(this.md5);
        sb.append(", apkFileSize:");
        sb.append(this.apkSize);
        sb.append(", bundle:");
        sb.append(this.bundle);
        sb.append(", splitFileList:");
        List<SplitFileInfoDto> list = this.splitFileList;
        sb.append(list == null ? "null" : Arrays.toString(list.toArray()));
        sb.append(", downUrlList:");
        ArrayList<String> arrayList = this.downUrlList;
        sb.append(arrayList != null ? Arrays.toString(arrayList.toArray()) : "null");
        sb.append("}");
        return sb.toString();
    }

    public long getDownloadFileSize(String str) {
        if (this.bundle) {
            List<SplitFileInfoDto> list = this.splitFileList;
            if (list != null && !list.isEmpty()) {
                for (SplitFileInfoDto splitFileInfoDto : this.splitFileList) {
                    if (splitFileInfoDto.getMd5().equals(str)) {
                        return splitFileInfoDto.getSize();
                    }
                }
            }
            return 0L;
        }
        return this.apkSize;
    }
}
