package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.core.content.pm.PackageInfoCompat;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.wearable.oms.aidl.IWearableListener;
import com.heytap.wearable.oms.common.Status;
import com.oplus.backup.sdk.common.plugin.BRPluginConfig;
import com.oplus.ocs.wearengine.proto.WearEngineProto$WEMessage;
import com.oplus.ocs.wearengine.proto.WearEngineProto$WEMessageHeader;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b4\u00105J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002J\u0018\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ1\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\f0\u0010J\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\fJ\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020 2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\u0012\u0010$\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002J\u0012\u0010%\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002J\u0012\u0010&\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002J\u0012\u0010'\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002J\u0012\u0010(\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002J\u001c\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00020)2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010.\u001a\u00020\u00022\b\u0010-\u001a\u0004\u0018\u00010,H\u0002R \u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u00100R \u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00100¨\u00066"}, d2 = {"Lcom/oplus/aiunit/vision/tf3;", "", "", "packageName", "Lcom/oplus/aiunit/vision/qf3;", "f", "q", "toPackageName", LogFieldKey.LEVEL_KEY, "clientInfo", "Lcom/oplus/ocs/wearengine/proto/WearEngineProto$WEMessage;", "message", "", "o", "Lcom/heytap/wearable/oms/common/Status;", "b", "Lkotlin/Function1;", "Lcom/heytap/wearable/oms/aidl/IWearableListener;", "Lkotlin/ParameterName;", "name", "listener", "block", "d", "checkClientInfo", "Lcom/oplus/aiunit/vision/q14;", b2n.f, "", "r", LogFieldKey.PROCESS_NAME_KEY, "Landroid/content/pm/PackageInfo;", "packageInfo", "c", "Ljava/util/ArrayList;", "j", "Landroid/os/Bundle;", "metadata", MapSchema.FIELD_NAME_KEY, b2n.g, LogFieldKey.MESSAGE_KEY, "n", "i", "Landroid/util/Pair;", "", "a", "", "byteToBinary", MapSchema.FIELD_NAME_ENTRY, "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "clientInfoMap", "Landroid/content/ComponentName;", "hasServicePackageMap", "<init>", "()V", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nClientManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClientManager.kt\ncom/heytap/wearable/oms/base/client/ClientManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,351:1\n1855#2,2:352\n1855#2,2:355\n1#3:354\n13316#4,2:357\n*S KotlinDebug\n*F\n+ 1 ClientManager.kt\ncom/heytap/wearable/oms/base/client/ClientManager\n*L\n79#1:352,2\n300#1:355,2\n344#1:357,2\n*E\n"})
public final class tf3 {

    @NotNull
    public static final tf3 INSTANCE = new tf3();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<String, ClientInfo> clientInfoMap = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<String, ComponentName> hasServicePackageMap = new ConcurrentHashMap<>();

    public final Pair<Integer, String> a(String packageName) {
        Pair<Integer, byte[]> pairA = wm0.a(df0.b(), packageName, "WEAR_ENGINE_CLIENT", false);
        return new Pair<>(pairA.first, e((byte[]) pairA.second));
    }

    @NotNull
    public final Status b(@NotNull ClientInfo clientInfo, @NotNull WearEngineProto$WEMessage message) {
        Intrinsics.checkNotNullParameter(clientInfo, "clientInfo");
        Intrinsics.checkNotNullParameter(message, "message");
        return wa0.INSTANCE.c(clientInfo, message);
    }

    public final ClientInfo c(PackageInfo packageInfo) {
        String strC;
        PackageManager packageManagerC;
        String string;
        Signature[] apkContentsSigners;
        Signature signature;
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        Bundle bundle = applicationInfo != null ? applicationInfo.metaData : null;
        SigningInfo signingInfo = packageInfo.signingInfo;
        byte[] byteArray = (signingInfo == null || (apkContentsSigners = signingInfo.getApkContentsSigners()) == null || (signature = (Signature) ArraysKt___ArraysKt.firstOrNull(apkContentsSigners)) == null) ? null : signature.toByteArray();
        dcb dcbVar = dcb.INSTANCE;
        String strB = dcbVar.b(byteArray);
        if (strB == null || (strC = dcbVar.c(byteArray)) == null) {
            return null;
        }
        String strK = k(bundle);
        String strM = m(bundle);
        String strN = n(bundle);
        String strH = h(bundle);
        String strI = i(bundle);
        ArrayList<String> arrayListJ = j(packageInfo);
        String str = packageInfo.packageName;
        Intrinsics.checkNotNullExpressionValue(str, "packageInfo.packageName");
        Pair<Integer, String> pairA = a(str);
        k25.a("ClientManager", "createClientInfo(), packageInfo=" + packageInfo + " targetPackageName=" + strK + " targetSignatureMD5=" + strM + " targetSignatureSHA256=" + strN);
        if (TextUtils.equals(packageInfo.packageName, "com.coloros.findmyphone") && !TextUtils.equals(strB, "d5f2d71470028a27f040234dbe7b62b0")) {
            k25.c("ClientManager", "createClientInfo(), replace signature info");
            strC = "64aafaf1d5bc9155a9e417a849e4f8eda1d0d1341667c28ed7c443c76f820b9a";
            strB = "d5f2d71470028a27f040234dbe7b62b0";
        }
        String str2 = strC;
        ApplicationInfo applicationInfo2 = packageInfo.applicationInfo;
        String str3 = "";
        if (applicationInfo2 != null && (packageManagerC = df0.c()) != null && (string = applicationInfo2.loadLabel(packageManagerC).toString()) != null) {
            str3 = string;
        }
        String str4 = packageInfo.packageName;
        Intrinsics.checkNotNullExpressionValue(str4, "packageInfo.packageName");
        String strSubstring = strB.substring(8, 24);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return new ClientInfo(str3, str4, strSubstring, str2, (int) PackageInfoCompat.getLongVersionCode(packageInfo), packageInfo.versionName, strK, strM, strN, strH, strI, hasServicePackageMap.get(packageInfo.packageName), arrayListJ, pairA, 0, 16384, null);
    }

    @NotNull
    public final Status d(@NotNull String packageName, @NotNull Function1<? super IWearableListener, Boolean> block) {
        Status status;
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(block, "block");
        if (f(packageName) != null) {
            try {
                Set<IWearableListener> setA = c1a.a(packageName);
                if (setA.isEmpty()) {
                    status = new Status(28, null, 2, null);
                } else {
                    Iterator<IWearableListener> it = setA.iterator();
                    boolean zBooleanValue = false;
                    while (it.hasNext()) {
                        zBooleanValue |= block.invoke(it.next()).booleanValue();
                    }
                    status = zBooleanValue ? Status.SUCCESS : new Status(29, null, 2, null);
                }
            } catch (Exception e2) {
                k25.b("ClientManager", "dispatch() error:" + e2.getMessage());
                status = new Status(8, e2.getMessage());
            }
            if (status != null) {
                return status;
            }
        }
        return new Status(20, null, 2, null);
    }

    public final String e(byte[] byteToBinary) {
        StringBuilder sb = new StringBuilder();
        if (byteToBinary != null) {
            for (byte b : byteToBinary) {
                sb.append(pd2.a(b));
            }
        }
        k25.a("ClientManager", "getBinaryStr result=" + ((Object) sb));
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "result.toString()");
        return string;
    }

    @Nullable
    public final ClientInfo f(@NotNull String packageName) {
        ClientInfo clientInfoP;
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        synchronized (this) {
            clientInfoP = clientInfoMap.get(packageName);
            if (clientInfoP == null) {
                clientInfoP = INSTANCE.p(packageName);
            }
        }
        return clientInfoP;
    }

    @NotNull
    public final q14<ClientInfo> g(@NotNull String packageName, boolean checkClientInfo) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        ClientInfo clientInfoF = f(packageName);
        if (clientInfoF == null) {
            return new q14<>(new Status(20, null, 2, null));
        }
        k25.a("ClientManager", "getClientInfoWithPermission clientInfo=" + clientInfoF);
        if (checkClientInfo && !clientInfoF.k().isSuccess()) {
            return new q14<>(clientInfoF.k());
        }
        return new q14<>(clientInfoF);
    }

    public final String h(Bundle metadata) {
        String string = metadata != null ? metadata.getString("com.oplus.ocs.wearengine.TARGET_PACKAGE_NAME_MCU") : null;
        return string == null || string.length() == 0 ? "" : string;
    }

    public final String i(Bundle metadata) {
        String string = metadata != null ? metadata.getString("com.oplus.ocs.wearengine.TARGET_SIGNATURE_SHA256_MCU") : null;
        if (string == null || string.length() == 0) {
            return "";
        }
        String strReplace$default = StringsKt__StringsJVMKt.replace$default(string, ":", "", false, 4, (Object) null);
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = strReplace$default.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public final ArrayList<String> j(PackageInfo packageInfo) {
        ArrayList<String> arrayList = new ArrayList<>();
        String[] strArr = packageInfo.requestedPermissions;
        if (strArr != null) {
            for (String permission : strArr) {
                Intrinsics.checkNotNullExpressionValue(permission, "permission");
                if (StringsKt__StringsKt.contains$default((CharSequence) permission, (CharSequence) ree.PERMISSION_COMMON, false, 2, (Object) null)) {
                    arrayList.add(permission);
                }
            }
        }
        return arrayList;
    }

    public final String k(Bundle metadata) {
        String string = metadata != null ? metadata.getString(BRPluginConfig.TARGET_PACKAGE) : null;
        if (string == null || string.length() == 0) {
            string = metadata != null ? metadata.getString("com.oplus.ocs.wearengine.TARGET_PACKAGE_NAME") : null;
        }
        return string == null || string.length() == 0 ? "" : string;
    }

    @NotNull
    public final String l(@NotNull String toPackageName) {
        Intrinsics.checkNotNullParameter(toPackageName, "toPackageName");
        ClientInfo clientInfoF = null;
        if (StringsKt__StringsKt.contains$default((CharSequence) toPackageName, (CharSequence) ",", false, 2, (Object) null)) {
            toPackageName = "";
            for (String str : StringsKt__StringsKt.split$default((CharSequence) toPackageName, new String[]{","}, false, 0, 6, (Object) null)) {
                tf3 tf3Var = INSTANCE;
                if (clientInfoF == null) {
                    clientInfoF = tf3Var.f(str);
                    toPackageName = str;
                }
            }
        }
        return toPackageName;
    }

    public final String m(Bundle metadata) {
        String string = metadata != null ? metadata.getString("targetSignature") : null;
        if (string == null || string.length() == 0) {
            return "";
        }
        String strReplace$default = StringsKt__StringsJVMKt.replace$default(string, ":", "", false, 4, (Object) null);
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = strReplace$default.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        StringBuffer stringBuffer = new StringBuffer();
        if (!StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) ",", false, 2, (Object) null)) {
            String strSubstring = lowerCase.substring(8, 24);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
        for (String str : StringsKt__StringsKt.split$default((CharSequence) lowerCase, new String[]{","}, false, 0, 6, (Object) null)) {
            if ((str.length() > 0) & (str.length() == 32)) {
                String strSubstring2 = str.substring(8, 24);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                stringBuffer.append(strSubstring2 + ",");
            }
        }
        return stringBuffer.toString();
    }

    public final String n(Bundle metadata) {
        String string = metadata != null ? metadata.getString("com.oplus.ocs.wearengine.TARGET_SIGNATURE_SHA256") : null;
        if (string == null || string.length() == 0) {
            return "";
        }
        String strReplace$default = StringsKt__StringsJVMKt.replace$default(string, ":", "", false, 4, (Object) null);
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = strReplace$default.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public final boolean o(@Nullable ClientInfo clientInfo, @NotNull WearEngineProto$WEMessage message) {
        String targetSignatureMD5;
        String signatureMD5;
        Intrinsics.checkNotNullParameter(message, "message");
        WearEngineProto$WEMessageHeader header = message.getHeader();
        String str = "";
        if (clientInfo == null || (targetSignatureMD5 = clientInfo.getTargetSignatureMD5()) == null) {
            targetSignatureMD5 = "";
        }
        String fromSignature = header.getFromSignature();
        if (fromSignature == null) {
            fromSignature = "";
        }
        String toSignature = header.getToSignature();
        if (toSignature == null) {
            toSignature = "";
        }
        if (clientInfo != null && (signatureMD5 = clientInfo.getSignatureMD5()) != null) {
            str = signatureMD5;
        }
        return (Intrinsics.areEqual(targetSignatureMD5, fromSignature) || StringsKt__StringsKt.contains((CharSequence) targetSignatureMD5, (CharSequence) fromSignature, true)) && (Intrinsics.areEqual(toSignature, str) || StringsKt__StringsKt.contains((CharSequence) toSignature, (CharSequence) str, true));
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    public final ClientInfo p(String packageName) {
        PackageInfo packageInfo;
        ClientInfo clientInfoC;
        k25.a("ClientManager", "initPackageInfo packageName: " + packageName);
        if (packageName.length() == 0) {
            k25.b("ClientManager", "initPackageInfo error, packageName is null, return");
            return null;
        }
        try {
            PackageManager packageManagerC = df0.c();
            if (packageManagerC == null || (packageInfo = packageManagerC.getPackageInfo(packageName, 134221952)) == null || (clientInfoC = INSTANCE.c(packageInfo)) == null) {
                return null;
            }
            ConcurrentHashMap<String, ClientInfo> concurrentHashMap = clientInfoMap;
            concurrentHashMap.remove(packageName);
            concurrentHashMap.put(packageName, clientInfoC);
            k25.a("ClientManager", "initPackageInfo update: " + clientInfoC);
            return clientInfoC;
        } catch (Exception e2) {
            k25.b("ClientManager", "initPackageInfo error, packageName=" + packageName + ", " + e2);
            return null;
        }
    }

    @Nullable
    public final ClientInfo q(@NotNull String packageName) {
        ClientInfo clientInfoRemove;
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        synchronized (this) {
            clientInfoRemove = clientInfoMap.remove(packageName);
        }
        return clientInfoRemove;
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    public final void r(@NotNull String packageName) {
        PackageInfo packageInfo;
        ClientInfo clientInfoC;
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        k25.c("ClientManager", "updateClientInfo packageName: " + packageName);
        PackageManager packageManagerC = df0.c();
        if (packageManagerC == null || (packageInfo = packageManagerC.getPackageInfo(packageName, 134221952)) == null || (clientInfoC = INSTANCE.c(packageInfo)) == null) {
            return;
        }
        synchronized (this) {
            if (clientInfoMap.put(clientInfoC.getPackageName(), clientInfoC) == null) {
                k25.a("ClientManager", "updateClientInfo add: " + clientInfoC.getPackageName());
            } else {
                k25.a("ClientManager", "updateClientInfo update: " + clientInfoC.getPackageName());
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
