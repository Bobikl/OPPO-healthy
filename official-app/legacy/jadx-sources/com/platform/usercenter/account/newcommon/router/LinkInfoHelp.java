package com.platform.usercenter.account.newcommon.router;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.platform.usercenter.account.mba.OutsideApk;
import com.platform.usercenter.account.proxy.entity.LinkDataAccount;
import com.platform.usercenter.account.router.wrapper.IntentWrapper;
import com.platform.usercenter.account.router.wrapper.RouterOapsWrapper;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.tools.ApkInfoHelper;
import com.platform.usercenter.tools.datastructure.StringUtil;
import com.platform.usercenter.tools.log.UCLogUtil;
import java.net.URISyntaxException;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class LinkInfoHelp {
    private static final String TAG = "LinkInfoHelp";

    private static LinkInfo buildDownloadLink(Context context, LinkDataAccount linkDataAccount, LinkInfo.Builder builder) {
        return builder.linkType("DOWNLOAD").linkUrl(linkDataAccount.downloadUrl).canJump(canJumpLink(context, "", linkDataAccount.downloadUrl)).build();
    }

    private static LinkInfo buildLinkInfo(LinkInfo.Builder builder, LinkDataAccount.LinkDetail linkDetail) {
        return builder.linkType(linkDetail.linkType).packageName(linkDetail.packageName).appVersion(linkDetail.appVersion).linkUrl(linkDetail.linkUrl).enterFrom(linkDetail.enter_from).build();
    }

    private static boolean canJumpLink(Context context, String str, String str2) {
        if (!StringUtil.isEmpty(str) && isMbaDisable(context, str)) {
            return true;
        }
        try {
            return context.getPackageManager().resolveActivity(IntentWrapper.parseUri(str2, 1), 0) != null;
        } catch (URISyntaxException e2) {
            UCLogUtil.e(TAG, e2);
            return false;
        }
    }

    public static boolean checkInstalledApp(Context context, String str, String str2) {
        try {
            int i = 0;
            if (isEmptyPkg(context, str)) {
                return false;
            }
            if (!ApkInfoHelper.appExistByPkgName(context, str)) {
                return isMbaDisable(context, str);
            }
            int versionCode = ApkInfoHelper.getVersionCode(context, str);
            if (!TextUtils.isEmpty(str2)) {
                try {
                    i = Integer.parseInt(str2);
                } catch (NumberFormatException e2) {
                    UCLogUtil.e(e2);
                }
            }
            if (versionCode >= i) {
                return true;
            }
        } catch (Exception e3) {
            UCLogUtil.e(e3);
        }
        return isMbaDisable(context, str);
    }

    public static LinkInfo getLinkInfoFromAccount(Context context, LinkDataAccount linkDataAccount) {
        if (linkDataAccount == null) {
            UCLogUtil.w(TAG, "getLinkInfoFromAccount linkDataAccount = null");
            return null;
        }
        LinkInfo.Builder builder = new LinkInfo.Builder();
        builder.trackId(linkDataAccount.trackId);
        List<LinkDataAccount.LinkDetail> list = linkDataAccount.linkDetail;
        if (list != null) {
            for (LinkDataAccount.LinkDetail linkDetail : list) {
                if (!TextUtils.isEmpty(linkDetail.linkUrl)) {
                    if (!TextUtils.equals(linkDetail.linkType, "NATIVE")) {
                        return builder.linkType(linkDetail.linkType).linkUrl(linkDetail.linkUrl).canJump(true).build();
                    }
                    boolean zCanJumpLink = canJumpLink(context, linkDetail.packageName, linkDetail.linkUrl);
                    if (isPureDplink(linkDetail.packageName, zCanJumpLink) || checkInstalledApp(context, linkDetail.packageName, linkDetail.appVersion)) {
                        builder.canJump(zCanJumpLink);
                        return buildLinkInfo(builder, linkDetail);
                    }
                }
            }
        }
        if (TextUtils.isEmpty(linkDataAccount.downloadUrl)) {
            UCLogUtil.w(TAG, "getLinkInfoFromAccount return null");
            return null;
        }
        builder.canJump(canJumpLink(context, "", linkDataAccount.downloadUrl));
        return buildDownloadLink(context, linkDataAccount, builder);
    }

    public static boolean isDownLink(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith(RouterOapsWrapper.OAPS_PREFIX);
    }

    public static boolean isEmptyPkg(Context context, String str) {
        Bundle metaData = ApkInfoHelper.getMetaData(context, str);
        if (metaData != null) {
            return metaData.getBoolean("is_empty", false);
        }
        return false;
    }

    public static boolean isMbaDisable(Context context, String str) {
        Boolean boolIsPkgEnabled = OutsideApk.isPkgEnabled(context, str);
        return (boolIsPkgEnabled == null || boolIsPkgEnabled.booleanValue()) ? false : true;
    }

    private static boolean isPureDplink(String str, boolean z) {
        if (StringUtil.isEmpty(str)) {
            return z;
        }
        return false;
    }
}
