package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes2.dex */
@eja(method = "close")
public class ym3 implements mr9 {
    @Override // com.oplus.aiunit.vision.mr9
    public void execute(or9 or9Var, kja kjaVar, lr9 lr9Var) {
        if (or9Var.getActivity() != null) {
            or9Var.getActivity().finish();
        }
        lr9Var.success();
    }
}
