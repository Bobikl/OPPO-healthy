package com.oplus.pantanal.seedling.update;

import android.os.SystemClock;
import com.oplus.pantanal.seedling.bean.SeedlingCard;
import com.oplus.pantanal.seedling.constants.Constants;
import com.oplus.pantanal.seedling.convertor.ConvertorFactory;
import com.oplus.pantanal.seedling.convertor.JsonToSeedlingCardOptionsConvertor;
import com.oplus.pantanal.seedling.translator.SeedlingDataTranslator;
import com.oplus.pantanal.seedling.util.Logger;
import com.oplus.pantanal.seedling.util.StringCompressor;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J$\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u001c\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\bH\u0002¨\u0006\u0017"}, d2 = {"Lcom/oplus/pantanal/seedling/update/SeedlingDataProcessor;", "Lcom/oplus/pantanal/seedling/update/ISeedlingDataProcessor;", "()V", "buildByteData", "", "card", "Lcom/oplus/pantanal/seedling/bean/SeedlingCard;", "dataJson", "", "checkDataSizeAllow", "", "size", "", "processData", "businessData", "Lorg/json/JSONObject;", "cardOptions", "Lcom/oplus/pantanal/seedling/update/SeedlingCardOptions;", "startCompress", "Lkotlin/Pair;", "", "source", "Companion", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SeedlingDataProcessor implements ISeedlingDataProcessor {

    @NotNull
    private static final String CARD_UNIQUE_KEY = "card_unique_key";
    private static final int COMPRESS_SIZE_LENGTH_CONDITION = 2000;

    @NotNull
    private static final String KEY_BUSINESS_DATA = "ui_data";

    @NotNull
    private static final String KEY_CARD_DATA = "options";

    @NotNull
    private static final String KEY_TIMESTAMP = "timestamp";
    private static final int TOO_LARGE_SIZE_WARNING = 20000;

    private final byte[] buildByteData(SeedlingCard card, String dataJson) {
        Logger.INSTANCE.i(Constants.TAG, "buildByteData#card = " + card);
        Pair<String, Integer> pairStartCompress = startCompress(dataJson);
        return SeedlingDataTranslator.INSTANCE.encodeSeedlingUpdateData(new SeedlingUpdateData(card.getCardId(), (String) pairStartCompress.getFirst(), ((Number) pairStartCompress.getSecond()).intValue(), false, 8, null));
    }

    private final void checkDataSizeAllow(long size) {
        if (size > 20000) {
            Logger.INSTANCE.e(Constants.TAG, "checkDataSizeAllow error:not allow to post data of size over 20000 Bytes");
        }
    }

    private final Pair<String, Integer> startCompress(String source) {
        int length = source.length();
        if (length >= COMPRESS_SIZE_LENGTH_CONDITION) {
            checkDataSizeAllow(length);
            return new Pair<>(StringCompressor.INSTANCE.encompress(source), 1);
        }
        Logger.INSTANCE.d(Constants.TAG, "no need to compress origin source size is " + source.length());
        return new Pair<>(source, 0);
    }

    @Override // com.oplus.pantanal.seedling.update.ISeedlingDataProcessor
    @NotNull
    public byte[] processData(@NotNull SeedlingCard card, @Nullable JSONObject businessData, @Nullable SeedlingCardOptions cardOptions) throws JSONException {
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(card, "card");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(KEY_TIMESTAMP, SystemClock.elapsedRealtimeNanos());
        jSONObject2.put("card_unique_key", SeedlingCard.getCardUniqueKey$seedling_support_manualRelease$default(card, false, 1, null));
        if (cardOptions != null && (jSONObject = (JSONObject) ConvertorFactory.INSTANCE.get(JsonToSeedlingCardOptionsConvertor.class).from(cardOptions)) != null) {
            jSONObject2.put(KEY_CARD_DATA, jSONObject);
        }
        Logger.INSTANCE.i(Constants.TAG, SeedlingCard.getPrintKey$seedling_support_manualRelease$default(card, false, 1, null) + " processData options=" + jSONObject2);
        if (businessData != null) {
            jSONObject2.put(KEY_BUSINESS_DATA, businessData);
        }
        String string = jSONObject2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return buildByteData(card, string);
    }
}
