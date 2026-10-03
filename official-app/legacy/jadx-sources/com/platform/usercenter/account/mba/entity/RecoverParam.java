package com.platform.usercenter.account.mba.entity;

import android.net.Uri;
import android.view.View;
import com.platform.usercenter.account.mba.MbaConstant;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.tools.datastructure.StringUtil;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class RecoverParam {
    public boolean autoOpen;
    private String dplink;
    public int minVersion;
    public String pkg;
    public RecoverTypeEnum recoverTypeEnum;
    public int snackBarDuration;
    public View view;

    public RecoverParam(RecoverTypeEnum recoverTypeEnum, int i) {
        this.autoOpen = false;
        this.pkg = MbaConstant.RECOVERY_DEFAULT_PKG;
        this.recoverTypeEnum = recoverTypeEnum;
        this.minVersion = i;
    }

    public String getDplink() {
        return this.dplink;
    }

    public void setDplink(String str) {
        this.dplink = str;
    }

    public RecoverParam(RecoverTypeEnum recoverTypeEnum, int i, int i2, View view) {
        this.autoOpen = false;
        this.pkg = MbaConstant.RECOVERY_DEFAULT_PKG;
        this.recoverTypeEnum = recoverTypeEnum;
        this.snackBarDuration = i;
        this.minVersion = i2;
        this.view = view;
    }

    public RecoverParam(String str) {
        this.autoOpen = false;
        this.pkg = MbaConstant.RECOVERY_DEFAULT_PKG;
        this.dplink = str;
        this.recoverTypeEnum = RecoverTypeEnum.BLOCK_INSTALL;
        if (StringUtil.isEmpty(str)) {
            return;
        }
        Uri uri = Uri.parse(str);
        this.pkg = uri.getQueryParameter("packageName");
        String queryParameter = uri.getQueryParameter(MbaConstant.RECOVERY_DP_LINK_KEY_MIN_VER);
        if (StringUtil.isEmpty(queryParameter)) {
            return;
        }
        this.minVersion = Integer.parseInt(queryParameter);
    }
}
