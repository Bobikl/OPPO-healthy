package com.oplus.pantanal.seedling.update;

import com.oplus.pantanal.seedling.bean.SeedlingCardAction;
import com.oplus.pantanal.seedling.util.CardDataTranslaterKt;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/oplus/pantanal/seedling/update/SeedlingCardActionParser;", "", "()V", "TAG_ACTION", "", "TAG_CARD_ID", "TAG_CARD_TYPE", "TAG_HOST_ID", "TAG_PARAM", "parse", "Lcom/oplus/pantanal/seedling/bean/SeedlingCardAction;", "obj", "Lorg/json/JSONObject;", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SeedlingCardActionParser {

    @NotNull
    public static final SeedlingCardActionParser INSTANCE = new SeedlingCardActionParser();

    @NotNull
    private static final String TAG_ACTION = "action";

    @NotNull
    private static final String TAG_CARD_ID = "cardId";

    @NotNull
    private static final String TAG_CARD_TYPE = "cardType";

    @NotNull
    private static final String TAG_HOST_ID = "hostId";

    @NotNull
    private static final String TAG_PARAM = "param";

    private SeedlingCardActionParser() {
    }

    @NotNull
    public final SeedlingCardAction parse(@NotNull JSONObject obj) throws JSONException {
        Intrinsics.checkNotNullParameter(obj, "obj");
        int i = obj.getInt(TAG_CARD_ID);
        int i2 = obj.getInt(TAG_HOST_ID);
        int i3 = obj.getInt("action");
        int i4 = obj.getInt(TAG_CARD_TYPE);
        JSONObject jSONObject = obj.has(TAG_PARAM) ? obj.getJSONObject(TAG_PARAM) : new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        HashMap map = null;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (map == null) {
                map = new HashMap();
            }
            Intrinsics.checkNotNull(next);
            String string = jSONObject.getString(next);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            map.put(next, string);
        }
        return new SeedlingCardAction(CardDataTranslaterKt.getWidgetId(i4, i, i2), i3, map);
    }
}
