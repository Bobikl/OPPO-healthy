package com.heytap.health.sleep.ai.data;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/heytap/health/sleep/ai/data/QuestionsModuleResponse;", "", "modules", "", "Lcom/heytap/health/sleep/ai/data/Module;", "(Ljava/util/List;)V", "getModules", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sleep_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class QuestionsModuleResponse {
    public static final int $stable = 8;

    @Nullable
    private final List<Module> modules;

    /* JADX WARN: Multi-variable type inference failed */
    public QuestionsModuleResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QuestionsModuleResponse copy$default(QuestionsModuleResponse questionsModuleResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = questionsModuleResponse.modules;
        }
        return questionsModuleResponse.copy(list);
    }

    @Nullable
    public final List<Module> component1() {
        return this.modules;
    }

    @NotNull
    public final QuestionsModuleResponse copy(@Nullable List<Module> modules) {
        return new QuestionsModuleResponse(modules);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof QuestionsModuleResponse) && Intrinsics.areEqual(this.modules, ((QuestionsModuleResponse) other).modules);
    }

    @Nullable
    public final List<Module> getModules() {
        return this.modules;
    }

    public int hashCode() {
        List<Module> list = this.modules;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        return "QuestionsModuleResponse(modules=" + this.modules + ")";
    }

    public QuestionsModuleResponse(@Nullable List<Module> list) {
        this.modules = list;
    }

    public /* synthetic */ QuestionsModuleResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
