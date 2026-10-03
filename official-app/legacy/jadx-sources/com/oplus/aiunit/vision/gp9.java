package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\b\u0010\u0006\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0004H&J\u0018\u0010\f\u001a\u00020\u000b2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\tH&¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/gp9;", "", "", "isConnectNet", "", "getCarrierName", "brand", "adg", "model", "Lkotlin/Function0;", "tapGlsb", "", "a", "com.heytap.nearx.common"}, k = 1, mv = {1, 4, 0})
public interface gp9 {
    void a(@NotNull Function0<String> tapGlsb);

    @NotNull
    String adg();

    @NotNull
    String brand();

    @Nullable
    String getCarrierName();

    boolean isConnectNet();

    @NotNull
    String model();
}
