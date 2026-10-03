package com.heytap.health.connect.rawapi.host;

import android.content.Context;
import android.os.RemoteException;
import com.heytap.health.connect.rawapi.ConnectManager;
import com.heytap.health.connect.rawapi.ExtsKt;
import com.heytap.health.connect.rawapi.IHMessageListener;
import com.heytap.health.connect.rawapi.IResult;
import com.heytap.health.oaf.OafHost;
import com.oplus.aiunit.vision.q43;
import com.oplus.aiunit.vision.rxb;
import com.oplus.aiunit.vision.wil;
import com.oplus.wearable.linkservice.WearableApiManager;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\"\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u000e\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/heytap/health/connect/rawapi/host/H3Message;", "Lcom/heytap/health/connect/rawapi/host/H2Node;", "mContext", "Landroid/content/Context;", "mPkgName", "", "mOlink", "Lcom/oplus/wearable/linkservice/WearableApiManager;", "mOaf", "Lcom/heytap/health/oaf/OafHost;", "(Landroid/content/Context;Ljava/lang/String;Lcom/oplus/wearable/linkservice/WearableApiManager;Lcom/heytap/health/oaf/OafHost;)V", "TAG", "mSendSeq", "Ljava/util/concurrent/atomic/AtomicInteger;", "addMessageListener", "", "listener", "Lcom/heytap/health/connect/rawapi/IHMessageListener;", "removeMessageListener", "sendMessage", "", "mac", "event", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "result", "Lcom/heytap/health/connect/rawapi/IResult;", "sendMessageActiveDevice", "setSeq", "lib_heytapconnect_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nH3Message.kt\nKotlin\n*S Kotlin\n*F\n+ 1 H3Message.kt\ncom/heytap/health/connect/rawapi/host/H3Message\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
public abstract class H3Message extends H2Node {

    @NotNull
    private final String TAG;

    @NotNull
    private final AtomicInteger mSendSeq;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H3Message(@NotNull Context mContext, @NotNull String mPkgName, @NotNull WearableApiManager mOlink, @NotNull OafHost mOaf) {
        super(mContext, mPkgName, mOlink, mOaf);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(mPkgName, "mPkgName");
        Intrinsics.checkNotNullParameter(mOlink, "mOlink");
        Intrinsics.checkNotNullParameter(mOaf, "mOaf");
        this.mSendSeq = new AtomicInteger(1);
        this.TAG = "H3Message";
    }

    @Override // com.heytap.health.connect.rawapi.IHeytap
    public void addMessageListener(@NotNull IHMessageListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        q43.INSTANCE.y(listener);
    }

    @Override // com.heytap.health.connect.rawapi.IHeytap
    public void removeMessageListener(@NotNull IHMessageListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        q43.INSTANCE.D(listener);
    }

    @Override // com.heytap.health.connect.rawapi.IHeytap
    public boolean sendMessage(@NotNull String mac, @NotNull MessageEvent event, @Nullable IResult result) {
        MessageEvent messageEventB;
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(event, "event");
        setSeq(event);
        boolean z = false;
        if (event.getCacheOption() == 1 && (messageEventB = rxb.INSTANCE.b(mac, event)) != null) {
            q43.INSTANCE.z(mac, messageEventB, false);
            return true;
        }
        if (event.getCacheOption() == 16) {
            rxb.INSTANCE.e(mac, event);
        }
        if (!ConnectManager.INSTANCE.D(mac)) {
            return getMOaf().k.sendMessage(mac, event, ExtsKt.c(result));
        }
        if (event.getServiceId() == 1 && event.getCommandId() == 7) {
            if (getNodeByMac(mac) != null && isStubModule() && isCurrentConnected()) {
                z = true;
            }
        }
        if (!z) {
            return getMOlink().u().sendMessage(getMPkgName(), mac, event, ExtsKt.b(result));
        }
        wil.b(this.TAG, "filter 0107!!!");
        return true;
    }

    @Override // com.heytap.health.connect.rawapi.IHeytap
    public boolean sendMessageActiveDevice(@NotNull MessageEvent event, @Nullable IResult result) throws RemoteException {
        Intrinsics.checkNotNullParameter(event, "event");
        String activeNodeId = getActiveNodeId();
        setSeq(event);
        if (activeNodeId != null) {
            return sendMessage(activeNodeId, event, result);
        }
        if (result != null) {
            result.onResult(false, "activeNodeId is null", null);
        }
        return false;
    }

    public final void setSeq(@NotNull MessageEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getSequence() == 0) {
            event.setSequence(this.mSendSeq.getAndIncrement());
        }
    }
}
