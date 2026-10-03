package com.heytap.health.settings.watch.sporthealthsettings2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.api.RxExtendKt;
import com.heytap.health.device_settings.health.SportHealthSetting;
import com.heytap.health.settings.watch.sporthealthsettings.bean.DeviceSettings;
import com.heytap.health.settings.watch.sporthealthsettings.bean.SettingMergeResult;
import com.heytap.health.settings.watch.sporthealthsettings.bean.m;
import com.heytap.health.settings.watch.sporthealthsettings2.SHSettingManager;
import com.heytap.health.settings.watch.sporthealthsettings2.ui.SHSettingMainAdapter;
import com.heytap.nearx.tangramconfig.stat.Const;
import com.lifesense.android.bluetooth.scale.bean.WeightData_A3;
import com.lifesense.device.scale.infrastructure.protocol.UploadDeviceInformationRequest;
import com.lifesense.weidong.lzsimplenetlibs.net.invoker.JsonResponse;
import com.oplus.aiunit.model.gk8;
import com.oplus.aiunit.model.jki;
import com.oplus.aiunit.model.kdi;
import com.oplus.aiunit.model.l9g;
import com.oplus.aiunit.model.m4b;
import com.oplus.aiunit.model.m73;
import com.oplus.aiunit.model.oag;
import com.oplus.aiunit.model.pag;
import com.oplus.aiunit.model.q3;
import com.oplus.aiunit.model.v0h;
import com.oplus.aiunit.vision.b24;
import com.oplus.aiunit.vision.ddd;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.jrc;
import com.oplus.aiunit.vision.lki;
import com.oplus.aiunit.vision.ln3;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.rze;
import com.oplus.aiunit.vision.veb;
import com.oplus.aiunit.vision.wl4;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 k2\u00020\u0001:\u0001HB\u0019\b\u0002\u0012\u0006\u0010J\u001a\u00020\f\u0012\u0006\u0010L\u001a\u00020\f¢\u0006\u0004\bi\u0010jJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0014\u0010\u000b\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\u0004J,\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J.\u0010\u0017\u001a\u00020\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u00102\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007J\u000e\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019J\u000e\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001cJ\u0006\u0010\u001e\u001a\u00020\u0015J\u000e\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019J\u000e\u0010 \u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001cJ\b\u0010!\u001a\u00020\u0004H\u0007J/\u0010&\u001a\u00020\u00042\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\t2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060$H\u0082@ø\u0001\u0000¢\u0006\u0004\b&\u0010'J.\u0010+\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0)\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060*0(2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0002J\u001e\u00100\u001a\u00020/2\u0006\u0010-\u001a\u00020,2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\"0\tH\u0002J\u0010\u00101\u001a\u00020/2\u0006\u0010-\u001a\u00020,H\u0002J$\u00104\u001a\u00020\u00042\f\u00102\u001a\b\u0012\u0004\u0012\u00020\"0\t2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0002J\u0016\u00107\u001a\u00020\u00042\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000605H\u0002J\u0010\u00109\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u0015H\u0002J\u0016\u0010;\u001a\u00020\u00042\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000605H\u0002J\u0016\u0010=\u001a\u00020\u00042\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u000605H\u0002J\b\u0010>\u001a\u00020\u0004H\u0002J$\u0010?\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u0010H\u0002J&\u0010A\u001a\u0004\u0018\u00010@2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u0010H\u0002J\u0012\u0010B\u001a\u0004\u0018\u00010@2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u001c\u0010C\u001a\u00020\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u0010H\u0002J\u000e\u0010D\u001a\b\u0012\u0004\u0012\u00020\u000605H\u0002J\b\u0010E\u001a\u00020\u0015H\u0002J\b\u0010G\u001a\u00020FH\u0002R\u0014\u0010J\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010L\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010IR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020\u001c0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\"\u0010V\u001a\u00020F8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010&\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u0016\u0010X\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010\u000fR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00190Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010^\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010\u000fR\u0016\u0010`\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010\u000fR\u0016\u0010<\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010f\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u001a\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00060Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010[\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006l"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/SHSettingManager;", "", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/DeviceSettings;", "A", "", "H", "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "item", "J", "", "items", "L", "", "switchType", "K", "Z", "", JsonResponse.PROTOCOL_JSON_KEY_DATA, "Lcom/oplus/aiunit/vision/m73;", "callback", "v", "", "ignoreResult", "u", "R", "Lcom/oplus/aiunit/vision/m4b;", "listener", "r", "Lcom/oplus/aiunit/vision/v0h;", "s", "F", "T", "U", "V", "Lcom/oplus/aiunit/vision/q3;", "uniqueSettingItems", "", "allKeys", "I", "(Ljava/util/Collection;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Pair;", "Ljava/util/LinkedHashSet;", "", "x", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/m;", "deviceSettingBean", "targets", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/SettingMergeResult;", "O", "M", "targetSettingItems", "notifyItems", "P", "", "notifySettings", "S", "isChangeLoadState", "Q", JsonResponse.PROTOCOL_JSON_KEY_LIST_IN_DATA, "N", UploadDeviceInformationRequest.kRequestParam_DeviceSettings, "X", "W", gk8.TIMESTAMP, "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "E", "D", "a0", "z", "G", "", "y", "a", "Ljava/lang/String;", "deviceMac", "b", "deviceModel", "Ljava/util/concurrent/CopyOnWriteArrayList;", "c", "Ljava/util/concurrent/CopyOnWriteArrayList;", "listeners", "d", "B", "()I", "Y", "(I)V", "localSettingLoadState", "e", "isLoadSettingFromDeviceFinish", "", "f", "Ljava/util/List;", "loadAllCompleteListenerList", "g", "isNeedSendAllSettingToDevice", "h", "isOnDemandMerging", "i", "Lcom/heytap/health/settings/watch/sporthealthsettings/bean/DeviceSettings;", "Lcom/oplus/aiunit/vision/oag;", "j", "Lcom/oplus/aiunit/vision/oag;", "dbRepository", "k", "sendDeviceSettings", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Companion", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSHSettingManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SHSettingManager.kt\ncom/heytap/health/settings/watch/sporthealthsettings2/SHSettingManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 UIConfig.kt\ncom/heytap/sporthealth/blib/helper/UIConfigKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,635:1\n1855#2,2:636\n1855#2,2:638\n1855#2,2:640\n1855#2,2:646\n1549#2:648\n1620#2,3:649\n1855#2,2:652\n1855#2,2:654\n1855#2,2:656\n1855#2,2:658\n1855#2,2:660\n1855#2,2:662\n13309#3:642\n13310#3:645\n155#4:643\n1#5:644\n*S KotlinDebug\n*F\n+ 1 SHSettingManager.kt\ncom/heytap/health/settings/watch/sporthealthsettings2/SHSettingManager\n*L\n173#1:636,2\n176#1:638,2\n205#1:640,2\n231#1:646,2\n237#1:648\n237#1:649,3\n239#1:652,2\n245#1:654,2\n250#1:656,2\n381#1:658,2\n392#1:660,2\n408#1:662,2\n216#1:642\n216#1:645\n218#1:643\n*E\n"})
public final class SHSettingManager {
    public static final int IDLE = 0;
    public static final int LOADED = 2;
    public static final int LOADING = 1;

    @NotNull
    public static final String TAG = "SHS-SHSettingManager";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String deviceMac;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String deviceModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final CopyOnWriteArrayList<v0h> listeners;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public volatile int localSettingLoadState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public volatile boolean isLoadSettingFromDeviceFinish;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final List<m4b> loadAllCompleteListenerList;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public volatile boolean isNeedSendAllSettingToDevice;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public volatile boolean isOnDemandMerging;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public volatile DeviceSettings deviceSettings;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final oag dbRepository;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final List<SportHealthSetting> sendDeviceSettings;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Map<String, SHSettingManager> l = new LinkedHashMap();

    @JvmField
    @NotNull
    public static String SYNC_SWITCH_ALL = "0";

    /* JADX INFO: renamed from: com.heytap.health.settings.watch.sporthealthsettings2.SHSettingManager$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0007J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0007J\b\u0010\r\u001a\u00020\fH\u0007R\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/SHSettingManager$a;", "", "", "deviceMac", "Lcom/heytap/health/settings/watch/sporthealthsettings2/SHSettingManager;", "a", "deviceModel", "b", "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "item", "", "c", "", "d", "", WeightData_A3.IMPEDANCE_STATUS_IDLE, "I", "LOADED", "LOADING", "SYNC_SWITCH_ALL", "Ljava/lang/String;", "TAG", "", "managerMap", "Ljava/util/Map;", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final SHSettingManager a(@Nullable String deviceMac) {
            return (SHSettingManager) SHSettingManager.l.get(deviceMac);
        }

        @JvmStatic
        @NotNull
        public final SHSettingManager b(@NotNull String deviceMac, @NotNull String deviceModel) {
            Intrinsics.checkNotNullParameter(deviceMac, "deviceMac");
            Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
            SHSettingManager sHSettingManager = (SHSettingManager) SHSettingManager.l.get(deviceMac);
            if (sHSettingManager != null) {
                return sHSettingManager;
            }
            SHSettingManager sHSettingManager2 = new SHSettingManager(deviceMac, deviceModel, null);
            SHSettingManager.l.put(deviceMac, sHSettingManager2);
            return sHSettingManager2;
        }

        @JvmStatic
        public final boolean c(@NotNull SportHealthSetting item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return pag.INSTANCE.c(item);
        }

        @JvmStatic
        public final void d() {
            SHSettingManager.l.clear();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isSuccess", "", "a", "(Z)V"}, k = 3, mv = {1, 8, 0})
    public static final class b<T> implements b24 {
        public final /* synthetic */ CountDownLatch i;
        public final /* synthetic */ boolean j;
        public final /* synthetic */ q3 k;
        public final /* synthetic */ SportHealthSetting l;
        public final /* synthetic */ Map<SportHealthSetting, String> m;
        public final /* synthetic */ SHSettingManager n;
        public final /* synthetic */ m73 o;
        public final /* synthetic */ AtomicInteger p;

        public b(CountDownLatch countDownLatch, boolean z, q3 q3Var, SportHealthSetting sportHealthSetting, Map<SportHealthSetting, String> map, SHSettingManager sHSettingManager, m73 m73Var, AtomicInteger atomicInteger) {
            this.i = countDownLatch;
            this.j = z;
            this.k = q3Var;
            this.l = sportHealthSetting;
            this.m = map;
            this.n = sHSettingManager;
            this.o = m73Var;
            this.p = atomicInteger;
        }

        public final void a(boolean z) {
            m73 m73Var;
            m8b.f(SHSettingManager.TAG, "Change DB device setting result, isSuccess=" + z);
            this.i.countDown();
            if (!this.j && z) {
                q3 q3Var = this.k;
                if (q3Var != null) {
                    SportHealthSetting sportHealthSetting = this.l;
                    String str = this.m.get(sportHealthSetting);
                    Intrinsics.checkNotNull(str);
                    q3Var.i(sportHealthSetting, str, this.n.y());
                }
                this.n.R(this.l);
            }
            if (this.i.getCount() != 0 || (m73Var = this.o) == null) {
                return;
            }
            m73Var.a(this.l, (z && this.p.get() == 0) ? 0 : 2);
        }

        public /* bridge */ /* synthetic */ void accept(Object obj) {
            a(((Boolean) obj).booleanValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "throwable", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    public static final class c<T> implements b24 {
        public final /* synthetic */ AtomicInteger i;
        public final /* synthetic */ CountDownLatch j;
        public final /* synthetic */ m73 k;
        public final /* synthetic */ SportHealthSetting l;

        public c(AtomicInteger atomicInteger, CountDownLatch countDownLatch, m73 m73Var, SportHealthSetting sportHealthSetting) {
            this.i = atomicInteger;
            this.j = countDownLatch;
            this.k = m73Var;
            this.l = sportHealthSetting;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(@NotNull Throwable th) {
            m73 m73Var;
            Intrinsics.checkNotNullParameter(th, "throwable");
            m8b.f(SHSettingManager.TAG, "Change device setting, save to db fail=" + th);
            this.i.addAndGet(1);
            this.j.countDown();
            if (this.j.getCount() != 0 || (m73Var = this.k) == null) {
                return;
            }
            m73Var.a(this.l, 2);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/heytap/health/settings/watch/sporthealthsettings2/SHSettingManager$d", "Lcom/oplus/aiunit/vision/m73;", "Lcom/heytap/health/device_settings/health/SportHealthSetting;", "settingType", "", "resultCode", "", "a", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class d implements m73 {
        public final /* synthetic */ m73 a;
        public final /* synthetic */ SHSettingManager b;
        public final /* synthetic */ Map<SportHealthSetting, String> c;

        public d(m73 m73Var, SHSettingManager sHSettingManager, Map<SportHealthSetting, String> map) {
            this.a = m73Var;
            this.b = sHSettingManager;
            this.c = map;
        }

        @Override // com.oplus.aiunit.model.m73
        public void a(@NotNull SportHealthSetting settingType, int resultCode) {
            Intrinsics.checkNotNullParameter(settingType, "settingType");
            this.a.a(settingType, resultCode);
            if (resultCode == 0) {
                this.b.t(settingType, this.c);
            }
        }
    }

    public /* synthetic */ SHSettingManager(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    @JvmStatic
    @NotNull
    public static final SHSettingManager C(@NotNull String str, @NotNull String str2) {
        return INSTANCE.b(str, str2);
    }

    public static final void w(SHSettingManager sHSettingManager, Map map, m73 m73Var, SportHealthSetting sportHealthSetting, int i) {
        Intrinsics.checkNotNullParameter(sHSettingManager, "this$0");
        Intrinsics.checkNotNullParameter(map, "$data");
        Intrinsics.checkNotNullParameter(m73Var, "$callback");
        Intrinsics.checkNotNullParameter(sportHealthSetting, "$item");
        if (i == 0) {
            sHSettingManager.a0(map);
            sHSettingManager.u(map, true, null);
            m73Var.a(sportHealthSetting, 0);
        } else {
            m8b.f(TAG, "Change device setting fail, resultCode=" + i);
            m73Var.a(sportHealthSetting, i);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: A, reason: from getter */
    public final DeviceSettings getDeviceSettings() {
        return this.deviceSettings;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final int getLocalSettingLoadState() {
        return this.localSettingLoadState;
    }

    public final MessageEvent D(SportHealthSetting item) {
        if (item == null) {
            m8b.f(TAG, "get setting pb msg item is null");
            return null;
        }
        q3 q3VarA = pag.INSTANCE.a(item, this.deviceSettings);
        if (q3VarA != null) {
            return q3VarA.b(item, this.deviceModel);
        }
        return null;
    }

    public final MessageEvent E(SportHealthSetting item, Map<SportHealthSetting, String> data) {
        q3 q3VarA = pag.INSTANCE.a(item, this.deviceSettings);
        q3 q3VarG = q3VarA != null ? q3VarA.g() : null;
        for (SportHealthSetting sportHealthSetting : data.keySet()) {
            if (q3VarG != null) {
                String str = data.get(sportHealthSetting);
                Intrinsics.checkNotNull(str);
                q3VarG.i(sportHealthSetting, str, y());
            }
        }
        if (q3VarG != null) {
            return q3VarG.b(item, this.deviceModel);
        }
        return null;
    }

    public final boolean F() {
        return this.localSettingLoadState == 2;
    }

    public final boolean G() {
        return wl4.managerApi.isCurrentConnected();
    }

    public final void H() {
        if (this.localSettingLoadState != 0) {
            m8b.f(TAG, "All setting is loading or loaded");
            return;
        }
        this.localSettingLoadState = 1;
        this.isLoadSettingFromDeviceFinish = false;
        List<SportHealthSetting> listZ = z();
        Pair<LinkedHashSet<q3>, Set<SportHealthSetting>> pairX = x(listZ);
        BuildersKt.launch$default(kdi.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new SHSettingManager$loadAllSetting$1(this, (LinkedHashSet) pairX.component1(), (Set) pairX.component2(), listZ, null), 3, (Object) null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object I(Collection<? extends q3> collection, Set<? extends SportHealthSetting> set, Continuation<? super Unit> continuation) {
        SHSettingManager$loadFromDBAndApply$1 sHSettingManager$loadFromDBAndApply$1;
        if (continuation instanceof SHSettingManager$loadFromDBAndApply$1) {
            sHSettingManager$loadFromDBAndApply$1 = (SHSettingManager$loadFromDBAndApply$1) continuation;
            int i = sHSettingManager$loadFromDBAndApply$1.label;
            if ((i & Const.NOT_EXIST_CONFIGCODE_IN_LOCAL) != 0) {
                sHSettingManager$loadFromDBAndApply$1.label = i - Const.NOT_EXIST_CONFIGCODE_IN_LOCAL;
            } else {
                sHSettingManager$loadFromDBAndApply$1 = new SHSettingManager$loadFromDBAndApply$1(this, continuation);
            }
        } else {
            sHSettingManager$loadFromDBAndApply$1 = new SHSettingManager$loadFromDBAndApply$1(this, continuation);
        }
        Object objC = sHSettingManager$loadFromDBAndApply$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = sHSettingManager$loadFromDBAndApply$1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objC);
                ddd<Map<SportHealthSetting, l9g>> dddVarH0 = this.dbRepository.h0(set);
                Intrinsics.checkNotNullExpressionValue(dddVarH0, "dbRepository.readAllPreferences(allKeys)");
                sHSettingManager$loadFromDBAndApply$1.L$0 = this;
                sHSettingManager$loadFromDBAndApply$1.L$1 = collection;
                sHSettingManager$loadFromDBAndApply$1.label = 1;
                objC = RxExtendKt.c(dddVarH0, sHSettingManager$loadFromDBAndApply$1);
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                collection = (Collection) sHSettingManager$loadFromDBAndApply$1.L$1;
                this = (SHSettingManager) sHSettingManager$loadFromDBAndApply$1.L$0;
                ResultKt.throwOnFailure(objC);
            }
            Intrinsics.checkNotNullExpressionValue(objC, "dbRepository.readAllPref…nces(allKeys).awaitOnce()");
            Map<SportHealthSetting, ? extends l9g> map = (Map) objC;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                ((q3) it.next()).a(this.deviceModel, map);
            }
        } catch (Exception e) {
            m8b.b(TAG, "Batch read preferences fail, use defaults: " + e);
            Iterator<T> it2 = collection.iterator();
            while (it2.hasNext()) {
                ((q3) it2.next()).a(this.deviceModel, MapsKt.emptyMap());
            }
        }
        return Unit.INSTANCE;
    }

    public final void J(@NotNull SportHealthSetting item) {
        Intrinsics.checkNotNullParameter(item, "item");
        L(CollectionsKt.listOf(item));
    }

    public final void K(@NotNull String switchType) {
        Intrinsics.checkNotNullParameter(switchType, "switchType");
        String currentConnectId = wl4.managerApi.getCurrentConnectId();
        m8b.f(TAG, "Start load sport health setting from device type = " + switchType + ",mac = " + veb.a(this.deviceMac) + ",currmac = " + veb.a(currentConnectId));
        if (Intrinsics.areEqual(this.deviceMac, currentConnectId)) {
            BuildersKt.launch$default(kdi.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new SHSettingManager$loadSettingFromDevice$1(switchType, this, null), 3, (Object) null);
        } else {
            this.isLoadSettingFromDeviceFinish = true;
            Q(true);
        }
    }

    public final void L(@NotNull Collection<? extends SportHealthSetting> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        if (items.isEmpty()) {
            return;
        }
        if (this.localSettingLoadState == 1) {
            m8b.f(TAG, "Full load in progress, skip on-demand load");
            return;
        }
        List listDistinct = CollectionsKt.distinct(items);
        Pair<LinkedHashSet<q3>, Set<SportHealthSetting>> pairX = x(listDistinct);
        LinkedHashSet linkedHashSet = (LinkedHashSet) pairX.component1();
        Set set = (Set) pairX.component2();
        if (set.isEmpty()) {
            return;
        }
        BuildersKt.launch$default(kdi.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new SHSettingManager$loadSettingsByItems$1(this, linkedHashSet, set, listDistinct, null), 3, (Object) null);
    }

    public final SettingMergeResult M(m deviceSettingBean) throws IllegalAccessException {
        ArrayList arrayList = new ArrayList();
        Field[] declaredFields = this.deviceSettings.getClass().getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(declaredFields, "deviceSettings.javaClass.declaredFields");
        for (Field field : declaredFields) {
            field.setAccessible(true);
            Object obj = field.get(this.deviceSettings);
            if (!(obj instanceof q3)) {
                obj = null;
            }
            q3 q3Var = (q3) obj;
            if (q3Var != null) {
                arrayList.add(q3Var);
            }
        }
        return O(deviceSettingBean, arrayList);
    }

    public final void N(List<? extends SportHealthSetting> list) {
        this.sendDeviceSettings.clear();
        this.sendDeviceSettings.addAll(lki.a(this.deviceMac).p8());
        for (SportHealthSetting sportHealthSetting : list) {
            if (!this.sendDeviceSettings.contains(sportHealthSetting)) {
                this.sendDeviceSettings.add(sportHealthSetting);
            }
        }
    }

    public final SettingMergeResult O(m deviceSettingBean, Collection<? extends q3> targets) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = targets.iterator();
        while (it.hasNext()) {
            SettingMergeResult settingMergeResultF = ((q3) it.next()).f(deviceSettingBean, this.dbRepository);
            arrayList.addAll(settingMergeResultF.getDeviceSettings());
            arrayList2.addAll(settingMergeResultF.getPhoneSettings());
        }
        return new SettingMergeResult(arrayList, arrayList2);
    }

    public final void P(Collection<? extends q3> targetSettingItems, Collection<? extends SportHealthSetting> notifyItems) {
        if (!lki.a(this.deviceMac).U2()) {
            Iterator<T> it = notifyItems.iterator();
            while (it.hasNext()) {
                R((SportHealthSetting) it.next());
            }
            return;
        }
        if (!G()) {
            Collection<? extends SportHealthSetting> collection = notifyItems;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
            Iterator<T> it2 = collection.iterator();
            while (it2.hasNext()) {
                arrayList.add(((SportHealthSetting) it2.next()).name());
            }
            m8b.f(TAG, "Device not connected, skip on-demand merge for items=" + arrayList);
            Iterator<T> it3 = collection.iterator();
            while (it3.hasNext()) {
                R((SportHealthSetting) it3.next());
            }
            return;
        }
        if (!Intrinsics.areEqual(this.deviceMac, wl4.managerApi.getCurrentConnectId())) {
            m8b.f(TAG, "Device mac mismatch, skip on-demand merge");
            Iterator<T> it4 = notifyItems.iterator();
            while (it4.hasNext()) {
                R((SportHealthSetting) it4.next());
            }
            return;
        }
        if (this.isOnDemandMerging) {
            m8b.f(TAG, "On-demand merge already running, skip");
            Iterator<T> it5 = notifyItems.iterator();
            while (it5.hasNext()) {
                R((SportHealthSetting) it5.next());
            }
            return;
        }
        m8b.f(TAG, "Start on-demand merge, items count=" + notifyItems.size() + ", targetGroups=" + targetSettingItems.size());
        this.isOnDemandMerging = true;
        BuildersKt.launch$default(kdi.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new SHSettingManager$mergeSettingsForItems$6(this, notifyItems, targetSettingItems, null), 3, (Object) null);
    }

    public final void Q(boolean isChangeLoadState) {
        if (isChangeLoadState) {
            this.localSettingLoadState = 2;
        }
        if (lki.a(this.deviceMac).U2() && !this.isLoadSettingFromDeviceFinish && this.localSettingLoadState == 2) {
            m8b.f(TAG, "Load setting from local success, start load from device mac = " + veb.a(this.deviceMac));
            K(SYNC_SWITCH_ALL);
            return;
        }
        m8b.f(TAG, "Load all setting finish");
        if (this.isNeedSendAllSettingToDevice) {
            this.isNeedSendAllSettingToDevice = false;
            W();
        }
        Iterator it = new ArrayList(this.loadAllCompleteListenerList).iterator();
        while (it.hasNext()) {
            ((m4b) it.next()).q();
        }
    }

    public final void R(@NotNull SportHealthSetting item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Iterator<v0h> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().r(item);
        }
    }

    public final void S(List<? extends SportHealthSetting> notifySettings) {
        if (notifySettings.isEmpty()) {
            return;
        }
        Context contextA = e88.a();
        Intrinsics.checkNotNullExpressionValue(contextA, "context");
        if (rze.v(contextA)) {
            m8b.f(TAG, "Send device shs changed broadcast in transport");
            Intent intent = new Intent(SHSettingsSyncMonitor.ACTION_DEVICE_SHS_CHANGED);
            intent.putExtra("device_mac", this.deviceMac);
            intent.putExtra("type", SYNC_SWITCH_ALL);
            intent.setPackage(contextA.getPackageName());
            contextA.sendBroadcast(intent);
        }
    }

    public final void T(@NotNull m4b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.loadAllCompleteListenerList.remove(listener);
    }

    public final void U(@NotNull v0h listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listeners.remove(listener);
    }

    @SuppressLint({"CheckResult"})
    public final void V() {
        m8b.f(TAG, "Start reset all SHS, deviceMac=" + veb.a(this.deviceMac));
        Iterator<SportHealthSetting> it = z().iterator();
        while (it.hasNext()) {
            q3 q3VarA = pag.INSTANCE.a(it.next(), this.deviceSettings);
            if (q3VarA != null) {
                q3VarA.h(this.dbRepository);
            }
        }
    }

    public final void W() {
        m8b.f(TAG, "Load all setting finish, start send to device");
        ArrayList<SportHealthSetting> arrayList = new ArrayList();
        if (lki.a(this.deviceMac).U2()) {
            arrayList.addAll(this.sendDeviceSettings);
        } else {
            arrayList.addAll(z());
        }
        for (SportHealthSetting sportHealthSetting : arrayList) {
            SHSettingBTRepository.INSTANCE.a(sportHealthSetting, D(sportHealthSetting));
        }
    }

    public final void X(List<? extends SportHealthSetting> deviceSettings) {
        if (deviceSettings.isEmpty()) {
            return;
        }
        for (SportHealthSetting sportHealthSetting : CollectionsKt.distinct(deviceSettings)) {
            SHSettingBTRepository.INSTANCE.a(sportHealthSetting, D(sportHealthSetting));
        }
    }

    public final void Y(int i) {
        this.localSettingLoadState = i;
    }

    public final void Z() {
        m8b.f(TAG, "Call sync setting to device, deviceMac=" + veb.a(this.deviceMac));
        if (!wl4.managerApi.isCurrentConnected()) {
            m8b.f(TAG, "Device not connect, can not sync setting");
            return;
        }
        this.isNeedSendAllSettingToDevice = true;
        m8b.f(TAG, "localSettingLoadState ==" + this.localSettingLoadState);
        if (this.localSettingLoadState != 2) {
            H();
        } else if (lki.a(this.deviceMac).U2()) {
            this.isLoadSettingFromDeviceFinish = false;
            K(SYNC_SWITCH_ALL);
        } else {
            this.isNeedSendAllSettingToDevice = false;
            W();
        }
    }

    public final void a0(Map<SportHealthSetting, String> data) {
        for (SportHealthSetting sportHealthSetting : data.keySet()) {
            q3 q3VarA = pag.INSTANCE.a(sportHealthSetting, this.deviceSettings);
            if (q3VarA != null) {
                String str = data.get(sportHealthSetting);
                Intrinsics.checkNotNull(str);
                q3VarA.i(sportHealthSetting, str, y());
            }
        }
    }

    public final void r(@NotNull m4b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.loadAllCompleteListenerList.contains(listener)) {
            return;
        }
        this.loadAllCompleteListenerList.add(listener);
    }

    public final void s(@NotNull v0h listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.listeners.contains(listener)) {
            return;
        }
        this.listeners.add(listener);
    }

    public final void t(SportHealthSetting item, Map<SportHealthSetting, String> data) {
        if (pag.INSTANCE.d(item) || !G()) {
            return;
        }
        SHSettingBTRepository.INSTANCE.b(item, E(item, data), null);
    }

    @SuppressLint({"CheckResult"})
    public final void u(@NotNull Map<SportHealthSetting, String> data, boolean ignoreResult, @Nullable m73 callback) {
        Map<SportHealthSetting, String> map = data;
        Intrinsics.checkNotNullParameter(map, JsonResponse.PROTOCOL_JSON_KEY_DATA);
        CountDownLatch countDownLatch = new CountDownLatch(data.size());
        AtomicInteger atomicInteger = new AtomicInteger(0);
        for (SportHealthSetting sportHealthSetting : data.keySet()) {
            this.dbRepository.t0(sportHealthSetting, map.get(sportHealthSetting), System.currentTimeMillis(), INSTANCE.c(sportHealthSetting)).b(new b(countDownLatch, ignoreResult, pag.INSTANCE.a(sportHealthSetting, this.deviceSettings), sportHealthSetting, data, this, callback, atomicInteger), new c(atomicInteger, countDownLatch, callback, sportHealthSetting));
            if (ignoreResult) {
                R(sportHealthSetting);
            }
            map = data;
        }
    }

    @SuppressLint({"CheckResult"})
    public final void v(@NotNull final SportHealthSetting item, @NotNull final Map<SportHealthSetting, String> data, @NotNull final m73 callback) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(data, JsonResponse.PROTOCOL_JSON_KEY_DATA);
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!INSTANCE.c(item)) {
            if (G()) {
                SHSettingBTRepository.INSTANCE.b(item, E(item, data), new ln3() { // from class: com.oplus.aiunit.vision.vbg
                    public final void onResult(Object obj) {
                        SHSettingManager.w(this.a, data, callback, item, ((Integer) obj).intValue());
                    }
                });
                return;
            } else {
                callback.a(item, 1);
                return;
            }
        }
        if (jrc.c()) {
            u(data, false, new d(callback, this, data));
        } else {
            m8b.f(TAG, "Change device setting fail, network not enable");
            callback.a(item, 2);
        }
    }

    public final Pair<LinkedHashSet<q3>, Set<SportHealthSetting>> x(Collection<? extends SportHealthSetting> items) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (SportHealthSetting sportHealthSetting : items) {
            q3 q3VarA = pag.INSTANCE.a(sportHealthSetting, this.deviceSettings);
            if (q3VarA != null) {
                linkedHashSet.add(q3VarA);
                linkedHashSet2.addAll(q3VarA.c());
            } else {
                m8b.f(TAG, "Read preference name=" + sportHealthSetting.name() + " is null");
            }
        }
        return TuplesKt.to(linkedHashSet, linkedHashSet2);
    }

    public final int y() {
        return (int) (System.currentTimeMillis() / 1000);
    }

    public final List<SportHealthSetting> z() {
        ArrayList arrayList = new ArrayList();
        for (SHSettingMainAdapter.d dVar : jki.a.e(lki.a(this.deviceMac), false, 1, null)) {
            SportHealthSetting sportHealthSetting = dVar.c;
            if (sportHealthSetting != null && !arrayList.contains(sportHealthSetting)) {
                SportHealthSetting sportHealthSetting2 = dVar.c;
                Intrinsics.checkNotNullExpressionValue(sportHealthSetting2, "item.settings");
                arrayList.add(sportHealthSetting2);
            }
        }
        return arrayList;
    }

    public SHSettingManager(String str, String str2) {
        this.deviceMac = str;
        this.deviceModel = str2;
        this.listeners = new CopyOnWriteArrayList<>();
        this.loadAllCompleteListenerList = new ArrayList();
        this.deviceSettings = new DeviceSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 3, null);
        this.dbRepository = new oag(str, str2);
        this.sendDeviceSettings = new ArrayList();
        SHSettingsSyncMonitor sHSettingsSyncMonitor = SHSettingsSyncMonitor.INSTANCE;
    }
}