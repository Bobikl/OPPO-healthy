package com.oplus.aiunit.vision;

import com.oplus.nearx.track.internal.common.ntp.TimeStamp;
import io.protostuff.MapSchema;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/gec;", "Lcom/oplus/aiunit/vision/g05;", "Ljava/net/InetAddress;", "host", "", "port", "Lcom/oplus/aiunit/vision/eyj;", "f", MapSchema.FIELD_NAME_ENTRY, "I", "getVersion", "()I", "setVersion", "(I)V", "version", "<init>", "()V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public final class gec extends g05 {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public int version = 3;

    @NotNull
    public final eyj e(@Nullable InetAddress host) throws IOException {
        return f(host, 123);
    }

    @NotNull
    public final eyj f(@Nullable InetAddress host, int port) throws IOException {
        if (!getIsOpen()) {
            c();
        }
        czc czcVar = new czc();
        czcVar.b(3);
        czcVar.setVersion(this.version);
        DatagramPacket datagramPacketC = czcVar.c();
        if (datagramPacketC != null) {
            datagramPacketC.setAddress(host);
        }
        if (datagramPacketC != null) {
            datagramPacketC.setPort(port);
        }
        czc czcVar2 = new czc();
        DatagramPacket datagramPacketC2 = czcVar2.c();
        czcVar.f(TimeStamp.INSTANCE.b());
        DatagramSocket datagramSocket = this._socket_;
        Intrinsics.checkNotNull(datagramSocket);
        datagramSocket.send(datagramPacketC);
        DatagramSocket datagramSocket2 = this._socket_;
        Intrinsics.checkNotNull(datagramSocket2);
        datagramSocket2.receive(datagramPacketC2);
        return new eyj(czcVar2, System.currentTimeMillis(), false);
    }
}
