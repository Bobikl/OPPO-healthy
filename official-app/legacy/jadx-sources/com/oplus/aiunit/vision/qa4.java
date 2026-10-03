package com.oplus.aiunit.vision;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmField;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000 \n2\u00020\u0001:\u0001\tJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/qa4;", "", "Lcom/oplus/aiunit/vision/uk9;", "url", "", "Lcom/oplus/aiunit/vision/pa4;", "cookies", "", "b", "a", "Companion", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public interface qa4 {

    @JvmField
    @NotNull
    public static final qa4 NO_COOKIES = new Companion.C0916a();

    @NotNull
    List<pa4> a(@NotNull uk9 url);

    void b(@NotNull uk9 url, @NotNull List<pa4> cookies);
}
