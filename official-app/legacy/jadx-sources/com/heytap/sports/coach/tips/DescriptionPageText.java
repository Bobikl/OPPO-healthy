package com.heytap.sports.coach.tips;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.Serializable;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB\u001d\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/heytap/sports/coach/tips/DescriptionPageText;", "Ljava/io/Serializable;", "strId", "", "extraString", "", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getExtraString", "()Ljava/lang/String;", "getStrId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "DescriptionContent", "DescriptionPointContent", "DescriptionTitle", "Lcom/heytap/sports/coach/tips/DescriptionPageText$DescriptionContent;", "Lcom/heytap/sports/coach/tips/DescriptionPageText$DescriptionPointContent;", "Lcom/heytap/sports/coach/tips/DescriptionPageText$DescriptionTitle;", "sport_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class DescriptionPageText implements Serializable {
    public static final int $stable = 0;

    @Nullable
    private final String extraString;

    @Nullable
    private final Integer strId;

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/heytap/sports/coach/tips/DescriptionPageText$DescriptionContent;", "Lcom/heytap/sports/coach/tips/DescriptionPageText;", "strId", "", "extraString", "", "(Ljava/lang/Integer;Ljava/lang/String;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DescriptionContent extends DescriptionPageText {
        public static final int $stable = 0;

        public DescriptionContent(@Nullable Integer num, @Nullable String str) {
            super(num, str, null);
        }

        public /* synthetic */ DescriptionContent(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(num, (i & 2) != 0 ? null : str);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/heytap/sports/coach/tips/DescriptionPageText$DescriptionPointContent;", "Lcom/heytap/sports/coach/tips/DescriptionPageText;", "strId", "", "extraString", "", "(Ljava/lang/Integer;Ljava/lang/String;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DescriptionPointContent extends DescriptionPageText {
        public static final int $stable = 0;

        public DescriptionPointContent(@Nullable Integer num, @Nullable String str) {
            super(num, str, null);
        }

        public /* synthetic */ DescriptionPointContent(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(num, (i & 2) != 0 ? null : str);
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/heytap/sports/coach/tips/DescriptionPageText$DescriptionTitle;", "Lcom/heytap/sports/coach/tips/DescriptionPageText;", "strId", "", "extraString", "", "(Ljava/lang/Integer;Ljava/lang/String;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DescriptionTitle extends DescriptionPageText {
        public static final int $stable = 0;

        public DescriptionTitle(@Nullable Integer num, @Nullable String str) {
            super(num, str, null);
        }

        public /* synthetic */ DescriptionTitle(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(num, (i & 2) != 0 ? null : str);
        }
    }

    public /* synthetic */ DescriptionPageText(Integer num, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, str);
    }

    @Nullable
    public final String getExtraString() {
        return this.extraString;
    }

    @Nullable
    public final Integer getStrId() {
        return this.strId;
    }

    private DescriptionPageText(Integer num, String str) {
        this.strId = num;
        this.extraString = str;
    }

    public /* synthetic */ DescriptionPageText(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, (i & 2) != 0 ? null : str, null);
    }
}
