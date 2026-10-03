package com.oplus.pay.opensdk.msp.pay;

import androidx.annotation.Keep;
import com.client.platform.opensdk.pay.Constants;
import com.heytap.wallet.business.bus.bean.BusConsume;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/oplus/pay/opensdk/msp/pay/PayConstant;", "", "()V", "MethodName", "ModuleInfo", "paysdk_msp_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PayConstant {

    @Keep
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/oplus/pay/opensdk/msp/pay/PayConstant$MethodName;", "", "()V", "CHANNEL", "", "DIRECTLY", "KEKE", "OFFLINE", "PAY", "PAY_PRE_ORDER", BusConsume.KEY_TRANSTYPE_RECHARGE, "RENEW", "paysdk_msp_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class MethodName {

        @NotNull
        public static final String CHANNEL = "Channel";

        @NotNull
        public static final String DIRECTLY = "Directly";

        @NotNull
        public static final MethodName INSTANCE = new MethodName();

        @NotNull
        public static final String KEKE = "KeKe";

        @NotNull
        public static final String OFFLINE = "OffLine";

        @NotNull
        public static final String PAY = "pay";

        @NotNull
        public static final String PAY_PRE_ORDER = "payPreOrder";

        @NotNull
        public static final String RECHARGE = "Recharge";

        @NotNull
        public static final String RENEW = "Renew";

        private MethodName() {
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/oplus/pay/opensdk/msp/pay/PayConstant$ModuleInfo;", "", "()V", "APP_MIN_CODE", "", "APP_MIN_VERSION", "", "BIZ_NO", "F_PAY_PKG_NAME", "MODULE_MIN_CODE", "MODULE_MIN_VERSION", "N_PAY_PKG_NAME", "O_PAY_PKG_NAME", "paysdk_msp_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ModuleInfo {
        public static final int APP_MIN_CODE = 1050000;

        @NotNull
        public static final String APP_MIN_VERSION = "1.5.0";

        @NotNull
        public static final String BIZ_NO = "1000003";

        @JvmField
        @NotNull
        public static final String F_PAY_PKG_NAME;

        @NotNull
        public static final ModuleInfo INSTANCE = new ModuleInfo();
        public static final int MODULE_MIN_CODE = 1;

        @NotNull
        public static final String MODULE_MIN_VERSION = "1.0.1";

        @JvmField
        @NotNull
        public static final String N_PAY_PKG_NAME;

        @JvmField
        @NotNull
        public static final String O_PAY_PKG_NAME;

        static {
            String N_PAY_PKG_NAME2 = Constants.N_PAY_PKG_NAME;
            Intrinsics.checkNotNullExpressionValue(N_PAY_PKG_NAME2, "N_PAY_PKG_NAME");
            N_PAY_PKG_NAME = N_PAY_PKG_NAME2;
            String F_PAY_PKG_NAME2 = Constants.F_PAY_PKG_NAME;
            Intrinsics.checkNotNullExpressionValue(F_PAY_PKG_NAME2, "F_PAY_PKG_NAME");
            F_PAY_PKG_NAME = F_PAY_PKG_NAME2;
            String O_PAY_PKG_NAME2 = Constants.O_PAY_PKG_NAME;
            Intrinsics.checkNotNullExpressionValue(O_PAY_PKG_NAME2, "O_PAY_PKG_NAME");
            O_PAY_PKG_NAME = O_PAY_PKG_NAME2;
        }

        private ModuleInfo() {
        }
    }
}
