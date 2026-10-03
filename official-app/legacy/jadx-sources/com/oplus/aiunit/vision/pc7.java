package com.oplus.aiunit.vision;

import com.heytap.log.consts.LogSenderConst;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\"\u0010\u0014\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0004\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/pc7;", "", "", "toString", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "setTaskId", "(Ljava/lang/String;)V", "taskId", "getFileName", "setFileName", LogSenderConst.FILENAME, "", "c", "I", "()I", "setProcess", "(I)V", "process", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
public class pc7 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public String taskId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public String fileName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public int process;

    public pc7(@NotNull String taskId, @Nullable String str, int i) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        this.taskId = taskId;
        this.fileName = str;
        this.process = i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getProcess() {
        return this.process;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getTaskId() {
        return this.taskId;
    }

    @NotNull
    public String toString() {
        return "FileTaskProcess{taskId='" + this.taskId + "', process=" + this.process + ", fileName='" + this.fileName + "'}";
    }
}
