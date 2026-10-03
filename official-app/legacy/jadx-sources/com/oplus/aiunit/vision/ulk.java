package com.oplus.aiunit.vision;

import android.net.Uri;
import org.apache.commons.codec.language.Soundex;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/ulk;", "Lcom/oplus/aiunit/vision/woa;", "Landroid/net/Uri;", "data", "Lcom/oplus/aiunit/vision/frd;", "options", "", "b", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
public final class ulk implements woa<Uri> {
    @Override // com.oplus.aiunit.vision.woa
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a(@NotNull Uri data, @NotNull frd options) {
        if (!Intrinsics.areEqual(data.getScheme(), "android.resource")) {
            return data.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(data);
        sb.append(Soundex.SILENT_MARKER);
        sb.append(j.k(options.getContext().getResources().getConfiguration()));
        return sb.toString();
    }
}
