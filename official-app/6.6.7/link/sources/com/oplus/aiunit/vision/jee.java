package com.oplus.aiunit.vision;

import com.oplus.pay.opensdk.deeplink.router.link.data.Link;
import com.oplus.pay.opensdk.deeplink.router.link.data.LinkDataAccount;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/jee;", "", "", "Lcom/oplus/pay/opensdk/deeplink/router/link/data/LinkDataAccount$LinkDetail;", "linkDetailList", "Lcom/oplus/pay/opensdk/deeplink/router/link/data/Link;", "a", "<init>", "()V", "paysdk_web_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPayWebDeepLinkConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayWebDeepLinkConverter.kt\ncom/oplus/pay/opensdk/web/deeplink/PayWebDeepLinkConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,46:1\n1549#2:47\n1620#2,3:48\n*S KotlinDebug\n*F\n+ 1 PayWebDeepLinkConverter.kt\ncom/oplus/pay/opensdk/web/deeplink/PayWebDeepLinkConverter\n*L\n26#1:47\n26#1:48,3\n*E\n"})
public final class jee {

    @NotNull
    public static final jee INSTANCE = new jee();

    @NotNull
    public final Link a(@NotNull List<LinkDataAccount.LinkDetail> linkDetailList) {
        Intrinsics.checkNotNullParameter(linkDetailList, "linkDetailList");
        List<LinkDataAccount.LinkDetail> list = linkDetailList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (LinkDataAccount.LinkDetail linkDetail : list) {
            LinkDataAccount.LinkDetail linkDetail2 = new LinkDataAccount.LinkDetail(null, null, null, null, null, null, 63, null);
            linkDetail2.setLinkType(linkDetail.getLinkType());
            linkDetail2.setLinkUrl(linkDetail.getLinkUrl());
            linkDetail2.setPackageName(linkDetail.getPackageName());
            arrayList.add(linkDetail2);
        }
        return new Link(CollectionsKt.emptyList(), "", "", arrayList, "", "");
    }
}
