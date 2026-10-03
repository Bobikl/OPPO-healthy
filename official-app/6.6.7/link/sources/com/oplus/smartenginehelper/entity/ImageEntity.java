package com.oplus.smartenginehelper.entity;

import android.widget.ImageView;
import com.oplus.smartenginehelper.ParserTag;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\rJ\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\rJ\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\rJ\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0003¨\u0006\u0018"}, d2 = {"Lcom/oplus/smartenginehelper/entity/ImageEntity;", "Lcom/oplus/smartenginehelper/entity/ViewEntity;", ParserTag.TAG_ID, "", "(Ljava/lang/String;)V", "setAdjustViewBounds", "", ParserTag.TAG_ADJUST_VIEW_BOUNDS, "", "setCropToPadding", ParserTag.TAG_CROP_TO_PADDING, "setDrawableAlpha", ViewEntity.ALPHA, "", "setMaxHeight", "size", "setMaxWidth", "setScaleType", ParserTag.TAG_SCALE_TYPE, "Landroid/widget/ImageView$ScaleType;", "setSrc", "drawableId", ParserTag.TAG_SRC, "Companion", "com.oplus.smartengine.smartenginehelper"}, k = 1, mv = {1, 4, 2})
public class ImageEntity extends ViewEntity {

    @NotNull
    public static final String SCALE_TYPE_CENTER = "center";

    @NotNull
    public static final String SCALE_TYPE_CENTER_CROP = "centerCrop";

    @NotNull
    public static final String SCALE_TYPE_CENTER_INSIDE = "centerInside";

    @NotNull
    public static final String SCALE_TYPE_FIT_CENTER = "fitCenter";

    @NotNull
    public static final String SCALE_TYPE_FIT_END = "fitEnd";

    @NotNull
    public static final String SCALE_TYPE_FIT_START = "fitStart";

    @NotNull
    public static final String SCALE_TYPE_FIT_XY = "fitXY";

    @NotNull
    public static final String SCALE_TYPE_MATRIX = "matrix";

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            iArr[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            iArr[ImageView.ScaleType.MATRIX.ordinal()] = 4;
            iArr[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 6;
            iArr[ImageView.ScaleType.FIT_START.ordinal()] = 7;
            iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 8;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageEntity(@NotNull String str) throws JSONException {
        super(str);
        Intrinsics.checkNotNullParameter(str, ParserTag.TAG_ID);
        getMJSONObject().put("type", "image");
    }

    public final void setAdjustViewBounds(boolean adjustViewBounds) throws JSONException {
        getMJSONObject().put(ParserTag.TAG_ADJUST_VIEW_BOUNDS, adjustViewBounds);
    }

    public final void setCropToPadding(boolean cropToPadding) throws JSONException {
        getMJSONObject().put(ParserTag.TAG_CROP_TO_PADDING, cropToPadding);
    }

    public final void setDrawableAlpha(int alpha) throws JSONException {
        getMJSONObject().put(ParserTag.TAG_DRAWABLE_ALPHA, alpha);
    }

    public final void setMaxHeight(int size) throws JSONException {
        getMJSONObject().put(ParserTag.TAG_MAX_HEIGHT, size);
    }

    public final void setMaxWidth(int size) throws JSONException {
        getMJSONObject().put(ParserTag.TAG_MAX_WIDTH, size);
    }

    public final void setScaleType(@NotNull ImageView.ScaleType scaleType) throws JSONException {
        Intrinsics.checkNotNullParameter(scaleType, ParserTag.TAG_SCALE_TYPE);
        int i = WhenMappings.$EnumSwitchMapping$0[scaleType.ordinal()];
        String str = SCALE_TYPE_FIT_CENTER;
        switch (i) {
            case 1:
                str = "center";
                break;
            case 2:
                str = SCALE_TYPE_CENTER_CROP;
                break;
            case 3:
                str = SCALE_TYPE_CENTER_INSIDE;
                break;
            case 4:
                str = SCALE_TYPE_MATRIX;
                break;
            case 5:
                str = SCALE_TYPE_FIT_END;
                break;
            case 7:
                str = SCALE_TYPE_FIT_START;
                break;
            case 8:
                str = SCALE_TYPE_FIT_XY;
                break;
        }
        getMJSONObject().put(ParserTag.TAG_SCALE_TYPE, str);
    }

    public final void setSrc(@NotNull String src) throws JSONException {
        Intrinsics.checkNotNullParameter(src, ParserTag.TAG_SRC);
        getMJSONObject().put(ParserTag.TAG_SRC, src);
    }

    public final void setSrc(int drawableId) throws JSONException {
        getMJSONObject().put(ParserTag.TAG_SRC, drawableId);
    }
}
