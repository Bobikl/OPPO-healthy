package com.oplus.aiunit.vision;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.net.Uri;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.watch.records.R$string;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import io.protostuff.MapSchema;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004J\u0016\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0004J\u000e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004J\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0004H\u0002J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¨\u0006\u001c"}, d2 = {"Lcom/oplus/aiunit/vision/c1j;", "", "Ljava/util/Date;", "date", "", "patten", "c", "", SpeechConstant.KEY_TTS_TIMESTAMP, "b", "d", "str", "a", "Landroid/content/Context;", "context", "path", MapSchema.FIELD_NAME_ENTRY, "url", b2n.f, "relativePath", "j", b2n.g, "mac", "", "i", "f", "<init>", "()V", "recordfilemanager_impl_release"}, k = 1, mv = {1, 8, 0})
public final class c1j {

    @NotNull
    public static final c1j INSTANCE = new c1j();

    @NotNull
    public final String a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        if (!i(str)) {
            return str;
        }
        String strD = vbb.d(str);
        Intrinsics.checkNotNullExpressionValue(strD, "strToMD5(str)");
        String strSubstring = strD.substring(0, 8);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @NotNull
    public final String b(long timeStamp) {
        return c(new Date(timeStamp * ((long) 1000)), "HH:mm yyyy/MM/dd");
    }

    @NotNull
    public final String c(@NotNull Date date, @NotNull String patten) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(patten, "patten");
        String str = new SimpleDateFormat(patten).format(date);
        Intrinsics.checkNotNullExpressionValue(str, "sdf.format(date)");
        return str;
    }

    @NotNull
    public final String d(long timeStamp) {
        return c(new Date(timeStamp * ((long) 1000)), "yyyy/MM/dd HH:mm:ss");
    }

    @NotNull
    public final String e(@NotNull Context context, @NotNull String path) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(path, "path");
        String string = context.getString(R$string.record_manager_storage_tag_phone_local);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…_storage_tag_phone_local)");
        return StringsKt__StringsJVMKt.replace$default(path, "/storage/emulated/0", string, false, 4, (Object) null);
    }

    public final String f(String mac) {
        String strReplace$default = StringsKt__StringsJVMKt.replace$default(mac, ":", "", false, 4, (Object) null);
        if (strReplace$default.length() < 4) {
            return "";
        }
        String strSubstring = strReplace$default.substring(strReplace$default.length() - 4);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final long g(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            String queryParameter = Uri.parse(url).getQueryParameter("fileId");
            if (queryParameter != null) {
                return Long.parseLong(queryParameter);
            }
            return 0L;
        } catch (Exception e2) {
            pwf.e(z0j.TAG, "getFiledValue e " + e2);
            return 0L;
        }
    }

    @Nullable
    public final String h() {
        UserDeviceInfo userDeviceInfoJ = gl4.managerApi.j();
        if (userDeviceInfoJ == null) {
            pwf.e(z0j.TAG, "getCurrentDeviceMac failed， device not connect");
            return null;
        }
        pwf.d(z0j.TAG, "getDeviceName: " + userDeviceInfoJ.getDeviceName());
        String deviceName = userDeviceInfoJ.getDeviceName();
        String mac = userDeviceInfoJ.getMac();
        Intrinsics.checkNotNullExpressionValue(mac, "activeDevice.mac");
        return deviceName + " " + f(mac);
    }

    public final boolean i(String mac) {
        return BluetoothAdapter.checkBluetoothAddress(mac);
    }

    @NotNull
    public final String j(@NotNull String relativePath) {
        Intrinsics.checkNotNullParameter(relativePath, "relativePath");
        return StringsKt__StringsJVMKt.replace$default(relativePath, "/storage/emulated/0/", "", false, 4, (Object) null);
    }
}
