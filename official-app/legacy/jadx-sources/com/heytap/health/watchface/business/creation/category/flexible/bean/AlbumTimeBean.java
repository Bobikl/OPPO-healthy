package com.heytap.health.watchface.business.creation.category.flexible.bean;

import androidx.annotation.Keep;
import com.heytap.health.watchface.R$array;
import com.heytap.health.watchface.business.base.BaseFlexiblePresenter;
import com.heytap.health.watchface.business.creation.category.video.VideoCustomPresenter;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.mr7;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u0011\n\u0002\b\t\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b'\u0010(J\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\"\u0010\r\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\"\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\"\u0010\u001f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/flexible/bean/AlbumTimeBean;", "Lcom/oplus/aiunit/vision/mr7;", "bean", "", "copyFrom", "", "other", "", "equals", "", "hashCode", "", "toString", VideoCustomPresenter.INDEX_TIME_STYLE, "I", "getTimeStyle", "()I", "setTimeStyle", "(I)V", "position", "getPosition", "setPosition", "timeColor", "Ljava/lang/String;", "getTimeColor", "()Ljava/lang/String;", "setTimeColor", "(Ljava/lang/String;)V", "timeType", "getTimeType", "setTimeType", "styleId", "getStyleId", "setStyleId", "", "colorList", "[Ljava/lang/String;", "getColorList", "()[Ljava/lang/String;", "<init>", "()V", "Companion", "a", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class AlbumTimeBean extends mr7 {

    @NotNull
    public static final String TAG = "AlbumTimeBean";

    @NotNull
    private final transient String[] colorList;
    private int position;

    @NotNull
    private String styleId;

    @NotNull
    private String timeColor;
    private int timeStyle;
    private int timeType;

    public AlbumTimeBean() {
        super(BaseFlexiblePresenter.TAG_ALBUM_TIME);
        this.timeColor = "#FFFFFFFF";
        this.styleId = "";
        String[] stringArray = b78.a().getResources().getStringArray(R$array.watch_face_flexible_time_colors);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getAppContext().resource…ace_flexible_time_colors)");
        this.colorList = stringArray;
    }

    public final void copyFrom(@NotNull AlbumTimeBean bean) {
        Intrinsics.checkNotNullParameter(bean, "bean");
        this.timeStyle = bean.timeStyle;
        this.position = bean.position;
        this.timeColor = bean.timeColor;
        this.timeType = bean.timeType;
        this.styleId = bean.styleId;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(AlbumTimeBean.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.heytap.health.watchface.business.creation.category.flexible.bean.AlbumTimeBean");
        AlbumTimeBean albumTimeBean = (AlbumTimeBean) other;
        return this.timeStyle == albumTimeBean.timeStyle && this.position == albumTimeBean.position && Intrinsics.areEqual(this.timeColor, albumTimeBean.timeColor) && this.timeType == albumTimeBean.timeType && Intrinsics.areEqual(this.styleId, albumTimeBean.styleId);
    }

    @NotNull
    public final String[] getColorList() {
        return this.colorList;
    }

    public final int getPosition() {
        return this.position;
    }

    @NotNull
    public final String getStyleId() {
        return this.styleId;
    }

    @NotNull
    public final String getTimeColor() {
        return this.timeColor;
    }

    public final int getTimeStyle() {
        return this.timeStyle;
    }

    public final int getTimeType() {
        return this.timeType;
    }

    public int hashCode() {
        return (((((((this.timeStyle * 31) + this.position) * 31) + this.timeColor.hashCode()) * 31) + this.timeType) * 31) + this.styleId.hashCode();
    }

    public final void setPosition(int i) {
        this.position = i;
    }

    public final void setStyleId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.styleId = str;
    }

    public final void setTimeColor(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.timeColor = str;
    }

    public final void setTimeStyle(int i) {
        this.timeStyle = i;
    }

    public final void setTimeType(int i) {
        this.timeType = i;
    }

    @NotNull
    public String toString() {
        return "AlbumTimeBean(timeStyle=" + this.timeStyle + ", position=" + this.position + ", timeColor='" + this.timeColor + "', timeType=" + this.timeType + ", styleId=" + this.styleId + ")";
    }
}
