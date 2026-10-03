package com.health.health_seedlingcard.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.oplus.aiunit.vision.fdg;
import com.oplus.aiunit.vision.jug;
import com.oplus.aiunit.vision.m8b;
import com.oplus.pantanal.seedling.intelligent.IntelligentData;
import com.oplus.pantanal.seedling.update.SeedlingCardOptions;
import com.oplus.pantanal.seedling.util.SeedlingTool;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\r"}, d2 = {"Lcom/health/health_seedlingcard/receiver/HealthDataRefreshReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "a", "b", "<init>", "()V", "Companion", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0})
public final class HealthDataRefreshReceiver extends BroadcastReceiver {
    public static final long ONE_MINUTE = 60000;

    @NotNull
    public static final String TAG = "HealthDataRefreshReceiver";

    public final void a(Context context) throws JSONException {
        long jB = fdg.x("health_seedling_share_preference").B("sports_record_last_send_time", 0L);
        long jAbs = Math.abs(System.currentTimeMillis() - jB);
        m8b.f(TAG, "processData:" + jB + " ,intervalTime:" + jAbs);
        if (jAbs > ONE_MINUTE) {
            b(context);
        }
    }

    public final void b(Context context) throws JSONException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", 3);
        SeedlingTool.INSTANCE.updateIntelligentData(context, new IntelligentData(jCurrentTimeMillis, 10106, jug.SPORTS_RECORD_EVENT, jSONObject, (JSONObject) null, (SeedlingCardOptions) null, (String) null, 112, (DefaultConstructorMarker) null));
        m8b.f(TAG, "sendSportsRecordToMetis:" + jCurrentTimeMillis);
        fdg.x("health_seedling_share_preference").T("sports_record_last_send_time", jCurrentTimeMillis);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) throws JSONException {
        m8b.f(TAG, "onReceive:" + this);
        if (TextUtils.equals("com.heytap.health.action_data_refresh", intent != null ? intent.getAction() : null)) {
            Intrinsics.checkNotNull(intent);
            int intExtra = intent.getIntExtra("refresh_type", 0);
            if (intExtra == 22) {
                m8b.f(TAG, "get intent = " + intExtra);
                Intrinsics.checkNotNull(context);
                a(context);
            }
        }
    }
}
