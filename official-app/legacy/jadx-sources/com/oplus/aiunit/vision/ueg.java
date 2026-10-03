package com.oplus.aiunit.vision;

import com.oplus.utrace.sdk.UTraceContext;
import com.pantanal.server.content.recommendlist.SceneInfo;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/ueg;", "", "", "Lcom/pantanal/server/content/recommendlist/SceneInfo;", "newList", "Lcom/oplus/utrace/sdk/UTraceContext;", "parentCtx", "", "onListChanged", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1})
public interface ueg {
    void onListChanged(@NotNull List<SceneInfo> newList, @Nullable UTraceContext parentCtx);
}
