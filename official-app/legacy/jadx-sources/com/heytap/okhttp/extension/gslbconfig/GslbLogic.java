package com.heytap.okhttp.extension.gslbconfig;

import com.heytap.httpdns.HttpDnsCore;
import com.heytap.nearx.cloudconfig.CloudConfigCtrl;
import com.heytap.nearx.taphttp.core.HeyCenter;
import com.oplus.aiunit.vision.jc8;
import com.oplus.aiunit.vision.kc8;
import com.oplus.aiunit.vision.lj9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001c\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u0004J\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/heytap/okhttp/extension/gslbconfig/GslbLogic;", "", "Lcom/heytap/nearx/cloudconfig/CloudConfigCtrl;", "cloudConfigCtrl", "Lcom/heytap/nearx/taphttp/core/HeyCenter;", "heyCenter", "", "d", "", "Lcom/heytap/okhttp/extension/gslbconfig/GslbEntity;", "list", "b", "c", "a", "", "Z", "hasInit", "<init>", "()V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public final class GslbLogic {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public volatile boolean hasInit;

    @NotNull
    public final List<GslbEntity> a(@NotNull List<GslbEntity> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList arrayList = new ArrayList();
        for (GslbEntity gslbEntity : list) {
            try {
                Iterator it = StringsKt__StringsKt.split$default((CharSequence) gslbEntity.getGslbValue(), new String[]{";"}, false, 0, 6, (Object) null).iterator();
                while (it.hasNext()) {
                    Iterator it2 = StringsKt__StringsKt.split$default((CharSequence) it.next(), new String[]{","}, false, 0, 6, (Object) null).iterator();
                    while (it2.hasNext()) {
                        Long.parseLong((String) it2.next());
                    }
                }
                arrayList.add(gslbEntity);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return arrayList;
    }

    public final void b(@NotNull List<GslbEntity> list, @NotNull HeyCenter heyCenter) {
        jc8 jc8VarM;
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(heyCenter, "heyCenter");
        for (GslbEntity gslbEntity : c(a(list))) {
            HttpDnsCore httpDnsCore = (HttpDnsCore) heyCenter.g(lj9.class);
            if (httpDnsCore != null && (jc8VarM = httpDnsCore.m()) != null) {
                jc8VarM.h(gslbEntity.getUrl(), gslbEntity.getGslbValue());
            }
        }
    }

    @NotNull
    public final List<GslbEntity> c(@NotNull List<GslbEntity> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        CopyOnWriteArrayList<GslbEntity> copyOnWriteArrayList = new CopyOnWriteArrayList();
        for (GslbEntity gslbEntity : list) {
            if (copyOnWriteArrayList.size() == 0) {
                copyOnWriteArrayList.add(gslbEntity);
            } else {
                for (GslbEntity gslbEntity2 : copyOnWriteArrayList) {
                    if (Intrinsics.areEqual(gslbEntity.getUrl(), gslbEntity2.getUrl())) {
                        gslbEntity2.c(gslbEntity2.getGslbValue() + ';' + gslbEntity.getGslbValue());
                    } else {
                        copyOnWriteArrayList.add(gslbEntity);
                    }
                }
            }
        }
        return copyOnWriteArrayList;
    }

    public final void d(@NotNull CloudConfigCtrl cloudConfigCtrl, @NotNull final HeyCenter heyCenter) {
        Intrinsics.checkNotNullParameter(cloudConfigCtrl, "cloudConfigCtrl");
        Intrinsics.checkNotNullParameter(heyCenter, "heyCenter");
        if (this.hasInit) {
            return;
        }
        synchronized (this) {
            if (this.hasInit) {
                return;
            }
            this.hasInit = true;
            Unit unit = Unit.INSTANCE;
            ((kc8) cloudConfigCtrl.create(kc8.class)).a().subscribe(new Function1<List<? extends GslbEntity>, Unit>() { // from class: com.heytap.okhttp.extension.gslbconfig.GslbLogic$setCloudConfigCtrl$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(List<? extends GslbEntity> list) {
                    invoke2((List<GslbEntity>) list);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull List<GslbEntity> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.this$0.b(it, heyCenter);
                }
            });
        }
    }
}
