package com.oplus.drs.track.routing.remote;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.heytap.health.health_archives.web.HealthArchiveWebViewActivity;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.a66;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.b87;
import com.oplus.aiunit.vision.bf3;
import com.oplus.aiunit.vision.c90;
import com.oplus.aiunit.vision.df3;
import com.oplus.aiunit.vision.hxe;
import com.oplus.aiunit.vision.mla;
import com.oplus.aiunit.vision.ojg;
import com.oplus.aiunit.vision.sjg;
import com.oplus.aiunit.vision.ut9;
import com.oplus.drs.core.model.OTrackEvent;
import com.oplus.drs.core.model.TrackType;
import com.oplus.drs.rom.sdk.comm.log.TrackLogger;
import com.oplus.drs.rom.sdk.comm.strategy.IpcFailoverManager;
import com.oplus.drs.rom.sdk.comm.util.OpenIdUtils;
import com.oplus.drs.track.ITrackEventCallBack;
import com.oplus.drs.track.impl.BaseTrackImpl;
import com.oplus.drs.track.routing.remote.RemoteTrackApiImpl;
import java.util.List;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;
import p010kotlin.coroutines.jvm.internal.SuspendLambda;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0017J\u001a\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0007H\u0002J\u0012\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/oplus/drs/track/routing/remote/RemoteTrackApiImpl;", "Lcom/oplus/drs/track/impl/BaseTrackImpl;", "Lcom/oplus/aiunit/vision/df3;", "clientConfig", "", b2n.g, "flush", "Lcom/oplus/drs/core/model/OTrackEvent;", "oTrackEvent", "Lcom/oplus/drs/track/ITrackEventCallBack;", "callBack", "j", "q", "o", "event", LogFieldKey.MESSAGE_KEY, "", "id", "", "n", "", LogFieldKey.PROCESS_NAME_KEY, "J", "appId", "Lcom/oplus/aiunit/vision/a66;", "Lcom/oplus/aiunit/vision/a66;", "drsTrack", "<init>", "(J)V", "Companion", "a", "obus-sdk_release"}, k = 1, mv = {1, 7, 1})
public class RemoteTrackApiImpl extends BaseTrackImpl {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "DRSTrackImpl";

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public final long appId;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public a66 drsTrack;

    /* JADX INFO: renamed from: com.oplus.drs.track.routing.remote.RemoteTrackApiImpl$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u0004\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/oplus/drs/track/routing/remote/RemoteTrackApiImpl$a;", "", "", "duid", "b", "TAG", "Ljava/lang/String;", "<init>", "()V", "obus-sdk_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String b(String duid) {
            if (duid == null || duid.length() == 0) {
                return "(empty)";
            }
            if (duid.length() <= 8) {
                return duid;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("***");
            String strSubstring = duid.substring(duid.length() - 8);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            sb.append(strSubstring);
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\u000b"}, d2 = {"com/oplus/drs/track/routing/remote/RemoteTrackApiImpl$b", "Lcom/oplus/aiunit/vision/bf3;", "", HealthArchiveWebViewActivity.H5_DATA_ID_KEY, "", "c", "", "errorCode", "", "message", "a", "obus-sdk_release"}, k = 1, mv = {1, 7, 1})
    public static final class b implements bf3 {
        public final /* synthetic */ ITrackEventCallBack a;
        public final /* synthetic */ OTrackEvent b;

        public b(ITrackEventCallBack iTrackEventCallBack, OTrackEvent oTrackEvent) {
            this.a = iTrackEventCallBack;
            this.b = oTrackEvent;
        }

        @Override // com.oplus.aiunit.vision.bf3
        public void a(int errorCode, @Nullable String message) {
            ITrackEventCallBack iTrackEventCallBack = this.a;
            if (iTrackEventCallBack != null) {
                String eventGroup = this.b.getEventGroup();
                Intrinsics.checkNotNullExpressionValue(eventGroup, "oTrackEvent.eventGroup");
                String eventId = this.b.getEventId();
                Intrinsics.checkNotNullExpressionValue(eventId, "oTrackEvent.eventId");
                iTrackEventCallBack.onTrackEvent(eventGroup, eventId, false);
            }
        }

        @Override // com.oplus.aiunit.vision.bf3
        public void c(long dataId) {
            ITrackEventCallBack iTrackEventCallBack = this.a;
            if (iTrackEventCallBack != null) {
                String eventGroup = this.b.getEventGroup();
                Intrinsics.checkNotNullExpressionValue(eventGroup, "oTrackEvent.eventGroup");
                String eventId = this.b.getEventId();
                Intrinsics.checkNotNullExpressionValue(eventId, "oTrackEvent.eventId");
                iTrackEventCallBack.onTrackEvent(eventGroup, eventId, true);
            }
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\u000b"}, d2 = {"com/oplus/drs/track/routing/remote/RemoteTrackApiImpl$c", "Lcom/oplus/aiunit/vision/bf3;", "", HealthArchiveWebViewActivity.H5_DATA_ID_KEY, "", "c", "", "errorCode", "", "message", "a", "obus-sdk_release"}, k = 1, mv = {1, 7, 1})
    public static final class c implements bf3 {
        public final /* synthetic */ OTrackEvent a;
        public final /* synthetic */ ITrackEventCallBack b;

        public c(OTrackEvent oTrackEvent, ITrackEventCallBack iTrackEventCallBack) {
            this.a = oTrackEvent;
            this.b = iTrackEventCallBack;
        }

        @Override // com.oplus.aiunit.vision.bf3
        public void a(int errorCode, @Nullable String message) {
            TrackLogger.e(RemoteTrackApiImpl.TAG, "Track event failed: eventGroup=%s, eventId=%s, errorCode=%d, message=%s", this.a.getEventGroup(), this.a.getEventId(), Integer.valueOf(errorCode), message);
            ITrackEventCallBack iTrackEventCallBack = this.b;
            if (iTrackEventCallBack != null) {
                String eventGroup = this.a.getEventGroup();
                Intrinsics.checkNotNullExpressionValue(eventGroup, "oTrackEvent.eventGroup");
                String eventId = this.a.getEventId();
                Intrinsics.checkNotNullExpressionValue(eventId, "oTrackEvent.eventId");
                iTrackEventCallBack.onTrackEvent(eventGroup, eventId, false);
            }
        }

        @Override // com.oplus.aiunit.vision.bf3
        public void c(long dataId) {
            TrackLogger.c(RemoteTrackApiImpl.TAG, "Track event success: eventGroup=%s, eventId=%s, dataId=%d", this.a.getEventGroup(), this.a.getEventId(), Long.valueOf(dataId));
            ITrackEventCallBack iTrackEventCallBack = this.b;
            if (iTrackEventCallBack != null) {
                String eventGroup = this.a.getEventGroup();
                Intrinsics.checkNotNullExpressionValue(eventGroup, "oTrackEvent.eventGroup");
                String eventId = this.a.getEventId();
                Intrinsics.checkNotNullExpressionValue(eventId, "oTrackEvent.eventId");
                iTrackEventCallBack.onTrackEvent(eventGroup, eventId, true);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"com/oplus/drs/track/routing/remote/RemoteTrackApiImpl$d", "Lcom/oplus/aiunit/vision/ut9;", "", "Lcom/oplus/aiunit/vision/hxe;", "sucInfos", "failedInfos", "", "a", "obus-sdk_release"}, k = 1, mv = {1, 7, 1})
    public static final class d implements ut9 {
        public final /* synthetic */ OTrackEvent a;
        public final /* synthetic */ ITrackEventCallBack b;

        public d(OTrackEvent oTrackEvent, ITrackEventCallBack iTrackEventCallBack) {
            this.a = oTrackEvent;
            this.b = iTrackEventCallBack;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0023  */
        @Override // com.oplus.aiunit.vision.ut9
        public void a(@Nullable List<hxe> sucInfos, @Nullable List<hxe> failedInfos) {
            boolean z;
            List<hxe> list = sucInfos;
            if (!(list == null || list.isEmpty())) {
                List<hxe> list2 = failedInfos;
                z = list2 == null || list2.isEmpty();
            }
            if (z) {
                TrackLogger.c(RemoteTrackApiImpl.TAG, "Direct track success: " + this.a.getEventGroup() + mla.SEPARATOR + this.a.getEventId(), new Object[0]);
            } else {
                TrackLogger.e(RemoteTrackApiImpl.TAG, "Direct track failed: " + this.a.getEventGroup() + mla.SEPARATOR + this.a.getEventId(), new Object[0]);
            }
            ITrackEventCallBack iTrackEventCallBack = this.b;
            if (iTrackEventCallBack != null) {
                String eventGroup = this.a.getEventGroup();
                Intrinsics.checkNotNullExpressionValue(eventGroup, "oTrackEvent.eventGroup");
                String eventId = this.a.getEventId();
                Intrinsics.checkNotNullExpressionValue(eventId, "oTrackEvent.eventId");
                iTrackEventCallBack.onTrackEvent(eventGroup, eventId, z);
            }
        }
    }

    /* JADX INFO: renamed from: com.oplus.drs.track.routing.remote.RemoteTrackApiImpl$flush$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.oplus.drs.track.routing.remote.RemoteTrackApiImpl$flush$1", f = "RemoteTrackApiImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return RemoteTrackApiImpl.this.new AnonymousClass1(continuation);
        }

        @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                a66 a66Var = RemoteTrackApiImpl.this.drsTrack;
                if (a66Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("drsTrack");
                    a66Var = null;
                }
                a66Var.c();
            } catch (Exception e2) {
                TrackLogger.d(RemoteTrackApiImpl.TAG, "force upload data failed", e2, new Object[0]);
            }
            return Unit.INSTANCE;
        }

        @Override // p010kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public RemoteTrackApiImpl(long j2) {
        super(j2, TAG);
        this.appId = j2;
    }

    public static final void p(final RemoteTrackApiImpl this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            ProcessLifecycleOwner.get().getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.oplus.drs.track.routing.remote.RemoteTrackApiImpl$registerLifecycleObserver$action$1$1

                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                public /* synthetic */ class a {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[Lifecycle.Event.values().length];
                        iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
                        iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 2;
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(@NotNull LifecycleOwner source, @NotNull Lifecycle.Event event) {
                    Intrinsics.checkNotNullParameter(source, "source");
                    Intrinsics.checkNotNullParameter(event, "event");
                    int i = a.$EnumSwitchMapping$0[event.ordinal()];
                    if (i == 1) {
                        TrackLogger.c(RemoteTrackApiImpl.TAG, "application entry foreground", new Object[0]);
                    } else {
                        if (i != 2) {
                            return;
                        }
                        TrackLogger.c(RemoteTrackApiImpl.TAG, "app enter background, force upload.", new Object[0]);
                        BuildersKt__Builders_commonKt.launch$default(this.i.getScope(), null, null, new RemoteTrackApiImpl$registerLifecycleObserver$action$1$1$onStateChanged$1(this.i, null), 3, null);
                    }
                }
            });
        } catch (Throwable th) {
            TrackLogger.d(TAG, "registerLifecycleObserver failed", th, new Object[0]);
        }
    }

    @Override // com.oplus.drs.track.ITrackApi
    @Deprecated(message = "reference realtime track")
    public void flush() throws InterruptedException {
        if (!getIsInitialized()) {
            TrackLogger.e(TAG, "DrsSdk not init, init() first", new Object[0]);
        } else {
            TrackLogger.h(TAG, "force upload data.", new Object[0]);
            BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(null), 1, null);
        }
    }

    @Override // com.oplus.drs.track.impl.BaseTrackImpl
    public void h(@NotNull df3 clientConfig) {
        Intrinsics.checkNotNullParameter(clientConfig, "clientConfig");
        a66 a66VarD = a66.d(c90.a(), String.valueOf(this.appId));
        Intrinsics.checkNotNullExpressionValue(a66VarD, "get(AppCxt.get(), appId.toString())");
        this.drsTrack = a66VarD;
        if (a66VarD == null) {
            Intrinsics.throwUninitializedPropertyAccessException("drsTrack");
            a66VarD = null;
        }
        a66VarD.e(clientConfig);
        sjg.r().v(c90.a(), String.valueOf(this.appId));
        o();
    }

    @Override // com.oplus.drs.track.impl.BaseTrackImpl
    public void j(@NotNull OTrackEvent oTrackEvent, @Nullable ITrackEventCallBack callBack) {
        a66 a66Var;
        Intrinsics.checkNotNullParameter(oTrackEvent, "oTrackEvent");
        boolean zIsForceStandaloneActive = IpcFailoverManager.isForceStandaloneActive(c90.a(), TrackType.OBUS);
        if (zIsForceStandaloneActive) {
            TrackLogger.o(TAG, "Force standalone active, use local IPC pipeline (sdk-comm + DrsCore) for event: " + oTrackEvent.getEventGroup() + mla.SEPARATOR + oTrackEvent.getEventId(), new Object[0]);
        }
        if (!zIsForceStandaloneActive) {
            try {
                String strValueOf = oTrackEvent.app_id;
                if (strValueOf == null || strValueOf.length() == 0) {
                    strValueOf = String.valueOf(this.appId);
                    oTrackEvent.app_id = strValueOf;
                }
                String str = oTrackEvent.duid;
                Companion companion = INSTANCE;
                TrackLogger.c(TAG, "obus prefilter check, appId=%s, group=%s, eventId=%s, duid=%s", strValueOf, oTrackEvent.getEventGroup(), oTrackEvent.getEventId(), companion.b(str));
                if (!sjg.r().N(strValueOf, oTrackEvent.getEventGroup(), oTrackEvent.getEventId(), str)) {
                    TrackLogger.h(TAG, "Event filtered before sdk-comm, appId=%s, group=%s, eventId=%s, duid=%s", strValueOf, oTrackEvent.getEventGroup(), oTrackEvent.getEventId(), companion.b(str));
                    if (callBack != null) {
                        String eventGroup = oTrackEvent.getEventGroup();
                        Intrinsics.checkNotNullExpressionValue(eventGroup, "oTrackEvent.eventGroup");
                        String eventId = oTrackEvent.getEventId();
                        Intrinsics.checkNotNullExpressionValue(eventId, "oTrackEvent.eventId");
                        callBack.onTrackEvent(eventGroup, eventId, true);
                        return;
                    }
                    return;
                }
                if (b87.a(c90.a(), b87.FF_SDK_RT_DIRECT_IPC, true) && sjg.r().y(strValueOf) && sjg.r().x(strValueOf, oTrackEvent.getEventGroup(), oTrackEvent.getEventId())) {
                    TrackLogger.h(TAG, "RT direct send, appId=%s, group=%s, eventId=%s", strValueOf, oTrackEvent.getEventGroup(), oTrackEvent.getEventId());
                    a66 a66Var2 = this.drsTrack;
                    if (a66Var2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("drsTrack");
                        a66Var2 = null;
                    }
                    if (a66Var2 != null) {
                        a66Var2.b(oTrackEvent, new b(callBack, oTrackEvent));
                        return;
                    }
                }
            } catch (Throwable th) {
                TrackLogger.d(TAG, "commitData failed in standalone mode, fallback to direct", th, new Object[0]);
                q(oTrackEvent, callBack);
                return;
            }
        }
        a66 a66Var3 = this.drsTrack;
        if (a66Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("drsTrack");
            a66Var = null;
        } else {
            a66Var = a66Var3;
        }
        a66Var.a(oTrackEvent, new c(oTrackEvent, callBack));
    }

    public final void m(OTrackEvent event) {
        try {
            Context contextA = c90.a();
            String str = event.duid;
            boolean z = true;
            if (str == null || str.length() == 0) {
                event.duid = OpenIdUtils.k(contextA);
            }
            String str2 = event.ouid;
            if (str2 != null && str2.length() != 0) {
                z = false;
            }
            if (z) {
                event.ouid = OpenIdUtils.n(contextA);
            }
            if (n(event.duid) || n(event.ouid)) {
                OpenIdUtils.h(contextA);
                if (n(event.duid)) {
                    event.duid = OpenIdUtils.k(contextA);
                }
                if (n(event.ouid)) {
                    event.ouid = OpenIdUtils.n(contextA);
                }
            }
        } catch (Throwable th) {
            TrackLogger.o(TAG, "fillDeviceIds failed: " + th.getMessage(), new Object[0]);
        }
    }

    public final boolean n(String id) {
        return (id == null || id.length() == 0) || Intrinsics.areEqual(id, OpenIdUtils.DEFAULT_VALUE);
    }

    public final void o() {
        Runnable runnable = new Runnable() { // from class: com.oplus.aiunit.vision.qof
            @Override // java.lang.Runnable
            public final void run() {
                RemoteTrackApiImpl.p(this.i);
            }
        };
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    public final void q(OTrackEvent oTrackEvent, ITrackEventCallBack callBack) {
        oTrackEvent.pkgName = c90.a().getPackageName();
        oTrackEvent.app_id = String.valueOf(this.appId);
        m(oTrackEvent);
        ojg.a().b(oTrackEvent, new d(oTrackEvent, callBack));
    }
}
