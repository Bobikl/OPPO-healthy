package com.heytap.health.community.utils;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.jvm.internal.ContinuationImpl;
import p010kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.heytap.health.community.utils.ImageUploadUtil", f = "ImageUploadUtil.kt", i = {0, 0, 0, 0, 1}, l = {46, 52}, m = "uploadImage", n = {"this", "filePath", "md5", "clientFileId", "preSign"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0"})
public final class ImageUploadUtil$uploadImage$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ImageUploadUtil this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageUploadUtil$uploadImage$1(ImageUploadUtil imageUploadUtil, Continuation<? super ImageUploadUtil$uploadImage$1> continuation) {
        super(continuation);
        this.this$0 = imageUploadUtil;
    }

    @Override // p010kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(null, 0, this);
    }
}
