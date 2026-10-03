package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/p8c;", "", "", "name", "direction", "Lcom/oplus/aiunit/vision/n8c;", "multipart", "", "a", "<init>", "()V", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
public final class p8c {

    @NotNull
    public static final p8c INSTANCE = new p8c();

    public final void a(@NotNull String name, @NotNull String direction, @NotNull n8c multipart) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(multipart, "multipart");
        if (t7b.INSTANCE.f() <= 3) {
            StringBuilder sb = new StringBuilder();
            sb.append(name);
            sb.append("\t");
            sb.append(direction);
            sb.append("\t");
            int iF = multipart.f();
            if (iF > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    byte[] bArrD = multipart.d(i);
                    Intrinsics.checkNotNull(bArrD);
                    sb.append(bArrD.length > 200 ? Intrinsics.stringPlus("...#", Integer.valueOf(bArrD.length)) : new String(bArrD, Charsets.UTF_8));
                    sb.append(" ");
                    if (i2 >= iF) {
                        break;
                    } else {
                        i = i2;
                    }
                }
            }
            t7b t7bVar = t7b.INSTANCE;
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "logStr.toString()");
            t7bVar.i("MultipartStream", string);
        }
    }
}
