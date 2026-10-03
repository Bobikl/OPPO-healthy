package com.oplus.pantanal.seedling.update;

import com.oplus.pantanal.seedling.bean.SeedlingCard;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JF\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH&JF\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J(\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH&¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/oplus/pantanal/seedling/update/ISeedlingDataUpdate;", "", "updateAllCardData", "", "card", "Lcom/oplus/pantanal/seedling/bean/SeedlingCard;", "instanceId", "", "businessData", "Lorg/json/JSONObject;", "cardOptions", "Lcom/oplus/pantanal/seedling/update/SeedlingCardOptions;", "instanceIdMatchType", "", "callback", "Lcom/oplus/pantanal/seedling/update/INegativeFeedbackCallback;", "updateData", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface ISeedlingDataUpdate {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ void updateAllCardData$default(ISeedlingDataUpdate iSeedlingDataUpdate, SeedlingCard seedlingCard, String str, JSONObject jSONObject, SeedlingCardOptions seedlingCardOptions, int i, INegativeFeedbackCallback iNegativeFeedbackCallback, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateAllCardData");
        }
        iSeedlingDataUpdate.updateAllCardData(seedlingCard, str, (i2 & 4) != 0 ? null : jSONObject, (i2 & 8) != 0 ? null : seedlingCardOptions, (i2 & 16) != 0 ? 1 : i, (i2 & 32) != 0 ? null : iNegativeFeedbackCallback);
    }

    static /* synthetic */ void updateData$default(ISeedlingDataUpdate iSeedlingDataUpdate, SeedlingCard seedlingCard, String str, JSONObject jSONObject, SeedlingCardOptions seedlingCardOptions, int i, INegativeFeedbackCallback iNegativeFeedbackCallback, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateData");
        }
        iSeedlingDataUpdate.updateData(seedlingCard, str, (i2 & 4) != 0 ? null : jSONObject, (i2 & 8) != 0 ? null : seedlingCardOptions, (i2 & 16) != 0 ? 1 : i, (i2 & 32) != 0 ? null : iNegativeFeedbackCallback);
    }

    void updateAllCardData(@NotNull SeedlingCard card, @NotNull String instanceId, @Nullable JSONObject businessData, @Nullable SeedlingCardOptions cardOptions, int instanceIdMatchType, @Nullable INegativeFeedbackCallback callback);

    void updateAllCardData(@NotNull SeedlingCard card, @Nullable JSONObject businessData, @Nullable SeedlingCardOptions cardOptions);

    void updateData(@NotNull SeedlingCard card, @NotNull String instanceId, @Nullable JSONObject businessData, @Nullable SeedlingCardOptions cardOptions, int instanceIdMatchType, @Nullable INegativeFeedbackCallback callback);

    void updateData(@NotNull SeedlingCard card, @Nullable JSONObject businessData, @Nullable SeedlingCardOptions cardOptions);

    static /* synthetic */ void updateAllCardData$default(ISeedlingDataUpdate iSeedlingDataUpdate, SeedlingCard seedlingCard, JSONObject jSONObject, SeedlingCardOptions seedlingCardOptions, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateAllCardData");
        }
        if ((i & 2) != 0) {
            jSONObject = null;
        }
        if ((i & 4) != 0) {
            seedlingCardOptions = null;
        }
        iSeedlingDataUpdate.updateAllCardData(seedlingCard, jSONObject, seedlingCardOptions);
    }

    static /* synthetic */ void updateData$default(ISeedlingDataUpdate iSeedlingDataUpdate, SeedlingCard seedlingCard, JSONObject jSONObject, SeedlingCardOptions seedlingCardOptions, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateData");
        }
        if ((i & 2) != 0) {
            jSONObject = null;
        }
        if ((i & 4) != 0) {
            seedlingCardOptions = null;
        }
        iSeedlingDataUpdate.updateData(seedlingCard, jSONObject, seedlingCardOptions);
    }
}
