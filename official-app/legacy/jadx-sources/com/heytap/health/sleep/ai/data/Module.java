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
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003JC\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/heytap/health/sleep/ai/data/Module;", "", "moduleId", "", "moduleName", "timeType", "moduleDesc", "questionList", "", "Lcom/heytap/health/sleep/ai/data/Question;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getModuleDesc", "()Ljava/lang/String;", "getModuleId", "getModuleName", "getQuestionList", "()Ljava/util/List;", "getTimeType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "sleep_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Module {
    public static final int $stable = 8;

    @NotNull
    private final String moduleDesc;

    @NotNull
    private final String moduleId;

    @NotNull
    private final String moduleName;

    @Nullable
    private final List<Question> questionList;

    @NotNull
    private final String timeType;

    public Module() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Module copy$default(Module module, String str, String str2, String str3, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = module.moduleId;
        }
        if ((i & 2) != 0) {
            str2 = module.moduleName;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = module.timeType;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = module.moduleDesc;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            list = module.questionList;
        }
        return module.copy(str, str5, str6, str7, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getModuleId() {
        return this.moduleId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getModuleName() {
        return this.moduleName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTimeType() {
        return this.timeType;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getModuleDesc() {
        return this.moduleDesc;
    }

    @Nullable
    public final List<Question> component5() {
        return this.questionList;
    }

    @NotNull
    public final Module copy(@NotNull String moduleId, @NotNull String moduleName, @NotNull String timeType, @NotNull String moduleDesc, @Nullable List<Question> questionList) {
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        Intrinsics.checkNotNullParameter(timeType, "timeType");
        Intrinsics.checkNotNullParameter(moduleDesc, "moduleDesc");
        return new Module(moduleId, moduleName, timeType, moduleDesc, questionList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Module)) {
            return false;
        }
        Module module = (Module) other;
        return Intrinsics.areEqual(this.moduleId, module.moduleId) && Intrinsics.areEqual(this.moduleName, module.moduleName) && Intrinsics.areEqual(this.timeType, module.timeType) && Intrinsics.areEqual(this.moduleDesc, module.moduleDesc) && Intrinsics.areEqual(this.questionList, module.questionList);
    }

    @NotNull
    public final String getModuleDesc() {
        return this.moduleDesc;
    }

    @NotNull
    public final String getModuleId() {
        return this.moduleId;
    }

    @NotNull
    public final String getModuleName() {
        return this.moduleName;
    }

    @Nullable
    public final List<Question> getQuestionList() {
        return this.questionList;
    }

    @NotNull
    public final String getTimeType() {
        return this.timeType;
    }

    public int hashCode() {
        int iHashCode = ((((((this.moduleId.hashCode() * 31) + this.moduleName.hashCode()) * 31) + this.timeType.hashCode()) * 31) + this.moduleDesc.hashCode()) * 31;
        List<Question> list = this.questionList;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        return "Module(moduleId=" + this.moduleId + ", moduleName=" + this.moduleName + ", timeType=" + this.timeType + ", moduleDesc=" + this.moduleDesc + ", questionList=" + this.questionList + ")";
    }

    public Module(@NotNull String moduleId, @NotNull String moduleName, @NotNull String timeType, @NotNull String moduleDesc, @Nullable List<Question> list) {
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        Intrinsics.checkNotNullParameter(timeType, "timeType");
        Intrinsics.checkNotNullParameter(moduleDesc, "moduleDesc");
        this.moduleId = moduleId;
        this.moduleName = moduleName;
        this.timeType = timeType;
        this.moduleDesc = moduleDesc;
        this.questionList = list;
    }

    public /* synthetic */ Module(String str, String str2, String str3, String str4, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : list);
    }
}
