package com.heytap.health.health_archives.autosync;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.health_archives.autosync.ArchiveUploadHelper", f = "ArchiveUploadHelper.kt", i = {0, 1, 1, 1}, l = {309, 312}, m = "findDuplicateFilesFromDB", n = {"repository", "repository", "destination$iv$iv", "element$iv$iv"}, s = {"L$0", "L$0", "L$1", "L$3"})
public final class ArchiveUploadHelper$findDuplicateFilesFromDB$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    public ArchiveUploadHelper$findDuplicateFilesFromDB$1(Continuation<? super ArchiveUploadHelper$findDuplicateFilesFromDB$1> continuation) {
        super(continuation);
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ArchiveUploadHelper.b(null, this);
    }
}
