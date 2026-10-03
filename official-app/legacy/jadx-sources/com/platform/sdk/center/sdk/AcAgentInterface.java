package com.platform.sdk.center.sdk;

import android.content.Context;
import android.net.Uri;
import com.accountcenter.r;
import com.platform.sdk.center.dispatcher.IAcCommunicationDispatcher;
import com.platform.sdk.center.pay.PayTaskCallback;
import com.platform.sdk.center.preload.ILocationCallback;
import com.platform.sdk.center.sdk.image.IImageLoad;
import com.platform.sdk.center.sdk.instant.AcIInstantDispatcher;
import com.platform.sdk.center.sdk.mvvm.model.net.callback.AcAccountResultCallback;
import com.platform.sdk.center.sdk.mvvm.model.net.callback.IAcInfoAndPrivilegeResultCallback;
import com.platform.sdk.center.sdk.oaps.UCIOapsDispatcher;
import com.platform.sdk.center.sdk.statistics.UCIStatisticsDispatcher;

/* JADX INFO: loaded from: classes9.dex */
public interface AcAgentInterface {
    r getPreloadResStatistic();

    void getVipAccount(Context context, boolean z, AcAccountResultCallback acAccountResultCallback);

    void getVipAndPrivilegeListInfo(Context context, String str, IAcInfoAndPrivilegeResultCallback iAcInfoAndPrivilegeResultCallback);

    void openBuyVipPage(Context context, PayTaskCallback payTaskCallback);

    void refreshParallelConfig();

    void refreshPreloadRes();

    AcAgentInterface regist(Context context, String str);

    AcAgentInterface regist(Context context, String str, String str2, ILocationCallback iLocationCallback);

    void reqSignInVipAccount(Context context, boolean z, AcAccountResultCallback acAccountResultCallback);

    AcAgentInterface setCommunicationDispatcher(IAcCommunicationDispatcher iAcCommunicationDispatcher);

    AcAgentInterface setImageLoadDispatcher(IImageLoad iImageLoad);

    AcAgentInterface setInstantDispatcher(AcIInstantDispatcher acIInstantDispatcher);

    AcAgentInterface setOapsDispatcher(UCIOapsDispatcher uCIOapsDispatcher);

    void setParallelEnable(boolean z);

    void setPreloadResEnable(boolean z);

    AcAgentInterface setStatisticsDispatcher(UCIStatisticsDispatcher uCIStatisticsDispatcher);

    void startLinkActivity(Context context, Uri uri);

    void startMain(Context context);
}
