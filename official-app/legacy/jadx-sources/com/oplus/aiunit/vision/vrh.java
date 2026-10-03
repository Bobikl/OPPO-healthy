package com.oplus.aiunit.vision;

import android.os.Bundle;
import com.oplus.smartsdk.SmartApiInfo;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lcom/oplus/smartsdk/SmartApiInfo;", "", "a", "card-smart-engine_release"}, k = 2, mv = {1, 8, 0})
public final class vrh {
    @NotNull
    public static final String a(@NotNull SmartApiInfo smartApiInfo) {
        Intrinsics.checkNotNullParameter(smartApiInfo, "<this>");
        boolean forceChangeCardUI = smartApiInfo.getForceChangeCardUI();
        Bundle extras = smartApiInfo.getExtras();
        HashMap<String, Integer> idMaps = smartApiInfo.getIdMaps();
        String name = smartApiInfo.getName();
        Long version = smartApiInfo.getVersion();
        Integer themeId = smartApiInfo.getThemeId();
        int length = smartApiInfo.getData().length;
        byte[] value = smartApiInfo.getValue();
        return "SmartApiInfo(forceChangeCardUI=" + forceChangeCardUI + ",extras=" + extras + ",idMaps=" + idMaps + ",name=" + name + ", version=" + version + ",themeId=" + themeId + ", dataSize =" + length + ", valueSize=" + (value != null ? Integer.valueOf(value.length) : null) + ",)";
    }
}
