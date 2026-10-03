package com.oplus.aiunit.vision;

import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\r\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000bJ\u0010\u0010\u000e\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0010\u001a\u00020\u0004R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R(\u0010\u0018\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\u001d\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/oplus/aiunit/vision/y54;", "", "", "macAddress", "", LogFieldKey.LEVEL_KEY, "", b2n.f, "b", "mac", MapSchema.FIELD_NAME_KEY, "", "status", "j", "a", MapSchema.FIELD_NAME_ENTRY, b2n.g, "Lcom/oplus/aiunit/vision/v9g;", "Lcom/oplus/aiunit/vision/v9g;", "mSp", "d", "()Ljava/lang/String;", "i", "(Ljava/lang/String;)V", "lastCheckSyncMacAddress", "f", "syncMacs", "c", "()Z", "alreadyDeleteDb", "<init>", "()V", "contactsync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class y54 {

    @NotNull
    public static final y54 INSTANCE = new y54();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final v9g mSp;

    static {
        v9g v9gVarX = v9g.x("contact_sync_sp");
        Intrinsics.checkNotNullExpressionValue(v9gVarX, "getInstance(\"contact_sync_sp\")");
        mSp = v9gVarX;
    }

    public final void a(@Nullable String mac) {
        mSp.a0("sp_key_contactssource" + mac);
    }

    public final void b(@Nullable String macAddress) {
        mSp.a0("sp_key_prefix_sync_mac_address" + macAddress);
    }

    public final boolean c() {
        return mSp.q("sp_key_delete_db");
    }

    @Nullable
    public final String d() {
        return mSp.E("sp_key_last_check_sync_mac_address", "");
    }

    public final int e(@Nullable String mac) {
        return mSp.z("sp_key_contactssource" + mac, 0);
    }

    @Nullable
    public final String f() {
        return mSp.E("sp_key_sync_macs", "");
    }

    public final boolean g(@Nullable String macAddress) {
        return mSp.r("sp_key_prefix_sync_mac_address" + macAddress, false);
    }

    public final void h() {
        mSp.W("sp_key_delete_db", true);
    }

    public final void i(@Nullable String str) {
        mSp.U("sp_key_last_check_sync_mac_address", str);
    }

    public final void j(@Nullable String mac, int status) {
        mSp.S("sp_key_contactssource" + mac, status);
    }

    public final void k(@Nullable String mac) {
        mSp.U("sp_key_sync_macs", mac);
    }

    public final void l(@Nullable String macAddress) {
        mSp.W("sp_key_prefix_sync_mac_address" + macAddress, true);
    }
}
