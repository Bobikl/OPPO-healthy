package com.platform.usercenter.account.router.wrapper;

import android.content.Context;
import androidx.annotation.WorkerThread;
import com.cdo.oaps.api.GCOaps;
import com.cdo.oaps.api.Oaps;
import com.cdo.oaps.api.callback.Callback;
import com.platform.usercenter.BaseApp;
import com.platform.usercenter.account.router.monitor.LinkMonitorManager;
import com.platform.usercenter.account.router.monitor.LinkMonitorParam;
import com.platform.usercenter.account.router.util.RouterIntentUtil;
import com.platform.usercenter.account.router.wrapper.RouterOapsWrapper;
import com.platform.usercenter.bizuws.R;
import com.platform.usercenter.tools.log.UCLogUtil;
import com.platform.usercenter.tools.os.Version;
import com.platform.usercenter.tools.thread.BackgroundExecutor;
import com.platform.usercenter.tools.ui.CustomToast;
import java.net.URISyntaxException;

/* JADX INFO: loaded from: classes9.dex */
public class RouterOapsWrapper {
    public static final String OAPS_PREFIX = "oap";
    private static final String TAG = "OapsWrapper";

    /* JADX INFO: renamed from: com.platform.usercenter.account.router.wrapper.RouterOapsWrapper$1, reason: invalid class name */
    public class AnonymousClass1 extends Callback {
        final /* synthetic */ String val$trackId;
        final /* synthetic */ String val$url;

        public AnonymousClass1(String str, String str2) {
            this.val$url = str;
            this.val$trackId = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onResponse$0(Callback.Response response, String str, String str2) {
            if (response.getCode() == -9) {
                Context context = BaseApp.mContext;
                CustomToast.showToast(context, context.getString(R.string.jump_failed));
            }
            try {
                RouterIntentUtil.openIntent(BaseApp.mContext, IntentWrapper.parseUri(str, 1), null);
            } catch (Exception e2) {
                UCLogUtil.e(RouterOapsWrapper.TAG, e2);
                LinkMonitorManager.collectAndUpload(new LinkMonitorParam(str, str2, "", response.getCode() + " " + e2.getMessage()));
            }
        }

        public void onResponse(final Callback.Response response) {
            if (response == null || response.getCode() == 1) {
                return;
            }
            final String str = this.val$url;
            final String str2 = this.val$trackId;
            BackgroundExecutor.runOnUiThread(new Runnable() { // from class: com.platform.usercenter.account.router.wrapper.a
                @Override // java.lang.Runnable
                public final void run() {
                    RouterOapsWrapper.AnonymousClass1.lambda$onResponse$0(response, str, str2);
                }
            });
        }
    }

    public static void initOaps(String str, String str2) {
        try {
            Oaps.init(str, str2);
        } catch (Throwable th) {
            UCLogUtil.i(TAG, th.getMessage());
        }
    }

    public static boolean isOapsLink(String str) {
        return (str == null || str.startsWith("oaps://theme") || str.startsWith("oaps://mk") || !isOapsLinkReal(str) || Version.hasQ()) ? false : true;
    }

    private static boolean isOapsLinkReal(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith(OAPS_PREFIX);
    }

    @WorkerThread
    public static void openOaps(Context context, String str) {
        try {
            openOapsWithException(context, str, "");
        } catch (URISyntaxException e2) {
            UCLogUtil.e(TAG, e2);
        }
    }

    public static void openOapsWithException(final Context context, final String str, final String str2) throws URISyntaxException {
        if (str.startsWith("oaps://theme") || str.startsWith("oaps://mk")) {
            RouterIntentUtil.openIntent(context, IntentWrapper.parseUri(str, 1), null);
        } else {
            BackgroundExecutor.runOnWorkThread(new Runnable() { // from class: com.oplus.aiunit.vision.lzf
                @Override // java.lang.Runnable
                public final void run() {
                    RouterOapsWrapper.startOaps(context, str, str2);
                }
            });
        }
    }

    private static boolean startOaps(Context context, String str) {
        return startOaps(context, str, "");
    }

    private static void startOapsInner(String str, String str2) {
        GCOaps.startOaps(BaseApp.mContext, str, (String) null, new AnonymousClass1(str, str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean startOaps(Context context, String str, String str2) {
        try {
            startOapsInner(str, str2);
            return true;
        } catch (Throwable th) {
            UCLogUtil.e(TAG, th.getMessage());
            return false;
        }
    }
}
