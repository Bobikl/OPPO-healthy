package com.oplus.aiunit.vision;

import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengineservice.db.table.datacollection.DataCollection;
import com.heytap.health.health_archives.util.HealthArchivesUserInfoDialogUtil;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt___StringsKt;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0002J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0002J\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0002J\u0006\u0010\u0016\u001a\u00020\u0004J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\u0010\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0002J\u0010\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0017H\u0002J\u0010\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0002¨\u0006!"}, d2 = {"Lcom/oplus/aiunit/vision/pge;", "", "", "birthday", "", "c", Fields.HEIGHT_FIELD, b2n.f, "weight", LogFieldKey.LEVEL_KEY, "sex", MapSchema.FIELD_NAME_KEY, "name", "j", "allergicReaction", "b", HealthArchivesUserInfoDialogUtil.TYPE_MEDICAL_HISTORY, b2n.g, "bloodType", MapSchema.FIELD_NAME_ENTRY, "medicine", "i", "d", "", DataCollection.FIELD, "content", "f", LogFieldKey.MESSAGE_KEY, "len", "a", "n", "<init>", "()V", "settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class pge {
    public static final int $stable = 0;

    @NotNull
    public static final pge INSTANCE = new pge();

    public final String a(int len) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append("*");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }

    public final void b(@NotNull String allergicReaction) {
        Intrinsics.checkNotNullParameter(allergicReaction, "allergicReaction");
        f(42, m(allergicReaction));
    }

    public final void c(@NotNull String birthday) {
        Intrinsics.checkNotNullParameter(birthday, "birthday");
        f(2, n(birthday));
    }

    public final void d() {
        f(54, "*血压");
    }

    public final void e(@NotNull String bloodType) {
        Intrinsics.checkNotNullParameter(bloodType, "bloodType");
        f(44, "**");
    }

    public final void f(int field, String content) {
        if (TextUtils.isEmpty(content)) {
            return;
        }
        n7a.Companion.d(n7a.INSTANCE, field, 1, content, 0L, 0L, null, 56, null);
    }

    public final void g(@NotNull String height) {
        String str;
        Intrinsics.checkNotNullParameter(height, "height");
        if (TextUtils.isEmpty(height) || height.length() <= 2) {
            str = "";
        } else {
            String strSubstring = height.substring(0, height.length() - 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            str = m(strSubstring) + "cm";
        }
        f(3, str);
    }

    public final void h(@NotNull String medicalHistory) {
        Intrinsics.checkNotNullParameter(medicalHistory, "medicalHistory");
        f(43, m(medicalHistory));
    }

    public final void i(@NotNull String medicine) {
        Intrinsics.checkNotNullParameter(medicine, "medicine");
        f(45, m(medicine));
    }

    public final void j(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        f(6, m(name));
    }

    public final void k(@NotNull String sex) {
        Intrinsics.checkNotNullParameter(sex, "sex");
        f(5, "*");
    }

    public final void l(@NotNull String weight) {
        String string;
        Intrinsics.checkNotNullParameter(weight, "weight");
        if (TextUtils.isEmpty(weight) || weight.length() <= 3) {
            string = "";
        } else {
            String strSubstring = weight.substring(0, weight.length() - 2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            StringBuilder sb = new StringBuilder(m(strSubstring));
            StringBuilder sbInsert = sb.insert(sb.length() - 1, '.');
            sbInsert.append("kg");
            string = sbInsert.toString();
            Intrinsics.checkNotNullExpressionValue(string, "sb.insert(sb.length - 1,…).append(\"kg\").toString()");
        }
        f(4, string);
    }

    public final String m(String content) {
        if (TextUtils.isEmpty(content)) {
            return content;
        }
        if (content.length() == 1) {
            return "*";
        }
        return StringsKt___StringsKt.first(content) + a(content.length() - 1);
    }

    public final String n(String content) {
        if (TextUtils.isEmpty(content)) {
            return content;
        }
        if (content.length() < 4) {
            return a(content.length());
        }
        String strSubstring = content.substring(0, 4);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring + "-**-**";
    }
}
