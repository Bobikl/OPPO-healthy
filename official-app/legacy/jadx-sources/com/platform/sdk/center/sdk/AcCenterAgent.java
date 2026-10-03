package com.platform.sdk.center.sdk;

import android.content.Context;
import android.net.Uri;
import com.accountcenter.b;
import com.accountcenter.i;
import com.accountcenter.r;
import com.oplus.aiunit.vision.jea;
import com.platform.sdk.center.dispatcher.IAcCommunicationDispatcher;
import com.platform.sdk.center.dispatcher.IAcMBADispatcher;
import com.platform.sdk.center.pay.PayTaskCallback;
import com.platform.sdk.center.preload.ILocationCallback;
import com.platform.sdk.center.sdk.image.IImageLoad;
import com.platform.sdk.center.sdk.instant.AcIInstantDispatcher;
import com.platform.sdk.center.sdk.mvvm.model.net.callback.AcAccountResultCallback;
import com.platform.sdk.center.sdk.mvvm.model.net.callback.IAcInfoAndPrivilegeResultCallback;
import com.platform.sdk.center.sdk.oaps.UCIOapsDispatcher;
import com.platform.sdk.center.sdk.statistics.UCIStatisticsDispatcher;
import com.platform.usercenter.BaseApp;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.tools.os.UCRuntimeEnvironment;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AcCenterAgent {
    private static boolean isFirstPreloadData = true;
    private static boolean isFirstPreloadRes = true;
    private static AcAgentInterface mAgentDelegate = new b();

    @Keep
    public static class Builder {
        private String mAppCode;
        private final Context mContext;
        private IImageLoad mIImageLoad;
        private IAcCommunicationDispatcher mIVipCommunicationDispatcher;
        private AcIInstantDispatcher mInstantDispatcher;
        private jea[] mInterceptor;
        private ILocationCallback mLocationCallback;
        private UCIOapsDispatcher mOapsDispatcher;
        private String mProductCode;
        private UCIStatisticsDispatcher mStatisticsDispatcher;
        private IAcMBADispatcher mVipMBADispatcher;

        public Builder(Context context) {
            this.mContext = context;
        }

        public void build() {
            BaseApp.init(this.mContext);
            AcCenterAgent.mAgentDelegate.setParallelEnable(false);
            AcCenterAgent.mAgentDelegate.setPreloadResEnable(!UCRuntimeEnvironment.sIsExp);
            AcCenterAgent.mAgentDelegate.regist(this.mContext, this.mAppCode, this.mProductCode, this.mLocationCallback).setImageLoadDispatcher(this.mIImageLoad).setInstantDispatcher(this.mInstantDispatcher).setOapsDispatcher(this.mOapsDispatcher).setCommunicationDispatcher(this.mIVipCommunicationDispatcher).setStatisticsDispatcher(this.mStatisticsDispatcher);
            i iVar = i.f483c;
            IAcMBADispatcher iAcMBADispatcher = this.mVipMBADispatcher;
            if (iAcMBADispatcher != null) {
                iVar.b = iAcMBADispatcher;
            }
        }

        public Builder setAppCode(String str) {
            this.mAppCode = str;
            return this;
        }

        public Builder setCommunicationDispatcher(IAcCommunicationDispatcher iAcCommunicationDispatcher) {
            this.mIVipCommunicationDispatcher = iAcCommunicationDispatcher;
            return this;
        }

        public Builder setHttpInterceptor(jea... jeaVarArr) {
            if (jeaVarArr != null && jeaVarArr.length > 0) {
                this.mInterceptor = jeaVarArr;
            }
            return this;
        }

        public Builder setImageLoadDispatcher(IImageLoad iImageLoad) {
            this.mIImageLoad = iImageLoad;
            return this;
        }

        public Builder setInstantDispatcher(AcIInstantDispatcher acIInstantDispatcher) {
            this.mInstantDispatcher = acIInstantDispatcher;
            return this;
        }

        public Builder setLocationCallback(ILocationCallback iLocationCallback) {
            this.mLocationCallback = iLocationCallback;
            return this;
        }

        public Builder setOapsDispatcher(UCIOapsDispatcher uCIOapsDispatcher) {
            this.mOapsDispatcher = uCIOapsDispatcher;
            return this;
        }

        public Builder setProductCode(String str) {
            this.mProductCode = str;
            return this;
        }

        public Builder setStatisticsDispatcher(UCIStatisticsDispatcher uCIStatisticsDispatcher) {
            this.mStatisticsDispatcher = uCIStatisticsDispatcher;
            return this;
        }

        public Builder setVipMBADispatcher(IAcMBADispatcher iAcMBADispatcher) {
            this.mVipMBADispatcher = iAcMBADispatcher;
            return this;
        }
    }

    public static r getPreloadResStatistic() {
        return mAgentDelegate.getPreloadResStatistic();
    }

    public static void getVipAccount(Context context, boolean z, AcAccountResultCallback acAccountResultCallback) {
        mAgentDelegate.getVipAccount(context, z, acAccountResultCallback);
    }

    public static void getVipAndPrivilegeListInfo(Context context, String str, IAcInfoAndPrivilegeResultCallback iAcInfoAndPrivilegeResultCallback) {
        mAgentDelegate.getVipAndPrivilegeListInfo(context, str, iAcInfoAndPrivilegeResultCallback);
    }

    public static void openBuyVipPage(Context context, PayTaskCallback payTaskCallback) {
        mAgentDelegate.openBuyVipPage(context, payTaskCallback);
    }

    public static void refreshParallelConfig() {
        mAgentDelegate.refreshParallelConfig();
    }

    public static void refreshParallelConfigOnce() {
        if (!isFirstPreloadData || UCRuntimeEnvironment.sIsExp) {
            return;
        }
        isFirstPreloadData = false;
        mAgentDelegate.refreshParallelConfig();
    }

    public static void refreshPreloadRes() {
        mAgentDelegate.refreshPreloadRes();
    }

    public static void refreshPreloadResOnce() {
        if (!isFirstPreloadRes || UCRuntimeEnvironment.sIsExp) {
            return;
        }
        isFirstPreloadRes = false;
        mAgentDelegate.refreshPreloadRes();
    }

    @Deprecated
    public static AcAgentInterface regist(Context context, String str) {
        return mAgentDelegate.regist(context, str);
    }

    public static void reqSignInVipAccount(Context context, boolean z, AcAccountResultCallback acAccountResultCallback) {
        mAgentDelegate.reqSignInVipAccount(context, z, acAccountResultCallback);
    }

    public static void setParallelEnable(boolean z) {
        mAgentDelegate.setParallelEnable(z);
    }

    public static void setPreloadResEnable(boolean z) {
        mAgentDelegate.setPreloadResEnable(z);
    }

    public static void startLinkActivity(Context context, Uri uri) {
        mAgentDelegate.startLinkActivity(context, uri);
    }

    public static void startMain(Context context) {
        mAgentDelegate.startMain(context);
    }
}
