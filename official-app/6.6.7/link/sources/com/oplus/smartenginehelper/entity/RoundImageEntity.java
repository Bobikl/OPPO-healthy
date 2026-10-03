package com.oplus.smartenginehelper.entity;

import com.oplus.smartenginehelper.ParserTag;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0003¨\u0006\u0011"}, d2 = {"Lcom/oplus/smartenginehelper/entity/RoundImageEntity;", "Lcom/oplus/smartenginehelper/entity/ImageEntity;", ParserTag.TAG_ID, "", "(Ljava/lang/String;)V", "setBorderColor", "", "borderColor", "", "setBorderRadius", "radius", "setHasBorder", "hasBorder", "", "setImageType", "type", "Companion", "com.oplus.smartengine.smartenginehelper"}, k = 1, mv = {1, 4, 2})
public final class RoundImageEntity extends ImageEntity {

    @NotNull
    public static final String TAG_BORDER_COLOR = "borderColor";

    @NotNull
    public static final String TAG_BORDER_RADIUS = "borderRadius";

    @NotNull
    public static final String TAG_HAS_BORDER = "hasBorder";

    @NotNull
    public static final String TAG_IMAGE_TYPE = "imageType";
    public static final int TYPE_CIRCLE = 0;
    public static final int TYPE_ROUND = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundImageEntity(@NotNull String str) throws JSONException {
        super(str);
        Intrinsics.checkNotNullParameter(str, ParserTag.TAG_ID);
        getMJSONObject().put("type", "roundImage");
    }

    public final void setBorderColor(int borderColor) throws JSONException {
        getMJSONObject().put("borderColor", borderColor);
    }

    public final void setBorderRadius(int radius) throws JSONException {
        getMJSONObject().put("borderRadius", radius);
    }

    public final void setHasBorder(boolean hasBorder) throws JSONException {
        getMJSONObject().put("hasBorder", hasBorder);
    }

    public final void setImageType(int type) throws JSONException {
        getMJSONObject().put("imageType", type);
    }

    public final void setImageType(@NotNull String type) throws JSONException {
        Intrinsics.checkNotNullParameter(type, "type");
        getMJSONObject().put("imageType", type);
    }
}
