package com.oplus.pantanal.seedling.translator;

import com.oplus.pantanal.seedling.bean.SeedlingCard;
import com.oplus.pantanal.seedling.bean.SeedlingCardEvent;
import com.oplus.pantanal.seedling.constants.Constants;
import com.oplus.pantanal.seedling.convertor.ConvertorFactory;
import com.oplus.pantanal.seedling.convertor.JsonToSeedlingCardConvertor;
import com.oplus.pantanal.seedling.update.SeedlingUpdateData;
import com.oplus.pantanal.seedling.util.ExtsKt;
import com.oplus.pantanal.seedling.util.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/oplus/pantanal/seedling/translator/SeedlingDataTranslator;", "", "()V", "KEY_ACTION", "", "KEY_PARAM", "TAG_CARD_DATA", "TAG_COMPRESS", "TAG_FORCE_CHANGE", "TAG_WIDGET_CODE", "decodeSeedlingCardEvent", "Lcom/oplus/pantanal/seedling/bean/SeedlingCardEvent;", "data", "", "encodeSeedlingCardEvent", "encodeSeedlingUpdateData", "Lcom/oplus/pantanal/seedling/update/SeedlingUpdateData;", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SeedlingDataTranslator {

    @NotNull
    public static final SeedlingDataTranslator INSTANCE = new SeedlingDataTranslator();

    @NotNull
    private static final String KEY_ACTION = "action";

    @NotNull
    private static final String KEY_PARAM = "param";

    @NotNull
    private static final String TAG_CARD_DATA = "data";

    @NotNull
    private static final String TAG_COMPRESS = "compress";

    @NotNull
    private static final String TAG_FORCE_CHANGE = "forceChangeCardUI";

    @NotNull
    private static final String TAG_WIDGET_CODE = "cardId";

    private SeedlingDataTranslator() {
    }

    @NotNull
    public final SeedlingCardEvent decodeSeedlingCardEvent(@NotNull byte[] data) throws JSONException {
        Intrinsics.checkNotNullParameter(data, "data");
        Logger logger = Logger.INSTANCE;
        logger.i(Constants.TAG, "use json to decode,size = " + data.length);
        JSONObject jSONObject = new JSONObject(new String(data, Charsets.UTF_8));
        int iOptInt = jSONObject.optInt("action");
        JSONObject jSONObject2 = jSONObject.has(KEY_PARAM) ? jSONObject.getJSONObject(KEY_PARAM) : new JSONObject();
        logger.i(Constants.TAG, "card = " + jSONObject + "  action = " + iOptInt);
        Intrinsics.checkNotNull(jSONObject2);
        ExtsKt.copyValue(jSONObject, jSONObject2, "service_id", JsonToSeedlingCardConvertor.KEY_SUBSCRIBE_TYPE, "card_size", JsonToSeedlingCardConvertor.KEY_SEEDLING_ENTRANCE, JsonToSeedlingCardConvertor.KEY_PAGE_ID, JsonToSeedlingCardConvertor.KEY_UPK_VERSION_CODE, "SecondTermTraceContext", "service_instance_id", JsonToSeedlingCardConvertor.KEY_CARD_UNIQUE_KEY);
        return new SeedlingCardEvent((SeedlingCard) ConvertorFactory.INSTANCE.get(JsonToSeedlingCardConvertor.class).to(jSONObject), iOptInt, jSONObject2);
    }

    @NotNull
    public final byte[] encodeSeedlingCardEvent(@NotNull SeedlingCardEvent data) throws JSONException {
        Intrinsics.checkNotNullParameter(data, "data");
        Logger.INSTANCE.i(Constants.TAG, "encodeSeedlingCardEvent card=" + data.getCard());
        JSONObject jSONObject = (JSONObject) ConvertorFactory.INSTANCE.get(JsonToSeedlingCardConvertor.class).from(data.getCard());
        jSONObject.put("action", data.getAction());
        jSONObject.put(KEY_PARAM, data.getParams());
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return StringsKt.encodeToByteArray(string);
    }

    @NotNull
    public final byte[] encodeSeedlingUpdateData(@NotNull SeedlingUpdateData data) throws JSONException {
        Intrinsics.checkNotNullParameter(data, "data");
        Logger.INSTANCE.i(Constants.TAG, "use json to encode");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TAG_WIDGET_CODE, data.getCardId());
        jSONObject.put("data", data.getData());
        jSONObject.put(TAG_COMPRESS, data.getCompress());
        jSONObject.put(TAG_FORCE_CHANGE, data.getForceUpdate());
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return StringsKt.encodeToByteArray(string);
    }
}
