package com.platform.usercenter.account.mba.recovery;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.platform.usercenter.account.mba.IResultCallback;
import com.platform.usercenter.account.mba.MbaConstant;
import com.platform.usercenter.account.mba.entity.RecoverParam;
import com.platform.usercenter.account.mba.entity.RecoverTypeEnum;
import com.platform.usercenter.account.mba.entity.RecoveryPkgInfo;
import com.platform.usercenter.account.mba.util.MbaDeviceBrandUtil;
import com.platform.usercenter.account.mba.util.MbaIntentUtil;
import com.platform.usercenter.account.mba.util.MbaIntentWrapper;
import com.platform.usercenter.bizuws.R;
import com.platform.usercenter.tools.ApkInfoHelper;
import com.platform.usercenter.tools.datastructure.StringUtil;
import com.platform.usercenter.tools.log.UCLogUtil;
import com.platform.usercenter.tools.os.UCRuntimeEnvironment;
import com.platform.usercenter.tools.os.Version;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class RecoveryManager {
    private static volatile RecoveryManager INSTANCE = null;
    private static final String TAG = "RecoveryManager";
    private Reference<IResultCallback> autoOpenCallback;
    private String autoOpenText;
    private Set<Reference<IResultCallback>> callbackSet;

    public static Uri buildRecoveryDplink(String str, Integer num) {
        Uri.Builder builderPath = new Uri.Builder().scheme("account").authority("platform.usercenter.com").path("recovery");
        if (!StringUtil.isEmpty(str)) {
            builderPath.appendQueryParameter("packageName", str);
        }
        if (num != null) {
            builderPath.appendQueryParameter(MbaConstant.RECOVERY_DP_LINK_KEY_MIN_VER, String.valueOf(num));
        }
        return builderPath.build();
    }

    public static RecoveryManager getInstance() {
        if (INSTANCE == null) {
            synchronized (RecoveryManager.class) {
                if (INSTANCE == null) {
                    INSTANCE = new RecoveryManager();
                }
            }
        }
        return INSTANCE;
    }

    public static boolean isPkgUninstall(Context context, String str) {
        UCRuntimeEnvironment.init(context);
        if (!MbaDeviceBrandUtil.isOplusBrand() || UCRuntimeEnvironment.sIsExp || !Version.hasR()) {
            return false;
        }
        if (StringUtil.isEmpty(str) || MbaConstant.RECOVERY_DEFAULT_PKG.equals(str)) {
            return StringUtil.isEmpty(ApkInfoHelper.getUcPackage(context));
        }
        return ApkInfoHelper.getVersionCode(context, str) == 0;
    }

    public static boolean isRecoverLink(String str) {
        if (StringUtil.isEmpty(str)) {
            return false;
        }
        return str.startsWith(buildRecoveryDplink(null, null).toString());
    }

    private boolean jump2AccountInstall(Context context, RecoverParam recoverParam, boolean z) {
        try {
            Intent uriSecurity = MbaIntentWrapper.parseUriSecurity(context, !StringUtil.isEmpty(recoverParam.getDplink()) ? recoverParam.getDplink() : buildRecoveryDplink(recoverParam.pkg, Integer.valueOf(recoverParam.minVersion)).toString(), 1);
            if (uriSecurity == null) {
                return false;
            }
            uriSecurity.putExtra("from_pkg", context.getPackageName());
            uriSecurity.putExtra("is_block", z);
            MbaIntentUtil.openInstalledApp(context, uriSecurity, null);
            return true;
        } catch (Exception e2) {
            UCLogUtil.e(TAG, e2.getMessage());
            return false;
        }
    }

    private void notifyFail(int i, String str, Iterator<Reference<IResultCallback>> it) {
        this.autoOpenCallback = null;
        while (it.hasNext()) {
            Reference<IResultCallback> next = it.next();
            if (next != null && next.get() != null) {
                next.get().onFail(i, str);
            }
            it.remove();
        }
    }

    private void notifyInstalling(int i, String str, Iterator<Reference<IResultCallback>> it) {
        while (it.hasNext()) {
            Reference<IResultCallback> next = it.next();
            if (next != null && next.get() != null) {
                next.get().onLoading(i, str);
            }
        }
    }

    private void notifySuccess(Iterator<Reference<IResultCallback>> it) {
        Reference<IResultCallback> reference = this.autoOpenCallback;
        if (reference != null && reference.get() != null) {
            this.autoOpenCallback.get().onLoading(MbaConstant.RECOVERY_SNACK_OPEN, this.autoOpenText);
            this.autoOpenCallback = null;
        }
        while (it.hasNext()) {
            Reference<IResultCallback> next = it.next();
            if (next != null && next.get() != null) {
                next.get().onSuccess();
            }
            it.remove();
        }
    }

    public void addRecoverCallback(IResultCallback iResultCallback) {
        if (iResultCallback == null) {
            return;
        }
        if (this.callbackSet == null) {
            this.callbackSet = new LinkedHashSet();
        }
        this.callbackSet.add(new SoftReference(iResultCallback));
    }

    public void installApk(Context context, RecoverParam recoverParam, boolean z, IResultCallback iResultCallback) {
        if (recoverParam.autoOpen) {
            RecoveryPkgInfo memberAppInfoForProvider = RecoveryProviderHelper.getMemberAppInfoForProvider(context, recoverParam.pkg);
            if (memberAppInfoForProvider != null && memberAppInfoForProvider.success) {
                this.autoOpenText = context.getString(R.string.mba_recovery_install_success_open, memberAppInfoForProvider.appName);
            }
            this.autoOpenCallback = new SoftReference(iResultCallback);
        } else {
            this.autoOpenCallback = null;
        }
        if (jump2AccountInstall(context, recoverParam, z)) {
            return;
        }
        UCLogUtil.e(TAG, "link error");
        iResultCallback.onFail(MbaConstant.RECOVERY_LINK_FAIL, "link error");
    }

    public void notify(int i, String str) {
        Set<Reference<IResultCallback>> set = this.callbackSet;
        if (set == null) {
            return;
        }
        Iterator<Reference<IResultCallback>> it = set.iterator();
        if (i == 1000) {
            notifySuccess(it);
        } else if (i == 1001) {
            notifyInstalling(i, str, it);
        } else {
            notifyFail(i, str, it);
        }
    }

    public void recover(Context context, RecoverParam recoverParam, IResultCallback iResultCallback) {
        if (!isPkgUninstall(context, recoverParam.pkg)) {
            UCLogUtil.d(TAG, "not uninstall scene, cannot show recovery guide");
            iResultCallback.onFail(MbaConstant.RECOVERY_NOT_UNINSTALL, "not uninstall scene, cannot show recovery guide");
            return;
        }
        if (!(context instanceof FragmentActivity)) {
            UCLogUtil.e(TAG, "context must be FragmentActivity");
            iResultCallback.onFail(MbaConstant.RECOVERY_PARAM_ERROR, "context must be FragmentActivity");
            return;
        }
        FragmentActivity fragmentActivity = (FragmentActivity) context;
        if (fragmentActivity.getSupportFragmentManager().findFragmentByTag(MbaConstant.RECOVER_EMPTY_FRAGMENT_KEY) == null) {
            fragmentActivity.getSupportFragmentManager().beginTransaction().add(new RecoveryEmptyFragment(), MbaConstant.RECOVER_EMPTY_FRAGMENT_KEY).commitAllowingStateLoss();
        }
        addRecoverCallback(iResultCallback);
        RecoveryPkgInfo memberAppInfoForProvider = RecoveryProviderHelper.getMemberAppInfoForProvider(context, recoverParam.pkg);
        if (memberAppInfoForProvider == null) {
            UCLogUtil.e(TAG, "cannot get pkg info");
            getInstance().notify(MbaConstant.RECOVERY_REQUEST_PKG_FAIL, "cannot get pkg info");
        } else {
            if (!memberAppInfoForProvider.success) {
                UCLogUtil.e(TAG, "cannot get pkg info");
                getInstance().notify(memberAppInfoForProvider.resultCode, "cannot get pkg info");
                return;
            }
            RecoverTypeEnum recoverTypeEnum = recoverParam.recoverTypeEnum;
            if (recoverTypeEnum == RecoverTypeEnum.SNACK_BAR_GUIDE) {
                RecoverySnackBar.show(context, recoverParam, memberAppInfoForProvider, iResultCallback);
            } else {
                installApk(context, recoverParam, recoverTypeEnum == RecoverTypeEnum.BLOCK_INSTALL, iResultCallback);
            }
        }
    }
}
