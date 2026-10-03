package com.oplus.smartenginehelper.entity;

import com.oplus.smartenginehelper.ParserTag;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0006\u0010\f\u001a\u00020\u0004J\u001e\u0010\r\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ(\u0010\u0012\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/oplus/smartenginehelper/entity/ListDataEntity;", "", "()V", "mJSONArray", "Lorg/json/JSONArray;", "addItemData", "", "jsonObject", "Lorg/json/JSONObject;", "getItemDataJson", "itemData", "Lcom/oplus/smartenginehelper/entity/ListDataEntity$ListItemData;", "getJSONArray", "setArrayData", ParserTag.DATA_VALUE_ARRAY, "", "count", "", "setItemData", "value", "Lcom/oplus/smartenginehelper/entity/ViewEntity;", ParserTag.VIEW_TYPE, "ListItemData", "com.oplus.smartengine.smartenginehelper"}, k = 1, mv = {1, 4, 2})
public final class ListDataEntity {
    private final JSONArray mJSONArray = new JSONArray();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/oplus/smartenginehelper/entity/ListDataEntity$ListItemData;", "", "value", "", "Lcom/oplus/smartenginehelper/entity/ViewEntity;", "count", "", ParserTag.VIEW_TYPE, "(Ljava/util/List;II)V", "getCount", "()I", "getValue", "()Ljava/util/List;", "getViewType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "com.oplus.smartengine.smartenginehelper"}, k = 1, mv = {1, 4, 2})
    public static final /* data */ class ListItemData {
        private final int count;

        @NotNull
        private final List<ViewEntity> value;
        private final int viewType;

        /* JADX WARN: Multi-variable type inference failed */
        public ListItemData(@NotNull List<? extends ViewEntity> value, int i, int i2) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
            this.count = i;
            this.viewType = i2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ListItemData copy$default(ListItemData listItemData, List list, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                list = listItemData.value;
            }
            if ((i3 & 2) != 0) {
                i = listItemData.count;
            }
            if ((i3 & 4) != 0) {
                i2 = listItemData.viewType;
            }
            return listItemData.copy(list, i, i2);
        }

        @NotNull
        public final List<ViewEntity> component1() {
            return this.value;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getCount() {
            return this.count;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getViewType() {
            return this.viewType;
        }

        @NotNull
        public final ListItemData copy(@NotNull List<? extends ViewEntity> value, int count, int viewType) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new ListItemData(value, count, viewType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ListItemData)) {
                return false;
            }
            ListItemData listItemData = (ListItemData) other;
            return Intrinsics.areEqual(this.value, listItemData.value) && this.count == listItemData.count && this.viewType == listItemData.viewType;
        }

        public final int getCount() {
            return this.count;
        }

        @NotNull
        public final List<ViewEntity> getValue() {
            return this.value;
        }

        public final int getViewType() {
            return this.viewType;
        }

        public int hashCode() {
            List<ViewEntity> list = this.value;
            return ((((list != null ? list.hashCode() : 0) * 31) + Integer.hashCode(this.count)) * 31) + Integer.hashCode(this.viewType);
        }

        @NotNull
        public String toString() {
            return "ListItemData(value=" + this.value + ", count=" + this.count + ", viewType=" + this.viewType + ")";
        }

        public /* synthetic */ ListItemData(List list, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i3 & 2) != 0 ? 1 : i, (i3 & 4) != 0 ? 0 : i2);
        }
    }

    private final void addItemData(JSONObject jsonObject) {
        this.mJSONArray.put(jsonObject);
    }

    private final JSONObject getItemDataJson(ListItemData itemData) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = itemData.getValue().iterator();
        while (it.hasNext()) {
            jSONArray.put(((ViewEntity) it.next()).getMJSONObject());
        }
        jSONObject.put("value", jSONArray);
        jSONObject.put("count", itemData.getCount());
        jSONObject.put(ParserTag.VIEW_TYPE, itemData.getViewType());
        return jSONObject;
    }

    public static /* synthetic */ void setArrayData$default(ListDataEntity listDataEntity, List list, int i, int i2, Object obj) throws JSONException {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        listDataEntity.setArrayData(list, i);
    }

    public static /* synthetic */ void setItemData$default(ListDataEntity listDataEntity, List list, int i, int i2, int i3, Object obj) throws JSONException {
        if ((i3 & 2) != 0) {
            i = 1;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        listDataEntity.setItemData(list, i, i2);
    }

    @NotNull
    /* JADX INFO: renamed from: getJSONArray, reason: from getter */
    public final JSONArray getMJSONArray() {
        return this.mJSONArray;
    }

    public final void setArrayData(@NotNull List<ListItemData> valueArray, int count) throws JSONException {
        Intrinsics.checkNotNullParameter(valueArray, "valueArray");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONObject.put("count", count);
        Iterator<T> it = valueArray.iterator();
        while (it.hasNext()) {
            jSONArray.put(getItemDataJson((ListItemData) it.next()));
        }
        jSONObject.put(ParserTag.DATA_VALUE_ARRAY, jSONArray);
        jSONObject.put("count", count);
        addItemData(jSONObject);
    }

    public final void setItemData(@NotNull List<? extends ViewEntity> value, int count, int viewType) throws JSONException {
        Intrinsics.checkNotNullParameter(value, "value");
        if (!value.isEmpty()) {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                jSONArray.put(((ViewEntity) it.next()).getMJSONObject());
            }
            jSONObject.put("value", jSONArray);
            jSONObject.put("count", count);
            jSONObject.put(ParserTag.VIEW_TYPE, viewType);
            addItemData(jSONObject);
        }
    }

    public final void setItemData(@NotNull ListItemData itemData) throws JSONException {
        Intrinsics.checkNotNullParameter(itemData, "itemData");
        setItemData(itemData.getValue(), itemData.getCount(), itemData.getViewType());
    }
}
