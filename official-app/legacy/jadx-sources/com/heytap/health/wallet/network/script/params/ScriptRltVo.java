package com.heytap.health.wallet.network.script.params;

import androidx.annotation.Keep;
import com.heytap.health.wallet.network.script.rsp.CommandObject;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J%\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/wallet/network/script/params/ScriptRltVo;", "", "succeed", "", "(Z)V", "results", "", "Lcom/heytap/health/wallet/network/script/rsp/CommandObject;", "(ZLjava/util/List;)V", "getResults", "()Ljava/util/List;", "setResults", "(Ljava/util/List;)V", "getSucceed", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ScriptRltVo {

    @Nullable
    private List<CommandObject> results;
    private final boolean succeed;

    public ScriptRltVo(boolean z, @Nullable List<CommandObject> list) {
        this.succeed = z;
        this.results = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ScriptRltVo copy$default(ScriptRltVo scriptRltVo, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = scriptRltVo.succeed;
        }
        if ((i & 2) != 0) {
            list = scriptRltVo.results;
        }
        return scriptRltVo.copy(z, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSucceed() {
        return this.succeed;
    }

    @Nullable
    public final List<CommandObject> component2() {
        return this.results;
    }

    @NotNull
    public final ScriptRltVo copy(boolean succeed, @Nullable List<CommandObject> results) {
        return new ScriptRltVo(succeed, results);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScriptRltVo)) {
            return false;
        }
        ScriptRltVo scriptRltVo = (ScriptRltVo) other;
        return this.succeed == scriptRltVo.succeed && Intrinsics.areEqual(this.results, scriptRltVo.results);
    }

    @Nullable
    public final List<CommandObject> getResults() {
        return this.results;
    }

    public final boolean getSucceed() {
        return this.succeed;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.succeed;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        List<CommandObject> list = this.results;
        return i + (list == null ? 0 : list.hashCode());
    }

    public final void setResults(@Nullable List<CommandObject> list) {
        this.results = list;
    }

    @NotNull
    public String toString() {
        return "ScriptRltVo(succeed=" + this.succeed + ", results=" + this.results + ")";
    }

    public /* synthetic */ ScriptRltVo(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, list);
    }

    public ScriptRltVo(boolean z) {
        this(z, null);
    }
}
