package com.heytap.upgrade.model;

import android.text.TextUtils;
import com.oplus.aiunit.vision.e6b;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class SplitFileInfoDto implements Serializable {
    private static final String TAG = "upgrade_SplitFileInfoDto";
    private ArrayList<String> downUrlList;
    private String headerMd5;
    private String md5;
    private String revisionCode;
    private String size;
    private String splitName;
    private String type;

    public String getDownUrl(int i) {
        if (i < this.downUrlList.size()) {
            return this.downUrlList.get(i);
        }
        ArrayList<String> arrayList = this.downUrlList;
        return arrayList.get(i % arrayList.size());
    }

    public String getHeaderMd5() {
        return this.headerMd5;
    }

    public String getMd5() {
        return this.md5;
    }

    public long getRevisionCode() {
        try {
            return Long.parseLong(this.revisionCode);
        } catch (NumberFormatException e2) {
            e6b.a(TAG, "getRevisionCode failed : " + e2.getMessage());
            return 0L;
        }
    }

    public long getSize() {
        try {
            return Long.parseLong(this.size);
        } catch (NumberFormatException e2) {
            e6b.a(TAG, "getSize failed : " + e2.getMessage());
            return 0L;
        }
    }

    public String getSplitName() {
        String str;
        return (TextUtils.isEmpty(this.splitName) || (str = this.splitName) == null || "null".equals(str)) ? "base" : this.splitName;
    }

    public int getType() {
        try {
            return Integer.parseInt(this.type);
        } catch (NumberFormatException e2) {
            e6b.a(TAG, "getType failed : " + e2.getMessage());
            return 0;
        }
    }

    public SplitFileInfoDto setDownUrlList(ArrayList<String> arrayList) {
        this.downUrlList = arrayList;
        return this;
    }

    public SplitFileInfoDto setHeaderMd5(String str) {
        this.headerMd5 = str;
        return this;
    }

    public SplitFileInfoDto setMd5(String str) {
        this.md5 = str;
        return this;
    }

    public SplitFileInfoDto setRevisionCode(String str) {
        this.revisionCode = str;
        return this;
    }

    public SplitFileInfoDto setSize(String str) {
        this.size = str;
        return this;
    }

    public SplitFileInfoDto setSplitName(String str) {
        this.splitName = str;
        return this;
    }

    public SplitFileInfoDto setType(String str) {
        this.type = str;
        return this;
    }

    public String toString() {
        return "SplitFileInfoDto{splitName='" + this.splitName + "', revisionCode='" + this.revisionCode + "', type='" + this.type + "', md5='" + this.md5 + "', headerMd5='" + this.headerMd5 + "', downUrlList=" + this.downUrlList + ", size='" + this.size + "'}";
    }
}
