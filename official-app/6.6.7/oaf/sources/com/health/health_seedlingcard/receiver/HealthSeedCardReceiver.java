package com.health.health_seedlingcard.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.health.health_seedlingcard.utlis.SeedCardSendDataToMetisHelper;
import com.heytap.health.core.provider.adapter.open.SleepDataAdapter;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.jug;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.ne7;
import com.oplus.aiunit.vision.t15;
import com.oplus.pantanal.seedling.intelligent.IntelligentData;
import com.oplus.pantanal.seedling.update.SeedlingCardOptions;
import com.oplus.pantanal.seedling.util.SeedlingTool;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/health/health_seedlingcard/receiver/HealthSeedCardReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "", "a", "Ljava/lang/String;", "TAG", "<init>", "()V", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHealthSeedCardReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthSeedCardReceiver.kt\ncom/health/health_seedlingcard/receiver/HealthSeedCardReceiver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,107:1\n1#2:108\n*E\n"})
public final class HealthSeedCardReceiver extends BroadcastReceiver {

    @NotNull
    public final String a = "HealthSeedCardReceiver";

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) throws JSONException {
        m8b.f(this.a, "get intent = " + (intent != null ? intent.getAction() : null));
        String action = intent != null ? intent.getAction() : null;
        if (action != null) {
            switch (action.hashCode()) {
                case -1961540303:
                    if (action.equals("com.heytap.seedling.STEP_MEDAL")) {
                        try {
                            m8b.f(this.a, "get step medal Broadcast");
                            ne7.i(new File(ne7.SEEDLING_CARDP_ROVIDER));
                            SeedCardSendDataToMetisHelper.Companion companion = SeedCardSendDataToMetisHelper.INSTANCE;
                            Intrinsics.checkNotNull(context);
                            companion.b(context);
                        } catch (Exception e) {
                            m8b.b(this.a, e.getMessage());
                        }
                        break;
                    }
                    break;
                case -1254950059:
                    if (action.equals(jug.STEP_GOAL)) {
                        SeedCardSendDataToMetisHelper.Companion companion2 = SeedCardSendDataToMetisHelper.INSTANCE;
                        Intrinsics.checkNotNull(context);
                        companion2.f(context);
                        break;
                    }
                    break;
                case 647021111:
                    if (action.equals("com.heytap.health.action_data_refresh")) {
                        SeedCardSendDataToMetisHelper.Companion companion3 = SeedCardSendDataToMetisHelper.INSTANCE;
                        Intrinsics.checkNotNull(context);
                        companion3.f(context);
                        break;
                    }
                    break;
                case 1022777128:
                    if (action.equals(jug.SLEEP_REMINDER)) {
                        m8b.f(this.a, "get sleep reminder broadcast");
                        IntelligentData intelligentData = new IntelligentData(System.currentTimeMillis(), 10104, jug.SLEEP_REMINDER_EVENT, new JSONObject(), (JSONObject) null, (SeedlingCardOptions) null, (String) null, 112, (DefaultConstructorMarker) null);
                        SeedlingTool seedlingTool = SeedlingTool.INSTANCE;
                        Intrinsics.checkNotNull(context);
                        seedlingTool.updateIntelligentData(context, intelligentData);
                        m8b.f(this.a, "send sleep reminder data to smart brain");
                        break;
                    }
                    break;
                case 1617585202:
                    if (action.equals(jug.SLEEP_STAT_REFRESH)) {
                        m8b.f(this.a, "get sleep data broadcast");
                        try {
                            boolean z = false;
                            boolean booleanExtra = intent.getBooleanExtra("hasCurDaySleepData", false);
                            if (booleanExtra && t15.k()) {
                                z = true;
                            }
                            if (!z) {
                                m8b.f(this.a, "no need to sleep data to smart brain hasCurDaySleepData:" + booleanExtra + " isSleepCardNeedShow:" + t15.k());
                            } else {
                                SeedCardSendDataToMetisHelper.Companion companion4 = SeedCardSendDataToMetisHelper.INSTANCE;
                                Intrinsics.checkNotNull(context);
                                companion4.d(context);
                                SleepDataAdapter.Companion.a(e88.a());
                            }
                        } catch (Exception e2) {
                            m8b.b(this.a, e2.getMessage());
                            return;
                        }
                        break;
                    }
                    break;
            }
        }
    }
}
