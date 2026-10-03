package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Build;
import com.heytap.health.base.oplus.osense.LongCase;
import com.heytap.health.base.oplus.osense.ShortCase;
import com.heytap.health.base.track.quality.QualityTrack;
import com.heytap.health.base.track.quality.Scenes;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.osense.OsenseResEventClient;
import com.oplus.osense.task.BgRunningCallback;
import com.oplus.osense.task.FreezeDelayCallback;
import com.oplus.smartenginehelper.entity.ViewEntity;
import io.protostuff.MapSchema;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u001f&*B\t\b\u0002¢\u0006\u0004\b.\u0010/J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\u000b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\nJ\u0018\u0010\u000e\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\fJ\u0018\u0010\u0010\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u000fJ\u0018\u0010\u0011\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\fJ\u0016\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012J\b\u0010\u0016\u001a\u00020\u0002H\u0002J\u0018\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0002J#\u0010\u001c\u001a\u00020\u00122\u0012\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001a\"\u00020\u0001H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 RH\u0010(\u001a6\u0012\f\u0012\n $*\u0004\u0018\u00010#0#\u0012\u0006\u0012\u0004\u0018\u00010\f $*\u001a\u0012\f\u0012\n $*\u0004\u0018\u00010#0#\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010%0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'RH\u0010+\u001a6\u0012\f\u0012\n $*\u0004\u0018\u00010)0)\u0012\u0006\u0012\u0004\u0018\u00010\f $*\u001a\u0012\f\u0012\n $*\u0004\u0018\u00010)0)\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010%0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010'R\u0018\u0010-\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010,¨\u00060"}, d2 = {"Lcom/oplus/aiunit/vision/x3d;", "", "", "f", "Lcom/oplus/aiunit/vision/x3d$b;", "callback", "", "d", "Landroid/content/Context;", "context", "Lcom/oplus/aiunit/vision/x3d$c;", MapSchema.FIELD_NAME_KEY, "", "requestId", MapSchema.FIELD_NAME_ENTRY, "Lcom/oplus/aiunit/vision/x3d$a;", LogFieldKey.LEVEL_KEY, LogFieldKey.MESSAGE_KEY, "", "tag", "message", "i", b2n.g, ViewEntity.ENABLED, "hasDeviceConnected", "j", "", "item", b2n.f, "([Ljava/lang/Object;)Ljava/lang/String;", "Lcom/oplus/osense/OsenseResEventClient;", "a", "Lcom/oplus/osense/OsenseResEventClient;", "sClient", "", "Lcom/heytap/health/base/oplus/osense/ShortCase;", "kotlin.jvm.PlatformType", "", "b", "Ljava/util/Map;", "sShoreCaseRequestIdMap", "Lcom/heytap/health/base/oplus/osense/LongCase;", "c", "sLongCaseRequestIdMap", "Lcom/oplus/aiunit/vision/x3d$b;", "sDeviceConnectCallback", "<init>", "()V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOPlusOSenseRes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OPlusOSenseRes.kt\ncom/heytap/health/base/oplus/osense/OPlusOSenseRes\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,387:1\n1855#2,2:388\n1855#2,2:390\n*S KotlinDebug\n*F\n+ 1 OPlusOSenseRes.kt\ncom/heytap/health/base/oplus/osense/OPlusOSenseRes\n*L\n125#1:388,2\n189#1:390,2\n*E\n"})
public final class x3d {

    @NotNull
    public static final x3d INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static OsenseResEventClient sClient;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Map<ShortCase, Integer> sShoreCaseRequestIdMap;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Map<LongCase, Integer> sLongCaseRequestIdMap;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public static b sDeviceConnectCallback;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H&R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/x3d$a;", "", "Lcom/oplus/osense/task/BgRunningCallback;", MapSchema.FIELD_NAME_ENTRY, "", "requestId", "resultCode", "", "f", "c", "b", "Lcom/heytap/health/base/oplus/osense/LongCase;", "a", "Lcom/heytap/health/base/oplus/osense/LongCase;", "d", "()Lcom/heytap/health/base/oplus/osense/LongCase;", "case", "", "Ljava/lang/String;", "TAG", "<init>", "(Lcom/heytap/health/base/oplus/osense/LongCase;)V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final LongCase case;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String TAG;

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.x3d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0017¨\u0006\b"}, d2 = {"com/oplus/aiunit/vision/x3d$a$a", "Lcom/oplus/osense/task/BgRunningCallback;", "", "requestId", "resultCode", "", "requestRunningTaskInfo", "cancelRunningTaskInfo", "lib_base_release"}, k = 1, mv = {1, 8, 0})
        public static final class C0942a extends BgRunningCallback {
            public C0942a() {
            }

            @Deprecated(message = "不会回调")
            public void cancelRunningTaskInfo(int requestId, int resultCode) {
                x3d.INSTANCE.i(a.this.TAG, "cancelRunningTaskInfo() requestId = " + requestId + ", resultCode = " + resultCode);
                Map sLongCaseRequestIdMap = x3d.sLongCaseRequestIdMap;
                Intrinsics.checkNotNullExpressionValue(sLongCaseRequestIdMap, "sLongCaseRequestIdMap");
                sLongCaseRequestIdMap.put(a.this.getCase(), null);
                if (resultCode == 10101) {
                    a.this.b(requestId);
                } else {
                    a.this.c(requestId, resultCode);
                }
            }

            public void requestRunningTaskInfo(int requestId, int resultCode) {
                x3d x3dVar = x3d.INSTANCE;
                x3dVar.i(a.this.TAG, "requestRunningTaskInfo() requestId = " + requestId + ", resultCode = " + resultCode);
                if (resultCode == 10000) {
                    QualityTrack.INSTANCE.g(Scenes.OSENSE_RES_LONG, x3dVar.g(a.this.getCase().getCaseName(), "requestRunningTaskInfo", Integer.valueOf(requestId), Integer.valueOf(resultCode)));
                } else {
                    QualityTrack.INSTANCE.e(Scenes.OSENSE_RES_LONG, x3dVar.g(a.this.getCase().getCaseName(), "requestRunningTaskInfo", Integer.valueOf(requestId), Integer.valueOf(resultCode)));
                }
                Map sLongCaseRequestIdMap = x3d.sLongCaseRequestIdMap;
                Intrinsics.checkNotNullExpressionValue(sLongCaseRequestIdMap, "sLongCaseRequestIdMap");
                sLongCaseRequestIdMap.put(a.this.getCase(), Integer.valueOf(requestId));
                a.this.f(requestId, resultCode);
            }
        }

        public a(@NotNull LongCase longCase) {
            Intrinsics.checkNotNullParameter(longCase, "case");
            this.case = longCase;
            this.TAG = "OOSR_BRC_" + longCase.getCaseName();
        }

        public abstract void b(int requestId);

        @Deprecated(message = "不会回调")
        public final void c(int requestId, int resultCode) {
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final LongCase getCase() {
            return this.case;
        }

        @NotNull
        public final BgRunningCallback e() {
            return new C0942a();
        }

        public abstract void f(int requestId, int resultCode);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/x3d$b;", "", "", "a", "lib_base_release"}, k = 1, mv = {1, 8, 0})
    public interface b {
        boolean a();
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010\u0003\u001a\u00020\u0002J \u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H&J\u0018\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0006H\u0007R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/x3d$c;", "", "Lcom/oplus/osense/task/FreezeDelayCallback;", MapSchema.FIELD_NAME_ENTRY, "", "requestId", "", "delayTime", "resultCode", "", "c", "b", "timeout", "f", "Lcom/heytap/health/base/oplus/osense/ShortCase;", "a", "Lcom/heytap/health/base/oplus/osense/ShortCase;", "d", "()Lcom/heytap/health/base/oplus/osense/ShortCase;", "case", "", "Ljava/lang/String;", "TAG", "<init>", "(Lcom/heytap/health/base/oplus/osense/ShortCase;)V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final ShortCase case;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String TAG;

        @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0017J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0017¨\u0006\f"}, d2 = {"com/oplus/aiunit/vision/x3d$c$a", "Lcom/oplus/osense/task/FreezeDelayCallback;", "", "requestId", "", "delayTime", "resultCode", "", "delayInfo", "cancelInfo", "timeout", "pendingFreeze", "lib_base_release"}, k = 1, mv = {1, 8, 0})
        public static final class a extends FreezeDelayCallback {
            public a() {
            }

            @Deprecated(message = "不会回调")
            public void cancelInfo(int requestId, int resultCode) {
                x3d.INSTANCE.i(c.this.TAG, "cancelInfo() requestId = " + requestId + ", resultCode = " + resultCode);
                Map sShoreCaseRequestIdMap = x3d.sShoreCaseRequestIdMap;
                Intrinsics.checkNotNullExpressionValue(sShoreCaseRequestIdMap, "sShoreCaseRequestIdMap");
                sShoreCaseRequestIdMap.put(c.this.getCase(), null);
                c.this.b(requestId, resultCode);
            }

            public void delayInfo(int requestId, long delayTime, int resultCode) {
                x3d x3dVar = x3d.INSTANCE;
                x3dVar.i(c.this.TAG, "delayInfo() requestId = " + requestId + ", delayTime = " + delayTime + ", resultCode = " + resultCode);
                if (resultCode == 10000) {
                    QualityTrack.INSTANCE.g(Scenes.OSENSE_RES_SHORT, x3dVar.g(c.this.getCase().getCaseName(), "delayInfo", Integer.valueOf(requestId), Long.valueOf(delayTime), Integer.valueOf(resultCode)));
                } else {
                    QualityTrack.INSTANCE.e(Scenes.OSENSE_RES_SHORT, x3dVar.g(c.this.getCase().getCaseName(), "delayInfo", Integer.valueOf(requestId), Long.valueOf(delayTime), Integer.valueOf(resultCode)));
                }
                Map sShoreCaseRequestIdMap = x3d.sShoreCaseRequestIdMap;
                Intrinsics.checkNotNullExpressionValue(sShoreCaseRequestIdMap, "sShoreCaseRequestIdMap");
                sShoreCaseRequestIdMap.put(c.this.getCase(), Integer.valueOf(requestId));
                c.this.c(requestId, delayTime, resultCode);
            }

            @Deprecated(message = "已废弃")
            public void pendingFreeze(int requestId, long timeout) {
                x3d.INSTANCE.i(c.this.TAG, "pendingFreeze() requestId = " + requestId + ", timeout = " + timeout);
                c.this.f(requestId, timeout);
            }
        }

        public c(@NotNull ShortCase shortCase) {
            Intrinsics.checkNotNullParameter(shortCase, "case");
            this.case = shortCase;
            this.TAG = "OOSR_FDC_" + shortCase.getCaseName();
        }

        @Deprecated(message = "不会回调")
        public final void b(int requestId, int resultCode) {
        }

        public abstract void c(int requestId, long delayTime, int resultCode);

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final ShortCase getCase() {
            return this.case;
        }

        @NotNull
        public final FreezeDelayCallback e() {
            return new a();
        }

        @Deprecated(message = "已废弃")
        public final void f(int requestId, long timeout) {
        }
    }

    static {
        x3d x3dVar = new x3d();
        INSTANCE = x3dVar;
        sShoreCaseRequestIdMap = Collections.synchronizedMap(new EnumMap(ShortCase.class));
        sLongCaseRequestIdMap = Collections.synchronizedMap(new EnumMap(LongCase.class));
        if (Build.VERSION.SDK_INT <= 34) {
            x3dVar.i("OOSR", "static initializer:  2");
            return;
        }
        if (!(v3d.j() || v3d.i() || v3d.k())) {
            x3dVar.i("OOSR", "static initializer:  1");
            return;
        }
        OsenseResEventClient osenseResEventClient = OsenseResEventClient.getInstance();
        Intrinsics.checkNotNullExpressionValue(osenseResEventClient, "getInstance()");
        sClient = osenseResEventClient;
    }

    public final void d(@NotNull b callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        sDeviceConnectCallback = callback;
    }

    public final boolean e(@Nullable Context context, int requestId) {
        boolean zH = h();
        boolean z = sClient != null;
        String strJ = j(z, zH);
        if (!z) {
            i("OOSR", "cancelFreezeDelay() requestId = " + requestId + ", " + strJ + "!!!");
            return true;
        }
        OsenseResEventClient osenseResEventClient = sClient;
        OsenseResEventClient osenseResEventClient2 = null;
        if (osenseResEventClient == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sClient");
            osenseResEventClient = null;
        }
        boolean zCancelFreezeDelay = osenseResEventClient.cancelFreezeDelay(context, requestId);
        if (zCancelFreezeDelay) {
            Iterator<T> it = sShoreCaseRequestIdMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Integer num = (Integer) entry.getValue();
                if (num != null && num.intValue() == requestId) {
                    Map<ShortCase, Integer> sShoreCaseRequestIdMap2 = sShoreCaseRequestIdMap;
                    Intrinsics.checkNotNullExpressionValue(sShoreCaseRequestIdMap2, "sShoreCaseRequestIdMap");
                    sShoreCaseRequestIdMap2.put((ShortCase) entry.getKey(), null);
                }
            }
        }
        OsenseResEventClient osenseResEventClient3 = sClient;
        if (osenseResEventClient3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sClient");
        } else {
            osenseResEventClient2 = osenseResEventClient3;
        }
        i("OOSR", "cancelFreezeDelay() requestId = " + requestId + ", result = " + zCancelFreezeDelay + ", remainingFreezeTime = " + osenseResEventClient2.getRemainingFreezeTime(context) + ", " + strJ);
        return zCancelFreezeDelay;
    }

    public final boolean f() {
        return sClient != null;
    }

    public final String g(Object... item) {
        return ArraysKt___ArraysKt.joinToString$default(item, "$", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
    }

    public final boolean h() {
        b bVar = sDeviceConnectCallback;
        if (bVar != null) {
            return bVar.a();
        }
        return false;
    }

    public final void i(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        a7b.f(tag, message);
    }

    public final String j(boolean enabled, boolean hasDeviceConnected) {
        if (enabled) {
            return hasDeviceConnected ? "device connected" : "";
        }
        return "not enable";
    }

    public final void k(@Nullable Context context, @NotNull c callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        boolean zH = h();
        boolean z = sClient != null;
        String strJ = j(z, zH);
        if (zH || !z) {
            i("OOSR", "requestFreezeDelay() useCase = " + callback.getCase() + ", " + strJ + "!!!");
            callback.c(0, Long.MAX_VALUE, 10000);
            return;
        }
        OsenseResEventClient osenseResEventClient = sClient;
        OsenseResEventClient osenseResEventClient2 = null;
        if (osenseResEventClient == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sClient");
            osenseResEventClient = null;
        }
        long remainingFreezeTime = osenseResEventClient.getRemainingFreezeTime(context);
        i("OOSR", "requestFreezeDelay() useCase = " + callback.getCase() + ", remainingFreezeTime = " + remainingFreezeTime);
        QualityTrack.INSTANCE.c(Scenes.OSENSE_RES_SHORT, g(callback.getCase().getCaseName(), Long.valueOf(remainingFreezeTime)));
        if (remainingFreezeTime < 1000) {
            com.heytap.health.base.track.a.p().a("type", 3).a("msg", g(callback.getCase().getCaseName(), Long.valueOf(remainingFreezeTime))).b();
        }
        OsenseResEventClient osenseResEventClient3 = sClient;
        if (osenseResEventClient3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sClient");
        } else {
            osenseResEventClient2 = osenseResEventClient3;
        }
        osenseResEventClient2.requestFreezeDelay(context, callback.getCase().getCaseName(), callback.e());
    }

    public final void l(@Nullable Context context, @NotNull a callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (sClient == null) {
            i("OOSR", "startBackgroundRunning() useCase = " + callback.getCase() + ", not enable!");
            callback.f(0, 10000);
            return;
        }
        i("OOSR", "startBackgroundRunning() useCase = " + callback.getCase());
        QualityTrack.INSTANCE.c(Scenes.OSENSE_RES_LONG, g(callback.getCase().getCaseName()));
        OsenseResEventClient osenseResEventClient = sClient;
        if (osenseResEventClient == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sClient");
            osenseResEventClient = null;
        }
        osenseResEventClient.startBackgroundRunning(context, callback.getCase().getMode(), callback.e());
    }

    public final boolean m(@Nullable Context context, int requestId) {
        OsenseResEventClient osenseResEventClient = sClient;
        if (osenseResEventClient == null) {
            i("OOSR", "stopBackgroundRunning() requestId = " + requestId + ", not enable!");
            return true;
        }
        if (osenseResEventClient == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sClient");
            osenseResEventClient = null;
        }
        boolean zStopBackgroundRunning = osenseResEventClient.stopBackgroundRunning(context, requestId);
        if (zStopBackgroundRunning) {
            Iterator<T> it = sLongCaseRequestIdMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Integer num = (Integer) entry.getValue();
                if (num != null && num.intValue() == requestId) {
                    Map<LongCase, Integer> sLongCaseRequestIdMap2 = sLongCaseRequestIdMap;
                    Intrinsics.checkNotNullExpressionValue(sLongCaseRequestIdMap2, "sLongCaseRequestIdMap");
                    sLongCaseRequestIdMap2.put((LongCase) entry.getKey(), null);
                }
            }
        }
        i("OOSR", "stopBackgroundRunning() requestId = " + requestId + ", result = " + zStopBackgroundRunning);
        return zStopBackgroundRunning;
    }
}
