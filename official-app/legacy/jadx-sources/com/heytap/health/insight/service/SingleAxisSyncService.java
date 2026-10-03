package com.heytap.health.insight.service;

import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.wq8;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.ExceptionsKt__ExceptionsKt;
import p010kotlin.Metadata;
import p010kotlin.coroutines.AbstractCoroutineContextElement;
import p010kotlin.coroutines.CoroutineContext;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0019\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/insight/service/SingleAxisSyncService;", "", "", "date", "Ljava/lang/Runnable;", "callback", "", "c", "", "Lcom/oplus/aiunit/vision/g11;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "a", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "exceptionHandler", "<init>", "()V", "health_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSingleAxisSyncService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleAxisSyncService.kt\ncom/heytap/health/insight/service/SingleAxisSyncService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,162:1\n1855#2:163\n1855#2,2:164\n1856#2:166\n48#3,4:167\n*S KotlinDebug\n*F\n+ 1 SingleAxisSyncService.kt\ncom/heytap/health/insight/service/SingleAxisSyncService\n*L\n136#1:163\n139#1:164,2\n136#1:166\n38#1:167,4\n*E\n"})
public final class SingleAxisSyncService {

    @NotNull
    public static final SingleAxisSyncService INSTANCE = new SingleAxisSyncService();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final CoroutineExceptionHandler exceptionHandler = new a(CoroutineExceptionHandler.INSTANCE);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "handleException", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 SingleAxisSyncService.kt\ncom/heytap/health/insight/service/SingleAxisSyncService\n*L\n1#1,110:1\n39#2,3:111\n*E\n"})
    public static final class a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public a(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(@NotNull CoroutineContext context, @NotNull Throwable exception) {
            a7b.b("SingleAxisSyncService", "syncLocalSingleAxisCards exception: " + exception.getMessage());
            String strStackTraceToString = ExceptionsKt__ExceptionsKt.stackTraceToString(exception);
            StringBuilder sb = new StringBuilder();
            sb.append("syncLocalSingleAxisCards exception: ");
            sb.append(strStackTraceToString);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008f  */
    /* JADX WARN: Code duplicated, block: B:24:0x00ad A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x00bc A[Catch: Exception -> 0x0038, TryCatch #0 {Exception -> 0x0038, blocks: (B:12:0x0033, B:25:0x00ae, B:26:0x00b6, B:22:0x0096, B:28:0x00bc, B:30:0x00c8), top: B:35:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00ab -> B:25:0x00ae). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:38:0x00c8
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(p010kotlin.coroutines.Continuation<? super java.util.List<? extends com.oplus.aiunit.vision.g11>> r11) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.heytap.health.insight.service.SingleAxisSyncService.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void c(int date, @Nullable Runnable callback) {
        a7b.f("SingleAxisSyncService", "syncLocalSingleAxisCards start, date=" + date);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(wq8.INSTANCE.e().plus(exceptionHandler)), null, null, new SingleAxisSyncService$syncLocalSingleAxisCards$1(callback, date, null), 3, null);
    }
}
