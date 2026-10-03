package com.oplus.pay.opensdk.deeplink.router.link.data;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.ace;
import com.oplus.aiunit.vision.efa;
import com.oplus.aiunit.vision.i80;
import com.oplus.aiunit.vision.m2g;
import com.oplus.aiunit.vision.u4j;
import com.oplus.aiunit.vision.yjk;
import com.oplus.pay.opensdk.deeplink.router.link.LinkInfoHelp;
import com.oplusos.sau.common.utils.SauAarConstants;
import java.net.URISyntaxException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
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
    public String callType = TYPE_NATIVE;

    public static class a {
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public boolean i = true;
        public String j = LinkInfo.TYPE_NATIVE;

        public a a(String str) {
            this.c = str;
            return this;
        }

        public LinkInfo b() {
            LinkInfo linkInfo = new LinkInfo();
            linkInfo.linkType = this.a;
            linkInfo.linkUrl = this.b;
            linkInfo.appVersion = this.c;
            linkInfo.osVersion = this.d;
            linkInfo.appName = this.e;
            linkInfo.packageName = this.f;
            linkInfo.enter_from = this.g;
            linkInfo.callType = this.j;
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
                intent.addFlags(SauAarConstants.L);
            }
            context.startActivity(intent);
        } catch (Exception e) {
            ace.d(e.getMessage());
        }
    }

    private void openH5(Context context) {
        try {
            yjk.a().b();
            throw null;
        } catch (Exception e) {
            ace.d(e.getMessage());
        }
    }

    private void openInstalledApp(Context context) {
        try {
            openInstalledAppInner(context);
        } catch (Exception e) {
            ace.d("Unexpected error: " + e.getMessage());
        }
    }

    private void openInstalledAppInner(Context context) throws URISyntaxException {
        Intent url2Intent = parseUrl2Intent(context);
        if (!u4j.b(this.enter_from)) {
            url2Intent.putExtra("enter_from", this.enter_from);
        }
        m2g.a(context, url2Intent, this.packageName);
    }

    private void openIntent(Context context) {
        if (TextUtils.isEmpty(this.packageName)) {
            openIntentInner(context);
        }
    }

    private void openIntentInner(Context context) {
        try {
            Intent url2Intent = parseUrl2Intent(context);
            if (!u4j.b(this.enter_from)) {
                url2Intent.putExtra("enter_from", this.enter_from);
            }
            m2g.b(context, url2Intent, this.packageName);
        } catch (Exception e) {
            ace.d(e.getMessage());
        }
    }

    private void openNative(Context context) {
        if (TextUtils.isEmpty(this.packageName)) {
            openIntent(context);
            return;
        }
        if (i80.a(context, this.packageName) || LinkInfoHelp.isMbaDisable(context, this.packageName)) {
            if (TextUtils.isEmpty(this.appVersion)) {
                openInstalledApp(context);
                return;
            }
            try {
                if (i80.d(context, this.packageName) >= Integer.parseInt(this.appVersion)) {
                    openInstalledApp(context);
                }
            } catch (Exception e) {
                ace.d(e.getMessage());
            }
        }
    }

    private Intent parseUrl2Intent(Context context) throws URISyntaxException {
        return TYPE_NATIVE.equals(this.callType) ? efa.a(this.linkUrl, 1) : efa.b(context, this.linkUrl, 1, this.packageName);
    }

    public String getInstantScence() {
        return this.instantScence;
    }

    public String getLinkUrl() {
        return this.linkUrl;
    }

    public boolean isTypeBrowser() {
        return TextUtils.equals(this.linkType, TYPE_BROWSER);
    }

    public boolean isTypeDownload() {
        return TextUtils.equals(this.linkType, TYPE_DOWNLOAD);
    }

    public boolean isTypeLocalWeb() {
        return TextUtils.equals(this.linkType, TYPE_H5);
    }

    public boolean isTypeNative() {
        return TextUtils.equals(this.linkType, TYPE_NATIVE);
    }

    public void open(Context context) {
        if (TextUtils.isEmpty(this.linkUrl)) {
            return;
        }
        ace.c("type is " + this.linkType + ",linkUrl is " + this.linkUrl);
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
