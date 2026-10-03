package com.oplus.nearx.track;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.store.base.core.http.HttpConst;
import com.oplus.aiunit.vision.EventTimer;
import com.oplus.aiunit.vision.TrackEvent;
import com.oplus.aiunit.vision.ape;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.bu6;
import com.oplus.aiunit.vision.bw9;
import com.oplus.aiunit.vision.c8l;
import com.oplus.aiunit.vision.f04;
import com.oplus.aiunit.vision.fz9;
import com.oplus.aiunit.vision.gmi;
import com.oplus.aiunit.vision.gs9;
import com.oplus.aiunit.vision.h6k;
import com.oplus.aiunit.vision.jp3;
import com.oplus.aiunit.vision.k6k;
import com.oplus.aiunit.vision.lq9;
import com.oplus.aiunit.vision.mgf;
import com.oplus.aiunit.vision.mof;
import com.oplus.aiunit.vision.nfg;
import com.oplus.aiunit.vision.pe8;
import com.oplus.aiunit.vision.u7k;
import com.oplus.aiunit.vision.v45;
import com.oplus.aiunit.vision.wb0;
import com.oplus.aiunit.vision.xkj;
import com.oplus.aiunit.vision.ynf;
import com.oplus.aiunit.vision.zp9;
import com.oplus.aiunit.vision.zt6;
import com.oplus.aiunit.vision.zz4;
import com.oplus.nearx.track.TrackApi;
import com.oplus.nearx.track.internal.balance.TrackBalanceManager;
import com.oplus.nearx.track.internal.common.AppLifeManager;
import com.oplus.nearx.track.internal.common.TrackEnv;
import com.oplus.nearx.track.internal.common.content.ContextManager;
import com.oplus.nearx.track.internal.common.content.DefaultApkBuildInfo;
import com.oplus.nearx.track.internal.common.content.GlobalConfigHelper;
import com.oplus.nearx.track.internal.common.ntp.NtpHelper;
import com.oplus.nearx.track.internal.record.TrackBean;
import com.oplus.nearx.track.internal.record.TrackRecordManager;
import com.oplus.nearx.track.internal.remoteconfig.RemoteAppConfigManager;
import com.oplus.nearx.track.internal.remoteconfig.RemoteGlobalConfigManager;
import com.oplus.nearx.track.internal.storage.db.TrackCommonDbManager;
import com.oplus.nearx.track.internal.storage.db.TrackDbManager;
import com.oplus.nearx.track.internal.storage.db.common.entity.AppConfig;
import com.oplus.nearx.track.internal.storage.db.common.entity.AppIds;
import com.oplus.nearx.track.internal.storage.sp.SharePreferenceHelper;
import com.oplus.nearx.track.internal.utils.Logger;
import com.oplus.nearx.track.internal.utils.NetworkUtil;
import com.oplus.nearx.track.internal.utils.TrackTypeHelper;
import com.sensorsdata.analytics.android.sdk.plugin.property.beans.SAPropertyFilter;
import io.protostuff.MapSchema;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Deprecated;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmName;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function5;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Ref;
import p010kotlin.jvm.internal.StringCompanionObject;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 v2\u00020\u0001:\u0004v;>AB\u0011\b\u0000\u0012\u0006\u0010:\u001a\u00020\b¢\u0006\u0004\bt\u0010uJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\u0006J\u0006\u0010\t\u001a\u00020\bJ\b\u0010\u000b\u001a\u00020\nH\u0001J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0007J\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u000fH\u0007J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001c\u001a\u00020\u000f2\u0014\u0010\u001b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u000f0\u0019H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u001f\u001a\u00020\u001eH\u0016J\u0013\u0010!\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\"\u0010&\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$J*\u0010(\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010'J,\u0010+\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\b\u0010*\u001a\u0004\u0018\u00010)J\b\u0010,\u001a\u0004\u0018\u00010\u0004J\u000e\u0010.\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u0004J\b\u0010/\u001a\u0004\u0018\u00010\u0004J\u0006\u00100\u001a\u00020\u000fJ\u000e\u00102\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u0004J\b\u00103\u001a\u0004\u0018\u00010\u0004J\u000e\u00105\u001a\u00020\u000f2\u0006\u00104\u001a\u00020$J\u0006\u00106\u001a\u00020$R\u001a\u0010:\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b7\u0010.\u001a\u0004\b8\u00109R\u0018\u0010=\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010@\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\"\u0010F\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bA\u0010?\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001b\u0010L\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\"\u0010R\u001a\u000e\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020O0M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u001b\u0010W\u001a\u00020S8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bT\u0010I\u001a\u0004\bU\u0010VR\u001b\u0010Z\u001a\u00020\n8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010I\u001a\u0004\bX\u0010YR\u001b\u0010^\u001a\u00020[8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010I\u001a\u0004\b\\\u0010]R\u001b\u0010b\u001a\u00020_8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010I\u001a\u0004\b`\u0010aR\u001a\u0010g\u001a\u00020c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u0010d\u001a\u0004\be\u0010fR\u001b\u0010k\u001a\u00020h8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010I\u001a\u0004\bi\u0010jR\"\u0010n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010mR\u0018\u0010p\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010oR\u0018\u0010q\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010oR\u0018\u0010r\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010oR\u0016\u0010s\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010.¨\u0006w"}, d2 = {"Lcom/oplus/nearx/track/TrackApi;", "", "", b2n.g, "", LogFieldKey.LEVEL_KEY, "()Ljava/lang/String;", LogFieldKey.MESSAGE_KEY, "", "u", "Lcom/oplus/aiunit/vision/mgf;", "v", "Lcom/oplus/nearx/track/TrackApi$b;", "config", "D", "", "K", "(Lcom/oplus/nearx/track/TrackApi$b;)V", "j", "Lcom/oplus/aiunit/vision/zp9;", "process", "H", "(Lcom/oplus/aiunit/vision/zp9;)V", "s", "()Lcom/oplus/aiunit/vision/zp9;", "Lkotlin/Function1;", "Lcom/oplus/nearx/track/internal/storage/db/common/entity/AppConfig;", "callback", LogFieldKey.PROCESS_NAME_KEY, "(Lkotlin/jvm/functions/Function1;)V", "", "hashCode", "other", "equals", "eventGroup", "eventId", "Lorg/json/JSONObject;", SAPropertyFilter.PROPERTIES, "N", "", "M", "Lcom/oplus/nearx/track/TrackApi$d;", "callBack", "O", "n", "userId", "J", "C", "i", "customClientId", UserInfo.SEX_FEMALE, "q", "customHead", "G", "r", "a", MapSchema.FIELD_NAME_KEY, "()J", "appId", "b", "Lcom/oplus/nearx/track/internal/storage/db/common/entity/AppConfig;", "cacheAppConfig", "c", "Z", "isInit", "d", ExifInterface.LONGITUDE_EAST, "()Z", "I", "(Z)V", "isFirstRequestEventRule", "Lcom/oplus/aiunit/vision/h6k;", MapSchema.FIELD_NAME_ENTRY, "Lkotlin/Lazy;", "o", "()Lcom/oplus/aiunit/vision/h6k;", "collector", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/oplus/aiunit/vision/y5k;", "Lcom/oplus/aiunit/vision/et6;", "f", "Ljava/util/concurrent/ConcurrentHashMap;", "trackTimerMap", "Lcom/oplus/nearx/track/internal/storage/db/TrackDbManager;", b2n.f, "z", "()Lcom/oplus/nearx/track/internal/storage/db/TrackDbManager;", "trackDbManager", "w", "()Lcom/oplus/aiunit/vision/mgf;", "recordCountManager", "Lcom/oplus/nearx/track/internal/record/TrackRecordManager;", "A", "()Lcom/oplus/nearx/track/internal/record/TrackRecordManager;", "trackRecordManager", "Lcom/oplus/aiunit/vision/fz9;", c8l.KEY_B, "()Lcom/oplus/aiunit/vision/fz9;", "trackUploadManager", "Lcom/oplus/aiunit/vision/bw9;", "Lcom/oplus/aiunit/vision/bw9;", "x", "()Lcom/oplus/aiunit/vision/bw9;", "remoteConfigManager", "Lcom/oplus/nearx/track/internal/balance/TrackBalanceManager;", "y", "()Lcom/oplus/nearx/track/internal/balance/TrackBalanceManager;", "trackBalanceManager", "Lkotlin/Pair;", "Lkotlin/Pair;", "keyAndSecret", "Ljava/lang/String;", "cacheUserId", "cacheClientId", "cacheCustomClientId", "maxCacheSize", "<init>", "(J)V", "Companion", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public final class TrackApi {

    @NotNull
    public static final String DURATION = "$duration";
    public static boolean t;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final long appId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public AppConfig cacheAppConfig;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean isInit;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean isFirstRequestEventRule;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final bw9 remoteConfigManager;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public volatile String cacheUserId;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public volatile String cacheClientId;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public volatile String cacheCustomClientId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static String r = "Track.TrackApi";

    @NotNull
    public static final Handler s = new Handler(Looper.getMainLooper());

    @NotNull
    public static final a u = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy collector = LazyKt__LazyJVMKt.lazy(new Function0<h6k>() { // from class: com.oplus.nearx.track.TrackApi$collector$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        public final h6k invoke() {
            return h6k.a(GlobalConfigHelper.INSTANCE.c(), this.this$0.getAppId());
        }
    });

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public ConcurrentHashMap<TrackEvent, EventTimer> trackTimerMap = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Lazy trackDbManager = LazyKt__LazyJVMKt.lazy(new Function0<TrackDbManager>() { // from class: com.oplus.nearx.track.TrackApi$trackDbManager$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final TrackDbManager invoke() {
            return new TrackDbManager(this.this$0.getAppId());
        }
    });

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final Lazy recordCountManager = LazyKt__LazyJVMKt.lazy(new Function0<mgf>() { // from class: com.oplus.nearx.track.TrackApi$recordCountManager$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final mgf invoke() {
            return new mgf(this.this$0.z().j());
        }
    });

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy trackRecordManager = LazyKt__LazyJVMKt.lazy(new Function0<TrackRecordManager>() { // from class: com.oplus.nearx.track.TrackApi$trackRecordManager$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final TrackRecordManager invoke() {
            return new TrackRecordManager(this.this$0.getAppId(), this.this$0.z().j(), this.this$0.getRemoteConfigManager());
        }
    });

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy trackUploadManager = LazyKt__LazyJVMKt.lazy(new Function0<u7k>() { // from class: com.oplus.nearx.track.TrackApi$trackUploadManager$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final u7k invoke() {
            return new u7k(this.this$0.getAppId(), this.this$0.z().j(), this.this$0.getRemoteConfigManager());
        }
    });

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy trackBalanceManager = LazyKt__LazyJVMKt.lazy(new Function0<TrackBalanceManager>() { // from class: com.oplus.nearx.track.TrackApi$trackBalanceManager$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final TrackBalanceManager invoke() {
            return new TrackBalanceManager(this.this$0.getAppId(), this.this$0.z().f(), this.this$0.getRemoteConfigManager());
        }
    });

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public Pair<String, String> keyAndSecret = new Pair<>("", "");

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public long maxCacheSize = zz4.JOURNAL_SIZE_LIMIT_LOW;

    @Metadata(d1 = {"\u0000G\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u001b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0007J\n\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0007J\b\u0010\u0011\u001a\u00020\u0006H\u0002J\b\u0010\u0012\u001a\u00020\u0006H\u0002J\b\u0010\u0013\u001a\u00020\u0006H\u0002J\b\u0010\u0014\u001a\u00020\u0006H\u0002J\b\u0010\u0015\u001a\u00020\u0006H\u0002R\u0014\u0010\u0017\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/oplus/nearx/track/TrackApi$Companion;", "", "Landroid/app/Application;", "application", "Lcom/oplus/nearx/track/TrackApi$c;", "staticConfig", "", LogFieldKey.MESSAGE_KEY, "n", "", "appId", "Lcom/oplus/nearx/track/TrackApi;", "j", "", "netRequestEnable", b2n.f, MapSchema.FIELD_NAME_KEY, LogFieldKey.LEVEL_KEY, "i", "f", "o", b2n.g, "", "DURATION", "Ljava/lang/String;", "ERROR_MSG_NOT_EMPTY", "TAG", "com/oplus/nearx/track/TrackApi$a", "backGroundListener", "Lcom/oplus/nearx/track/TrackApi$a;", "hasFlushAll", "Z", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "<init>", "()V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/oplus/nearx/track/TrackApi$Companion$a", "Lcom/oplus/nearx/track/internal/utils/NetworkUtil$b;", "", "a", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
        public static final class a implements NetworkUtil.b {
            public static final void c(long j2) {
                Logger.b(k6k.e(), TrackApi.r, "onNetConnectSuccess after " + j2 + "ms, flush upload.", null, null, 12, null);
                TrackApi.INSTANCE.i();
            }

            @Override // com.oplus.nearx.track.internal.utils.NetworkUtil.b
            public void a() {
                GlobalConfigHelper globalConfigHelper = GlobalConfigHelper.INSTANCE;
                if (!globalConfigHelper.j()) {
                    Logger.b(k6k.e(), TrackApi.r, "SDK has not init, Make sure you have called the TrackApi.staticInit method!", null, null, 12, null);
                    return;
                }
                if (globalConfigHelper.o()) {
                    Logger loggerE = k6k.e();
                    String str = TrackApi.r;
                    StringBuilder sb = new StringBuilder();
                    sb.append("onNetConnectSuccess, delay ");
                    final long j2 = 60000;
                    sb.append(60000L);
                    sb.append("ms to flush upload.");
                    Logger.b(loggerE, str, sb.toString(), null, null, 12, null);
                    k6k.d(1, 60000L, new Runnable() { // from class: com.oplus.aiunit.vision.f5k
                        @Override // java.lang.Runnable
                        public final void run() {
                            TrackApi.Companion.a.c(j2);
                        }
                    });
                }
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void f() {
            AppLifeManager.INSTANCE.a().f(TrackApi.u);
        }

        @JvmStatic
        public final void g(boolean netRequestEnable) {
            GlobalConfigHelper.INSTANCE.w(netRequestEnable);
        }

        public final void h() {
            if (GlobalConfigHelper.INSTANCE.o()) {
                k6k.b(new Function0<Unit>() { // from class: com.oplus.nearx.track.TrackApi$Companion$flushAll$1
                    @Override // p010kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        Long[] lArrD = ContextManager.INSTANCE.d();
                        if (lArrD != null) {
                            for (Long l2 : lArrD) {
                                TrackApi.INSTANCE.j(l2.longValue()).B().e();
                            }
                        }
                    }
                });
            }
        }

        public final void i() {
            RemoteGlobalConfigManager remoteGlobalConfigManager = RemoteGlobalConfigManager.INSTANCE;
            if (!StringsKt__StringsJVMKt.isBlank(remoteGlobalConfigManager.f())) {
                k6k.b(new Function0<Unit>() { // from class: com.oplus.nearx.track.TrackApi$Companion$flushAllWhenNetConnect$2
                    @Override // p010kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        Long[] lArrD = ContextManager.INSTANCE.d();
                        if (lArrD != null) {
                            for (Long l2 : lArrD) {
                                long jLongValue = l2.longValue();
                                TrackApi.Companion companion = TrackApi.INSTANCE;
                                if (!companion.j(jLongValue).isInit || companion.j(jLongValue).getRemoteConfigManager().m()) {
                                    Logger.b(k6k.e(), TrackApi.r, "appId=[" + jLongValue + "] isInit = " + companion.j(jLongValue).isInit + ", disableNetConnectedFlush = " + companion.j(jLongValue).getRemoteConfigManager().m(), null, null, 12, null);
                                } else {
                                    companion.j(jLongValue).B().e();
                                }
                            }
                        }
                    }
                });
            } else {
                k6k.b(new Function0<Unit>() { // from class: com.oplus.nearx.track.TrackApi$Companion$flushAllWhenNetConnect$1
                    @Override // p010kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Code duplicated, block: B:16:0x0050  */
                    /* JADX WARN: Instruction removed from duplicated block: B:16:0x0050, please report this as an issue */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        Long[] lArrD = ContextManager.INSTANCE.d();
                        if (lArrD != null) {
                            for (Long l2 : lArrD) {
                                long jLongValue = l2.longValue();
                                TrackApi.Companion companion = TrackApi.INSTANCE;
                                if (!companion.j(jLongValue).isInit) {
                                    Logger.b(k6k.e(), TrackApi.r, "appId=[" + jLongValue + "] onNetConnectSuccess isInit = " + companion.j(jLongValue).isInit + ", disableNetConnectedFlush = " + companion.j(jLongValue).getRemoteConfigManager().m() + ", BziuploadHost = " + companion.j(jLongValue).getRemoteConfigManager().j(), null, null, 12, null);
                                } else if (!(companion.j(jLongValue).getRemoteConfigManager().j().length() > 0) || companion.j(jLongValue).getRemoteConfigManager().m()) {
                                    Logger.b(k6k.e(), TrackApi.r, "appId=[" + jLongValue + "] onNetConnectSuccess isInit = " + companion.j(jLongValue).isInit + ", disableNetConnectedFlush = " + companion.j(jLongValue).getRemoteConfigManager().m() + ", BziuploadHost = " + companion.j(jLongValue).getRemoteConfigManager().j(), null, null, 12, null);
                                } else {
                                    companion.j(jLongValue).B().e();
                                }
                            }
                        }
                    }
                });
                remoteGlobalConfigManager.e();
            }
        }

        @JvmStatic
        @NotNull
        public final TrackApi j(long appId) {
            return ContextManager.INSTANCE.b(appId);
        }

        @JvmStatic
        @Nullable
        public final TrackApi k() {
            long j2 = wb0.sAppModuleId;
            if (j2 == 0) {
                return null;
            }
            return j(j2);
        }

        public final void l() {
            NetworkUtil.INSTANCE.h(GlobalConfigHelper.INSTANCE.c(), new a());
        }

        @JvmStatic
        @MainThread
        public final void m(@NotNull final Application application, @NotNull final c staticConfig) {
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(staticConfig, "staticConfig");
            if (application.getApplicationContext() != null) {
                GlobalConfigHelper globalConfigHelper = GlobalConfigHelper.INSTANCE;
                Context applicationContext = application.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "application.applicationContext");
                globalConfigHelper.r(applicationContext);
            } else {
                GlobalConfigHelper.INSTANCE.r(application);
            }
            k6k.g(new Logger(staticConfig.getEnableLog()));
            k6k.e().n(staticConfig.getLogHook());
            Logger.b(k6k.e(), TrackApi.r, "SDK call the TrackApi.staticInit method!, staticConfig=[" + staticConfig + "] , DEBUG:  false", null, null, 12, null);
            GlobalConfigHelper globalConfigHelper2 = GlobalConfigHelper.INSTANCE;
            globalConfigHelper2.y(staticConfig.getStorageFilePrefix());
            if (staticConfig.getDefaultToDeviceProtectedStorage()) {
                globalConfigHelper2.r(jp3.INSTANCE.a(globalConfigHelper2.c()));
            }
            globalConfigHelper2.t(TrackEnv.RELEASE);
            globalConfigHelper2.q(new DefaultApkBuildInfo(globalConfigHelper2.c(), staticConfig.getEnableCacheStdid()));
            TrackApiHelper trackApiHelper = TrackApiHelper.INSTANCE;
            globalConfigHelper2.x(trackApiHelper.checkUserRegion$core_statistics_release(staticConfig.getRegion()));
            globalConfigHelper2.u(TextUtils.isEmpty(staticConfig.getFeedbackRegion()) ? globalConfigHelper2.l() : trackApiHelper.checkUserRegion$core_statistics_release(staticConfig.getFeedbackRegion()));
            Logger.b(k6k.e(), TrackApi.r, "GlobalConfigHelper.region=[" + globalConfigHelper2.l() + ']', null, null, 12, null);
            if (globalConfigHelper2.l().length() == 0) {
                globalConfigHelper2.v(false);
                Logger.d(k6k.e(), TrackApi.r, "SDK TrackApi.staticInit fail, because region is empty!", null, null, 12, null);
            } else {
                globalConfigHelper2.s(staticConfig.getEnableTrackInCurrentProcess());
                TrackTypeHelper.INSTANCE.k();
                k6k.b(new Function0<Unit>() { // from class: com.oplus.nearx.track.TrackApi$Companion$staticInit$1

                    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/oplus/nearx/track/TrackApi$Companion$staticInit$1$a", "Lcom/oplus/aiunit/vision/ynf;", "", "a", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
                    public static final class a implements ynf {
                        @Override // com.oplus.aiunit.vision.ynf
                        public void a() {
                            Logger loggerE = k6k.e();
                            String str = TrackApi.r;
                            StringBuilder sb = new StringBuilder();
                            sb.append("request remoteGlobalConfig success, ntpServerAddress:");
                            RemoteGlobalConfigManager remoteGlobalConfigManager = RemoteGlobalConfigManager.INSTANCE;
                            sb.append(StringsKt__StringsJVMKt.isBlank(remoteGlobalConfigManager.h()));
                            sb.append(", bizBackupDomain:");
                            sb.append(StringsKt__StringsJVMKt.isBlank(remoteGlobalConfigManager.f()));
                            sb.append(", hasFlushAll:");
                            sb.append(TrackApi.t);
                            Logger.b(loggerE, str, sb.toString(), null, null, 12, null);
                            if (!StringsKt__StringsJVMKt.isBlank(remoteGlobalConfigManager.h())) {
                                Logger.b(k6k.e(), TrackApi.r, "initNetTimeAsync when remoteGlobalConfig success and ntpServerAddress is not blank", null, null, 12, null);
                                NtpHelper.INSTANCE.i(remoteGlobalConfigManager.h());
                            }
                            if (StringsKt__StringsJVMKt.isBlank(remoteGlobalConfigManager.f()) || TrackApi.t) {
                                return;
                            }
                            Logger.b(k6k.e(), TrackApi.r, "flushAll when remoteGlobalConfig success and bizBackupDomain is not blank", null, null, 12, null);
                            TrackApi.INSTANCE.h();
                            TrackApi.t = true;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p010kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        AppLifeManager.Companion companion = AppLifeManager.INSTANCE;
                        companion.a().m(application);
                        zt6.b();
                        zt6.a(companion.a());
                        TrackApi.Companion companion2 = TrackApi.INSTANCE;
                        companion2.f();
                        if (staticConfig.getEnableTrackSdkCrash()) {
                            gmi.INSTANCE.a();
                        }
                        companion2.l();
                        RemoteGlobalConfigManager remoteGlobalConfigManager = RemoteGlobalConfigManager.INSTANCE;
                        RemoteGlobalConfigManager.n(remoteGlobalConfigManager, TrackApi.s, false, 2, null);
                        remoteGlobalConfigManager.u(new a());
                    }
                });
                globalConfigHelper2.v(true);
            }
        }

        @JvmStatic
        @MainThread
        public final void n(@NotNull Application application, @NotNull c staticConfig) {
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(staticConfig, "staticConfig");
            if (GlobalConfigHelper.INSTANCE.j()) {
                return;
            }
            Logger.b(k6k.e(), TrackApi.r, "SDK call the TrackApi.staticInitIfUninitialized method!", null, null, 12, null);
            m(application, staticConfig);
        }

        public final void o() {
            if (pe8.d().f()) {
                k6k.b(new Function0<Unit>() { // from class: com.oplus.nearx.track.TrackApi$Companion$uploadLog$1
                    @Override // p010kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        Long[] lArrD = ContextManager.INSTANCE.d();
                        if (lArrD != null) {
                            for (Long l2 : lArrD) {
                                if (TrackApi.INSTANCE.j(l2.longValue()).getRemoteConfigManager().n()) {
                                    pe8.d().c();
                                    return;
                                }
                            }
                        }
                    }
                });
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/oplus/nearx/track/TrackApi$a", "Lcom/oplus/aiunit/vision/lq9;", "", "a", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements lq9 {
        @Override // com.oplus.aiunit.vision.lq9
        public void a() {
            Companion companion = TrackApi.INSTANCE;
            companion.h();
            companion.o();
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001f2\u00020\u0001:\u0002\u0005\rB\u0011\b\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0011\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R&\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\r\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006 "}, d2 = {"Lcom/oplus/nearx/track/TrackApi$b;", "", "", "appId", "Lcom/oplus/nearx/track/internal/storage/db/common/entity/AppConfig;", "a", "(J)Lcom/oplus/nearx/track/internal/storage/db/common/entity/AppConfig;", "Lorg/json/JSONObject;", "Lorg/json/JSONObject;", "getCustomHead$core_statistics_release", "()Lorg/json/JSONObject;", "customHead", "", "b", "Ljava/lang/String;", "getChannel$core_statistics_release", "()Ljava/lang/String;", "channel", "Lkotlin/Pair;", "c", "Lkotlin/Pair;", "()Lkotlin/Pair;", "keyAndSecret", "d", "J", "()J", "maxCacheSize", "Lcom/oplus/nearx/track/TrackApi$b$a;", "builder", "<init>", "(Lcom/oplus/nearx/track/TrackApi$b$a;)V", "Companion", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
    public static final class b {
        public static final long CACHE_SIZE_MAX = 536870912;
        public static final long CACHE_SIZE_MIN = 16777216;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final JSONObject customHead;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String channel;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Pair<String, String> keyAndSecret;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public final long maxCacheSize;

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010 \u001a\u00020\u000b\u0012\u0006\u0010!\u001a\u00020\u000b¢\u0006\u0004\b\"\u0010#J\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\n\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010R.\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001f\u001a\u00020\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006$"}, d2 = {"Lcom/oplus/nearx/track/TrackApi$b$a;", "", "Lcom/oplus/nearx/track/TrackApi$b;", "a", "Lorg/json/JSONObject;", "Lorg/json/JSONObject;", "c", "()Lorg/json/JSONObject;", "setCustomHead$core_statistics_release", "(Lorg/json/JSONObject;)V", "customHead", "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "setChannel$core_statistics_release", "(Ljava/lang/String;)V", "channel", "Lkotlin/Pair;", "Lkotlin/Pair;", "d", "()Lkotlin/Pair;", "setKeyAndSecret$core_statistics_release", "(Lkotlin/Pair;)V", "keyAndSecret", "", "J", MapSchema.FIELD_NAME_ENTRY, "()J", "setMaxCacheSize$core_statistics_release", "(J)V", "maxCacheSize", HttpConst.APP_KEY, f04.JSON_KEY_APP_SECRET, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
        public static final class a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public JSONObject customHead;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            public String channel;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public Pair<String, String> keyAndSecret;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            public long maxCacheSize;

            public a(@NotNull String appKey, @NotNull String appSecret) {
                Intrinsics.checkNotNullParameter(appKey, "appKey");
                Intrinsics.checkNotNullParameter(appSecret, "appSecret");
                this.customHead = new JSONObject();
                this.channel = "";
                this.keyAndSecret = new Pair<>("", "");
                this.maxCacheSize = zz4.JOURNAL_SIZE_LIMIT_LOW;
                ape apeVar = ape.INSTANCE;
                boolean z = !TextUtils.isEmpty(appKey);
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str = String.format("%s can't be empty", Arrays.copyOf(new Object[]{HttpConst.APP_KEY}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
                apeVar.a(z, str);
                boolean z2 = !TextUtils.isEmpty(appSecret);
                String str2 = String.format("%s can't be empty", Arrays.copyOf(new Object[]{f04.JSON_KEY_APP_SECRET}, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
                apeVar.a(z2, str2);
                this.keyAndSecret = new Pair<>(appKey, appSecret);
            }

            @NotNull
            public final b a() {
                return new b(this, null);
            }

            @NotNull
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getChannel() {
                return this.channel;
            }

            @NotNull
            /* JADX INFO: renamed from: c, reason: from getter */
            public final JSONObject getCustomHead() {
                return this.customHead;
            }

            @NotNull
            public final Pair<String, String> d() {
                return this.keyAndSecret;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final long getMaxCacheSize() {
                return this.maxCacheSize;
            }
        }

        public /* synthetic */ b(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar);
        }

        @NotNull
        public final AppConfig a(long appId) {
            return new AppConfig(0L, appId, this.channel, k6k.h(this.customHead));
        }

        @NotNull
        public final Pair<String, String> b() {
            return this.keyAndSecret;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getMaxCacheSize() {
            return this.maxCacheSize;
        }

        public b(a aVar) {
            this.customHead = aVar.getCustomHead();
            this.channel = aVar.getChannel();
            this.keyAndSecret = aVar.d();
            this.maxCacheSize = aVar.getMaxCacheSize();
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0011\b\u0002\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\b\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007R\"\u0010\u0012\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0016\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\"\u0010\u0018\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0004\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\"\u0010\u001f\u001a\u00020\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010!\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b \u0010\u0011R\"\u0010#\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\t\u0010\u000f\"\u0004\b\"\u0010\u0011R\"\u0010'\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0005\u001a\u0004\b$\u0010\u0007\"\u0004\b%\u0010&¨\u0006,"}, d2 = {"Lcom/oplus/nearx/track/TrackApi$c;", "", "", "toString", "a", "Ljava/lang/String;", b2n.g, "()Ljava/lang/String;", "region", "b", "f", "feedbackRegion", "", "c", "Z", "()Z", "setEnableLog$core_statistics_release", "(Z)V", "enableLog", "d", MapSchema.FIELD_NAME_ENTRY, "setEnableTrackSdkCrash$core_statistics_release", "enableTrackSdkCrash", "setDefaultToDeviceProtectedStorage$core_statistics_release", "defaultToDeviceProtectedStorage", "Lcom/oplus/aiunit/vision/gs9;", "Lcom/oplus/aiunit/vision/gs9;", b2n.f, "()Lcom/oplus/aiunit/vision/gs9;", "setLogHook$core_statistics_release", "(Lcom/oplus/aiunit/vision/gs9;)V", "logHook", "setEnableTrackInCurrentProcess$core_statistics_release", "enableTrackInCurrentProcess", "setEnableCacheStdid$core_statistics_release", "enableCacheStdid", "i", "setStorageFilePrefix$core_statistics_release", "(Ljava/lang/String;)V", "storageFilePrefix", "Lcom/oplus/nearx/track/TrackApi$c$a;", "builder", "<init>", "(Lcom/oplus/nearx/track/TrackApi$c$a;)V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
    public static final class c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String region;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String feedbackRegion;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public boolean enableLog;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        public boolean enableTrackSdkCrash;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        public boolean defaultToDeviceProtectedStorage;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public gs9 logHook;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
        public boolean enableTrackInCurrentProcess;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public boolean enableCacheStdid;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public String storageFilePrefix;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b1\u0010\u0012J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0007J\u0006\u0010\r\u001a\u00020\fR\"\u0010\u0013\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0016\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001e\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019\"\u0004\b \u0010\u001bR\"\u0010(\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010+\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b)\u0010\u0019\"\u0004\b*\u0010\u001bR\"\u0010-\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0017\u001a\u0004\b\"\u0010\u0019\"\u0004\b,\u0010\u001bR\"\u00100\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b.\u0010\u0010\"\u0004\b/\u0010\u0012¨\u00062"}, d2 = {"Lcom/oplus/nearx/track/TrackApi$c$a;", "", "", "enableLog", "c", "defaultToDeviceProtectedStorage", "b", "enable", "d", "", "dbPrefix", "n", "Lcom/oplus/nearx/track/TrackApi$c;", "a", "Ljava/lang/String;", LogFieldKey.LEVEL_KEY, "()Ljava/lang/String;", "setRegion$core_statistics_release", "(Ljava/lang/String;)V", "region", "j", "setFeedbackRegion$core_statistics_release", "feedbackRegion", "Z", b2n.f, "()Z", "setEnableLog$core_statistics_release", "(Z)V", "i", "setEnableTrackSdkCrash$core_statistics_release", "enableTrackSdkCrash", MapSchema.FIELD_NAME_ENTRY, "setDefaultToDeviceProtectedStorage$core_statistics_release", "Lcom/oplus/aiunit/vision/gs9;", "f", "Lcom/oplus/aiunit/vision/gs9;", MapSchema.FIELD_NAME_KEY, "()Lcom/oplus/aiunit/vision/gs9;", "setLogHook$core_statistics_release", "(Lcom/oplus/aiunit/vision/gs9;)V", "logHook", b2n.g, "setEnableTrackInCurrentProcess$core_statistics_release", "enableTrackInCurrentProcess", "setEnableCacheStdId$core_statistics_release", "enableCacheStdId", LogFieldKey.MESSAGE_KEY, "setStorageFilePrefix$core_statistics_release", "storageFilePrefix", "<init>", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
        public static final class a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            @NotNull
            public String region;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            @NotNull
            public String feedbackRegion;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            public boolean enableLog;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            public boolean enableTrackSdkCrash;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
            public boolean defaultToDeviceProtectedStorage;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            @NotNull
            public gs9 logHook;

            /* JADX INFO: renamed from: g, reason: from kotlin metadata */
            public boolean enableTrackInCurrentProcess;

            /* JADX INFO: renamed from: h, reason: from kotlin metadata */
            public boolean enableCacheStdId;

            /* JADX INFO: renamed from: i, reason: from kotlin metadata */
            @NotNull
            public String storageFilePrefix;

            public a(@NotNull String region) {
                Intrinsics.checkNotNullParameter(region, "region");
                this.region = "";
                this.feedbackRegion = "";
                this.enableTrackSdkCrash = true;
                this.logHook = v45.INSTANCE.a();
                this.storageFilePrefix = "";
                this.region = !TextUtils.isEmpty(region) ? region : "";
                this.feedbackRegion = TextUtils.isEmpty(region) ? "" : region;
            }

            @NotNull
            public final c a() {
                return new c(this, null);
            }

            @NotNull
            public final a b(boolean defaultToDeviceProtectedStorage) {
                this.defaultToDeviceProtectedStorage = defaultToDeviceProtectedStorage;
                return this;
            }

            @NotNull
            public final a c(boolean enableLog) {
                this.enableLog = enableLog;
                return this;
            }

            @NotNull
            public final a d(boolean enable) {
                this.enableTrackInCurrentProcess = enable;
                return this;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final boolean getDefaultToDeviceProtectedStorage() {
                return this.defaultToDeviceProtectedStorage;
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final boolean getEnableCacheStdId() {
                return this.enableCacheStdId;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final boolean getEnableLog() {
                return this.enableLog;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final boolean getEnableTrackInCurrentProcess() {
                return this.enableTrackInCurrentProcess;
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final boolean getEnableTrackSdkCrash() {
                return this.enableTrackSdkCrash;
            }

            @NotNull
            /* JADX INFO: renamed from: j, reason: from getter */
            public final String getFeedbackRegion() {
                return this.feedbackRegion;
            }

            @NotNull
            /* JADX INFO: renamed from: k, reason: from getter */
            public final gs9 getLogHook() {
                return this.logHook;
            }

            @NotNull
            /* JADX INFO: renamed from: l, reason: from getter */
            public final String getRegion() {
                return this.region;
            }

            @NotNull
            /* JADX INFO: renamed from: m, reason: from getter */
            public final String getStorageFilePrefix() {
                return this.storageFilePrefix;
            }

            @Deprecated(message = "使用该接口存在老埋点丢失的可能, 请谨慎使用")
            @NotNull
            public final a n(@NotNull String dbPrefix) {
                Intrinsics.checkNotNullParameter(dbPrefix, "dbPrefix");
                this.storageFilePrefix = dbPrefix;
                return this;
            }
        }

        public /* synthetic */ c(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getDefaultToDeviceProtectedStorage() {
            return this.defaultToDeviceProtectedStorage;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getEnableCacheStdid() {
            return this.enableCacheStdid;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getEnableLog() {
            return this.enableLog;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getEnableTrackInCurrentProcess() {
            return this.enableTrackInCurrentProcess;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getEnableTrackSdkCrash() {
            return this.enableTrackSdkCrash;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getFeedbackRegion() {
            return this.feedbackRegion;
        }

        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public final gs9 getLogHook() {
            return this.logHook;
        }

        @NotNull
        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getRegion() {
            return this.region;
        }

        @NotNull
        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getStorageFilePrefix() {
            return this.storageFilePrefix;
        }

        @NotNull
        public String toString() {
            return "region=" + this.region + ", feedbackRegion = " + this.feedbackRegion + ", enableLog=" + this.enableLog + ", enableTrackSdkCrash=" + this.enableTrackSdkCrash + ", defaultToDeviceProtectedStorage=" + this.defaultToDeviceProtectedStorage + ", enableTrackInCurrentProcess=" + this.enableTrackInCurrentProcess;
        }

        public c(a aVar) {
            this.region = aVar.getRegion();
            this.feedbackRegion = aVar.getFeedbackRegion();
            this.enableLog = aVar.getEnableLog();
            this.enableTrackSdkCrash = aVar.getEnableTrackSdkCrash();
            this.defaultToDeviceProtectedStorage = aVar.getDefaultToDeviceProtectedStorage();
            this.logHook = aVar.getLogHook();
            this.enableTrackInCurrentProcess = aVar.getEnableTrackInCurrentProcess();
            this.enableCacheStdid = aVar.getEnableCacheStdId();
            this.storageFilePrefix = aVar.getStorageFilePrefix();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lcom/oplus/nearx/track/TrackApi$d;", "", "", "eventGroup", "eventId", "", "isTrackSuccess", "", "onTrackEvent", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
    public interface d {
        void onTrackEvent(@NotNull String eventGroup, @NotNull String eventId, boolean isTrackSuccess);
    }

    public TrackApi(long j2) {
        this.appId = j2;
        this.remoteConfigManager = new RemoteAppConfigManager(s, j2);
    }

    @JvmStatic
    @MainThread
    public static final void L(@NotNull Application application, @NotNull c cVar) {
        INSTANCE.n(application, cVar);
    }

    @JvmStatic
    @NotNull
    public static final TrackApi t(long j2) {
        return INSTANCE.j(j2);
    }

    public final TrackRecordManager A() {
        return (TrackRecordManager) this.trackRecordManager.getValue();
    }

    @NotNull
    public final fz9 B() {
        return (fz9) this.trackUploadManager.getValue();
    }

    @Nullable
    public final String C() {
        String string;
        if (!h()) {
            return "";
        }
        if (this.cacheUserId == null && (string = SharePreferenceHelper.i(this.appId).getString("user_id", "")) != null) {
            this.cacheUserId = string;
        }
        return this.cacheUserId;
    }

    @MainThread
    public final boolean D(@NotNull final b config) {
        Intrinsics.checkNotNullParameter(config, "config");
        if (!GlobalConfigHelper.INSTANCE.j()) {
            this.isInit = false;
            Logger.b(k6k.e(), r, "appId=[" + this.appId + "] SdkVersion=[3043102] has not init, Make sure you have called the TrackApi.staticInit method!", null, null, 12, null);
            return this.isInit;
        }
        if (config.b().getFirst().length() == 0) {
            this.isInit = false;
            Logger.b(k6k.e(), r, "appId=[" + this.appId + "] SdkVersion=[3043102] appKey can't be empty", null, null, 12, null);
            return this.isInit;
        }
        if (config.b().getSecond().length() == 0) {
            this.isInit = false;
            Logger.b(k6k.e(), r, "appId=[" + this.appId + "] SdkVersion=[3043102] appSecret can't be empty", null, null, 12, null);
            return this.isInit;
        }
        if (this.isInit) {
            Logger.b(k6k.e(), r, "appId=[" + this.appId + "] SdkVersion=[3043102] You have already called the TrackApi.init method!", null, null, 12, null);
            return this.isInit;
        }
        K(config);
        k6k.b(new Function0<Unit>() { // from class: com.oplus.nearx.track.TrackApi$init$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                TrackCommonDbManager trackCommonDbManager = TrackCommonDbManager.INSTANCE;
                trackCommonDbManager.e().c(config.a(this.getAppId()));
                trackCommonDbManager.e().a(new AppIds(0L, this.getAppId(), 0L, 0L, 13, null));
                bw9.a.a(this.getRemoteConfigManager(), false, 1, null);
                bw9 remoteConfigManager = this.getRemoteConfigManager();
                final TrackApi trackApi = this;
                remoteConfigManager.e(new mof() { // from class: com.oplus.nearx.track.TrackApi$init$1.1
                    @Override // com.oplus.aiunit.vision.mof
                    public void a(long eventAppId) {
                        Logger.b(k6k.e(), TrackApi.r, "appId=[" + trackApi.getAppId() + "], eventAppId=[" + eventAppId + "] onEventRuleError", null, null, 12, null);
                        final TrackApi trackApi2 = trackApi;
                        k6k.b(new Function0<Unit>() { // from class: com.oplus.nearx.track.TrackApi$init$1$1$onEventRuleError$1
                            {
                                super(0);
                            }

                            @Override // p010kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                trackApi2.A().m();
                            }
                        });
                    }

                    @Override // com.oplus.aiunit.vision.mof
                    public void b(long eventAppId) {
                        Logger.b(k6k.e(), TrackApi.r, "appId=[" + trackApi.getAppId() + "], eventAppId=[" + trackApi.getAppId() + "] onEventRuleSuccess", null, null, 12, null);
                        final TrackApi trackApi2 = trackApi;
                        k6k.b(new Function0<Unit>() { // from class: com.oplus.nearx.track.TrackApi$init$1$1$onEventRuleSuccess$1
                            {
                                super(0);
                            }

                            @Override // p010kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                trackApi2.A().n();
                            }
                        });
                    }
                });
                this.z().f().c();
            }
        });
        boolean zD = xkj.INSTANCE.d("debug.oplus.track.sample", true);
        boolean z = SharePreferenceHelper.h().getBoolean("enableScanTestDeviceMode", false);
        Logger.b(k6k.e(), r, "isSample by adb :" + zD, null, null, 12, null);
        Logger.b(k6k.e(), r, "enableScanTestDevice :" + z, null, null, 12, null);
        if (z) {
            nfg.SAMPLE = Boolean.FALSE;
        } else {
            nfg.SAMPLE = Boolean.valueOf(zD);
        }
        this.isInit = true;
        Logger.b(k6k.e(), r, "appId=[" + this.appId + "] SdkVersion=[3043102] TrackApi.init success!!!", null, null, 12, null);
        return this.isInit;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final boolean getIsFirstRequestEventRule() {
        return this.isFirstRequestEventRule;
    }

    public final void F(@NotNull String customClientId) {
        Intrinsics.checkNotNullParameter(customClientId, "customClientId");
        if (h()) {
            this.cacheCustomClientId = customClientId;
            SharePreferenceHelper.i(this.appId).d("custom_client_id", customClientId);
        }
    }

    public final void G(@NotNull JSONObject customHead) {
        String channel;
        Intrinsics.checkNotNullParameter(customHead, "customHead");
        if (h()) {
            AppConfig appConfig = new AppConfig(0L, 0L, null, null, 15, null);
            appConfig.setAppId(this.appId);
            appConfig.setCustomHead(k6k.h(customHead));
            AppConfig appConfig2 = this.cacheAppConfig;
            if (appConfig2 == null || (channel = appConfig2.getChannel()) == null) {
                channel = "";
            }
            appConfig.setChannel(channel);
            this.cacheAppConfig = appConfig;
            TrackCommonDbManager.INSTANCE.e().d(appConfig);
        }
    }

    public final void H(@NotNull zp9 process) {
        Intrinsics.checkNotNullParameter(process, "process");
        o().d(process);
    }

    public final void I(boolean z) {
        this.isFirstRequestEventRule = z;
    }

    public final void J(@NotNull String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        if (h()) {
            this.cacheUserId = userId;
            SharePreferenceHelper.i(this.appId).d("user_id", userId);
        }
    }

    @VisibleForTesting(otherwise = 2)
    public final void K(@NotNull b config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.keyAndSecret = config.b();
        this.maxCacheSize = config.getMaxCacheSize();
        this.cacheAppConfig = config.a(this.appId);
    }

    public final void M(@NotNull String eventGroup, @NotNull String eventId, @NotNull Map<String, ? extends Object> properties) throws JSONException {
        Intrinsics.checkNotNullParameter(eventGroup, "eventGroup");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(properties, "properties");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends Object> entry : properties.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        N(eventGroup, eventId, jSONObject);
    }

    public final void N(@NotNull String eventGroup, @NotNull String eventId, @Nullable JSONObject properties) {
        Intrinsics.checkNotNullParameter(eventGroup, "eventGroup");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        O(eventGroup, eventId, properties, null);
    }

    public final void O(@NotNull final String eventGroup, @NotNull final String eventId, @Nullable JSONObject properties, @Nullable final d callBack) {
        Intrinsics.checkNotNullParameter(eventGroup, "eventGroup");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        if (h()) {
            ape apeVar = ape.INSTANCE;
            boolean z = !TextUtils.isEmpty(eventGroup);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%s can't be empty", Arrays.copyOf(new Object[]{"eventGroup"}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            apeVar.a(z, str);
            boolean z2 = !TextUtils.isEmpty(eventId);
            String str2 = String.format("%s can't be empty", Arrays.copyOf(new Object[]{"eventId"}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
            apeVar.a(z2, str2);
            if (properties == null) {
                properties = new JSONObject();
            }
            EventTimer eventTimerRemove = this.trackTimerMap.remove(new TrackEvent(eventGroup, eventId));
            if (eventTimerRemove != null) {
                eventTimerRemove.c(SystemClock.elapsedRealtime());
                long endTime = eventTimerRemove.getEndTime() - eventTimerRemove.getStartTime();
                if (endTime > 0) {
                    synchronized (properties) {
                        properties.put(DURATION, endTime);
                    }
                }
            }
            A().j(eventGroup, eventId, properties, new Function5<TrackBean, Integer, Boolean, Boolean, Integer, Unit>(callBack, eventGroup, eventId) { // from class: com.oplus.nearx.track.TrackApi$track$3
                final /* synthetic */ TrackApi.d $callBack;
                final /* synthetic */ String $eventGroup;
                final /* synthetic */ String $eventId;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(5);
                    this.$eventGroup = eventGroup;
                    this.$eventId = eventId;
                }

                /* JADX INFO: renamed from: invoke$lambda-1$lambda-0, reason: not valid java name */
                private static final void m5189invoke$lambda1$lambda0(TrackApi.d it, String eventGroup2, String eventId2, Ref.BooleanRef isSuccess) {
                    Intrinsics.checkNotNullParameter(it, "$it");
                    Intrinsics.checkNotNullParameter(eventGroup2, "$eventGroup");
                    Intrinsics.checkNotNullParameter(eventId2, "$eventId");
                    Intrinsics.checkNotNullParameter(isSuccess, "$isSuccess");
                    it.onTrackEvent(eventGroup2, eventId2, isSuccess.element);
                }

                @Override // p010kotlin.jvm.functions.Function5
                public /* bridge */ /* synthetic */ Unit invoke(TrackBean trackBean, Integer num, Boolean bool, Boolean bool2, Integer num2) {
                    invoke(trackBean, num.intValue(), bool.booleanValue(), bool2.booleanValue(), num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull TrackBean trackBean, int i, boolean z3, boolean z4, int i2) {
                    Intrinsics.checkNotNullParameter(trackBean, "trackBean");
                    Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                    booleanRef.element = z3;
                    if (z3) {
                        Logger.l(k6k.e(), "TrackRecord", "appId=[" + this.this$0.getAppId() + "], result=[success:true, msg:\"record ok\"], data=[" + trackBean + ']', null, null, 12, null);
                        this.this$0.B().c(i, trackBean.getUpload_type(), trackBean.getData_type());
                        return;
                    }
                    if (i2 == -200 || i2 == -101) {
                        GlobalConfigHelper globalConfigHelper = GlobalConfigHelper.INSTANCE;
                        if (globalConfigHelper.o() && NetworkUtil.INSTANCE.e(globalConfigHelper.c())) {
                            Logger.l(k6k.e(), "TrackRecord", "appId=[" + this.this$0.getAppId() + "], send flushWithTrackBean message when event save database failed, data=[" + trackBean + ']', null, null, 12, null);
                            this.this$0.B().d(trackBean);
                            booleanRef.element = true;
                            return;
                        }
                    }
                    Logger loggerE = k6k.e();
                    StringBuilder sb = new StringBuilder();
                    sb.append("appId=[");
                    sb.append(this.this$0.getAppId());
                    sb.append("], isCtaOpen=");
                    GlobalConfigHelper globalConfigHelper2 = GlobalConfigHelper.INSTANCE;
                    sb.append(globalConfigHelper2.o());
                    sb.append(", isNetworkConnected=");
                    sb.append(NetworkUtil.INSTANCE.e(globalConfigHelper2.c()));
                    sb.append(", result=[success:false, errorCode:");
                    sb.append(i2);
                    sb.append("], data=[");
                    sb.append(trackBean);
                    sb.append(']');
                    Logger.d(loggerE, "TrackRecord", sb.toString(), null, null, 12, null);
                }
            });
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(TrackApi.class, other != null ? other.getClass() : null)) {
            return false;
        }
        long j2 = this.appId;
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.oplus.nearx.track.TrackApi");
        return j2 == ((TrackApi) other).appId;
    }

    public final boolean h() {
        if (!GlobalConfigHelper.INSTANCE.j()) {
            Logger.b(k6k.e(), r, "appId=[" + this.appId + "] SDK has not init, Make sure you have called the TrackApi.staticInit method!", null, null, 12, null);
            return false;
        }
        if (this.isInit) {
            return true;
        }
        Logger.b(k6k.e(), r, "appId=[" + this.appId + "] You have to call the TrackApi.init method first!", null, null, 12, null);
        return false;
    }

    public int hashCode() {
        return Long.hashCode(this.appId);
    }

    public final void i() {
        if (h()) {
            this.cacheUserId = "";
            SharePreferenceHelper.i(this.appId).c("user_id");
        }
    }

    @Deprecated(message = "reference realtime track")
    public final void j() {
        if (h()) {
            if (!this.remoteConfigManager.q()) {
                Logger.b(k6k.e(), r, "appId=[" + this.appId + "] flush switch is off", null, null, 12, null);
                return;
            }
            Logger.b(k6k.e(), r, "appId=[" + this.appId + "] 主动调用flush api 触发上报", null, null, 12, null);
            B().e();
        }
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getAppId() {
        return this.appId;
    }

    @NotNull
    public final String l() {
        return this.keyAndSecret.getFirst();
    }

    @NotNull
    public final String m() {
        return this.keyAndSecret.getSecond();
    }

    @Nullable
    public final String n() {
        String string;
        if (!h()) {
            return "";
        }
        if (this.cacheClientId == null && (string = SharePreferenceHelper.i(this.appId).getString("client_id", "")) != null) {
            this.cacheClientId = string;
        }
        return this.cacheClientId;
    }

    public final h6k o() {
        Object value = this.collector.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-collector>(...)");
        return (h6k) value;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0035  */
    /* JADX WARN: Code duplicated, block: B:26:0x0043  */
    public final void p(@NotNull Function1<? super AppConfig, Unit> callback) {
        AppConfig appConfigE;
        Intrinsics.checkNotNullParameter(callback, "callback");
        AppConfig appConfig = this.cacheAppConfig;
        if (appConfig != null) {
            String customHead = appConfig != null ? appConfig.getCustomHead() : null;
            if (customHead == null || customHead.length() == 0) {
                appConfigE = TrackCommonDbManager.INSTANCE.e().e(this.appId);
                if (appConfigE != null) {
                    this.cacheAppConfig = appConfigE;
                }
            } else {
                AppConfig appConfig2 = this.cacheAppConfig;
                String channel = appConfig2 != null ? appConfig2.getChannel() : null;
                if (channel == null || channel.length() == 0) {
                    appConfigE = TrackCommonDbManager.INSTANCE.e().e(this.appId);
                    if (appConfigE != null) {
                        this.cacheAppConfig = appConfigE;
                    }
                }
            }
        } else {
            appConfigE = TrackCommonDbManager.INSTANCE.e().e(this.appId);
            if (appConfigE != null) {
                this.cacheAppConfig = appConfigE;
            }
        }
        callback.invoke(this.cacheAppConfig);
    }

    @Nullable
    public final String q() {
        String string;
        if (!h()) {
            return "";
        }
        if (this.cacheCustomClientId == null && (string = SharePreferenceHelper.i(this.appId).getString("custom_client_id", "")) != null) {
            this.cacheCustomClientId = string;
        }
        return this.cacheCustomClientId;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0026  */
    /* JADX WARN: Code duplicated, block: B:19:0x0034  */
    @NotNull
    public final JSONObject r() {
        AppConfig appConfigE;
        JSONObject jSONObject = new JSONObject();
        if (!h()) {
            return jSONObject;
        }
        AppConfig appConfig = this.cacheAppConfig;
        if (appConfig == null) {
            appConfigE = TrackCommonDbManager.INSTANCE.e().e(this.appId);
            if (appConfigE != null) {
                this.cacheAppConfig = appConfigE;
            }
        } else {
            String customHead = appConfig != null ? appConfig.getCustomHead() : null;
            if (customHead == null || customHead.length() == 0) {
                appConfigE = TrackCommonDbManager.INSTANCE.e().e(this.appId);
                if (appConfigE != null) {
                    this.cacheAppConfig = appConfigE;
                }
            }
        }
        AppConfig appConfig2 = this.cacheAppConfig;
        return (appConfig2 == null || StringsKt__StringsJVMKt.isBlank(appConfig2.getCustomHead())) ? jSONObject : new JSONObject(appConfig2.getCustomHead());
    }

    @Nullable
    public final zp9 s() {
        bu6 bu6VarB = o().b();
        if (bu6VarB != null) {
            return bu6VarB.c();
        }
        return null;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final long getMaxCacheSize() {
        return this.maxCacheSize;
    }

    @JvmName(name = "getRecordCountManager")
    @NotNull
    public final mgf v() {
        return w();
    }

    @NotNull
    public final mgf w() {
        return (mgf) this.recordCountManager.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: x, reason: from getter */
    public final bw9 getRemoteConfigManager() {
        return this.remoteConfigManager;
    }

    @NotNull
    public final TrackBalanceManager y() {
        return (TrackBalanceManager) this.trackBalanceManager.getValue();
    }

    @NotNull
    public final TrackDbManager z() {
        return (TrackDbManager) this.trackDbManager.getValue();
    }
}
