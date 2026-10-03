package com.oplus.pantaconnect.sdk.ext;

import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmName;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0086\b¢\u0006\u0002\u0010\u0004\u001a=\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0003\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0014\b\u0004\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00060\bH\u0086\b¨\u0006\t"}, d2 = {"asResult", "Lkotlin/Result;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/util/concurrent/CompletableFuture;", "(Ljava/util/concurrent/CompletableFuture;)Ljava/lang/Object;", "map", ExifInterface.LONGITUDE_WEST, "mapper", "Lkotlin/Function1;", "core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@JvmName(name = "CompletableFutureExt")
public final class CompletableFutureExt {

    /* JADX INFO: renamed from: com.oplus.pantaconnect.sdk.ext.CompletableFutureExt$map$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0003\u0018\u0001\"\u0004\b\u0001\u0010\u00042\u000e\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", ExifInterface.GPS_DIRECTION_TRUE, ExifInterface.LONGITUDE_WEST, "it", "", "apply"}, k = 3, mv = {1, 9, 0}, xi = 176)
    @SourceDebugExtension({"SMAP\nCompletableFutureExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompletableFutureExt.kt\ncom/oplus/pantaconnect/sdk/ext/CompletableFutureExt$map$2\n*L\n1#1,49:1\n*E\n"})
    public static final class AnonymousClass2<T, R> implements Function {
        final /* synthetic */ CompletableFuture<W> $completableFuture;

        public AnonymousClass2(CompletableFuture<W> completableFuture) {
            this.$completableFuture = completableFuture;
        }

        @Override // java.util.function.Function
        public final Void apply(Throwable th) {
            this.$completableFuture.completeExceptionally(th);
            return null;
        }
    }

    public static final /* synthetic */ <T> Object asResult(CompletableFuture<T> completableFuture) {
        try {
            Result.Companion companion = Result.INSTANCE;
            return Result.m5287constructorimpl(completableFuture.get());
        } catch (Exception e2) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m5287constructorimpl(ResultKt.createFailure(e2));
        }
    }

    public static final /* synthetic */ <T, W> CompletableFuture<W> map(CompletableFuture<T> completableFuture, final Function1<? super T, ? extends W> function1) {
        final CompletableFuture<W> completableFuture2 = new CompletableFuture<>();
        Intrinsics.needClassReification();
        completableFuture.thenAcceptAsync((Consumer) new CompletableFutureExt$sam$i$java_util_function_Consumer$0(new Function1<T, Unit>() { // from class: com.oplus.pantaconnect.sdk.ext.CompletableFutureExt.map.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(T t) {
                completableFuture2.complete((W) function1.invoke(t));
            }
        })).exceptionally((Function<Throwable, ? extends Void>) new AnonymousClass2(completableFuture2));
        return completableFuture2;
    }
}
