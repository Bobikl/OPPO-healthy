package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.oplus.aiunit.vision.qak;

/* JADX INFO: loaded from: classes13.dex */
public abstract class qak<CHILD extends qak<CHILD, TranscodeType>, TranscodeType> implements Cloneable {
    public pak<? super TranscodeType> i = itc.c();

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final pak<? super TranscodeType> b() {
        return this.i;
    }

    public final CHILD c() {
        return this;
    }

    @NonNull
    public final CHILD d(@NonNull pak<? super TranscodeType> pakVar) {
        this.i = (pak) cpe.d(pakVar);
        return (CHILD) c();
    }

    public boolean equals(Object obj) {
        if (obj instanceof qak) {
            return uqk.e(this.i, ((qak) obj).i);
        }
        return false;
    }

    public int hashCode() {
        pak<? super TranscodeType> pakVar = this.i;
        if (pakVar != null) {
            return pakVar.hashCode();
        }
        return 0;
    }
}
