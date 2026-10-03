package com.oplus.pantanal.seedling.update;

import com.oplus.pantanal.seedling.bean.SeedlingCard;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/oplus/pantanal/seedling/update/ISeedlingDataProcessor;", "", "processData", "", "card", "Lcom/oplus/pantanal/seedling/bean/SeedlingCard;", "businessData", "Lorg/json/JSONObject;", "cardOptions", "Lcom/oplus/pantanal/seedling/update/SeedlingCardOptions;", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ISeedlingDataProcessor {
    @NotNull
    byte[] processData(@NotNull SeedlingCard card, @Nullable JSONObject businessData, @Nullable SeedlingCardOptions cardOptions);
}
