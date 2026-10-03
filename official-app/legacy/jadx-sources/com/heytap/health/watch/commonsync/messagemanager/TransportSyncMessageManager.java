package com.heytap.health.watch.commonsync.messagemanager;

import com.heytap.health.watch.commonsync.messagehandler.LanguageHandler;
import com.heytap.health.watch.commonsync.messagehandler.timehandler.TimeHandlerFactory;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.byj;
import com.oplus.aiunit.vision.e83;
import com.oplus.aiunit.vision.gf7;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.l25;
import com.oplus.aiunit.vision.l9d;
import com.oplus.aiunit.vision.tx3;
import com.oplus.aiunit.vision.ul4;
import com.oplus.aiunit.vision.xxj;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\u0006R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001b\u0010\u0013\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001b\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/heytap/health/watch/commonsync/messagemanager/TransportSyncMessageManager;", "", "", "nodeId", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "event", "", "d", "", "syncType", "f", b2n.f, MapSchema.FIELD_NAME_ENTRY, "TAG", "Ljava/lang/String;", "Lcom/oplus/aiunit/vision/gf7;", "a", "Lkotlin/Lazy;", "()Lcom/oplus/aiunit/vision/gf7;", "mFindPhoneHandler", "Lcom/oplus/aiunit/vision/xxj;", "b", "c", "()Lcom/oplus/aiunit/vision/xxj;", "mTimeFormatHandler", "Lcom/heytap/health/watch/commonsync/messagehandler/LanguageHandler;", "()Lcom/heytap/health/watch/commonsync/messagehandler/LanguageHandler;", "mLanguageHandler", "<init>", "()V", "commonsync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class TransportSyncMessageManager {

    @NotNull
    public static final String TAG = "SyncMessageManager";

    @NotNull
    public static final TransportSyncMessageManager INSTANCE = new TransportSyncMessageManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Lazy mFindPhoneHandler = LazyKt__LazyJVMKt.lazy(new Function0<gf7>() { // from class: com.heytap.health.watch.commonsync.messagemanager.TransportSyncMessageManager$mFindPhoneHandler$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final gf7 invoke() {
            return new gf7();
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Lazy mTimeFormatHandler = LazyKt__LazyJVMKt.lazy(new Function0<xxj>() { // from class: com.heytap.health.watch.commonsync.messagemanager.TransportSyncMessageManager$mTimeFormatHandler$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final xxj invoke() {
            return new xxj();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy mLanguageHandler = LazyKt__LazyJVMKt.lazy(new Function0<LanguageHandler>() { // from class: com.heytap.health.watch.commonsync.messagemanager.TransportSyncMessageManager$mLanguageHandler$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final LanguageHandler invoke() {
            return new LanguageHandler();
        }
    });

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/heytap/health/watch/commonsync/messagemanager/TransportSyncMessageManager$a", "Lcom/oplus/aiunit/vision/ul4$a;", "Lcom/oplus/wearable/linkservice/sdk/Node;", l9d.BUNDLE_KEY_NODE, "", "onPeerConnected", "onPeerDisconnected", "commonsync_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements ul4.a {
        @Override // com.oplus.aiunit.vision.ul4.a
        public void onPeerConnected(@NotNull Node node) {
            Intrinsics.checkNotNullParameter(node, "node");
            byj byjVarA = TimeHandlerFactory.INSTANCE.a();
            if (byjVarA != null) {
                byjVarA.i();
            }
            TransportSyncMessageManager transportSyncMessageManager = TransportSyncMessageManager.INSTANCE;
            transportSyncMessageManager.g();
            transportSyncMessageManager.e();
        }

        @Override // com.oplus.aiunit.vision.ul4.a
        public void onPeerDisconnected(@NotNull Node node) {
            Intrinsics.checkNotNullParameter(node, "node");
        }
    }

    static {
        gl4.devicePrimary.nodeApi.g(new a());
    }

    public final gf7 a() {
        return (gf7) mFindPhoneHandler.getValue();
    }

    public final LanguageHandler b() {
        return (LanguageHandler) mLanguageHandler.getValue();
    }

    public final xxj c() {
        return (xxj) mTimeFormatHandler.getValue();
    }

    public final synchronized void d(@Nullable String nodeId, @NotNull MessageEvent event) {
        byj byjVarA;
        Intrinsics.checkNotNullParameter(event, "event");
        int commandId = event.getCommandId();
        l25.a(TAG, "handleMessage commandId: " + commandId);
        if (commandId == 5) {
            byj byjVarA2 = TimeHandlerFactory.INSTANCE.a();
            if (byjVarA2 != null) {
                byjVarA2.c(event, commandId);
            }
        } else if (commandId == 6) {
            byj byjVarA3 = TimeHandlerFactory.INSTANCE.a();
            if (byjVarA3 != null) {
                byjVarA3.f(1);
            }
        } else if (commandId == 15) {
            a().a();
        } else if (commandId == 43) {
            tx3.b().c(nodeId, event.getData());
        } else if (commandId == 76) {
            new e83().b(event);
        } else if (commandId == 114) {
            byj byjVarA4 = TimeHandlerFactory.INSTANCE.a();
            if (byjVarA4 != null) {
                byjVarA4.a();
            }
        } else if (commandId == 128) {
            byj byjVarA5 = TimeHandlerFactory.INSTANCE.a();
            if (byjVarA5 != null) {
                byjVarA5.d(event);
            }
        } else if (commandId == 135 && (byjVarA = TimeHandlerFactory.INSTANCE.a()) != null) {
            byjVarA.b();
        }
    }

    public final void e() {
        b().a();
    }

    public final void f(int syncType) {
        a7b.f(TAG, "[onTimeChanged] --> syncType=" + syncType);
        byj byjVarA = TimeHandlerFactory.INSTANCE.a();
        if (byjVarA != null) {
            byjVarA.f(syncType);
        }
        g();
    }

    public final void g() {
        c().a();
    }
}
