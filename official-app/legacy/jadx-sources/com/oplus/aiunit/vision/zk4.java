package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.client.call.DMCallException;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JC\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH¦@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ;\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH§@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ>\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH&J6\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH'J8\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/zk4;", "", "", "mac", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "request", "Lcom/oplus/aiunit/vision/ko4;", "rspType", "", "timeOut", "", "retry", "j", "(Ljava/lang/String;Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;Lcom/oplus/aiunit/vision/ko4;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "d", "(Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;Lcom/oplus/aiunit/vision/ko4;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/oplus/aiunit/vision/sl4;", "rspCallback", "", MapSchema.FIELD_NAME_ENTRY, "i", "a", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public interface zk4 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(zk4 zk4Var, MessageEvent messageEvent, sl4 sl4Var, ko4 ko4Var, long j2, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendMessageWithCallback");
            }
            if ((i2 & 4) != 0) {
                ko4Var = ko4.c.INSTANCE;
            }
            ko4 ko4Var2 = ko4Var;
            if ((i2 & 8) != 0) {
                j2 = 5000;
            }
            long j3 = j2;
            if ((i2 & 16) != 0) {
                i = 0;
            }
            zk4Var.i(messageEvent, sl4Var, ko4Var2, j3, i);
        }

        public static /* synthetic */ void b(zk4 zk4Var, String str, MessageEvent messageEvent, sl4 sl4Var, ko4 ko4Var, long j2, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendMessageWithCallback");
            }
            zk4Var.e(str, messageEvent, sl4Var, (i2 & 8) != 0 ? ko4.c.INSTANCE : ko4Var, (i2 & 16) != 0 ? 5000L : j2, (i2 & 32) != 0 ? 0 : i);
        }

        public static /* synthetic */ Object c(zk4 zk4Var, MessageEvent messageEvent, ko4 ko4Var, long j2, int i, Continuation continuation, int i2, Object obj) throws DMCallException {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendMessageWithCoroutine");
            }
            if ((i2 & 2) != 0) {
                ko4Var = ko4.c.INSTANCE;
            }
            ko4 ko4Var2 = ko4Var;
            if ((i2 & 4) != 0) {
                j2 = 5000;
            }
            long j3 = j2;
            if ((i2 & 8) != 0) {
                i = 0;
            }
            return zk4Var.d(messageEvent, ko4Var2, j3, i, continuation);
        }

        public static /* synthetic */ Object d(zk4 zk4Var, String str, MessageEvent messageEvent, ko4 ko4Var, long j2, int i, Continuation continuation, int i2, Object obj) throws DMCallException {
            if (obj == null) {
                return zk4Var.j(str, messageEvent, (i2 & 4) != 0 ? ko4.c.INSTANCE : ko4Var, (i2 & 8) != 0 ? 5000L : j2, (i2 & 16) != 0 ? 0 : i, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendMessageWithCoroutine");
        }

        public static /* synthetic */ MessageEvent e(zk4 zk4Var, String str, MessageEvent messageEvent, ko4 ko4Var, long j2, int i, int i2, Object obj) throws DMCallException {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendMessageWithThreadBlock");
            }
            if ((i2 & 4) != 0) {
                ko4Var = ko4.c.INSTANCE;
            }
            ko4 ko4Var2 = ko4Var;
            if ((i2 & 8) != 0) {
                j2 = 5000;
            }
            long j3 = j2;
            if ((i2 & 16) != 0) {
                i = 0;
            }
            return zk4Var.a(str, messageEvent, ko4Var2, j3, i);
        }
    }

    @Nullable
    MessageEvent a(@NotNull String mac, @NotNull MessageEvent request, @NotNull ko4 rspType, long timeOut, int retry) throws DMCallException;

    @Deprecated(message = "please use mac function")
    @Nullable
    Object d(@NotNull MessageEvent messageEvent, @NotNull ko4 ko4Var, long j2, int i, @NotNull Continuation<? super MessageEvent> continuation) throws DMCallException;

    void e(@NotNull String mac, @NotNull MessageEvent request, @NotNull sl4 rspCallback, @NotNull ko4 rspType, long timeOut, int retry);

    @Deprecated(message = "please use mac function")
    void i(@NotNull MessageEvent request, @NotNull sl4 rspCallback, @NotNull ko4 rspType, long timeOut, int retry);

    @Nullable
    Object j(@NotNull String str, @NotNull MessageEvent messageEvent, @NotNull ko4 ko4Var, long j2, int i, @NotNull Continuation<? super MessageEvent> continuation) throws DMCallException;
}
