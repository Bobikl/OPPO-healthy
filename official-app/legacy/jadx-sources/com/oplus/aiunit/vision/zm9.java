package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import com.heytap.accessory.utils.XmlReader;
import com.heytap.health.wallet.iccoa.ui.ICCOACreateActivity;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007JN\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0002¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/zm9;", "", "Landroid/content/Context;", "context", "", "b", "", "packageName", f04.KEY_FRIENDLY_NAME, "", f04.KEY_VEHICLE_OEM_ID, f04.KEY_VEHICLE_ID, "sessionId", f04.KEY_BRAND_ID, "", "wirelessCapabilitiesList", "a", "<init>", "()V", "entrance_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nICCOAUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ICCOAUtils.kt\ncom/heytap/health/wallet/iccoa/ICCOAUtils\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,117:1\n13309#2,2:118\n13309#2,2:120\n*S KotlinDebug\n*F\n+ 1 ICCOAUtils.kt\ncom/heytap/health/wallet/iccoa/ICCOAUtils\n*L\n32#1:118,2\n62#1:120,2\n*E\n"})
public final class zm9 {

    @NotNull
    public static final zm9 INSTANCE = new zm9();

    @JvmStatic
    public static final void b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        List<String> listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"NFC", XmlReader.TRANSPORT_BLE});
        INSTANCE.a(context, "com.dahua.leapmotor", "零跑汽车", new byte[]{0, 24}, new byte[]{0, 24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 92}, "20EA1971F6F24A54B40098BF722D9F4F", "Leapmotor", listListOf);
    }

    public final void a(Context context, String packageName, String friendlyName, byte[] vehicleOemId, byte[] vehicleId, String sessionId, String brandId, List<String> wirelessCapabilitiesList) {
        String packageName2 = context.getPackageName();
        Intent intent = new Intent(ICCOACreateActivity.CREATE_ACTION);
        intent.setPackage(packageName2);
        intent.putExtra(f04.KEY_FRIENDLY_NAME, friendlyName);
        intent.putExtra(f04.KEY_VEHICLE_OEM_ID, vehicleOemId);
        intent.putExtra(f04.KEY_VEHICLE_ID, vehicleId);
        intent.putExtra("sessionId", sessionId);
        intent.putExtra(f04.KEY_BRAND_ID, brandId);
        intent.putStringArrayListExtra(f04.KEY_WIRELESS_CAPABILITIES, new ArrayList<>(wirelessCapabilitiesList));
        intent.putExtra("packageName", packageName);
        intent.setPackage(context.getPackageName());
        context.startActivity(intent);
    }
}
