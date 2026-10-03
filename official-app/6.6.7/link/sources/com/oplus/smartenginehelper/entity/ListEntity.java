package com.oplus.smartenginehelper.entity;

import com.oplus.smartenginehelper.ParserTag;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0003J\u0010\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003J\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\bJ\u000e\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\b¨\u0006\u001e"}, d2 = {"Lcom/oplus/smartenginehelper/entity/ListEntity;", "Lcom/oplus/smartenginehelper/entity/ViewEntity;", ParserTag.TAG_ID, "", "(Ljava/lang/String;)V", "setClipToPadding", "", "isClip", "", "setData", "data", "Lcom/oplus/smartenginehelper/entity/ListDataEntity;", "setHasFixedSize", ParserTag.HAS_FIXED_SIZE, "setLayout", ParserTag.CHILD_LAYOUT, "Lcom/oplus/smartenginehelper/entity/ListLayoutEntity;", "setLayoutManager", "setOrientation", "orientation", "setPaginationOnScrollListener", "listener", "Lcom/oplus/smartenginehelper/entity/ContentProviderClickEntity;", "setReverseLayout", "isReverse", "setSpanCount", ParserTag.DATA_SAME_COUNT, "", "setSupportPageLoad", "isSupport", "com.oplus.smartengine.smartenginehelper"}, k = 1, mv = {1, 4, 2})
public final class ListEntity extends ViewEntity {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListEntity(@NotNull String str) throws JSONException {
        super(str);
        Intrinsics.checkNotNullParameter(str, ParserTag.TAG_ID);
        getMJSONObject().put("type", "list");
    }

    public final void setClipToPadding(boolean isClip) throws JSONException {
        getMJSONObject().put(ParserTag.CLIP_TO_PADDING, isClip);
    }

    public final void setData(@NotNull ListDataEntity data) throws JSONException {
        Intrinsics.checkNotNullParameter(data, "data");
        getMJSONObject().put("data", data.getMJSONArray());
    }

    public final void setHasFixedSize(boolean hasFixedSize) throws JSONException {
        getMJSONObject().put(ParserTag.HAS_FIXED_SIZE, hasFixedSize);
    }

    public final void setLayout(@NotNull ListLayoutEntity layout) throws JSONException {
        Intrinsics.checkNotNullParameter(layout, ParserTag.CHILD_LAYOUT);
        getMJSONObject().put(ParserTag.CHILD, layout.getMJSONArray());
    }

    public final void setLayoutManager(@NotNull String layout) throws JSONException {
        Intrinsics.checkNotNullParameter(layout, ParserTag.CHILD_LAYOUT);
        getMJSONObject().put(ParserTag.LAYOUT_MANAGER, layout);
    }

    public final void setOrientation(@Nullable String orientation) throws JSONException {
        getMJSONObject().put("orientation", orientation);
    }

    public final void setPaginationOnScrollListener(@NotNull ContentProviderClickEntity listener) throws JSONException {
        Intrinsics.checkNotNullParameter(listener, "listener");
        getMJSONObject().put(ParserTag.PAGINATION_SCROLL_LISTENER, listener.getMJSONObject());
    }

    public final void setReverseLayout(boolean isReverse) throws JSONException {
        getMJSONObject().put(ParserTag.REVERSE_LAYOUT, isReverse);
    }

    public final void setSpanCount(int count) throws JSONException {
        getMJSONObject().put(ParserTag.SPAN_COUNT, count);
    }

    public final void setSupportPageLoad(boolean isSupport) throws JSONException {
        getMJSONObject().put(ParserTag.SUPPORT_PAGINATION_LOAD, isSupport);
    }
}
