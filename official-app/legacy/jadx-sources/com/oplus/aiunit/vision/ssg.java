package com.oplus.aiunit.vision;

import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B-\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\tR\"\u0010\u0019\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0004\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/oplus/aiunit/vision/ssg;", "", "", "toString", "a", "Ljava/lang/String;", "getUri", "()Ljava/lang/String;", "setUri", "(Ljava/lang/String;)V", ParserTag.TAG_URI, "b", "getSendFilePath", "setSendFilePath", "sendFilePath", "c", "getTaskId", "setTaskId", "taskId", "Lcom/oplus/aiunit/vision/nc7;", "d", "Lcom/oplus/aiunit/vision/nc7;", "()Lcom/oplus/aiunit/vision/nc7;", "setFileTaskListener", "(Lcom/oplus/aiunit/vision/nc7;)V", "fileTaskListener", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/oplus/aiunit/vision/nc7;)V", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
public final class ssg {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public String uri;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public String sendFilePath;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public String taskId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public nc7 observer;

    public ssg(@Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull nc7 fileTaskListener) {
        Intrinsics.checkNotNullParameter(fileTaskListener, "fileTaskListener");
        this.uri = str;
        this.sendFilePath = str2;
        this.taskId = str3;
        this.observer = fileTaskListener;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final nc7 getObserver() {
        return this.observer;
    }

    @NotNull
    public String toString() {
        return "SendInfoRecord{uri='" + this.uri + "', sendFilePath='" + this.sendFilePath + "', taskId='" + this.taskId + "', observer=" + this.observer + "}";
    }
}
