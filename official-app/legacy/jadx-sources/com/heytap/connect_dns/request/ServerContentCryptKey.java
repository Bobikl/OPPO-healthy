package com.heytap.connect_dns.request;

import com.heytap.connect.Env;
import com.heytap.store.base.core.http.HttpConst;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006R\u001c\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000bR\u001c\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000bR\u001c\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0012\u0010\t\u001a\u0004\b\u0013\u0010\u000bR\u001c\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0015\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/heytap/connect_dns/request/ServerContentCryptKey;", "", "Lcom/heytap/connect/Env;", HttpConst.SERVER_ENV, "", "serverSignatureKey", "(Lcom/heytap/connect/Env;)Ljava/lang/String;", "serverAESKey", "AES_KEY_TEST", "Ljava/lang/String;", "getAES_KEY_TEST", "()Ljava/lang/String;", "PUBLIC_KEY_DEV", "getPUBLIC_KEY_DEV", "PUBLIC_KEY_RLS", "getPUBLIC_KEY_RLS", "PUBLIC_KEY_TEST", "getPUBLIC_KEY_TEST", "AES_KEY_RLS", "getAES_KEY_RLS", "AES_KEY_DEV", "getAES_KEY_DEV", "<init>", "()V", "connect_release"}, k = 1, mv = {1, 5, 1})
public final class ServerContentCryptKey {

    @NotNull
    public static final ServerContentCryptKey INSTANCE = new ServerContentCryptKey();

    @NotNull
    private static final String AES_KEY_TEST = "17a166ffd052d05763d5fc09cc4efa37";

    @NotNull
    private static final String AES_KEY_DEV = "17a166ffd052d05763d5fc09cc4efa37";

    @NotNull
    private static final String AES_KEY_RLS = "f52da7d553b49fd1bd7903918af8ae29";

    @NotNull
    private static final String PUBLIC_KEY_TEST = "3059301306072a8648ce3d020106082a8648ce3d03010703420004a84ae448643d44d0954ede2b457efc1a051a96c59156b99f962b775e74fc195f18b523ddd39376e057cd623d7e1ca70c13160d75e8602f6043b2dae6eca25c2e";

    @NotNull
    private static final String PUBLIC_KEY_DEV = "3059301306072a8648ce3d020106082a8648ce3d03010703420004a84ae448643d44d0954ede2b457efc1a051a96c59156b99f962b775e74fc195f18b523ddd39376e057cd623d7e1ca70c13160d75e8602f6043b2dae6eca25c2e";

    @NotNull
    private static final String PUBLIC_KEY_RLS = "3059301306072a8648ce3d020106082a8648ce3d030107034200043d5a5fb0fea339b515ac2b91a351edde77cc26b952d29a13d2f731397dcc6f8c96414d195df40901a42c0bfd2afe50b51b68133bc5262784eda909f599ec4426";

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            Env.valuesCustom();
            int[] iArr = new int[3];
            iArr[Env.TEST.ordinal()] = 1;
            iArr[Env.DEV.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private ServerContentCryptKey() {
    }

    @NotNull
    public final String getAES_KEY_DEV() {
        return AES_KEY_DEV;
    }

    @NotNull
    public final String getAES_KEY_RLS() {
        return AES_KEY_RLS;
    }

    @NotNull
    public final String getAES_KEY_TEST() {
        return AES_KEY_TEST;
    }

    @NotNull
    public final String getPUBLIC_KEY_DEV() {
        return PUBLIC_KEY_DEV;
    }

    @NotNull
    public final String getPUBLIC_KEY_RLS() {
        return PUBLIC_KEY_RLS;
    }

    @NotNull
    public final String getPUBLIC_KEY_TEST() {
        return PUBLIC_KEY_TEST;
    }

    @NotNull
    public final String serverAESKey(@NotNull Env env) {
        Intrinsics.checkNotNullParameter(env, "env");
        int iOrdinal = env.ordinal();
        if (iOrdinal != 1) {
            return iOrdinal != 2 ? AES_KEY_RLS : AES_KEY_DEV;
        }
        return AES_KEY_TEST;
    }

    @NotNull
    public final String serverSignatureKey(@NotNull Env env) {
        Intrinsics.checkNotNullParameter(env, "env");
        int iOrdinal = env.ordinal();
        if (iOrdinal != 1) {
            return iOrdinal != 2 ? PUBLIC_KEY_RLS : PUBLIC_KEY_DEV;
        }
        return PUBLIC_KEY_TEST;
    }
}
