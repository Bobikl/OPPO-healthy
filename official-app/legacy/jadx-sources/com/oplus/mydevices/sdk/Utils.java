package com.oplus.mydevices.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.exifinterface.media.ExifInterface;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.reflect.TypeToken;
import com.heytap.health.watch.notification.impl.pull.NotificationApiService;
import com.oplus.mydevices.sdk.device.DeviceInfo;
import com.oplus.mydevices.sdk.utils.LogUtils;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0007J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007J\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0002\b\u0012J\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0002J\u0014\u0010\u0015\u001a\u0004\u0018\u00010\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0007J&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u00182\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u001aj\b\u0012\u0004\u0012\u00020\u0004`\u001bH\u0007J\u0006\u0010\u001c\u001a\u00020\u001dJ \u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0004H\u0007J\u0018\u0010$\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0007J\u0018\u0010%\u001a\u00020\"2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0007J\u0019\u0010&\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010'*\u0002H'H\u0007¢\u0006\u0002\u0010(J\u001e\u0010)\u001a\u0004\u0018\u0001H'\"\u0006\b\u0000\u0010'\u0018\u0001*\u0004\u0018\u00010\u0004H\u0087\b¢\u0006\u0002\u0010*R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/oplus/mydevices/sdk/Utils;", "", "()V", "PROVIDER_ACTION", "", "SELECTION_MAC", "TAG", "addFlag", "", "current", "flag", "convertToDeviceJson", "device", "Lcom/oplus/mydevices/sdk/device/DeviceInfo;", "findProvider", "Landroid/content/pm/ProviderInfo;", "context", "Landroid/content/Context;", "findProvider$sdk_domesticRelease", "genContentAuthority", "authority", "getDeviceByJson", "json", "getDevicesByJsonList", "", "jsonList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getMyDeviceApkVersionCode", "", "getUri", "Landroid/net/Uri;", "pathName", "isMacSelection", "", "selection", "removeFlag", "supportFlag", "toJson", ExifInterface.GPS_DIRECTION_TRUE, "(Ljava/lang/Object;)Ljava/lang/String;", "toObject", "(Ljava/lang/String;)Ljava/lang/Object;", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public final class Utils {
    public static final Utils INSTANCE = new Utils();
    private static final String PROVIDER_ACTION = "oplus.devicecards.action.DEVICE_INFO";
    private static final String SELECTION_MAC = "device_mac=?";
    private static final String TAG = "Utils";

    private Utils() {
    }

    @JvmStatic
    public static final int addFlag(int current, int flag) {
        return current | flag;
    }

    @JvmStatic
    @Nullable
    public static final String convertToDeviceJson(@Nullable DeviceInfo device) {
        try {
            String str = new GsonBuilder().setLenient().disableHtmlEscaping().create().toJson(device);
            Intrinsics.checkNotNullExpressionValue(str, "str");
            Charset charset = Charsets.UTF_8;
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            return new String(bytes, charset);
        } catch (Exception e2) {
            LogUtils.INSTANCE.d(TAG, "to json error! " + e2.getMessage());
            return null;
        }
    }

    private final String genContentAuthority(String authority) {
        if (authority == null) {
            return null;
        }
        return NotificationApiService.CONTENT + authority;
    }

    @JvmStatic
    @Nullable
    public static final DeviceInfo getDeviceByJson(@Nullable String json) {
        try {
            return (DeviceInfo) new GsonBuilder().setLenient().disableHtmlEscaping().create().fromJson(json, DeviceInfo.class);
        } catch (Exception e2) {
            LogUtils.INSTANCE.d(TAG, "json parse error! " + e2.getMessage());
            return null;
        }
    }

    @JvmStatic
    @NotNull
    public static final List<DeviceInfo> getDevicesByJsonList(@NotNull ArrayList<String> jsonList) {
        Intrinsics.checkNotNullParameter(jsonList, "jsonList");
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = jsonList.iterator();
        while (it.hasNext()) {
            DeviceInfo deviceByJson = getDeviceByJson(it.next());
            if (deviceByJson != null) {
                arrayList.add(deviceByJson);
            }
        }
        return arrayList;
    }

    @JvmStatic
    @Nullable
    public static final Uri getUri(@Nullable String authority, @Nullable String pathName) {
        Uri.Builder builderBuildUpon = Uri.parse(INSTANCE.genContentAuthority(authority)).buildUpon();
        if (pathName != null) {
            builderBuildUpon.appendPath(pathName);
        }
        return builderBuildUpon.build();
    }

    public static /* synthetic */ Uri getUri$default(String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return getUri(str, str2);
    }

    @JvmStatic
    public static final boolean isMacSelection(@Nullable String selection) {
        return Intrinsics.areEqual(selection != null ? StringsKt__StringsJVMKt.replace$default(selection, " ", "", false, 4, (Object) null) : null, SELECTION_MAC);
    }

    @JvmStatic
    public static final int removeFlag(int current, int flag) {
        return current & (~flag);
    }

    @JvmStatic
    public static final boolean supportFlag(int current, int flag) {
        return (current & flag) == flag;
    }

    @JvmStatic
    @Nullable
    public static final <T> String toJson(T t) {
        if (t == null) {
            return null;
        }
        try {
            String str = new GsonBuilder().setLenient().disableHtmlEscaping().create().toJson(t);
            Intrinsics.checkNotNullExpressionValue(str, "str");
            Charset charset = Charsets.UTF_8;
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            return new String(bytes, charset);
        } catch (JsonIOException e2) {
            LogUtils.INSTANCE.e(TAG, "to json error! " + e2.getMessage());
            return null;
        }
    }

    @JvmStatic
    @Nullable
    public static final /* synthetic */ <T> T toObject(@Nullable String str) {
        if (str == null || StringsKt__StringsJVMKt.isBlank(str)) {
            return null;
        }
        try {
            Gson gsonCreate = new GsonBuilder().setLenient().disableHtmlEscaping().create();
            Intrinsics.needClassReification();
            return (T) gsonCreate.fromJson(str, new TypeToken<T>() { // from class: com.oplus.mydevices.sdk.Utils.toObject.1
            }.getType());
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    public final ProviderInfo findProvider$sdk_domesticRelease(@Nullable Context context) {
        if (context == null) {
            LogUtils.INSTANCE.i(TAG, "context is null!");
            return null;
        }
        Intent intent = new Intent(PROVIDER_ACTION);
        intent.setPackage(context.getPackageName());
        PackageManager packageManager = context.getPackageManager();
        List<ResolveInfo> listQueryIntentContentProviders = packageManager != null ? packageManager.queryIntentContentProviders(intent, 128) : null;
        List<ResolveInfo> list = listQueryIntentContentProviders;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return ((ResolveInfo) CollectionsKt___CollectionsKt.first((List) listQueryIntentContentProviders)).providerInfo;
    }

    public final long getMyDeviceApkVersionCode() {
        Context applicationContext = DeviceSdk.getApplicationContext();
        if (applicationContext == null) {
            LogUtils.INSTANCE.i(TAG, "current context null!");
            return Long.MAX_VALUE;
        }
        try {
            PackageInfo appInfo = applicationContext.getPackageManager().getPackageInfo(Constants.PACKAGE_NAME_MY_DEVICE, 0);
            Intrinsics.checkNotNullExpressionValue(appInfo, "appInfo");
            return appInfo.getLongVersionCode();
        } catch (Exception e2) {
            LogUtils.INSTANCE.e(TAG, "get app info error", e2);
            return Long.MAX_VALUE;
        }
    }
}
