package com.oplus.aiunit.vision;

import java.net.DatagramSocket;
import java.net.SocketException;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/oplus/aiunit/vision/g45;", "Lcom/oplus/aiunit/vision/j05;", "Ljava/net/DatagramSocket;", "a", "<init>", "()V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public final class g45 implements j05 {
    @Override // com.oplus.aiunit.vision.j05
    @Nullable
    public DatagramSocket a() throws SocketException {
        return new DatagramSocket();
    }
}
