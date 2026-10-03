package com.heytap.health.health_archives.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006 "}, d2 = {"Lcom/heytap/health/health_archives/bean/AIAgentBean;", "", "analysis", "", "analysisTimestamp", "", "questions", "actionText", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "getActionText", "()Ljava/lang/String;", "setActionText", "(Ljava/lang/String;)V", "getAnalysis", "setAnalysis", "getAnalysisTimestamp", "()J", "setAnalysisTimestamp", "(J)V", "getQuestions", "setQuestions", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "health_archives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AIAgentBean {

    @Nullable
    private String actionText;

    @Nullable
    private String analysis;
    private long analysisTimestamp;

    @Nullable
    private String questions;

    public AIAgentBean() {
        this(null, 0L, null, null, 15, null);
    }

    public static /* synthetic */ AIAgentBean copy$default(AIAgentBean aIAgentBean, String str, long j2, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aIAgentBean.analysis;
        }
        if ((i & 2) != 0) {
            j2 = aIAgentBean.analysisTimestamp;
        }
        long j3 = j2;
        if ((i & 4) != 0) {
            str2 = aIAgentBean.questions;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            str3 = aIAgentBean.actionText;
        }
        return aIAgentBean.copy(str, j3, str4, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAnalysis() {
        return this.analysis;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getAnalysisTimestamp() {
        return this.analysisTimestamp;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getQuestions() {
        return this.questions;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getActionText() {
        return this.actionText;
    }

    @NotNull
    public final AIAgentBean copy(@Nullable String analysis, long analysisTimestamp, @Nullable String questions, @Nullable String actionText) {
        return new AIAgentBean(analysis, analysisTimestamp, questions, actionText);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AIAgentBean)) {
            return false;
        }
        AIAgentBean aIAgentBean = (AIAgentBean) other;
        return Intrinsics.areEqual(this.analysis, aIAgentBean.analysis) && this.analysisTimestamp == aIAgentBean.analysisTimestamp && Intrinsics.areEqual(this.questions, aIAgentBean.questions) && Intrinsics.areEqual(this.actionText, aIAgentBean.actionText);
    }

    @Nullable
    public final String getActionText() {
        return this.actionText;
    }

    @Nullable
    public final String getAnalysis() {
        return this.analysis;
    }

    public final long getAnalysisTimestamp() {
        return this.analysisTimestamp;
    }

    @Nullable
    public final String getQuestions() {
        return this.questions;
    }

    public int hashCode() {
        String str = this.analysis;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Long.hashCode(this.analysisTimestamp)) * 31;
        String str2 = this.questions;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.actionText;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setActionText(@Nullable String str) {
        this.actionText = str;
    }

    public final void setAnalysis(@Nullable String str) {
        this.analysis = str;
    }

    public final void setAnalysisTimestamp(long j2) {
        this.analysisTimestamp = j2;
    }

    public final void setQuestions(@Nullable String str) {
        this.questions = str;
    }

    @NotNull
    public String toString() {
        return "AIAgentBean(analysis=" + this.analysis + ", analysisTimestamp=" + this.analysisTimestamp + ", questions=" + this.questions + ", actionText=" + this.actionText + ")";
    }

    public AIAgentBean(@Nullable String str, long j2, @Nullable String str2, @Nullable String str3) {
        this.analysis = str;
        this.analysisTimestamp = j2;
        this.questions = str2;
        this.actionText = str3;
    }

    public /* synthetic */ AIAgentBean(String str, long j2, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
