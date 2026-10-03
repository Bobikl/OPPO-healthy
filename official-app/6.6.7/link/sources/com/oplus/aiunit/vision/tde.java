package com.oplus.aiunit.vision;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u000e2\u00020\u0001:\u0001\bB'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0014R\"\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/tde;", "Lcom/oplus/aiunit/vision/zfg;", "Landroid/content/Context;", "context", "", "", "updateMap", "", "a", "b", "Ljava/util/Map;", "baseMap", "<init>", "(Landroid/content/Context;Ljava/util/Map;)V", "Companion", "paysdk_statistic_release"}, k = 1, mv = {1, 8, 0})
public final class tde extends zfg {

    @Nullable
    public final Map<String, String> b;

    public tde(@Nullable Context context, @Nullable Map<String, String> map) {
        super(context);
        this.b = map;
    }

    @Override // com.oplus.aiunit.vision.zfg
    public void a(@NotNull Context context, @NotNull Map<String, String> updateMap) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(updateMap, "updateMap");
        String str = updateMap.get("log_tag");
        String str2 = updateMap.get("event_id");
        updateMap.get(rde.KEY_COUNTRY_CODE);
        String str3 = updateMap.get("payMsgType");
        boolean zAreEqual = Intrinsics.areEqual(str, jri.DEFAULT_CATEGORY);
        if (!StringsKt.equals("_PayMerchantSdk", str3, true) || str2 == null) {
            return;
        }
        HashMap map = new HashMap(updateMap);
        if (zAreEqual) {
            fri.INSTANCE.g(map, context, str2);
        } else {
            fri.INSTANCE.h(map, context, str2);
        }
    }
}
