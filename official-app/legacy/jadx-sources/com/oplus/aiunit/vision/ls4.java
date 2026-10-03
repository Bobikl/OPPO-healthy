package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import java.io.File;

/* JADX INFO: loaded from: classes13.dex */
public class ls4<DataType> implements st5.b {
    public final im6<DataType> a;
    public final DataType b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final erd f13810c;

    public ls4(im6<DataType> im6Var, DataType datatype, erd erdVar) {
        this.a = im6Var;
        this.b = datatype;
        this.f13810c = erdVar;
    }

    @Override // com.oplus.aiunit.vision.st5.b
    public boolean a(@NonNull File file) {
        return this.a.b(this.b, file, this.f13810c);
    }
}
