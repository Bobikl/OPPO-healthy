package com.heytap.weather.module;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.heytap.store.business.rn.service.RnConstant;
import com.heytap.wearable.watch.weather.IWeatherMainApi;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.cm9;
import com.oplus.aiunit.vision.op;
import com.oplus.aiunit.vision.wq8;
import io.protostuff.MapSchema;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/heytap/weather/module/WeatherMainApi;", "Lcom/oplus/aiunit/vision/cm9;", "Lcom/heytap/wearable/watch/weather/IWeatherMainApi;", "f", "Landroid/content/Context;", "context", "", "c", "b", "Lcom/heytap/wearable/watch/weather/IWeatherMainApi$Stub;", "i", "Lkotlin/Lazy;", MapSchema.FIELD_NAME_ENTRY, "()Lcom/heytap/wearable/watch/weather/IWeatherMainApi$Stub;", "mBinder", "<init>", "()V", "Companion", "interconnection_impl_release"}, k = 1, mv = {1, 8, 0})
public final class WeatherMainApi implements cm9<IWeatherMainApi> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy mBinder = LazyKt__LazyJVMKt.lazy(new Function0<WeatherMainApi$mBinder$2.AnonymousClass1>() { // from class: com.heytap.weather.module.WeatherMainApi$mBinder$2
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Type inference failed for: r0v1, types: [com.heytap.weather.module.WeatherMainApi$mBinder$2$1] */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final AnonymousClass1 invoke() {
            return new IWeatherMainApi.Stub() { // from class: com.heytap.weather.module.WeatherMainApi$mBinder$2.1
                @Override // com.heytap.wearable.watch.weather.IWeatherMainApi
                public void oobeSyncFinish(boolean result) {
                    a7b.f("HtWeather_MainApi", "oobeSyncFinish result " + result);
                    Intent intent = new Intent("com.op.smartwear.public.wearable.RECEIVER");
                    intent.putExtra("native_sync_action", "com.op.smartwear.native.weather.RECEIVER");
                    intent.putExtra("native_sync_result", result);
                    LocalBroadcastManager.getInstance(b78.a()).sendBroadcast(intent);
                }

                @Override // com.heytap.wearable.watch.weather.IWeatherMainApi
                public void startPage(int page) {
                    a7b.f("HtWeather_MainApi", "startPage=" + page);
                    if (page == 1) {
                        Activity activityS = op.n().s();
                        if (activityS == null) {
                            b78.e("jump_weather_location", Long.valueOf(System.currentTimeMillis()));
                            return;
                        }
                        Intent intent = new Intent();
                        intent.setComponent(new ComponentName(activityS, "com.heytap.health.main.MainActivity"));
                        intent.putExtra("tab", "3");
                        intent.putExtra("jump_action", "jump_weather_location");
                        intent.putExtra("time_snap", System.currentTimeMillis());
                        activityS.startActivity(intent);
                    }
                }
            };
        }
    });

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/heytap/weather/module/WeatherMainApi$Companion;", "", "", "result", "", "a", "", RnConstant.KEY_PAGE, "b", "PAGE_PERMISSION_DETAILS", "I", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "interconnection_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(boolean result) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(wq8.INSTANCE.e()), null, null, new WeatherMainApi$Companion$oobeSyncFinish$1(result, null), 3, null);
        }

        public final void b(int page) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(wq8.INSTANCE.e()), null, null, new WeatherMainApi$Companion$startPage$1(page, null), 3, null);
        }
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final IWeatherMainApi.Stub e() {
        return (IWeatherMainApi.Stub) this.mBinder.getValue();
    }

    @Override // com.oplus.aiunit.vision.cm9
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public IWeatherMainApi d() {
        return e();
    }
}
