package com.platform.usercenter.account.newcommon.link_check;

import android.content.Context;
import android.graphics.drawable.Icon;
import androidx.annotation.StringRes;
import com.oplus.aiunit.vision.x0;
import com.platform.usercenter.account.api.provider.IPublicServiceProvider;
import com.platform.usercenter.account.api.route.PublicServiceRouter;
import com.platform.usercenter.account.mba.IResultCallback;
import com.platform.usercenter.account.mba.OutsideApk;
import com.platform.usercenter.bizuws.R;
import com.platform.usercenter.tools.ApkInfoHelper;
import com.platform.usercenter.tools.datastructure.StringUtil;
import com.platform.usercenter.tools.log.UCLogUtil;
import com.platform.usercenter.tools.ui.BitmapHelper;

/* JADX INFO: loaded from: classes9.dex */
public class LinkCheckService implements ILinkCheck {
    private static final String TAG = "LinkCheckService";

    private void callMbaSdk(Context context, ILinkCheck.LinkCheckParam linkCheckParam, final ILinkCheck.CheckCallback checkCallback) {
        boolean zIsForeground;
        String appName = ApkInfoHelper.getAppName(context, linkCheckParam.pkgName);
        try {
            IPublicServiceProvider iPublicServiceProvider = (IPublicServiceProvider) x0.d().b(PublicServiceRouter.PUBLIC_SERVICE_PROVIDER_PATH).navigation();
            zIsForeground = iPublicServiceProvider != null ? iPublicServiceProvider.isForeground() : true;
        } catch (Throwable th) {
            UCLogUtil.i(TAG, th.getMessage());
        }
        new OutsideApk.Builder(context).setNotification(true ^ zIsForeground).setIcon(!zIsForeground ? Icon.createWithBitmap(BitmapHelper.drawableToBitmap(ApkInfoHelper.getPackageIcon(context, context.getPackageName()))) : null).setTitle(!StringUtil.isEmpty(linkCheckParam.title) ? linkCheckParam.title : getString(context, R.string.uc_biz_mba_title, appName)).setMessage(!StringUtil.isEmpty(linkCheckParam.content) ? linkCheckParam.content : getString(context, R.string.uc_biz_mba_alert_common, appName, appName)).forceEnabled(linkCheckParam.pkgName).resultCallback(new IResultCallback() { // from class: com.platform.usercenter.account.newcommon.link_check.LinkCheckService.1
            @Override // com.platform.usercenter.account.mba.IResultCallback
            public void err(int i, String str) {
                checkCallback.onFail(i, str);
            }

            @Override // com.platform.usercenter.account.mba.IResultCallback
            public void onOpenView() {
                checkCallback.onSuccess();
            }
        }).build().launch();
    }

    private String getString(Context context, @StringRes int i, Object... objArr) {
        return context.getResources().getString(i, objArr);
    }

    @Override // com.platform.usercenter.account.newcommon.link_check.ILinkCheck
    public void checkLink(Context context, ILinkCheck.LinkCheckParam linkCheckParam, ILinkCheck.CheckCallback checkCallback) {
        if (context == null || linkCheckParam == null || checkCallback == null) {
            return;
        }
        if (StringUtil.isEmpty(linkCheckParam.pkgName)) {
            checkCallback.onSuccess();
        } else {
            callMbaSdk(context, linkCheckParam, checkCallback);
        }
    }
}
