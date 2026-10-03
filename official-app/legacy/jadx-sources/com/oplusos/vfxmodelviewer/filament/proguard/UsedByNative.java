package com.oplusos.vfxmodelviewer.filament.proguard;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes9.dex */
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.CONSTRUCTOR})
public @interface UsedByNative {
    String value();
}
