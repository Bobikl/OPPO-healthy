package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import java.io.FileDescriptor;
import java.io.IOException;
import java.security.DigestException;

/* JADX INFO: loaded from: classes8.dex */
public interface qw4 {
    @NonNull
    static qw4 a(@NonNull FileDescriptor fileDescriptor, long j2, long j3) {
        return new ubf(fileDescriptor, j2, j3);
    }

    void b(zs4 zs4Var, long j2, int i) throws DigestException, IOException;

    long size();
}
