package com.oplus.smartenginehelper.entity;

import com.oplus.smartenginehelper.ParserTag;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0002J\u0006\u0010\f\u001a\u00020\u0004J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011J\u0012\u0010\r\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/oplus/smartenginehelper/entity/ListLayoutEntity;", "", "()V", "mJSONArray", "Lorg/json/JSONArray;", "mLayoutList", "Ljava/util/ArrayList;", "Lorg/json/JSONObject;", "Lkotlin/collections/ArrayList;", "addLayout", "", "jsonObject", "getJSONArray", "setItemLayout", "viewEntity", "Lcom/oplus/smartenginehelper/entity/ViewEntity;", ParserTag.VIEW_TYPE, "", "com.oplus.smartengine.smartenginehelper"}, k = 1, mv = {1, 4, 2})
public final class ListLayoutEntity {
    private final JSONArray mJSONArray = new JSONArray();
    private final ArrayList<JSONObject> mLayoutList = new ArrayList<>();

    private final void addLayout(JSONObject jsonObject) {
        this.mJSONArray.put(jsonObject);
    }

    public static /* synthetic */ void setItemLayout$default(ListLayoutEntity listLayoutEntity, ViewEntity viewEntity, int i, int i2, Object obj) throws JSONException {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        listLayoutEntity.setItemLayout(viewEntity, i);
    }

    @NotNull
    /* JADX INFO: renamed from: getJSONArray, reason: from getter */
    public final JSONArray getMJSONArray() {
        return this.mJSONArray;
    }

    public final void setItemLayout(@NotNull ViewEntity viewEntity, int viewType) throws JSONException {
        Intrinsics.checkNotNullParameter(viewEntity, "viewEntity");
        JSONObject mJSONObject = viewEntity.getMJSONObject();
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt(ParserTag.CHILD_LAYOUT, mJSONObject);
        jSONObject.put(ParserTag.VIEW_TYPE, viewType);
        setItemLayout(jSONObject);
    }

    private final void setItemLayout(JSONObject jsonObject) {
        if (jsonObject == null || this.mLayoutList.contains(jsonObject)) {
            return;
        }
        this.mLayoutList.add(jsonObject);
        addLayout(jsonObject);
    }
}
