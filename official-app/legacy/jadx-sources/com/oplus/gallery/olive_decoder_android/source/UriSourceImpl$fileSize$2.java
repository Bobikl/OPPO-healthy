package com.oplus.gallery.olive_decoder_android.source;

import com.oplus.aiunit.vision.ylk;
import java.io.FileNotFoundException;
import java.io.InputStream;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class UriSourceImpl$fileSize$2 extends Lambda implements Function0<Long> {
    final /* synthetic */ ylk this$0;

    public UriSourceImpl$fileSize$2(ylk ylkVar) {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p010kotlin.jvm.functions.Function0
    @NotNull
    public final Long invoke() throws FileNotFoundException {
        InputStream inputStreamOpenInputStream = ylk.b(null).getContentResolver().openInputStream(ylk.c(null));
        return Long.valueOf(inputStreamOpenInputStream == null ? 0L : inputStreamOpenInputStream.available());
    }
}
