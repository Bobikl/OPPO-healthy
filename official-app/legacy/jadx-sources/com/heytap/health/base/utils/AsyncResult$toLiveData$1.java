package com.heytap.health.base.utils;

import androidx.exifinterface.media.ExifInterface;
import com.oplus.aiunit.vision.bvf;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "Lkotlin/Result;", "invoke", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class AsyncResult$toLiveData$1 extends Lambda implements Function1<Result<Object>, Unit> {
    final /* synthetic */ AsyncResult<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncResult$toLiveData$1(AsyncResult<Object> asyncResult) {
        super(1);
        this.this$0 = asyncResult;
    }

    @Override // p010kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Result<Object> result) {
        m4616invoke(result.getValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m4616invoke(@NotNull Object obj) {
        this.this$0.f().postValue(new bvf(obj));
    }
}
