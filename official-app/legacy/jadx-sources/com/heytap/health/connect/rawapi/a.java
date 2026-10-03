package com.heytap.health.connect.rawapi;

import com.heytap.health.connect.rawapi.call.CallException;
import com.oplus.aiunit.vision.iuf;
import com.oplus.aiunit.vision.sxb;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JC\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH¦@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ>\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH&J6\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH'J8\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/heytap/health/connect/rawapi/a;", "", "", "mac", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "request", "Lcom/oplus/aiunit/vision/iuf;", "rspType", "", "timeOut", "", "retry", "d", "(Ljava/lang/String;Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;Lcom/oplus/aiunit/vision/iuf;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/oplus/aiunit/vision/sxb;", "rspCallback", "", "b", "c", "a", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0})
public interface a {

    /* JADX INFO: renamed from: com.heytap.health.connect.rawapi.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C0325a {
        public static /* synthetic */ void a(a aVar, MessageEvent messageEvent, sxb sxbVar, iuf iufVar, long j2, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendMessageWithCallback");
            }
            if ((i2 & 4) != 0) {
                iufVar = iuf.c.INSTANCE;
            }
            iuf iufVar2 = iufVar;
            if ((i2 & 8) != 0) {
                j2 = 5000;
            }
            long j3 = j2;
            if ((i2 & 16) != 0) {
                i = 0;
            }
            aVar.c(messageEvent, sxbVar, iufVar2, j3, i);
        }

        public static /* synthetic */ Object b(a aVar, String str, MessageEvent messageEvent, iuf iufVar, long j2, int i, Continuation continuation, int i2, Object obj) throws CallException {
            if (obj == null) {
                return aVar.d(str, messageEvent, (i2 & 4) != 0 ? iuf.c.INSTANCE : iufVar, (i2 & 8) != 0 ? 5000L : j2, (i2 & 16) != 0 ? 0 : i, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendMessageWithCoroutine");
        }
    }

    @Nullable
    MessageEvent a(@NotNull String mac, @NotNull MessageEvent request, @NotNull iuf rspType, long timeOut, int retry) throws CallException;

    void b(@NotNull String mac, @NotNull MessageEvent request, @NotNull sxb rspCallback, @NotNull iuf rspType, long timeOut, int retry);

    @Deprecated(message = "please use mac function")
    void c(@NotNull MessageEvent request, @NotNull sxb rspCallback, @NotNull iuf rspType, long timeOut, int retry);

    @Nullable
    Object d(@NotNull String str, @NotNull MessageEvent messageEvent, @NotNull iuf iufVar, long j2, int i, @NotNull Continuation<? super MessageEvent> continuation) throws CallException;
}
