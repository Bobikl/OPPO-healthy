package com.oplus.aiunit.vision;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.dm3, reason: from toString */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\t\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/dm3;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "b", "()I", "cmd", "", "J", "c", "()J", "version", "", "Ljava/util/List;", "()Ljava/util/List;", "args", "<init>", "(IJLjava/util/List;)V", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
public final /* data */ class CommandInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final int cmd;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final long version;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final List<String> args;

    public CommandInfo(int i, long j2, @Nullable List<String> list) {
        this.cmd = i;
        this.version = j2;
        this.args = list;
    }

    @Nullable
    public final List<String> a() {
        return this.args;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCmd() {
        return this.cmd;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getVersion() {
        return this.version;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommandInfo)) {
            return false;
        }
        CommandInfo commandInfo = (CommandInfo) other;
        return this.cmd == commandInfo.cmd && this.version == commandInfo.version && Intrinsics.areEqual(this.args, commandInfo.args);
    }

    public int hashCode() {
        int i = this.cmd * 31;
        long j2 = this.version;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        List<String> list = this.args;
        return i2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CommandInfo(cmd=" + this.cmd + ", version=" + this.version + ", args=" + this.args + ")";
    }
}
