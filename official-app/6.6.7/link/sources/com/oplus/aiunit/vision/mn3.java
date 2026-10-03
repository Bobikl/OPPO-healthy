package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@mka(method = "close")
public class mn3 implements ss9 {
    @Override // com.oplus.aiunit.vision.ss9
    public void execute(us9 us9Var, ska skaVar, rs9 rs9Var) {
        if (us9Var.getActivity() != null) {
            us9Var.getActivity().finish();
        }
        rs9Var.success();
    }
}
