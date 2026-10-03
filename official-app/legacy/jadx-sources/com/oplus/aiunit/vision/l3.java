package com.oplus.aiunit.vision;

import com.heytap.accessory.file.model.Constant;
import com.heytap.health.watchface.business.creation.engine.compress.CompressType;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b&\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H&J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H&¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/l3;", "", "Lcom/oplus/aiunit/vision/wrf;", "res", "", "a", "Lcom/heytap/health/watchface/business/creation/engine/compress/CompressType;", "b", Constant.SOURCE_PATH, "sinkPath", "", "c", "<init>", "()V", "Companion", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public abstract class l3 {

    @NotNull
    public static final String TAG = "AbsCompress";

    @NotNull
    public String a(@NotNull wrf res) {
        Intrinsics.checkNotNullParameter(res, "res");
        String strG = res.g(b().getSuffixName());
        ltl.d(TAG, "pkg full file name:" + nd7.INSTANCE.k(res.getBasePkgDir()));
        ltl.d(TAG, "doPack result " + c(res.getBasePkgDir(), strG) + " outPkgPath " + strG + " file size " + new File(strG).length());
        return strG;
    }

    @NotNull
    public abstract CompressType b();

    public abstract int c(@NotNull String sourcePath, @NotNull String sinkPath);
}
