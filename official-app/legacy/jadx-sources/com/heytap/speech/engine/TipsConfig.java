package com.heytap.speech.engine;

import androidx.annotation.Keep;
import com.heytap.speech.engine.constant.EngineConstant;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bµ\u0001\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003¢\u0006\u0002\u0010\fJ\u0015\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003HÆ\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003HÆ\u0003J\u0015\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003HÆ\u0003J\u0015\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003HÆ\u0003J\u0015\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003HÆ\u0003J\u0015\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003HÆ\u0003J\u0015\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003HÆ\u0003J\u0015\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003HÆ\u0003J¹\u0001\u0010\u001e\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00032\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00032\u0014\b\u0002\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00032\u0014\b\u0002\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00032\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006%"}, d2 = {"Lcom/heytap/speech/engine/TipsConfig;", "", EngineConstant.PRODUCT_TIPS_ASR_EMPTY, "", "", EngineConstant.PRODUCT_TIPS_DMERROR, EngineConstant.PRODUCT_TIPS_DMTIMEOUT, EngineConstant.PRODUCT_TIPS_EXIT, EngineConstant.PRODUCT_TIPS_NLU_EMPTY, EngineConstant.PRODUCT_TIPS_OFFLINE, EngineConstant.PRODUCT_TIPS_TTSTIMEOUT, EngineConstant.PRODUCT_TIPS_VADTIMEOUT, "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getAsrEmptyWords", "()Ljava/util/List;", "getDmerror", "getDmtimeout", "getExitWords", "getNluEmptyWords", "getOfflineWords", "getTtstimeout", "getVadtimeout", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class TipsConfig {

    @NotNull
    private final List<List<String>> asrEmptyWords;

    @NotNull
    private final List<List<String>> dmerror;

    @NotNull
    private final List<List<String>> dmtimeout;

    @NotNull
    private final List<List<String>> exitWords;

    @NotNull
    private final List<List<String>> nluEmptyWords;

    @NotNull
    private final List<List<String>> offlineWords;

    @NotNull
    private final List<List<String>> ttstimeout;

    @NotNull
    private final List<List<String>> vadtimeout;

    public TipsConfig() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @NotNull
    public final List<List<String>> component1() {
        return this.asrEmptyWords;
    }

    @NotNull
    public final List<List<String>> component2() {
        return this.dmerror;
    }

    @NotNull
    public final List<List<String>> component3() {
        return this.dmtimeout;
    }

    @NotNull
    public final List<List<String>> component4() {
        return this.exitWords;
    }

    @NotNull
    public final List<List<String>> component5() {
        return this.nluEmptyWords;
    }

    @NotNull
    public final List<List<String>> component6() {
        return this.offlineWords;
    }

    @NotNull
    public final List<List<String>> component7() {
        return this.ttstimeout;
    }

    @NotNull
    public final List<List<String>> component8() {
        return this.vadtimeout;
    }

    @NotNull
    public final TipsConfig copy(@NotNull List<? extends List<String>> asrEmptyWords, @NotNull List<? extends List<String>> dmerror, @NotNull List<? extends List<String>> dmtimeout, @NotNull List<? extends List<String>> exitWords, @NotNull List<? extends List<String>> nluEmptyWords, @NotNull List<? extends List<String>> offlineWords, @NotNull List<? extends List<String>> ttstimeout, @NotNull List<? extends List<String>> vadtimeout) {
        Intrinsics.checkNotNullParameter(asrEmptyWords, "asrEmptyWords");
        Intrinsics.checkNotNullParameter(dmerror, "dmerror");
        Intrinsics.checkNotNullParameter(dmtimeout, "dmtimeout");
        Intrinsics.checkNotNullParameter(exitWords, "exitWords");
        Intrinsics.checkNotNullParameter(nluEmptyWords, "nluEmptyWords");
        Intrinsics.checkNotNullParameter(offlineWords, "offlineWords");
        Intrinsics.checkNotNullParameter(ttstimeout, "ttstimeout");
        Intrinsics.checkNotNullParameter(vadtimeout, "vadtimeout");
        return new TipsConfig(asrEmptyWords, dmerror, dmtimeout, exitWords, nluEmptyWords, offlineWords, ttstimeout, vadtimeout);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TipsConfig)) {
            return false;
        }
        TipsConfig tipsConfig = (TipsConfig) other;
        return Intrinsics.areEqual(this.asrEmptyWords, tipsConfig.asrEmptyWords) && Intrinsics.areEqual(this.dmerror, tipsConfig.dmerror) && Intrinsics.areEqual(this.dmtimeout, tipsConfig.dmtimeout) && Intrinsics.areEqual(this.exitWords, tipsConfig.exitWords) && Intrinsics.areEqual(this.nluEmptyWords, tipsConfig.nluEmptyWords) && Intrinsics.areEqual(this.offlineWords, tipsConfig.offlineWords) && Intrinsics.areEqual(this.ttstimeout, tipsConfig.ttstimeout) && Intrinsics.areEqual(this.vadtimeout, tipsConfig.vadtimeout);
    }

    @NotNull
    public final List<List<String>> getAsrEmptyWords() {
        return this.asrEmptyWords;
    }

    @NotNull
    public final List<List<String>> getDmerror() {
        return this.dmerror;
    }

    @NotNull
    public final List<List<String>> getDmtimeout() {
        return this.dmtimeout;
    }

    @NotNull
    public final List<List<String>> getExitWords() {
        return this.exitWords;
    }

    @NotNull
    public final List<List<String>> getNluEmptyWords() {
        return this.nluEmptyWords;
    }

    @NotNull
    public final List<List<String>> getOfflineWords() {
        return this.offlineWords;
    }

    @NotNull
    public final List<List<String>> getTtstimeout() {
        return this.ttstimeout;
    }

    @NotNull
    public final List<List<String>> getVadtimeout() {
        return this.vadtimeout;
    }

    public int hashCode() {
        return (((((((((((((this.asrEmptyWords.hashCode() * 31) + this.dmerror.hashCode()) * 31) + this.dmtimeout.hashCode()) * 31) + this.exitWords.hashCode()) * 31) + this.nluEmptyWords.hashCode()) * 31) + this.offlineWords.hashCode()) * 31) + this.ttstimeout.hashCode()) * 31) + this.vadtimeout.hashCode();
    }

    @NotNull
    public String toString() {
        return "TipsConfig(asrEmptyWords=" + this.asrEmptyWords + ", dmerror=" + this.dmerror + ", dmtimeout=" + this.dmtimeout + ", exitWords=" + this.exitWords + ", nluEmptyWords=" + this.nluEmptyWords + ", offlineWords=" + this.offlineWords + ", ttstimeout=" + this.ttstimeout + ", vadtimeout=" + this.vadtimeout + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TipsConfig(@NotNull List<? extends List<String>> asrEmptyWords, @NotNull List<? extends List<String>> dmerror, @NotNull List<? extends List<String>> dmtimeout, @NotNull List<? extends List<String>> exitWords, @NotNull List<? extends List<String>> nluEmptyWords, @NotNull List<? extends List<String>> offlineWords, @NotNull List<? extends List<String>> ttstimeout, @NotNull List<? extends List<String>> vadtimeout) {
        Intrinsics.checkNotNullParameter(asrEmptyWords, "asrEmptyWords");
        Intrinsics.checkNotNullParameter(dmerror, "dmerror");
        Intrinsics.checkNotNullParameter(dmtimeout, "dmtimeout");
        Intrinsics.checkNotNullParameter(exitWords, "exitWords");
        Intrinsics.checkNotNullParameter(nluEmptyWords, "nluEmptyWords");
        Intrinsics.checkNotNullParameter(offlineWords, "offlineWords");
        Intrinsics.checkNotNullParameter(ttstimeout, "ttstimeout");
        Intrinsics.checkNotNullParameter(vadtimeout, "vadtimeout");
        this.asrEmptyWords = asrEmptyWords;
        this.dmerror = dmerror;
        this.dmtimeout = dmtimeout;
        this.exitWords = exitWords;
        this.nluEmptyWords = nluEmptyWords;
        this.offlineWords = offlineWords;
        this.ttstimeout = ttstimeout;
        this.vadtimeout = vadtimeout;
    }

    public /* synthetic */ TipsConfig(List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3, (i & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list4, (i & 16) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list5, (i & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list6, (i & 64) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list7, (i & 128) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list8);
    }
}
