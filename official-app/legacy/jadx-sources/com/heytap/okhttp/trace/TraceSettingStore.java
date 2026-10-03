package com.heytap.okhttp.trace;

import com.heytap.nearx.cloudconfig.CloudConfigCtrl;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.hxg;
import com.oplus.aiunit.vision.kxg;
import com.oplus.aiunit.vision.r7b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsJVMKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006H\u0016R\u0016\u0010\u000e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\rR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/heytap/okhttp/trace/TraceSettingStore;", "Lcom/oplus/aiunit/vision/kxg;", "Lcom/heytap/nearx/cloudconfig/CloudConfigCtrl;", "cloudControl", "", b2n.f, "", "a", "", "", "b", "samplingRatio", b2n.g, "I", "sampleRatio", "Ljava/util/List;", "uploadAddress", "", "c", "Z", "hasInit", "Lcom/oplus/aiunit/vision/r7b;", "d", "Lcom/oplus/aiunit/vision/r7b;", "f", "()Lcom/oplus/aiunit/vision/r7b;", "logger", "<init>", "(Lcom/oplus/aiunit/vision/r7b;)V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public final class TraceSettingStore implements kxg {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public volatile int sampleRatio;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public volatile List<String> uploadAddress = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public volatile boolean hasInit;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final r7b logger;

    public TraceSettingStore(@Nullable r7b r7bVar) {
        this.logger = r7bVar;
    }

    @Override // com.oplus.aiunit.vision.kxg
    /* JADX INFO: renamed from: a, reason: from getter */
    public int getSampleRatio() {
        return this.sampleRatio;
    }

    @Override // com.oplus.aiunit.vision.kxg
    @NotNull
    public List<String> b() {
        return this.uploadAddress;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final r7b getLogger() {
        return this.logger;
    }

    public final void g(@NotNull CloudConfigCtrl cloudControl) {
        Intrinsics.checkNotNullParameter(cloudControl, "cloudControl");
        if (this.hasInit) {
            return;
        }
        synchronized (this) {
            if (this.hasInit) {
                return;
            }
            this.hasInit = true;
            Unit unit = Unit.INSTANCE;
            hxg hxgVar = (hxg) cloudControl.create(hxg.class);
            SampleRatioEntity sampleRatioEntityB = hxgVar.b();
            if (sampleRatioEntityB != null && sampleRatioEntityB.getSampleRatio() != 0) {
                h(sampleRatioEntityB.getSampleRatio());
                this.uploadAddress = CollectionsKt___CollectionsKt.toMutableList((Collection) CollectionsKt__CollectionsJVMKt.listOf(sampleRatioEntityB.getUploadUrl()));
                r7b r7bVar = this.logger;
                if (r7bVar != null) {
                    r7b.h(r7bVar, "TraceSetting", "set sample setting ratio " + this.sampleRatio + ", upload address is " + this.uploadAddress, null, null, 12, null);
                }
            }
            hxgVar.a().subscribe(new Function1<SampleRatioEntity, Unit>() { // from class: com.heytap.okhttp.trace.TraceSettingStore$setCloudControl$3
                {
                    super(1);
                }

                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SampleRatioEntity sampleRatioEntity) {
                    invoke2(sampleRatioEntity);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SampleRatioEntity cloud) {
                    Intrinsics.checkNotNullParameter(cloud, "cloud");
                    this.this$0.h(cloud.getSampleRatio());
                    this.this$0.uploadAddress = CollectionsKt___CollectionsKt.toMutableList((Collection) CollectionsKt__CollectionsJVMKt.listOf(cloud.getUploadUrl()));
                    r7b logger = this.this$0.getLogger();
                    if (logger != null) {
                        r7b.h(logger, "TraceSetting", "update sample setting ratio " + this.this$0.sampleRatio + ", upload address is " + this.this$0.uploadAddress, null, null, 12, null);
                    }
                }
            });
        }
    }

    public void h(int samplingRatio) {
        this.sampleRatio = samplingRatio;
    }
}
