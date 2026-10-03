package com.heytap.sports.record.details.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.heytap.store.platform.videoplayer.bean.VideoPlayerProductDetailDataBeanKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/heytap/sports/record/details/bean/SwimNationalStandardImgBean;", "", VideoPlayerProductDetailDataBeanKt.IMG, "", "(Ljava/lang/String;)V", "getImg", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "sport_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SwimNationalStandardImgBean {
    public static final int $stable = 0;

    @SerializedName("swimRatingUrl")
    @NotNull
    private final String img;

    public SwimNationalStandardImgBean(@NotNull String img) {
        Intrinsics.checkNotNullParameter(img, "img");
        this.img = img;
    }

    public static /* synthetic */ SwimNationalStandardImgBean copy$default(SwimNationalStandardImgBean swimNationalStandardImgBean, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = swimNationalStandardImgBean.img;
        }
        return swimNationalStandardImgBean.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getImg() {
        return this.img;
    }

    @NotNull
    public final SwimNationalStandardImgBean copy(@NotNull String img) {
        Intrinsics.checkNotNullParameter(img, "img");
        return new SwimNationalStandardImgBean(img);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SwimNationalStandardImgBean) && Intrinsics.areEqual(this.img, ((SwimNationalStandardImgBean) other).img);
    }

    @NotNull
    public final String getImg() {
        return this.img;
    }

    public int hashCode() {
        return this.img.hashCode();
    }

    @NotNull
    public String toString() {
        return "SwimNationalStandardImgBean(img=" + this.img + ")";
    }
}
