package com.platform.usercenter.account.newcommon.link_check;

import android.content.Context;

/* JADX INFO: loaded from: classes9.dex */
public interface ILinkCheck {

    public interface CheckCallback {
        default void onFail(int i, String str) {
        }

        void onSuccess();
    }

    void checkLink(Context context, LinkCheckParam linkCheckParam, CheckCallback checkCallback);

    public static class LinkCheckParam {
        String content;
        String linkUrl;
        String pkgName;
        String title;

        public LinkCheckParam(String str) {
            this.pkgName = str;
        }

        public LinkCheckParam(String str, String str2) {
            this.pkgName = str;
            this.linkUrl = str2;
        }

        public LinkCheckParam(String str, String str2, String str3, String str4) {
            this.pkgName = str;
            this.linkUrl = str2;
            this.title = str3;
            this.content = str4;
        }
    }
}
