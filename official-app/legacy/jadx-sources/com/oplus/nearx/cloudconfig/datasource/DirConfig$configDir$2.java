package com.oplus.nearx.cloudconfig.datasource;

import com.oplus.aiunit.vision.gt5;
import java.io.File;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/io/File;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 16})
final class DirConfig$configDir$2 extends Lambda implements Function0<File> {
    final /* synthetic */ String $configRootDir;
    final /* synthetic */ gt5 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirConfig$configDir$2(gt5 gt5Var, String str) {
        super(0);
        this.this$0 = gt5Var;
        this.$configRootDir = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p010kotlin.jvm.functions.Function0
    public final File invoke() {
        if (!(this.$configRootDir.length() > 0)) {
            return this.this$0.context.getDir(this.this$0.configDirName, 0);
        }
        File file = new File(this.$configRootDir + File.separator + this.this$0.configDirName);
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        gt5.l(this.this$0, "create Dir[" + file + "] failed.., use Default Dir", null, 1, null);
        return this.this$0.context.getDir(this.this$0.configDirName, 0);
    }
}
