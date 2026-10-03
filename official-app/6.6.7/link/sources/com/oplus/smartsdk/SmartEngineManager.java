package com.oplus.smartsdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.oplus.smartsdk.themecard.ViewApiDelegate;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class SmartEngineManager {
    private final Context mHostContext;
    private ISmartViewApi mSmartViewApi;
    public static final ExecutorService SINGLE_THREAD_POOL = Executors.newSingleThreadExecutor();
    public static final Handler MAIN_HANDLER = new Handler(Looper.getMainLooper());

    public SmartEngineManager(Context context) {
        this.mHostContext = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getSmartApi$0(SmartAPICallback smartAPICallback) {
        if (this.mSmartViewApi == null) {
            this.mSmartViewApi = new ViewApiDelegate();
        }
        smartAPICallback.onCall(this.mSmartViewApi);
    }

    public Context getHostContext() {
        return this.mHostContext;
    }

    @Nullable
    public ISmartViewApi getSmartApi() {
        return this.mSmartViewApi;
    }

    public void getSmartApi(final SmartAPICallback smartAPICallback) {
        if (smartAPICallback != null) {
            SINGLE_THREAD_POOL.execute(new Runnable() { // from class: com.oplus.aiunit.vision.bwh
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.lambda$getSmartApi$0(smartAPICallback);
                }
            });
        }
    }
}
