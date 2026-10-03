package com.heytap.speech.engine;

import androidx.annotation.Keep;
import com.heytap.speech.engine.constant.EngineConstant;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001dJn\u0010'\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\u000b2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\tHÖ\u0001J\t\u0010,\u001a\u00020\u0004HÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006-"}, d2 = {"Lcom/heytap/speech/engine/ErrorHandle;", "", EngineConstant.PRODUCT_TIPS_ASR_EMPTY, "", "", EngineConstant.PRODUCT_TIPS_EXIT, EngineConstant.PRODUCT_TIPS_NLU_EMPTY, EngineConstant.PRODUCT_TIPS_OFFLINE, "retryTimes", "", "visible", "", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getAsrEmptyWords", "()Ljava/util/List;", "setAsrEmptyWords", "(Ljava/util/List;)V", "getExitWords", "setExitWords", "getNluEmptyWords", "setNluEmptyWords", "getOfflineWords", "setOfflineWords", "getRetryTimes", "()Ljava/lang/Integer;", "setRetryTimes", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getVisible", "()Ljava/lang/Boolean;", "setVisible", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/heytap/speech/engine/ErrorHandle;", "equals", "other", "hashCode", "toString", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class ErrorHandle {

    @Nullable
    private List<String> asrEmptyWords;

    @Nullable
    private List<String> exitWords;

    @Nullable
    private List<String> nluEmptyWords;

    @Nullable
    private List<String> offlineWords;

    @Nullable
    private Integer retryTimes;

    @Nullable
    private Boolean visible;

    public ErrorHandle() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ErrorHandle copy$default(ErrorHandle errorHandle, List list, List list2, List list3, List list4, Integer num, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            list = errorHandle.asrEmptyWords;
        }
        if ((i & 2) != 0) {
            list2 = errorHandle.exitWords;
        }
        List list5 = list2;
        if ((i & 4) != 0) {
            list3 = errorHandle.nluEmptyWords;
        }
        List list6 = list3;
        if ((i & 8) != 0) {
            list4 = errorHandle.offlineWords;
        }
        List list7 = list4;
        if ((i & 16) != 0) {
            num = errorHandle.retryTimes;
        }
        Integer num2 = num;
        if ((i & 32) != 0) {
            bool = errorHandle.visible;
        }
        return errorHandle.copy(list, list5, list6, list7, num2, bool);
    }

    @Nullable
    public final List<String> component1() {
        return this.asrEmptyWords;
    }

    @Nullable
    public final List<String> component2() {
        return this.exitWords;
    }

    @Nullable
    public final List<String> component3() {
        return this.nluEmptyWords;
    }

    @Nullable
    public final List<String> component4() {
        return this.offlineWords;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getRetryTimes() {
        return this.retryTimes;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getVisible() {
        return this.visible;
    }

    @NotNull
    public final ErrorHandle copy(@Nullable List<String> asrEmptyWords, @Nullable List<String> exitWords, @Nullable List<String> nluEmptyWords, @Nullable List<String> offlineWords, @Nullable Integer retryTimes, @Nullable Boolean visible) {
        return new ErrorHandle(asrEmptyWords, exitWords, nluEmptyWords, offlineWords, retryTimes, visible);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorHandle)) {
            return false;
        }
        ErrorHandle errorHandle = (ErrorHandle) other;
        return Intrinsics.areEqual(this.asrEmptyWords, errorHandle.asrEmptyWords) && Intrinsics.areEqual(this.exitWords, errorHandle.exitWords) && Intrinsics.areEqual(this.nluEmptyWords, errorHandle.nluEmptyWords) && Intrinsics.areEqual(this.offlineWords, errorHandle.offlineWords) && Intrinsics.areEqual(this.retryTimes, errorHandle.retryTimes) && Intrinsics.areEqual(this.visible, errorHandle.visible);
    }

    @Nullable
    public final List<String> getAsrEmptyWords() {
        return this.asrEmptyWords;
    }

    @Nullable
    public final List<String> getExitWords() {
        return this.exitWords;
    }

    @Nullable
    public final List<String> getNluEmptyWords() {
        return this.nluEmptyWords;
    }

    @Nullable
    public final List<String> getOfflineWords() {
        return this.offlineWords;
    }

    @Nullable
    public final Integer getRetryTimes() {
        return this.retryTimes;
    }

    @Nullable
    public final Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        List<String> list = this.asrEmptyWords;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.exitWords;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.nluEmptyWords;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.offlineWords;
        int iHashCode4 = (iHashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Integer num = this.retryTimes;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.visible;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public final void setAsrEmptyWords(@Nullable List<String> list) {
        this.asrEmptyWords = list;
    }

    public final void setExitWords(@Nullable List<String> list) {
        this.exitWords = list;
    }

    public final void setNluEmptyWords(@Nullable List<String> list) {
        this.nluEmptyWords = list;
    }

    public final void setOfflineWords(@Nullable List<String> list) {
        this.offlineWords = list;
    }

    public final void setRetryTimes(@Nullable Integer num) {
        this.retryTimes = num;
    }

    public final void setVisible(@Nullable Boolean bool) {
        this.visible = bool;
    }

    @NotNull
    public String toString() {
        return "ErrorHandle(asrEmptyWords=" + this.asrEmptyWords + ", exitWords=" + this.exitWords + ", nluEmptyWords=" + this.nluEmptyWords + ", offlineWords=" + this.offlineWords + ", retryTimes=" + this.retryTimes + ", visible=" + this.visible + ')';
    }

    public ErrorHandle(@Nullable List<String> list, @Nullable List<String> list2, @Nullable List<String> list3, @Nullable List<String> list4, @Nullable Integer num, @Nullable Boolean bool) {
        this.asrEmptyWords = list;
        this.exitWords = list2;
        this.nluEmptyWords = list3;
        this.offlineWords = list4;
        this.retryTimes = num;
        this.visible = bool;
    }

    public /* synthetic */ ErrorHandle(List list, List list2, List list3, List list4, Integer num, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : list4, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : bool);
    }
}
