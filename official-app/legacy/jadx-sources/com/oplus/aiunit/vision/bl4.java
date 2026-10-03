package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.client.call.DMCallException;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JK\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH¦@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJC\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011JF\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH&J>\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH'J@\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/bl4;", "", "Lcom/oplus/aiunit/vision/ra5;", "role", "", "mac", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "request", "Lcom/oplus/aiunit/vision/ko4;", "rspType", "", "timeOut", "", "retry", "b", "(Lcom/oplus/aiunit/vision/ra5;Ljava/lang/String;Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;Lcom/oplus/aiunit/vision/ko4;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", b2n.f, "(Lcom/oplus/aiunit/vision/ra5;Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;Lcom/oplus/aiunit/vision/ko4;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/oplus/aiunit/vision/sl4;", "rspCallback", "", "f", b2n.g, "c", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public interface bl4 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(bl4 bl4Var, ra5 ra5Var, String str, MessageEvent messageEvent, sl4 sl4Var, ko4 ko4Var, long j2, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendMessageWithCallback");
            }
            bl4Var.f(ra5Var, str, messageEvent, sl4Var, (i2 & 16) != 0 ? ko4.c.INSTANCE : ko4Var, (i2 & 32) != 0 ? 5000L : j2, (i2 & 64) != 0 ? 0 : i);
        }

        public static /* synthetic */ Object b(bl4 bl4Var, ra5 ra5Var, String str, MessageEvent messageEvent, ko4 ko4Var, long j2, int i, Continuation continuation, int i2, Object obj) throws DMCallException {
            if (obj == null) {
                return bl4Var.b(ra5Var, str, messageEvent, (i2 & 8) != 0 ? ko4.c.INSTANCE : ko4Var, (i2 & 16) != 0 ? 5000L : j2, (i2 & 32) != 0 ? 0 : i, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendMessageWithCoroutine");
        }

        public static /* synthetic */ MessageEvent c(bl4 bl4Var, ra5 ra5Var, String str, MessageEvent messageEvent, ko4 ko4Var, long j2, int i, int i2, Object obj) throws DMCallException {
            if (obj == null) {
                return bl4Var.c(ra5Var, str, messageEvent, (i2 & 8) != 0 ? ko4.c.INSTANCE : ko4Var, (i2 & 16) != 0 ? 5000L : j2, (i2 & 32) != 0 ? 0 : i);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendMessageWithThreadBlock");
        }
    }

    @Nullable
    Object b(@NotNull ra5 ra5Var, @NotNull String str, @NotNull MessageEvent messageEvent, @NotNull ko4 ko4Var, long j2, int i, @NotNull Continuation<? super MessageEvent> continuation) throws DMCallException;

    @Nullable
    MessageEvent c(@NotNull ra5 role, @NotNull String mac, @NotNull MessageEvent request, @NotNull ko4 rspType, long timeOut, int retry) throws DMCallException;

    void f(@NotNull ra5 role, @NotNull String mac, @NotNull MessageEvent request, @NotNull sl4 rspCallback, @NotNull ko4 rspType, long timeOut, int retry);

    @Deprecated(message = "please use mac function")
    @Nullable
    Object g(@NotNull ra5 ra5Var, @NotNull MessageEvent messageEvent, @NotNull ko4 ko4Var, long j2, int i, @NotNull Continuation<? super MessageEvent> continuation) throws DMCallException;

    @Deprecated(message = "please use mac function")
    void h(@NotNull ra5 role, @NotNull MessageEvent request, @NotNull sl4 rspCallback, @NotNull ko4 rspType, long timeOut, int retry);
}
