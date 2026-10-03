package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ,\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006J\u001a\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\fH\u0002R0\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u0010j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/oplus/aiunit/vision/a1;", "", "Landroid/content/Context;", "context", "", "arouterPath", "Lkotlin/Function1;", "Lcom/heytap/health/devicemanager/client/impl/arouter/DMIMessageHandler;", "", "block", "b", "path", "Lcom/oplus/aiunit/vision/a1$a;", "c", "handlerWrapper", "d", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "a", "Ljava/util/HashMap;", "mArouterCache", "Landroid/os/Handler;", "Landroid/os/Handler;", "getMTimeOutHandler", "()Landroid/os/Handler;", "mTimeOutHandler", "<init>", "()V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public final class a1 {

    @NotNull
    public static final a1 INSTANCE = new a1();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final HashMap<String, IMessageHandlerWrapper> mArouterCache = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Handler mTimeOutHandler = new Handler(duc.INSTANCE.a(), new Handler.Callback() { // from class: com.oplus.aiunit.vision.z0
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            return a1.e(message);
        }
    });

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.a1$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\t\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/a1$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "path", "Lcom/heytap/health/devicemanager/client/impl/arouter/DMIMessageHandler;", "Lcom/heytap/health/devicemanager/client/impl/arouter/DMIMessageHandler;", "()Lcom/heytap/health/devicemanager/client/impl/arouter/DMIMessageHandler;", "messageHandler", "<init>", "(Ljava/lang/String;Lcom/heytap/health/devicemanager/client/impl/arouter/DMIMessageHandler;)V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class IMessageHandlerWrapper {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String path;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final DMIMessageHandler messageHandler;

        public IMessageHandlerWrapper(@NotNull String path, @NotNull DMIMessageHandler messageHandler) {
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(messageHandler, "messageHandler");
            this.path = path;
            this.messageHandler = messageHandler;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final DMIMessageHandler getMessageHandler() {
            return this.messageHandler;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IMessageHandlerWrapper)) {
                return false;
            }
            IMessageHandlerWrapper iMessageHandlerWrapper = (IMessageHandlerWrapper) other;
            return Intrinsics.areEqual(this.path, iMessageHandlerWrapper.path) && Intrinsics.areEqual(this.messageHandler, iMessageHandlerWrapper.messageHandler);
        }

        public int hashCode() {
            return (this.path.hashCode() * 31) + this.messageHandler.hashCode();
        }

        @NotNull
        public String toString() {
            return "IMessageHandlerWrapper(path=" + this.path + ", messageHandler=" + this.messageHandler + ")";
        }
    }

    public static final boolean e(Message message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (message.what == 1) {
            Object obj = message.obj;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.heytap.health.devicemanager.client.ARouterServiceManager.IMessageHandlerWrapper");
            IMessageHandlerWrapper iMessageHandlerWrapper = (IMessageHandlerWrapper) obj;
            HashMap<String, IMessageHandlerWrapper> map = mArouterCache;
            synchronized (map) {
                IMessageHandlerWrapper iMessageHandlerWrapperRemove = map.remove(iMessageHandlerWrapper.getPath());
                if (iMessageHandlerWrapperRemove == null) {
                    return true;
                }
                Intrinsics.checkNotNullExpressionValue(iMessageHandlerWrapperRemove, "synchronized(mArouterCac…andler true\n            }");
                iMessageHandlerWrapperRemove.getMessageHandler().onDestroy();
            }
        }
        return true;
    }

    public final void b(@NotNull Context context, @Nullable String arouterPath, @NotNull Function1<? super DMIMessageHandler, Unit> block) {
        IMessageHandlerWrapper iMessageHandlerWrapperC;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        if (arouterPath == null || (iMessageHandlerWrapperC = c(context, arouterPath)) == null) {
            return;
        }
        block.invoke(iMessageHandlerWrapperC.getMessageHandler());
        d(iMessageHandlerWrapperC);
    }

    public final IMessageHandlerWrapper c(Context context, String path) {
        HashMap<String, IMessageHandlerWrapper> map = mArouterCache;
        synchronized (map) {
            IMessageHandlerWrapper iMessageHandlerWrapper = map.get(path);
            if (iMessageHandlerWrapper != null) {
                return iMessageHandlerWrapper;
            }
            Object objNavigation = x0.d().b(path).navigation();
            if (objNavigation == null) {
                return null;
            }
            Intrinsics.checkNotNullExpressionValue(objNavigation, "ARouter.getInstance().bu…vigation() ?: return null");
            IMessageHandlerWrapper iMessageHandlerWrapper2 = new IMessageHandlerWrapper(path, (DMIMessageHandler) objNavigation);
            iMessageHandlerWrapper2.getMessageHandler().onCreate(context);
            if (iMessageHandlerWrapper2.getMessageHandler().getKeepAlive() != 0) {
                map.put(path, iMessageHandlerWrapper2);
            }
            return iMessageHandlerWrapper2;
        }
    }

    public final void d(IMessageHandlerWrapper handlerWrapper) {
        long keepAlive = handlerWrapper.getMessageHandler().getKeepAlive();
        if (keepAlive == 0) {
            handlerWrapper.getMessageHandler().onDestroy();
            return;
        }
        Handler handler = mTimeOutHandler;
        handler.removeMessages(1, handlerWrapper);
        Message messageObtainMessage = handler.obtainMessage(1, handlerWrapper);
        Intrinsics.checkNotNullExpressionValue(messageObtainMessage, "mTimeOutHandler.obtainMe…_RELEASE, handlerWrapper)");
        handler.sendMessageDelayed(messageObtainMessage, keepAlive);
    }
}
