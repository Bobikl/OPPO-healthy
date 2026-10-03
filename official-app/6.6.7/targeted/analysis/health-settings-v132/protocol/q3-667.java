package com.oplus.aiunit.model;

import android.annotation.SuppressLint;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.health.settings.watch.sporthealthsettings.bean.SettingMergeResult;
import com.heytap.health.settings.watch.sporthealthsettings.bean.m;
import com.heytap.health.settings.watch.sporthealthsettings2.SHSettingManager;
import com.lifesense.device.scale.infrastructure.protocol.UploadDeviceInformationRequest;
import com.oplus.aiunit.vision.b24;
import com.oplus.aiunit.vision.cp5;
import com.oplus.aiunit.vision.lki;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.wl4;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\nH&J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H&J \u0010\u0019\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H&J\b\u0010\u001a\u001a\u00020\u0000H&J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0004J\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007R\u001a\u0010!\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/oplus/aiunit/vision/q3;", "", "", "deviceModel", "", "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "Lcom/oplus/aiunit/vision/l9g;", "results", "", "a", "", "c", "item", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "b", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/m;", UploadDeviceInformationRequest.kRequestParam_DeviceSettings, "Lcom/oplus/aiunit/vision/oag;", "dbRepository", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/SettingMergeResult;", "f", "settings", "value", "", "modifyTime", "i", "g", "", "e", "h", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "TAG", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAbsBaseSettingItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbsBaseSettingItem.kt\ncom/heytap/health/settings/watch/sporthealthsettings/bean/AbsBaseSettingItem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,102:1\n1549#2:103\n1620#2,3:104\n1855#2,2:107\n1855#2,2:109\n*S KotlinDebug\n*F\n+ 1 AbsBaseSettingItem.kt\ncom/heytap/health/settings/watch/sporthealthsettings/bean/AbsBaseSettingItem\n*L\n34#1:103\n34#1:104,3\n35#1:107,2\n90#1:109,2\n*E\n"})
public abstract class q3 {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String TAG = SHSettingManager.TAG;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "result", "", "a", "(Z)V"}, k = 3, mv = {1, 8, 0})
    public static final class a<T> implements b24 {
        public final /* synthetic */ SportHealthSetting j;

        public a(SportHealthSetting sportHealthSetting) {
            this.j = sportHealthSetting;
        }

        public final void a(boolean z) {
            m8b.f(q3.this.getTAG(), "Reset sport health setting result=" + z + ", item=" + this.j.name());
        }

        public /* bridge */ /* synthetic */ void accept(Object obj) {
            a(((Boolean) obj).booleanValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "throwable", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    public static final class b<T> implements b24 {
        public final /* synthetic */ SportHealthSetting j;

        public b(SportHealthSetting sportHealthSetting) {
            this.j = sportHealthSetting;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "throwable");
            m8b.f(q3.this.getTAG(), "Reset sport health setting fail=" + th + ", item=" + this.j.name());
        }
    }

    public final void a(@NotNull String deviceModel, @NotNull Map<SportHealthSetting, ? extends l9g> results) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(results, "results");
        List<HeartRateSettingBean> listX0 = lki.a(wl4.managerApi.getCurrActiveMac()).X0();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listX0, 10));
        Iterator<T> it = listX0.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((HeartRateSettingBean) it.next()).getType()));
        }
        for (SportHealthSetting sportHealthSetting : c()) {
            l9g l9gVar = results.get(sportHealthSetting);
            if (l9gVar != null) {
                String strC = l9gVar.c();
                if (sportHealthSetting == SportHealthSetting.HEART_RATE_TYPE && !arrayList.contains(l9gVar.c())) {
                    strC = byk.l(sportHealthSetting, deviceModel);
                }
                Intrinsics.checkNotNullExpressionValue(strC, "value");
                i(sportHealthSetting, strC, l9gVar.a());
            } else {
                String strL = byk.l(sportHealthSetting, deviceModel);
                Intrinsics.checkNotNullExpressionValue(strL, "getDefaultValue(settingItem, deviceModel)");
                i(sportHealthSetting, strL, 0);
            }
        }
    }

    @Nullable
    public abstract MessageEvent b(@NotNull SportHealthSetting item, @NotNull String deviceModel);

    @NotNull
    public abstract List<SportHealthSetting> c();

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTAG() {
        return this.TAG;
    }

    public final boolean e(@NotNull String deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        return cp5.b(deviceModel).F3();
    }

    @NotNull
    public abstract SettingMergeResult f(@NotNull m deviceSettings, @NotNull oag dbRepository);

    @NotNull
    public abstract q3 g();

    @SuppressLint({"CheckResult"})
    public final void h(@NotNull oag dbRepository) {
        Intrinsics.checkNotNullParameter(dbRepository, "dbRepository");
        for (SportHealthSetting sportHealthSetting : c()) {
            if (!SHSettingManager.INSTANCE.c(sportHealthSetting)) {
                dbRepository.t0(sportHealthSetting, "", 0L, false).b(new a(sportHealthSetting), new b(sportHealthSetting));
            }
        }
    }

    public abstract void i(@NotNull SportHealthSetting settings, @NotNull String value, int modifyTime);
}