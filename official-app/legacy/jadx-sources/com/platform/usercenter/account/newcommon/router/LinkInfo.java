package com.platform.usercenter.account.newcommon.router;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.platform.usercenter.account.UcRouterAgent;
import com.platform.usercenter.account.mba.MbaAgent;
import com.platform.usercenter.account.mba.entity.RecoverParam;
import com.platform.usercenter.account.newcommon.link_check.ILinkCheck;
import com.platform.usercenter.account.newcommon.link_check.LinkCheckService;
import com.platform.usercenter.account.router.LinkConstants;
import com.platform.usercenter.account.router.interfaces.IRouterService;
import com.platform.usercenter.account.router.monitor.LinkMonitorManager;
import com.platform.usercenter.account.router.monitor.LinkMonitorParam;
import com.platform.usercenter.account.router.util.RouterIntentUtil;
import com.platform.usercenter.account.router.util.StackTraceUtil;
import com.platform.usercenter.account.router.wrapper.IntentWrapper;
import com.platform.usercenter.account.router.wrapper.RouterOapsWrapper;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.tools.ApkInfoHelper;
import com.platform.usercenter.tools.datastructure.StringUtil;
import com.platform.usercenter.tools.log.UCLogUtil;
import java.net.URISyntaxException;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class LinkInfo {
    public static final String CALL_TYPE_DEFAULT = "NATIVE";
    public static final String CALL_TYPE_H5 = "H5";
    public static final String CALL_TYPE_NATIVE = "NATIVE";
    public static final String CALL_TYPE_SDK = "SDK";
    private static final String TAG = "LinkInfo";
    public static final String TYPE_BROWSER = "BROWSER";
    public static final String TYPE_DOWNLOAD = "DOWNLOAD";
    public static final String TYPE_H5 = "WEBVIEW";
    public static final String TYPE_INSTANT = "FAST_APP";
    public static final String TYPE_NATIVE = "NATIVE";
    public static final String TYPE_NONE = "NONE";
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

    public static class Builder {
        private String appName;
        private String appVersion;
        private String enter_from;
        private String linkType;
        private String linkUrl;
        private String osVersion;
        private String packageName;
        private String trackId;
        private boolean canJump = true;
        private String callType = "NATIVE";

        public Builder appName(String str) {
            this.appName = str;
            return this;
        }

        public Builder appVersion(String str) {
            this.appVersion = str;
            return this;
        }

        public LinkInfo build() {
            LinkInfo linkInfo = new LinkInfo();
            linkInfo.linkType = this.linkType;
            linkInfo.linkUrl = this.linkUrl;
            linkInfo.appVersion = this.appVersion;
            linkInfo.osVersion = this.osVersion;
            linkInfo.appName = this.appName;
            linkInfo.packageName = this.packageName;
            linkInfo.enter_from = this.enter_from;
            linkInfo.callType = this.callType;
            linkInfo.trackId = this.trackId;
            linkInfo.canJump = this.canJump;
            return linkInfo;
        }

        public Builder callType(String str) {
            this.callType = str;
            return this;
        }

        public Builder canJump(boolean z) {
            this.canJump = z;
            return this;
        }

        public Builder enterFrom(String str) {
            this.enter_from = str;
            return this;
        }

        public Builder linkType(String str) {
            this.linkType = str;
            return this;
        }

        public Builder linkUrl(String str) {
            this.linkUrl = str;
            return this;
        }

        public Builder osVersion(String str) {
            this.osVersion = str;
            return this;
        }

        public Builder packageName(String str) {
            this.packageName = str;
            return this;
        }

        public Builder trackId(String str) {
            this.trackId = str;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void collectAndUpload(String str, String str2) {
        LinkMonitorManager.collectAndUpload(new LinkMonitorParam(this.linkUrl, this.trackId, str, str2));
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
            UCLogUtil.e(e2);
            collectAndUpload(StackTraceUtil.getStackTraceString(), e2.getMessage());
        }
    }

    private void openByOaps(final Context context, final String str) {
        new LinkCheckService().checkLink(context, new ILinkCheck.LinkCheckParam(this.packageName, this.linkUrl), new ILinkCheck.CheckCallback() { // from class: com.platform.usercenter.account.newcommon.router.LinkInfo.3
            @Override // com.platform.usercenter.account.newcommon.link_check.ILinkCheck.CheckCallback
            public void onFail(int i, String str2) {
                String str3 = "openByOaps checkLink code = " + i + "," + str2;
                UCLogUtil.d(LinkInfo.TAG, str3);
                LinkInfo.this.collectAndUpload(StackTraceUtil.getStackTraceString(), str3);
            }

            @Override // com.platform.usercenter.account.newcommon.link_check.ILinkCheck.CheckCallback
            public void onSuccess() {
                try {
                    RouterOapsWrapper.openOapsWithException(context, str, LinkInfo.this.trackId);
                } catch (Exception e2) {
                    UCLogUtil.e(LinkInfo.TAG, e2.getMessage());
                    LinkInfo.this.collectAndUpload(e2.getLocalizedMessage(), e2.getMessage());
                }
            }
        });
    }

    private void openDownload(Context context) {
        if (TextUtils.isEmpty(this.linkUrl)) {
            return;
        }
        if (MbaAgent.isRecoverLink(this.linkUrl)) {
            MbaAgent.recover(context, new RecoverParam(this.linkUrl), null);
        } else if (RouterOapsWrapper.isOapsLink(this.linkUrl)) {
            openByOaps(context, this.linkUrl);
        } else {
            openIntent(context);
        }
    }

    private void openH5(Context context) {
        try {
            UcRouterAgent.getInstance().getRouterService().openWebView(context, this.linkUrl);
        } catch (Exception e2) {
            UCLogUtil.e(TAG, e2);
            collectAndUpload(StackTraceUtil.getStackTraceString(), e2.getMessage());
        }
    }

    private void openInstalledApp(final Context context) {
        if (TextUtils.isEmpty(this.linkUrl) || !this.linkUrl.startsWith(RouterOapsWrapper.OAPS_PREFIX)) {
            new LinkCheckService().checkLink(context, new ILinkCheck.LinkCheckParam(this.packageName, this.linkUrl), new ILinkCheck.CheckCallback() { // from class: com.platform.usercenter.account.newcommon.router.LinkInfo.2
                @Override // com.platform.usercenter.account.newcommon.link_check.ILinkCheck.CheckCallback
                public void onFail(int i, String str) {
                    String str2 = "openInstalledApp code = " + i + ", " + str;
                    UCLogUtil.d(LinkInfo.TAG, str2);
                    LinkInfo.this.collectAndUpload(StackTraceUtil.getStackTraceString(), str2);
                }

                @Override // com.platform.usercenter.account.newcommon.link_check.ILinkCheck.CheckCallback
                public void onSuccess() {
                    try {
                        LinkInfo.this.openInstalledAppInner(context);
                    } catch (Exception e2) {
                        UCLogUtil.e(LinkInfo.TAG, e2);
                        LinkInfo.this.collectAndUpload(e2.getLocalizedMessage(), "openInstalledApp code = " + e2.getMessage());
                    }
                }
            });
        } else {
            openByOaps(context, this.linkUrl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openInstalledAppInner(Context context) throws URISyntaxException {
        Intent url2Intent = parseUrl2Intent(context);
        if (!StringUtil.isEmptyOrNull(this.enter_from)) {
            url2Intent.putExtra(LinkConstants.EXTRA_PARAM_ENTER_FROM, this.enter_from);
        }
        RouterIntentUtil.openInstalledApp(context, url2Intent, this.packageName);
    }

    private void openIntent(final Context context) {
        new LinkCheckService().checkLink(context, new ILinkCheck.LinkCheckParam(this.packageName, this.linkUrl), new ILinkCheck.CheckCallback() { // from class: com.platform.usercenter.account.newcommon.router.LinkInfo.1
            @Override // com.platform.usercenter.account.newcommon.link_check.ILinkCheck.CheckCallback
            public void onFail(int i, String str) {
                String str2 = "openIntent code = " + i + "," + str;
                UCLogUtil.d(LinkInfo.TAG, str2);
                LinkInfo.this.collectAndUpload(StackTraceUtil.getStackTraceString(), str2);
            }

            @Override // com.platform.usercenter.account.newcommon.link_check.ILinkCheck.CheckCallback
            public void onSuccess() {
                LinkInfo.this.openIntentInner(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openIntentInner(Context context) {
        try {
            Intent url2Intent = parseUrl2Intent(context);
            if (!StringUtil.isEmptyOrNull(this.enter_from)) {
                url2Intent.putExtra(LinkConstants.EXTRA_PARAM_ENTER_FROM, this.enter_from);
            }
            RouterIntentUtil.openIntentWithException(context, url2Intent, this.packageName);
        } catch (Exception e2) {
            UCLogUtil.e("openIntent", e2);
            collectAndUpload(e2.getLocalizedMessage(), "openIntentInner " + e2.getLocalizedMessage());
        }
    }

    private void openNative(Context context) {
        if (TextUtils.isEmpty(this.packageName)) {
            openIntent(context);
            return;
        }
        if (ApkInfoHelper.appExistByPkgName(context, this.packageName) || LinkInfoHelp.isMbaDisable(context, this.packageName)) {
            if (TextUtils.isEmpty(this.appVersion)) {
                openInstalledApp(context);
                return;
            }
            try {
                if (ApkInfoHelper.getVersionCode(context, this.packageName) >= Integer.parseInt(this.appVersion)) {
                    openInstalledApp(context);
                }
            } catch (Exception e2) {
                UCLogUtil.e(e2);
            }
        }
    }

    private Intent parseUrl2Intent(Context context) throws URISyntaxException {
        return "NATIVE".equals(this.callType) ? IntentWrapper.parseUri(this.linkUrl, 1) : IntentWrapper.parseUriSecurity(context, this.linkUrl, 1, this.packageName);
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

    public boolean isTypeInstant() {
        return TextUtils.equals(this.linkType, TYPE_INSTANT);
    }

    public boolean isTypeLocalWeb() {
        return TextUtils.equals(this.linkType, "WEBVIEW");
    }

    public boolean isTypeNative() {
        return TextUtils.equals(this.linkType, "NATIVE");
    }

    public void open(Context context) {
        if (isTypeDownload()) {
            openDownload(context);
            return;
        }
        if (TextUtils.isEmpty(this.linkUrl)) {
            return;
        }
        if (isTypeLocalWeb()) {
            openH5(context);
            return;
        }
        if (isTypeBrowser()) {
            openBrowser(context);
            return;
        }
        if (isTypeNative()) {
            openNative(context);
            return;
        }
        if (!isTypeInstant()) {
            openIntent(context);
            return;
        }
        IRouterService routerService = UcRouterAgent.getInstance().getRouterService();
        if (routerService != null) {
            routerService.openInstant(context.getApplicationContext(), this.linkUrl, getInstantScence());
        }
    }

    public void setInstantScence(String str) {
        this.instantScence = str;
    }
}
