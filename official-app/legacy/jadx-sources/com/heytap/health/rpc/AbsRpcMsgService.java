package com.heytap.health.rpc;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0007*\u0001\u0013\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\"\u0010\t\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH&J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0006H&R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/rpc/AbsRpcMsgService;", "Landroid/app/Service;", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "", UTraceSQLiteHelperKt.COL_FLAGS, "startId", "onStartCommand", "rootIntent", "", "onTaskRemoved", "Lcom/heytap/health/rpc/RpcMsg;", "msg", "b", "callingUid", "", "a", "com/heytap/health/rpc/AbsRpcMsgService$msgBinder$1", "i", "Lcom/heytap/health/rpc/AbsRpcMsgService$msgBinder$1;", "msgBinder", "<init>", "()V", "lib_rpc_base_release"}, k = 1, mv = {1, 8, 0})
public abstract class AbsRpcMsgService extends Service {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final AbsRpcMsgService$msgBinder$1 msgBinder = new MsgInterface.Stub() { // from class: com.heytap.health.rpc.AbsRpcMsgService$msgBinder$1
        @Override // com.heytap.health.rpc.MsgInterface
        public void msgCall(@NotNull RpcMsg msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            this.this$0.b(msg);
        }

        @Override // com.heytap.health.rpc.MsgInterface.Stub, android.os.Binder
        public boolean onTransact(int code, @NotNull Parcel data, @Nullable Parcel reply, int flags) {
            Intrinsics.checkNotNullParameter(data, "data");
            if (this.this$0.a(Binder.getCallingUid())) {
                return super.onTransact(code, data, reply, flags);
            }
            c.INSTANCE.d("Check calling app fail, callingUid=" + Binder.getCallingUid());
            if (reply == null) {
                return true;
            }
            reply.writeException(new SecurityException("Call permission not granted, callUid=" + Binder.getCallingUid()));
            return true;
        }
    };

    public abstract boolean a(int callingUid);

    public abstract void b(@NotNull RpcMsg msg);

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@Nullable Intent intent) {
        return this.msgBinder;
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);
        return 2;
    }

    @Override // android.app.Service
    public void onTaskRemoved(@Nullable Intent rootIntent) {
        super.onTaskRemoved(rootIntent);
        stopSelf();
    }
}
