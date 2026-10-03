package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH&¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/u8h;", "", "Lkotlin/Pair;", "", "a", "", "d", "b", "", "c", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public abstract class u8h {
    public static final int $stable = 0;

    @Nullable
    public final Pair<String, String> a() {
        String str;
        if (!d()) {
            return null;
        }
        String strB = b();
        List<String> listC = c();
        if (listC.size() == 1) {
            str = listC.get(0);
        } else {
            str = listC.size() > 1 ? listC.get((int) (Math.random() * ((double) listC.size()))) : "";
        }
        return new Pair<>(strB, str);
    }

    @NotNull
    public abstract String b();

    @NotNull
    public abstract List<String> c();

    public abstract boolean d();
}
