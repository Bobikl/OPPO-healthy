package com.oplus.pantanal.seedling.convertor;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.oplus.pantanal.seedling.bean.SeedlingCard;
import com.oplus.pantanal.seedling.bean.SeedlingCardSizeEnum;
import com.oplus.pantanal.seedling.bean.SeedlingHostEnum;
import com.oplus.pantanal.seedling.bean.SeedlingSubscribeTypeEnum;
import com.oplus.pantanal.seedling.util.ExtsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/oplus/pantanal/seedling/convertor/JsonToSeedlingCardConvertor;", "Lcom/oplus/pantanal/seedling/convertor/IConvertor;", "Lorg/json/JSONObject;", "Lcom/oplus/pantanal/seedling/bean/SeedlingCard;", "()V", "from", "data", TypedValues.TransitionType.S_TO, "Companion", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class JsonToSeedlingCardConvertor implements IConvertor<JSONObject, SeedlingCard> {

    @NotNull
    private static final String KEY_CARD_ID = "cardType";

    @NotNull
    private static final String KEY_CARD_INDEX = "cardId";

    @NotNull
    public static final String KEY_CARD_SIZE = "card_size";

    @NotNull
    public static final String KEY_CARD_UNIQUE_KEY = "card_unique_key";

    @NotNull
    private static final String KEY_HOST_ID = "hostId";

    @NotNull
    public static final String KEY_PAGE_ID = "page_id";

    @NotNull
    public static final String KEY_SEEDLING_ENTRANCE = "seedling_entrance";

    @NotNull
    public static final String KEY_SERVICE_ID = "service_id";

    @NotNull
    public static final String KEY_SERVICE_INSTANCE_ID = "service_instance_id";

    @NotNull
    public static final String KEY_SUBSCRIBE_TYPE = "card_create_type";

    @NotNull
    public static final String KEY_TRACE_CONTEXT = "SecondTermTraceContext";

    @NotNull
    public static final String KEY_UPK_VERSION_CODE = "upk_version_code";

    @Override // com.oplus.pantanal.seedling.convertor.IConvertor
    @NotNull
    public SeedlingCard to(@NotNull JSONObject data) throws JSONException {
        Intrinsics.checkNotNullParameter(data, "data");
        String strOptString = data.optString("service_id");
        int iOptInt = data.optInt(KEY_CARD_ID);
        int iOptInt2 = data.optInt(KEY_CARD_INDEX);
        int iOptInt3 = data.optInt(KEY_HOST_ID);
        int iOptInt4 = data.optInt("card_create_type");
        int iOptInt5 = data.optInt("card_size");
        int iOptInt6 = data.optInt("seedling_entrance");
        String strOptString2 = data.optString("page_id");
        long jOptLong = data.optLong("upk_version_code");
        String strOptString3 = data.optString("service_instance_id");
        String strOptString4 = data.optString("card_unique_key");
        Intrinsics.checkNotNull(strOptString);
        SeedlingHostEnum seedlingHostEnumCreate = SeedlingHostEnum.INSTANCE.create(iOptInt6);
        SeedlingSubscribeTypeEnum seedlingSubscribeTypeEnumCreate = SeedlingSubscribeTypeEnum.INSTANCE.create(iOptInt4);
        SeedlingCardSizeEnum seedlingCardSizeEnumCreate = SeedlingCardSizeEnum.INSTANCE.create(iOptInt5);
        Intrinsics.checkNotNull(strOptString2);
        Intrinsics.checkNotNull(strOptString3);
        SeedlingCard seedlingCard = new SeedlingCard(strOptString, iOptInt, iOptInt2, iOptInt3, seedlingHostEnumCreate, seedlingSubscribeTypeEnumCreate, seedlingCardSizeEnumCreate, strOptString2, jOptLong, strOptString3);
        Intrinsics.checkNotNull(strOptString4);
        seedlingCard.setCardUniqueKey$seedling_support_manualRelease(strOptString4);
        ExtsKt.copyValue(seedlingCard.getExtraData(), data, "SecondTermTraceContext");
        return seedlingCard;
    }

    @Override // com.oplus.pantanal.seedling.convertor.IConvertor
    @NotNull
    public JSONObject from(@NotNull SeedlingCard data) throws JSONException {
        Intrinsics.checkNotNullParameter(data, "data");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("service_id", data.getServiceId());
        jSONObject.put(KEY_CARD_ID, data.getCardId());
        jSONObject.put(KEY_CARD_INDEX, data.getCardIndex());
        jSONObject.put(KEY_HOST_ID, data.getHostId$seedling_support_manualRelease());
        jSONObject.put("seedling_entrance", data.getHost().getHostId());
        jSONObject.put("card_create_type", data.getSubscribeType().getTypeCode());
        jSONObject.put("card_size", data.getSize().getSizeCode());
        jSONObject.put("page_id", data.getPageId());
        jSONObject.put("upk_version_code", data.getUpkVersionCode());
        jSONObject.put("service_instance_id", data.getServiceInstanceId());
        jSONObject.put("card_unique_key", data.getCardUniqueKey());
        return jSONObject;
    }
}
