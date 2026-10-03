package com.oplus.aiunit.vision;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmField;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\bJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/qx5;", "", "", "hostname", "", "Ljava/net/InetAddress;", "lookup", "Companion", "a", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public interface qx5 {

    @JvmField
    @NotNull
    public static final qx5 SYSTEM = new Companion.C0918a();

    @NotNull
    List<InetAddress> lookup(@NotNull String hostname) throws UnknownHostException;
}
