package com.oplus.aiunit.vision;

import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import com.heytap.nearx.tangramconfig.TangramConfigCtrl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001c\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/cj8;", "", "Lcom/oplus/aiunit/vision/ytf;", AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, "", "tapCloudHeader", "b", "", "headers", "a", "<init>", "()V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public final class cj8 {
    public static final cj8 INSTANCE = new cj8();

    @NotNull
    public final String a(@NotNull String tapCloudHeader, @NotNull List<String> headers) {
        Intrinsics.checkNotNullParameter(tapCloudHeader, "tapCloudHeader");
        Intrinsics.checkNotNullParameter(headers, "headers");
        StringBuilder sb = new StringBuilder();
        sb.append(tapCloudHeader);
        if (!headers.isEmpty()) {
            for (String str : headers) {
                sb.append(",");
                sb.append(str);
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "headerList.toString()");
        return string;
    }

    @NotNull
    public final ytf b(@NotNull ytf response, @NotNull String tapCloudHeader) {
        List listSplit$default;
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(tapCloudHeader, "tapCloudHeader");
        ArrayList arrayList = null;
        String strT = ytf.t(response, TangramConfigCtrl.CLOUD_CONFIG_VER, null, 2, null);
        List<String> mutableList = (strT == null || (listSplit$default = StringsKt__StringsKt.split$default((CharSequence) strT, new String[]{","}, false, 0, 6, (Object) null)) == null) ? null : CollectionsKt___CollectionsKt.toMutableList((Collection) listSplit$default);
        if (!(tapCloudHeader.length() > 0)) {
            return response;
        }
        String str = (String) CollectionsKt___CollectionsKt.firstOrNull(StringsKt__StringsKt.split$default((CharSequence) tapCloudHeader, new String[]{":"}, false, 0, 6, (Object) null));
        if (str == null || str.length() == 0) {
            return response;
        }
        if (mutableList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : mutableList) {
                if (StringsKt__StringsKt.contains$default((CharSequence) obj, (CharSequence) str, false, 2, (Object) null)) {
                    arrayList2.add(obj);
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || !(!arrayList.isEmpty())) {
            return response;
        }
        StringBuilder sb = new StringBuilder();
        mutableList.removeAll(arrayList);
        if (!(!mutableList.isEmpty())) {
            return response.x().r(TangramConfigCtrl.CLOUD_CONFIG_VER).c();
        }
        for (String str2 : mutableList) {
            sb.append(",");
            sb.append(str2);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "stringBuilder.toString()");
        return response.x().j(TangramConfigCtrl.CLOUD_CONFIG_VER, StringsKt__StringsJVMKt.replaceFirst$default(string, ",", "", false, 4, (Object) null)).c();
    }
}
