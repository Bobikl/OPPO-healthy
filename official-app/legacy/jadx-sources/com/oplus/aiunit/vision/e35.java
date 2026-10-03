package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.heytap.speech.engine.protocol.event.payload.analogclick.Feedback;
import com.oplus.pay.opensdk.deeplink.router.link.LinkInfoHelp;
import com.oplus.pay.opensdk.deeplink.router.link.data.Link;
import com.oplus.pay.opensdk.deeplink.router.link.data.LinkDataAccount;
import com.oplus.pay.opensdk.deeplink.router.link.data.LinkInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u001a\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u001a\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002R\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/e35;", "", "Lcom/oplus/aiunit/vision/d35;", "callback", "", "a", "Landroid/app/Activity;", "activity", "Lcom/oplus/pay/opensdk/deeplink/router/link/data/Link;", "link", "c", "b", "", Feedback.WIDGET_LINKURL, "d", "Lcom/oplus/aiunit/vision/d35;", "deepLinkCallback", "<init>", "()V", "paysdk_deeplink_release"}, k = 1, mv = {1, 8, 0})
public final class e35 {

    @NotNull
    public static final e35 INSTANCE = new e35();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static d35 deepLinkCallback = a.INSTANCE;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/e35$a;", "Lcom/oplus/aiunit/vision/d35;", "Landroid/app/Activity;", "activity", "", "url", "", "a", "<init>", "()V", "paysdk_deeplink_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements d35 {

        @NotNull
        public static final a INSTANCE = new a();

        @Override // com.oplus.aiunit.vision.d35
        public void a(@NotNull Activity activity, @NotNull String url) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(url, "url");
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
            intent.addCategory("android.intent.category.BROWSABLE");
            if (intent.resolveActivity(activity.getPackageManager()) != null) {
                activity.startActivity(intent);
                return;
            }
            bae.INSTANCE.d("No browser found to open URL: " + url);
        }
    }

    public final void a(@Nullable d35 callback) {
        if (callback == null) {
            callback = a.INSTANCE;
        }
        deepLinkCallback = callback;
    }

    public final void b(Activity activity, Link link) {
        if (link == null || link.getLinkDetail() == null) {
            bae.INSTANCE.d("link is null or linkDetail is null or empty");
            return;
        }
        LinkDataAccount linkDataAccount = new LinkDataAccount();
        linkDataAccount.setDownloadUrl(link.getDownloadUrl());
        linkDataAccount.setTrackId(link.getTrackId());
        linkDataAccount.setLinkDetail(link.getLinkDetail());
        LinkInfo linkInfoFromAccount = LinkInfoHelp.getLinkInfoFromAccount(activity, linkDataAccount);
        bae.INSTANCE.c("linkType is " + linkInfoFromAccount.linkType + " ,linkInfo.linkUrl is " + linkInfoFromAccount.linkUrl);
        if (linkInfoFromAccount.isTypeLocalWeb()) {
            INSTANCE.d(activity, linkInfoFromAccount.linkUrl);
        } else {
            linkInfoFromAccount.open(activity);
        }
    }

    public final void c(@NotNull Activity activity, @NotNull Link link) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(link, "link");
        b(activity, link);
    }

    public final void d(Activity activity, String linkUrl) {
        if (linkUrl != null) {
            deepLinkCallback.a(activity, linkUrl);
        }
    }
}
