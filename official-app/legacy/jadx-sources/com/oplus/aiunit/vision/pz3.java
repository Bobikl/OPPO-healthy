package com.oplus.aiunit.vision;

import io.netty.util.internal.StringUtil;
import io.protostuff.MapSchema;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0002R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0016\u0010\u0010\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/pz3;", "", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "Lcom/oplus/aiunit/vision/oz3;", "a", "Ljava/io/IOException;", MapSchema.FIELD_NAME_ENTRY, "", "b", "socket", "c", "", "I", "nextModeIndex", "Z", "isFallbackPossible", "isFallback", "", "d", "Ljava/util/List;", "connectionSpecs", "<init>", "(Ljava/util/List;)V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public final class pz3 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public int nextModeIndex;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean isFallbackPossible;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean isFallback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final List<oz3> connectionSpecs;

    public pz3(@NotNull List<oz3> connectionSpecs) {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        this.connectionSpecs = connectionSpecs;
    }

    @NotNull
    public final oz3 a(@NotNull SSLSocket sslSocket) throws IOException, CloneNotSupportedException {
        oz3 oz3Var;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        int i = this.nextModeIndex;
        int size = this.connectionSpecs.size();
        while (true) {
            if (i >= size) {
                oz3Var = null;
                break;
            }
            oz3Var = this.connectionSpecs.get(i);
            if (oz3Var.e(sslSocket)) {
                this.nextModeIndex = i + 1;
                break;
            }
            i++;
        }
        if (oz3Var != null) {
            this.isFallbackPossible = c(sslSocket);
            oz3Var.c(sslSocket, this.isFallback);
            return oz3Var;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to find acceptable protocols. isFallback=");
        sb.append(this.isFallback);
        sb.append(StringUtil.COMMA);
        sb.append(" modes=");
        sb.append(this.connectionSpecs);
        sb.append(StringUtil.COMMA);
        sb.append(" supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        Intrinsics.checkNotNull(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        Intrinsics.checkNotNullExpressionValue(string, "java.util.Arrays.toString(this)");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }

    public final boolean b(@NotNull IOException e2) {
        Intrinsics.checkNotNullParameter(e2, "e");
        this.isFallback = true;
        return (!this.isFallbackPossible || (e2 instanceof ProtocolException) || (e2 instanceof InterruptedIOException) || ((e2 instanceof SSLHandshakeException) && (e2.getCause() instanceof CertificateException)) || (e2 instanceof SSLPeerUnverifiedException) || !(e2 instanceof SSLException)) ? false : true;
    }

    public final boolean c(SSLSocket socket) {
        int size = this.connectionSpecs.size();
        for (int i = this.nextModeIndex; i < size; i++) {
            if (this.connectionSpecs.get(i).e(socket)) {
                return true;
            }
        }
        return false;
    }
}
