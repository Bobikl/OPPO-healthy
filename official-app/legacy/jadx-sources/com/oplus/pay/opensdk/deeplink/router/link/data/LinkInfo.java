package com.oplus.pay.opensdk.deeplink.router.link.data;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.b1j;
import com.oplus.aiunit.vision.bae;
import com.oplus.aiunit.vision.jzf;
import com.oplus.aiunit.vision.wda;
import com.oplus.aiunit.vision.wfk;
import com.oplus.aiunit.vision.y70;
import com.oplus.pay.opensdk.deeplink.router.link.LinkInfoHelp;
import com.platform.usercenter.account.router.LinkConstants;
import java.net.URISyntaxException;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public class LinkInfo {
    public static final String TYPE_BROWSER = "BROWSER";
    public static final String TYPE_DOWNLOAD = "DOWNLOAD";
    public static final String TYPE_H5 = "WEBVIEW";
    public static final String TYPE_NATIVE = "NATIVE";
    public String appName;
    public String appVersion;
    public String enter_from;
    private String instantScence;
    public String linkType;
    public String linkUrl;
    public String osVersion;
    public String packageName;
    public String trackId;
    public boolean canJump = true;
    public String callType = "NATIVE";

    public static class a {
        public String a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f20062c;
        public String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f20063e;
        public String f;
        public String g;
        public String h;
        public boolean i = true;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f20064j = "NATIVE";

        public a a(String str) {
            this.f20062c = str;
            return this;
        }

        public LinkInfo b() {
            LinkInfo linkInfo = new LinkInfo();
            linkInfo.linkType = this.a;
            linkInfo.linkUrl = this.b;
            linkInfo.appVersion = this.f20062c;
            linkInfo.osVersion = this.d;
            linkInfo.appName = this.f20063e;
            linkInfo.packageName = this.f;
            linkInfo.enter_from = this.g;
            linkInfo.callType = this.f20064j;
            linkInfo.trackId = this.h;
            linkInfo.canJump = this.i;
            return linkInfo;
        }

        public a c(boolean z) {
            this.i = z;
            return this;
        }

        public a d(String str) {
            this.g = str;
            return this;
        }

        public a e(String str) {
            this.a = str;
            return this;
        }

        public a f(String str) {
            this.b = str;
            return this;
        }

        public a g(String str) {
            this.f = str;
            return this;
        }

        public a h(String str) {
            this.h = str;
            return this;
        }
    }

    private void openBrowser(Context context) {
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(this.linkUrl));
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
        } catch (Exception e2) {
            bae.d(e2.getMessage());
        }
    }

    private void openH5(Context context) {
        try {
            wfk.a().b();
            throw null;
        } catch (Exception e2) {
            bae.d(e2.getMessage());
        }
    }

    private void openInstalledApp(Context context) {
        try {
            openInstalledAppInner(context);
        } catch (Exception e2) {
            bae.d("Unexpected error: " + e2.getMessage());
        }
    }

    private void openInstalledAppInner(Context context) throws URISyntaxException {
        Intent url2Intent = parseUrl2Intent(context);
        if (!b1j.b(this.enter_from)) {
            url2Intent.putExtra(LinkConstants.EXTRA_PARAM_ENTER_FROM, this.enter_from);
        }
        jzf.a(context, url2Intent, this.packageName);
    }

    private void openIntent(Context context) {
        if (TextUtils.isEmpty(this.packageName)) {
            openIntentInner(context);
        }
    }

    private void openIntentInner(Context context) {
        try {
            Intent url2Intent = parseUrl2Intent(context);
            if (!b1j.b(this.enter_from)) {
                url2Intent.putExtra(LinkConstants.EXTRA_PARAM_ENTER_FROM, this.enter_from);
            }
            jzf.b(context, url2Intent, this.packageName);
        } catch (Exception e2) {
            bae.d(e2.getMessage());
        }
    }

    private void openNative(Context context) {
        if (TextUtils.isEmpty(this.packageName)) {
            openIntent(context);
            return;
        }
        if (y70.a(context, this.packageName) || LinkInfoHelp.isMbaDisable(context, this.packageName)) {
            if (TextUtils.isEmpty(this.appVersion)) {
                openInstalledApp(context);
                return;
            }
            try {
                if (y70.d(context, this.packageName) >= Integer.parseInt(this.appVersion)) {
                    openInstalledApp(context);
                }
            } catch (Exception e2) {
                bae.d(e2.getMessage());
            }
        }
    }

    private Intent parseUrl2Intent(Context context) throws URISyntaxException {
        return "NATIVE".equals(this.callType) ? wda.a(this.linkUrl, 1) : wda.b(context, this.linkUrl, 1, this.packageName);
    }

    public String getInstantScence() {
        return this.instantScence;
    }

    public String getLinkUrl() {
        return this.linkUrl;
    }

    public boolean isTypeBrowser() {
        return TextUtils.equals(this.linkType, "BROWSER");
    }

    public boolean isTypeDownload() {
        return TextUtils.equals(this.linkType, "DOWNLOAD");
    }

    public boolean isTypeLocalWeb() {
        return TextUtils.equals(this.linkType, "WEBVIEW");
    }

    public boolean isTypeNative() {
        return TextUtils.equals(this.linkType, "NATIVE");
    }

    public void open(Context context) {
        if (TextUtils.isEmpty(this.linkUrl)) {
            return;
        }
        bae.c("type is " + this.linkType + ",linkUrl is " + this.linkUrl);
        if (isTypeLocalWeb()) {
            openH5(context);
        } else if (isTypeBrowser()) {
            openBrowser(context);
        } else if (isTypeNative()) {
            openNative(context);
        }
    }

    public void setInstantScence(String str) {
        this.instantScence = str;
    }
}
