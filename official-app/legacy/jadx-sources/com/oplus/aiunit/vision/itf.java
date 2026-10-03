package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import androidx.annotation.DrawableRes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0004\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/itf;", "Lcom/oplus/aiunit/vision/rfb;", "", "Landroid/net/Uri;", "data", "Lcom/oplus/aiunit/vision/frd;", "options", "c", "Landroid/content/Context;", "context", "", "b", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nResourceIntMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceIntMapper.kt\ncoil/map/ResourceIntMapper\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,26:1\n29#2:27\n*S KotlinDebug\n*F\n+ 1 ResourceIntMapper.kt\ncoil/map/ResourceIntMapper\n*L\n15#1:27\n*E\n"})
public final class itf implements rfb<Integer, Uri> {
    @Override // com.oplus.aiunit.vision.rfb
    public /* bridge */ /* synthetic */ Uri a(Integer num, frd frdVar) {
        return c(num.intValue(), frdVar);
    }

    public final boolean b(@DrawableRes int data, Context context) {
        try {
            return context.getResources().getResourceEntryName(data) != null;
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    @Nullable
    public Uri c(@DrawableRes int data, @NotNull frd options) {
        if (!b(data, options.getContext())) {
            return null;
        }
        return Uri.parse("android.resource://" + options.getContext().getPackageName() + mla.SEPARATOR + data);
    }
}
