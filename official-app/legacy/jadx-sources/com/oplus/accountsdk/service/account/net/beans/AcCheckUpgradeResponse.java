package com.oplus.accountsdk.service.account.net.beans;

import android.text.TextUtils;
import androidx.annotation.Keep;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class AcCheckUpgradeResponse implements Serializable {
    private String butContent;
    private String jumpLink;
    private String mainTitle;
    private boolean needUpgrade;
    private String overseaJumpLink;
    private String subTitle;
    private String upgradeContent;

    public AcCheckUpgradeResponse(boolean z, String str, String str2, String str3, String str4, String str5, String str6) {
        this.needUpgrade = z;
        this.mainTitle = str;
        this.subTitle = str2;
        this.upgradeContent = str3;
        this.butContent = str4;
        this.jumpLink = str5;
        this.overseaJumpLink = str6;
    }

    public String getButContent() {
        return this.butContent;
    }

    public String getJumpLink() {
        return this.jumpLink;
    }

    public String getMainTitle() {
        return this.mainTitle;
    }

    public String getOverseaJumpLink() {
        return this.overseaJumpLink;
    }

    public String getSubTitle() {
        return this.subTitle;
    }

    public String getUpgradeContent() {
        return this.upgradeContent;
    }

    public boolean isContainValidData() {
        return (TextUtils.isEmpty(this.mainTitle) || TextUtils.isEmpty(this.subTitle) || TextUtils.isEmpty(this.upgradeContent) || TextUtils.isEmpty(this.butContent)) ? false : true;
    }

    public boolean isNeedUpgrade() {
        return this.needUpgrade;
    }

    public void setButContent(String str) {
        this.butContent = str;
    }

    public void setJumpLink(String str) {
        this.jumpLink = str;
    }

    public void setMainTitle(String str) {
        this.mainTitle = str;
    }

    public void setNeedUpgrade(boolean z) {
        this.needUpgrade = z;
    }

    public void setOverseaJumpLink(String str) {
        this.overseaJumpLink = str;
    }

    public void setSubTitle(String str) {
        this.subTitle = str;
    }

    public void setUpgradeContent(String str) {
        this.upgradeContent = str;
    }
}
