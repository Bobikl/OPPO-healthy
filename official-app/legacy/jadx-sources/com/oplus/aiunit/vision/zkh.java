package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.sleep.R$string;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/zkh;", "Lcom/oplus/aiunit/vision/u8h;", "", "d", "", "b", "", "c", "Landroid/content/Context;", "a", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class zkh extends u8h {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    public zkh(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // com.oplus.aiunit.vision.u8h
    @NotNull
    public String b() {
        return "";
    }

    @Override // com.oplus.aiunit.vision.u8h
    @NotNull
    public List<String> c() {
        ArrayList arrayList = new ArrayList();
        String string = this.context.getString(R$string.health_sleep_null_desc_1);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…health_sleep_null_desc_1)");
        arrayList.add(string);
        String string2 = this.context.getString(R$string.health_sleep_null_desc_2);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…health_sleep_null_desc_2)");
        arrayList.add(string2);
        String string3 = this.context.getString(R$string.health_sleep_null_desc_3);
        Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.stri…health_sleep_null_desc_3)");
        arrayList.add(string3);
        String string4 = this.context.getString(R$string.health_sleep_null_desc_4);
        Intrinsics.checkNotNullExpressionValue(string4, "context.getString(R.stri…health_sleep_null_desc_4)");
        arrayList.add(string4);
        String string5 = this.context.getString(R$string.health_sleep_null_desc_5);
        Intrinsics.checkNotNullExpressionValue(string5, "context.getString(R.stri…health_sleep_null_desc_5)");
        arrayList.add(string5);
        String string6 = this.context.getString(R$string.health_sleep_null_desc_6);
        Intrinsics.checkNotNullExpressionValue(string6, "context.getString(R.stri…health_sleep_null_desc_6)");
        arrayList.add(string6);
        String string7 = this.context.getString(R$string.health_sleep_null_desc_7);
        Intrinsics.checkNotNullExpressionValue(string7, "context.getString(R.stri…health_sleep_null_desc_7)");
        arrayList.add(string7);
        return arrayList;
    }

    @Override // com.oplus.aiunit.vision.u8h
    public boolean d() {
        return true;
    }
}
