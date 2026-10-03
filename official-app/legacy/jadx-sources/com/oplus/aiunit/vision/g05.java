package com.oplus.aiunit.vision;

import java.net.DatagramSocket;
import java.net.SocketException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b \u0018\u0000  2\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\"\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR*\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\r\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00178\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/oplus/aiunit/vision/g05;", "", "", "c", "a", "", "I", "getDefaultTimeout", "()I", "d", "(I)V", "defaultTimeout", "Ljava/net/DatagramSocket;", "b", "Ljava/net/DatagramSocket;", "_socket_", "", "<set-?>", "Z", "()Z", "setOpen", "(Z)V", "isOpen", "Lcom/oplus/aiunit/vision/j05;", "Lcom/oplus/aiunit/vision/j05;", "get_socketFactory_", "()Lcom/oplus/aiunit/vision/j05;", "set_socketFactory_", "(Lcom/oplus/aiunit/vision/j05;)V", "_socketFactory_", "<init>", "()V", "Companion", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public abstract class g05 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final j05 f11581e = new g45();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int defaultTimeout;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    @Nullable
    public DatagramSocket _socket_;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean isOpen;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public j05 _socketFactory_ = f11581e;

    public final void a() {
        DatagramSocket datagramSocket = this._socket_;
        if (datagramSocket != null) {
            Intrinsics.checkNotNull(datagramSocket);
            datagramSocket.close();
        }
        this._socket_ = null;
        this.isOpen = false;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsOpen() {
        return this.isOpen;
    }

    public final void c() throws SocketException {
        DatagramSocket datagramSocketA = this._socketFactory_.a();
        this._socket_ = datagramSocketA;
        Intrinsics.checkNotNull(datagramSocketA);
        datagramSocketA.setSoTimeout(this.defaultTimeout);
        this.isOpen = true;
    }

    public final void d(int i) {
        this.defaultTimeout = i;
    }
}
