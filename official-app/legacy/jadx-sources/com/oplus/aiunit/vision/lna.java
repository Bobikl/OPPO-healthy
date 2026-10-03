package com.oplus.aiunit.vision;

import android.text.Spanned;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.text.HtmlCompat;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.sequences.Sequence;
import p010kotlin.text.MatchResult;
import p010kotlin.text.Regex;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/lna;", "", "", DBHealthReviewPlan.DESC, "", "a", "str", "key", "b", "<init>", "()V", "operation_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nKeepStr.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeepStr.kt\ncom/heytap/health/operation/courses/view/viewholder/KeepStr\n+ 2 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,45:1\n32#2,2:46\n32#2,2:48\n*S KotlinDebug\n*F\n+ 1 KeepStr.kt\ncom/heytap/health/operation/courses/view/viewholder/KeepStr\n*L\n22#1:46,2\n37#1:48,2\n*E\n"})
public final class lna {
    public static final int $stable = 0;

    @NotNull
    public static final lna INSTANCE = new lna();

    @NotNull
    public final CharSequence a(@NotNull String desc) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        if (!StringsKt__StringsKt.contains$default((CharSequence) desc, (CharSequence) "#### ", false, 2, (Object) null)) {
            return desc;
        }
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) desc, "#### 课程反馈", 0, false, 6, (Object) null);
        if (iIndexOf$default > 0) {
            desc = desc.substring(0, iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(desc, "substring(...)");
        }
        String strB = b(b(desc, "#####"), "####");
        Iterator it = Regex.findAll$default(new Regex("\\!\\[.*\\]\\(.+\\)"), strB, 0, 2, null).iterator();
        String strReplace$default = strB;
        while (it.hasNext()) {
            strReplace$default = StringsKt__StringsJVMKt.replace$default(strReplace$default, ((MatchResult) it.next()).getValue(), "", false, 4, (Object) null);
        }
        Spanned spannedFromHtml = HtmlCompat.fromHtml(StringsKt__StringsJVMKt.replace$default(strReplace$default, " - ", "<br /> • ", false, 4, (Object) null), 0);
        Intrinsics.checkNotNullExpressionValue(spannedFromHtml, "fromHtml(content, HtmlCo…at.FROM_HTML_MODE_LEGACY)");
        return spannedFromHtml;
    }

    public final String b(String str, String key) {
        Regex regex = new Regex(key + " .*? ");
        String str2 = (b78.a().getResources().getConfiguration().uiMode & 48) == 32 ? "#FFFFFF" : "#000000";
        String str3 = key.length() == 5 ? "" : "<br />";
        Sequence<MatchResult> sequenceFindAll$default = Regex.findAll$default(regex, str, 0, 2, null);
        if (sequenceFindAll$default == null || (r10 = sequenceFindAll$default.iterator()) == null) {
            return str;
        }
        String strReplace$default = str;
        for (MatchResult matchResult : sequenceFindAll$default) {
            System.out.println((Object) matchResult.getValue());
            System.out.println(matchResult.getRange());
            strReplace$default = StringsKt__StringsJVMKt.replace$default(strReplace$default, matchResult.getValue(), str3 + " <br /> <big><font color='" + str2 + "'><b>" + StringsKt__StringsJVMKt.replace$default(matchResult.getValue(), key, "", false, 4, (Object) null) + "</b></font></big> " + str3 + " ", false, 4, (Object) null);
        }
        return strReplace$default;
    }
}
