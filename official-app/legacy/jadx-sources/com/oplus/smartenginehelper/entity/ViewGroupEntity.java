package com.oplus.smartenginehelper.entity;

import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0001R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/oplus/smartenginehelper/entity/ViewGroupEntity;", "Lcom/oplus/smartenginehelper/entity/ViewEntity;", "id", "", "(Ljava/lang/String;)V", "mChildJSONArray", "Lorg/json/JSONArray;", "addView", "", "viewEntity", "com.oplus.smartengine.smartenginehelper"}, k = 1, mv = {1, 4, 2})
public abstract class ViewGroupEntity extends ViewEntity {
    private JSONArray mChildJSONArray;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewGroupEntity(@NotNull String id) {
        super(id);
        Intrinsics.checkNotNullParameter(id, "id");
    }

    public final void addView(@NotNull ViewEntity viewEntity) throws JSONException {
        Intrinsics.checkNotNullParameter(viewEntity, "viewEntity");
        if (this.mChildJSONArray == null) {
            this.mChildJSONArray = new JSONArray();
            getMJSONObject().put("child", this.mChildJSONArray);
        }
        JSONArray jSONArray = this.mChildJSONArray;
        if (jSONArray != null) {
            jSONArray.put(viewEntity.getMJSONObject());
        }
    }
}
