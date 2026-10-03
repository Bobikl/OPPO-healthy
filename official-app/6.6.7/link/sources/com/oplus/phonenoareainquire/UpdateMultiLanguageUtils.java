package com.oplus.phonenoareainquire;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.oplus.aiunit.vision.g3e;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import com.oplus.phonenoareainquire.service.OplusLocaleChangeJobIntentService;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\f"}, d2 = {"Lcom/oplus/phonenoareainquire/UpdateMultiLanguageUtils;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", TraceConstants.KEY_ACTION, "", "onReceive", "<init>", "()V", "Companion", "a", "contactnetnumber_impl_thirdRelease"}, k = 1, mv = {1, 8, 0})
public final class UpdateMultiLanguageUtils extends BroadcastReceiver {

    @NotNull
    public static final String TAG = "UpdateMultiLanguageUtils";

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, TraceConstants.KEY_ACTION);
        g3e.a(TAG, "start update the table in OplusLocaleChangeJobIntentService");
        OplusLocaleChangeJobIntentService.INSTANCE.a(context, intent);
    }
}
