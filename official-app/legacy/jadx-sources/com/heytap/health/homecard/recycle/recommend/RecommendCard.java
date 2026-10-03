package com.heytap.health.homecard.recycle.recommend;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.homecard.constant.HomeCardDataEnum$DataType;
import com.oplus.aiunit.vision.y15;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/heytap/health/homecard/recycle/recommend/RecommendCard;", "", y15.PARAMS_DATA_TYPE, "Lcom/heytap/health/homecard/constant/HomeCardDataEnum$DataType;", "content", "", "imgLink", "(Lcom/heytap/health/homecard/constant/HomeCardDataEnum$DataType;Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getDataType", "()Lcom/heytap/health/homecard/constant/HomeCardDataEnum$DataType;", "getImgLink", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "health_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RecommendCard {
    public static final int $stable = 0;

    @NotNull
    private final String content;

    @NotNull
    private final HomeCardDataEnum$DataType dataType;

    @NotNull
    private final String imgLink;

    public RecommendCard(@NotNull HomeCardDataEnum$DataType dataType, @NotNull String content, @NotNull String imgLink) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(imgLink, "imgLink");
        this.dataType = dataType;
        this.content = content;
        this.imgLink = imgLink;
    }

    public static /* synthetic */ RecommendCard copy$default(RecommendCard recommendCard, HomeCardDataEnum$DataType homeCardDataEnum$DataType, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            homeCardDataEnum$DataType = recommendCard.dataType;
        }
        if ((i & 2) != 0) {
            str = recommendCard.content;
        }
        if ((i & 4) != 0) {
            str2 = recommendCard.imgLink;
        }
        return recommendCard.copy(homeCardDataEnum$DataType, str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HomeCardDataEnum$DataType getDataType() {
        return this.dataType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImgLink() {
        return this.imgLink;
    }

    @NotNull
    public final RecommendCard copy(@NotNull HomeCardDataEnum$DataType dataType, @NotNull String content, @NotNull String imgLink) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(imgLink, "imgLink");
        return new RecommendCard(dataType, content, imgLink);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendCard)) {
            return false;
        }
        RecommendCard recommendCard = (RecommendCard) other;
        return this.dataType == recommendCard.dataType && Intrinsics.areEqual(this.content, recommendCard.content) && Intrinsics.areEqual(this.imgLink, recommendCard.imgLink);
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final HomeCardDataEnum$DataType getDataType() {
        return this.dataType;
    }

    @NotNull
    public final String getImgLink() {
        return this.imgLink;
    }

    public int hashCode() {
        return (((this.dataType.hashCode() * 31) + this.content.hashCode()) * 31) + this.imgLink.hashCode();
    }

    @NotNull
    public String toString() {
        return "RecommendCard(dataType=" + this.dataType + ", content=" + this.content + ", imgLink=" + this.imgLink + ")";
    }
}
