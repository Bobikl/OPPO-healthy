package com.oplus.aiunit.vision;

import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.Regex;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0004\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/fxc;", "", "", "chines", "b", "a", "<init>", "()V", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNotificationPinYinUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationPinYinUtils.kt\ncom/heytap/health/watch/notification/impl/utils/NotificationPinYinUtils\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,36:1\n107#2:37\n79#2,22:38\n*S KotlinDebug\n*F\n+ 1 NotificationPinYinUtils.kt\ncom/heytap/health/watch/notification/impl/utils/NotificationPinYinUtils\n*L\n32#1:37\n32#1:38,22\n*E\n"})
public final class fxc {

    @NotNull
    public static final fxc INSTANCE = new fxc();

    public final String a(String chines) {
        String strReplaceAll = Pattern.compile("[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}<>《》【】‘；：”“’。，、？]").matcher(new Regex("[\\p{Punct}\\p{Space}]+").replace(chines, "")).replaceAll("");
        Intrinsics.checkNotNullExpressionValue(strReplaceAll, "matcher.replaceAll(\"\")");
        int length = strReplaceAll.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.compare((int) strReplaceAll.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        return strReplaceAll.subSequence(i, length + 1).toString();
    }

    @NotNull
    public final String b(@Nullable String chines) {
        if (chines == null) {
            return "";
        }
        String strA = a(chines);
        StringBuilder sb = new StringBuilder();
        char[] charArray = strA.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        for (char c2 : charArray) {
            if (c2 > 128) {
                sb.append(kke.f(c2));
            } else {
                sb.append(c2);
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "pinyinName.toString()");
        return string;
    }
}
