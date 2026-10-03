package com.oplus.pantanal.seedling.update;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.Pair;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J@\u0010\u0002\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u001e\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0003\u0012\u0004\u0012\u00020\n0\tH&¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/oplus/pantanal/seedling/update/INegativeFeedbackCallback;", "", "requestDataOnDisableEntry", "Lkotlin/Pair;", "Lorg/json/JSONObject;", "Lcom/oplus/pantanal/seedling/update/SeedlingCardOptions;", "serviceId", "", "disableEntryMap", "", "", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface INegativeFeedbackCallback {
    @NotNull
    Pair<JSONObject, SeedlingCardOptions> requestDataOnDisableEntry(@NotNull String serviceId, @NotNull Map<Pair<String, String>, Integer> disableEntryMap);
}
