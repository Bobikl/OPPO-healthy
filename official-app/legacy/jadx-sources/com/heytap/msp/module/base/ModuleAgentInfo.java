package com.heytap.msp.module.base;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B)\b\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n¢\u0006\u0002\u0010\u000bJ\u0011\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0000H\u0096\u0002J\u0010\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\nJ\u0016\u0010\u001b\u001a\u00020\u001c2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/heytap/msp/module/base/ModuleAgentInfo;", "", "agentName", "", "className", "serviceClassName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "level", "", "dependent", "", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAgentName", "()Ljava/lang/String;", "setAgentName", "(Ljava/lang/String;)V", "getClassName", "setClassName", "getLevel", "()I", "setLevel", "(I)V", "getServiceClassName", "setServiceClassName", "compareTo", "o", "getDependent", "setDependent", "", "annotation-proxy"}, k = 1, mv = {1, 4, 2})
public final class ModuleAgentInfo implements Comparable<ModuleAgentInfo> {

    @Nullable
    private String agentName;

    @Nullable
    private String className;
    private List<String> dependent;
    private int level;

    @Nullable
    private String serviceClassName;

    @JvmOverloads
    public ModuleAgentInfo(@Nullable String str) {
        this(str, (String) null, (String) null, 6, (DefaultConstructorMarker) null);
    }

    @Nullable
    public final String getAgentName() {
        return this.agentName;
    }

    @Nullable
    public final String getClassName() {
        return this.className;
    }

    @Nullable
    public final List<String> getDependent() {
        return this.dependent;
    }

    public final int getLevel() {
        return this.level;
    }

    @Nullable
    public final String getServiceClassName() {
        return this.serviceClassName;
    }

    public final void setAgentName(@Nullable String str) {
        this.agentName = str;
    }

    public final void setClassName(@Nullable String str) {
        this.className = str;
    }

    public final void setDependent(@NotNull List<String> dependent) {
        Intrinsics.checkNotNullParameter(dependent, "dependent");
        this.dependent = dependent;
    }

    public final void setLevel(int i) {
        this.level = i;
    }

    public final void setServiceClassName(@Nullable String str) {
        this.serviceClassName = str;
    }

    @JvmOverloads
    public ModuleAgentInfo(@Nullable String str, @Nullable String str2) {
        this(str, str2, (String) null, 4, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0034  */
    /* JADX WARN: Code duplicated, block: B:15:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0041 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Comparable
    public int compareTo(@NotNull ModuleAgentInfo o) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(o, "o");
        if (o.getDependent() != null) {
            List<String> dependent = o.getDependent();
            Intrinsics.checkNotNull(dependent);
            if (dependent.contains(this.agentName)) {
                return -1;
            }
        }
        if (getDependent() != null) {
            List<String> dependent2 = getDependent();
            Intrinsics.checkNotNull(dependent2);
            if (!dependent2.contains(o.agentName)) {
                i = this.level;
                i2 = o.level;
                if (i - i2 > 0) {
                    return -1;
                }
                if (i - i2 >= 0) {
                    return 0;
                }
            }
        } else {
            i = this.level;
            i2 = o.level;
            if (i - i2 > 0) {
                return -1;
            }
            if (i - i2 >= 0) {
                return 0;
            }
        }
        return 1;
    }

    public ModuleAgentInfo(@Nullable String str, int i, @Nullable String str2, @Nullable String str3, @NotNull List<String> dependent) {
        Intrinsics.checkNotNullParameter(dependent, "dependent");
        this.agentName = str;
        this.level = i;
        this.className = str2;
        this.serviceClassName = str3;
        this.dependent = dependent;
    }

    public /* synthetic */ ModuleAgentInfo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    @JvmOverloads
    public ModuleAgentInfo(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this(str, 10, str2, str3, new ArrayList());
    }
}
