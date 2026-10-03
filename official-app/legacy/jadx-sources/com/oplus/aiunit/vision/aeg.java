package com.oplus.aiunit.vision;

import com.tencent.qgame.animplayer.util.ScaleType;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
public final /* synthetic */ class aeg {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[ScaleType.values().length];
        $EnumSwitchMapping$0 = iArr;
        iArr[ScaleType.FIT_XY.ordinal()] = 1;
        iArr[ScaleType.FIT_CENTER.ordinal()] = 2;
        iArr[ScaleType.CENTER_CROP.ordinal()] = 3;
    }
}
