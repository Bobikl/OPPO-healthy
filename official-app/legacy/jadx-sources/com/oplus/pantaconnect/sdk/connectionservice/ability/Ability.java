package com.oplus.pantaconnect.sdk.connectionservice.ability;

import android.os.Bundle;
import com.oplus.pantaconnect.sdk.connectionservice.connection.DisplayDevice;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\bH&J$\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH&¨\u0006\u0010"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connectionservice/ability/Ability;", "", "checkLocalAbility", "Ljava/util/concurrent/CompletableFuture;", "", "ability", "", "packageName", "", "getAppIdByPackageName", "getCachedDevicesByAbility", "", "Lcom/oplus/pantaconnect/sdk/connectionservice/connection/DisplayDevice;", "extraData", "Landroid/os/Bundle;", "Companion", "connectionservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface Ability {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int DEFAULT_APP_ID = -1;

    @NotNull
    public static final String EXTRA_INFO_KEY_SCAN_TYPE = "key_scan_type";

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/oplus/pantaconnect/sdk/connectionservice/ability/Ability$Companion;", "", "()V", "DEFAULT_APP_ID", "", "EXTRA_INFO_KEY_SCAN_TYPE", "", "create", "Lcom/oplus/pantaconnect/sdk/connectionservice/ability/Ability;", "connectionservice_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int DEFAULT_APP_ID = -1;

        @NotNull
        public static final String EXTRA_INFO_KEY_SCAN_TYPE = "key_scan_type";

        private Companion() {
        }

        @JvmStatic
        @NotNull
        public final Ability create() {
            return new AbilityImpl(null, 1, null);
        }
    }

    @JvmStatic
    @NotNull
    static Ability create() {
        return INSTANCE.create();
    }

    @NotNull
    CompletableFuture<Boolean> checkLocalAbility(int ability, @NotNull String packageName);

    @NotNull
    CompletableFuture<Integer> getAppIdByPackageName(@NotNull String packageName);

    @NotNull
    CompletableFuture<List<DisplayDevice>> getCachedDevicesByAbility(int ability, @NotNull Bundle extraData);
}
