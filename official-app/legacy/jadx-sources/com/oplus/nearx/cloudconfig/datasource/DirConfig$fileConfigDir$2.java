package com.oplus.nearx.cloudconfig.datasource;

import com.oplus.aiunit.vision.gt5;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 1, 16})
final class DirConfig$fileConfigDir$2 extends Lambda implements Function0<File> {
    final /* synthetic */ gt5 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirConfig$fileConfigDir$2(gt5 gt5Var) {
        super(0);
        this.this$0 = gt5Var;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p010kotlin.jvm.functions.Function0
    @NotNull
    public final File invoke() {
        File file = new File(this.this$0.g() + File.separator + "files");
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }
}
