package com.oplus.nearx.cloudconfig.datasource.task;

import com.oplus.aiunit.vision.lcf;
import com.oplus.aiunit.vision.pnc;
import com.oplus.aiunit.vision.s3i;
import com.oplus.aiunit.vision.wn9;
import com.oplus.nearx.cloudconfig.bean.UpdateConfigItem;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0007\n\u0002\b\u0004*\u0001\u0000\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"com/oplus/nearx/cloudconfig/datasource/task/NetSourceDownCloudTask$logic$2$a", "invoke", "()Lcom/oplus/nearx/cloudconfig/datasource/task/NetSourceDownCloudTask$logic$2$a;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
final class NetSourceDownCloudTask$logic$2 extends Lambda implements Function0<a> {
    final /* synthetic */ pnc this$0;

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"com/oplus/nearx/cloudconfig/datasource/task/NetSourceDownCloudTask$logic$2$a", "Lcom/oplus/aiunit/vision/lcf;", "Lcom/oplus/nearx/cloudconfig/bean/UpdateConfigItem;", "Lcom/oplus/aiunit/vision/s3i;", "com.oplus.nearx.cloudconfig"}, k = 1, mv = {1, 4, 0})
    public static final class a extends lcf<UpdateConfigItem, s3i> {
        public a(wn9 wn9Var) {
            super(wn9Var);
        }
    }

    public NetSourceDownCloudTask$logic$2(pnc pncVar) {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p010kotlin.jvm.functions.Function0
    @NotNull
    public final a invoke() {
        return new a(null);
    }
}
