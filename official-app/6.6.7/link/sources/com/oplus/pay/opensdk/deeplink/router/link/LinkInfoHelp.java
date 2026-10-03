package com.oplus.pay.opensdk.deeplink.router.link;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.ace;
import com.oplus.aiunit.vision.efa;
import com.oplus.aiunit.vision.i80;
import com.oplus.aiunit.vision.izd;
import com.oplus.aiunit.vision.u4j;
import com.oplus.pay.opensdk.deeplink.router.link.data.LinkDataAccount;
import com.oplus.pay.opensdk.deeplink.router.link.data.LinkInfo;
import java.net.URISyntaxException;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
public class LinkInfoHelp {
    private static final String TAG = "LinkInfoHelp";

    private static LinkInfo buildDownloadLink(Context context, LinkDataAccount linkDataAccount, LinkInfo.a aVar) {
        return aVar.e(LinkInfo.TYPE_DOWNLOAD).f(linkDataAccount.getDownloadUrl()).c(canJumpLink(context, "", linkDataAccount.getDownloadUrl())).b();
    }

    private static LinkInfo buildLinkInfo(LinkInfo.a aVar, LinkDataAccount.LinkDetail linkDetail) {
        return aVar.e(linkDetail.getLinkType()).g(linkDetail.getPackageName()).a(linkDetail.getAppVersion()).f(linkDetail.getLinkUrl()).d(linkDetail.getEnter_from()).b();
    }

    private static boolean canJumpLink(Context context, String str, String str2) {
        if (u4j.a(str) || !isMbaDisable(context, str)) {
            return isUriResolvable(context, str2);
        }
        return false;
    }

    public static boolean checkInstalledApp(Context context, String str, String str2) {
        try {
            int i = 0;
            if (isEmptyPkg(context, str)) {
                return false;
            }
            if (!i80.a(context, str)) {
                return isMbaDisable(context, str);
            }
            int iD = i80.d(context, str);
            if (!TextUtils.isEmpty(str2)) {
                try {
                    i = Integer.parseInt(str2);
                } catch (NumberFormatException e) {
                    ace.d(e.getMessage());
                }
            }
            if (iD >= i) {
                return true;
            }
        } catch (Exception e2) {
            ace.d(e2.getMessage());
        }
        return isMbaDisable(context, str);
    }

    public static LinkInfo getLinkInfoFromAccount(Context context, LinkDataAccount linkDataAccount) {
        if (linkDataAccount == null) {
            ace.e("getLinkInfoFromAccount linkDataAccount = null");
            return null;
        }
        LinkInfo.a aVar = new LinkInfo.a();
        aVar.h(linkDataAccount.getTrackId());
        List<LinkDataAccount.LinkDetail> linkDetail = linkDataAccount.getLinkDetail();
        if (linkDetail != null) {
            for (LinkDataAccount.LinkDetail linkDetail2 : linkDetail) {
                if (!TextUtils.isEmpty(linkDetail2.getLinkUrl())) {
                    if (!TextUtils.equals(linkDetail2.getLinkType(), LinkInfo.TYPE_NATIVE)) {
                        return aVar.e(linkDetail2.getLinkType()).f(linkDetail2.getLinkUrl()).c(true).b();
                    }
                    boolean zCanJumpLink = canJumpLink(context, linkDetail2.getPackageName(), linkDetail2.getLinkUrl());
                    if (isPureDplinkAndCanJump(linkDetail2.getLinkType(), zCanJumpLink) || (checkInstalledApp(context, linkDetail2.getPackageName(), linkDetail2.getAppVersion()) && zCanJumpLink)) {
                        aVar.c(zCanJumpLink);
                        return buildLinkInfo(aVar, linkDetail2);
                    }
                }
            }
        }
        if (TextUtils.isEmpty(linkDataAccount.getDownloadUrl())) {
            ace.e("getLinkInfoFromAccount return null");
            return null;
        }
        aVar.c(canJumpLink(context, "", linkDataAccount.getDownloadUrl()));
        return buildDownloadLink(context, linkDataAccount, aVar);
    }

    public static boolean isDownLink(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("oap");
    }

    public static boolean isEmptyPkg(Context context, String str) {
        Bundle bundleB = i80.b(context, str);
        if (bundleB != null) {
            return bundleB.getBoolean("is_empty", false);
        }
        return false;
    }

    public static boolean isMbaDisable(Context context, String str) {
        Boolean boolA = izd.a(context, str);
        if (boolA == null) {
            return false;
        }
        return !boolA.booleanValue();
    }

    private static boolean isPureDplinkAndCanJump(String str, boolean z) {
        return u4j.a(str) && z;
    }

    private static boolean isUriResolvable(Context context, String str) {
        try {
            return context.getPackageManager().resolveActivity(efa.a(str, 1), 0) != null;
        } catch (URISyntaxException e) {
            ace.d(e.getMessage());
            return false;
        }
    }
}
