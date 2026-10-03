package com.heytap.store.pay;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H&¨\u0006\n"}, d2 = {"Lcom/heytap/store/pay/PayCallBack;", "", "callBack", "", "status", "", "map", "", "", "Companion", "pay-service_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface PayCallBack {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/heytap/store/pay/PayCallBack$Companion;", "", "()V", "PAY_CANCEL", "", "getPAY_CANCEL", "()I", "PAY_FIAL", "getPAY_FIAL", "PAY_SUCCESS", "getPAY_SUCCESS", "pay-service_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private static final int PAY_FIAL = 0;
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int PAY_SUCCESS = 1;
        private static final int PAY_CANCEL = -1;

        private Companion() {
        }

        public final int getPAY_CANCEL() {
            return PAY_CANCEL;
        }

        public final int getPAY_FIAL() {
            return PAY_FIAL;
        }

        public final int getPAY_SUCCESS() {
            return PAY_SUCCESS;
        }
    }

    void callBack(int status, @NotNull Map<String, String> map);
}
