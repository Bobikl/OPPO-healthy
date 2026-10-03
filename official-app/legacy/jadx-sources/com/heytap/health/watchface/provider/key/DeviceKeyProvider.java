package com.heytap.health.watchface.provider.key;

import android.content.Context;
import android.text.TextUtils;
import android.util.ArraySet;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.heytap.health.settings.watch.sporthealthsettings2.ui.collaborationRelated.CloudDownloadWorker;
import com.heytap.log.config.LogMemoryConfig;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.auc;
import com.oplus.aiunit.vision.bt2;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.grl;
import com.oplus.aiunit.vision.l9d;
import com.oplus.aiunit.vision.ltl;
import com.oplus.aiunit.vision.ul4;
import com.oplus.wearable.linkservice.sdk.Node;
import io.protostuff.MapSchema;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt___StringsKt;

/* JADX INFO: loaded from: classes19.dex */
@Route(path = DeviceKeyProvider.PATH)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b%\u0010&J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J+\u0010\f\u001a\u00020\u00042#\u0010\u000b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00040\u0006J\b\u0010\r\u001a\u00020\u0004H\u0002J\b\u0010\u000e\u001a\u00020\u0007H\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\u0004H\u0002J-\u0010\u0013\u001a\u00020\u00042#\u0010\u000b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00040\u0006H\u0002J=\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00152#\u0010\u000b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00040\u0006H\u0002R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR(\u0010$\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00040\u00060!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006)"}, d2 = {"Lcom/heytap/health/watchface/provider/key/DeviceKeyProvider;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "Landroid/content/Context;", "context", "", "init", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "value", "callback", "db", "hb", "Q6", "Lcom/oplus/wearable/linkservice/sdk/Node;", l9d.BUNDLE_KEY_NODE, "eb", "gb", "ib", "uuid", "", "failedTryCount", "fb", "i", "Ljava/lang/String;", "currentKey", "j", "currentUUID", "Ljava/util/concurrent/atomic/AtomicBoolean;", MapSchema.FIELD_NAME_KEY, "Ljava/util/concurrent/atomic/AtomicBoolean;", "isPendingUpdate", "Ljava/util/concurrent/CopyOnWriteArrayList;", LogFieldKey.LEVEL_KEY, "Ljava/util/concurrent/CopyOnWriteArrayList;", "pendingListeners", "<init>", "()V", "Companion", "a", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDeviceKeyProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceKeyProvider.kt\ncom/heytap/health/watchface/provider/key/DeviceKeyProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,139:1\n1855#2,2:140\n*S KotlinDebug\n*F\n+ 1 DeviceKeyProvider.kt\ncom/heytap/health/watchface/provider/key/DeviceKeyProvider\n*L\n70#1:140,2\n*E\n"})
public final class DeviceKeyProvider implements IProvider {
    public static final int CID_DEVICE_KEY = 136;

    @NotNull
    public static final String PATH = "/device_key/DeviceKeyProvider";
    public static final int SID_DEVICE_KEY = 1;

    @NotNull
    public static final String TAG = "DeviceKeyProvider";
    public static final int TRY_CHANGE_COUNT = 2;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public volatile String currentKey;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public volatile String currentUUID;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean isPendingUpdate = new AtomicBoolean(false);

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CopyOnWriteArrayList<Function1<String, Unit>> pendingListeners = new CopyOnWriteArrayList<>();

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/heytap/health/watchface/provider/key/DeviceKeyProvider$b", "Lcom/oplus/aiunit/vision/bt2;", "", "id", CloudDownloadWorker.KEY_SECRET, "", "onResult", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements bt2 {
        public final /* synthetic */ Function1<String, Unit> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f7137c;
        public final /* synthetic */ String d;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super String, Unit> function1, int i, String str) {
            this.b = function1;
            this.f7137c = i;
            this.d = str;
        }

        @Override // com.oplus.aiunit.vision.bt2
        public void onResult(@NotNull String id, @Nullable String secret) {
            Intrinsics.checkNotNullParameter(id, "id");
            ltl.a(DeviceKeyProvider.TAG, "updateKey uuid " + id + " secret " + (secret != null ? StringsKt___StringsKt.take(secret, 3) : null) + LogMemoryConfig.LOG_ELLIPSIS);
            if (!TextUtils.isEmpty(secret)) {
                DeviceKeyProvider.this.isPendingUpdate.set(false);
                this.b.invoke(secret);
                return;
            }
            int i = this.f7137c;
            if (i > 2) {
                DeviceKeyProvider.this.isPendingUpdate.set(false);
                ltl.b(DeviceKeyProvider.TAG, "secret obtain failed.");
                return;
            }
            ltl.i(DeviceKeyProvider.TAG, "secret is null and try again " + i);
            DeviceKeyProvider.this.fb(this.d, this.f7137c + 1, this.b);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"com/heytap/health/watchface/provider/key/DeviceKeyProvider$c", "Lcom/oplus/aiunit/vision/ul4$b;", "Landroid/util/ArraySet;", "Lcom/oplus/aiunit/vision/auc;", "interests", "", "getInterestingStatus", "Lcom/oplus/wearable/linkservice/sdk/Node;", l9d.BUNDLE_KEY_NODE, "nodeStatus", "d", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class c implements ul4.b {
        public c() {
        }

        @Override // com.oplus.aiunit.vision.ul4.b
        public void d(@NotNull Node node, @NotNull auc nodeStatus) {
            Intrinsics.checkNotNullParameter(node, "node");
            Intrinsics.checkNotNullParameter(nodeStatus, "nodeStatus");
            if (nodeStatus == auc.a.INSTANCE && grl.a(gl4.managerApi.getCurrActiveMac()).w3()) {
                DeviceKeyProvider.this.eb(node);
            }
        }

        @Override // com.oplus.aiunit.vision.ul4.b
        public void getInterestingStatus(@NotNull ArraySet<auc> interests) {
            Intrinsics.checkNotNullParameter(interests, "interests");
            interests.add(auc.a.INSTANCE);
        }
    }

    public final String Q6() {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        return StringsKt__StringsJVMKt.replace$default(string, "-", "", false, 4, (Object) null);
    }

    public final synchronized void db(@NotNull final Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ltl.d(TAG, "getKey " + callback);
        String str = this.currentKey;
        if (str != null) {
            callback.invoke(str);
        } else if (this.isPendingUpdate.get()) {
            ltl.a(TAG, "add pending task.");
            this.pendingListeners.add(callback);
        } else {
            ib(new Function1<String, Unit>() { // from class: com.heytap.health.watchface.provider.key.DeviceKeyProvider$getKey$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str2) {
                    invoke2(str2);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@Nullable String str2) {
                    this.$this_run.currentKey = str2;
                    callback.invoke(str2);
                }
            });
        }
    }

    public final void eb(Node node) {
        ltl.a(TAG, "onNodeStatusChanged NodeConn node " + node);
        this.currentUUID = Q6();
        ib(new Function1<String, Unit>() { // from class: com.heytap.health.watchface.provider.key.DeviceKeyProvider$handleDeviceConnected$1
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable String str) {
                this.this$0.currentKey = str;
                this.this$0.gb();
            }
        });
    }

    public final void fb(String uuid, int failedTryCount, Function1<? super String, Unit> callback) {
        ECDHUtils.l(1, 136, uuid, new b(callback, failedTryCount, uuid));
    }

    public final void gb() {
        Iterator it = CollectionsKt___CollectionsKt.toList(this.pendingListeners).iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(this.currentKey);
        }
        this.pendingListeners.clear();
    }

    public final void hb() {
        gl4.devicePrimary.nodeApi.l(new c());
    }

    public final synchronized void ib(Function1<? super String, Unit> callback) {
        ltl.d(TAG, "updateKey...");
        if (this.currentUUID == null) {
            ltl.i(TAG, "updateKey currentUUID is null, should check connect.");
            this.currentUUID = Q6();
        }
        String str = this.currentUUID;
        if (str != null) {
            this.isPendingUpdate.set(true);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new DeviceKeyProvider$updateKey$1$1(this, str, callback, null), 3, null);
        }
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(@Nullable Context context) {
        ltl.d(TAG, "DeviceKeyProvider init");
        hb();
    }
}
