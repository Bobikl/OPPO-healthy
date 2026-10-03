package com.heytap.health.settings.watch.sporthealthsettings2.ui.collaborationRelated;

import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.aiunit.vision.mla;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001a\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002¨\u0006\u0010"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings2/ui/collaborationRelated/TarSportExtractor;", "", "Ljava/io/File;", "tarFile", "", "resourceName", "", "b", "targetRootDir", "", "c", "entryPath", "sourceDirName", "d", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class TarSportExtractor {
    public static final int $stable = 0;

    @NotNull
    public static final TarSportExtractor INSTANCE = new TarSportExtractor();

    public final boolean b(@NotNull File tarFile, @NotNull final String resourceName) {
        Intrinsics.checkNotNullParameter(tarFile, "tarFile");
        Intrinsics.checkNotNullParameter(resourceName, "resourceName");
        return (StringsKt__StringsJVMKt.isBlank(resourceName) || d.INSTANCE.d(tarFile, new Function1<d.TarEntry, String>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.collaborationRelated.TarSportExtractor$existsSportAudioResourceDir$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            @Nullable
            public final String invoke(@NotNull d.TarEntry entry) {
                Intrinsics.checkNotNullParameter(entry, "entry");
                return TarSportExtractor.INSTANCE.d(entry.getName(), resourceName);
            }
        }) == null) ? false : true;
    }

    public final int c(@NotNull File tarFile, @NotNull File targetRootDir, @NotNull final String resourceName) {
        Intrinsics.checkNotNullParameter(tarFile, "tarFile");
        Intrinsics.checkNotNullParameter(targetRootDir, "targetRootDir");
        Intrinsics.checkNotNullParameter(resourceName, "resourceName");
        if (StringsKt__StringsJVMKt.isBlank(resourceName)) {
            return 0;
        }
        return d.INSTANCE.c(tarFile, targetRootDir, new Function2<String, Boolean, String>() { // from class: com.heytap.health.settings.watch.sporthealthsettings2.ui.collaborationRelated.TarSportExtractor$extractSportAudioFilesByResourceName$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ String invoke(String str, Boolean bool) {
                return invoke(str, bool.booleanValue());
            }

            @Nullable
            public final String invoke(@NotNull String entryName, boolean z) {
                Intrinsics.checkNotNullParameter(entryName, "entryName");
                if (z) {
                    return TarSportExtractor.INSTANCE.d(entryName, resourceName);
                }
                return null;
            }
        });
    }

    public final String d(String entryPath, String sourceDirName) {
        if (StringsKt__StringsJVMKt.isBlank(entryPath)) {
            return null;
        }
        String str = "sport/audio/" + sourceDirName + "/";
        int iIndexOf = StringsKt__StringsKt.indexOf((CharSequence) entryPath, str, 0, true);
        if (iIndexOf < 0) {
            return null;
        }
        String strSubstring = entryPath.substring(iIndexOf + str.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String strTrimStart = StringsKt__StringsKt.trimStart(strSubstring, mla.SEPARATOR);
        if (StringsKt__StringsJVMKt.isBlank(strTrimStart) || StringsKt__StringsKt.contains$default((CharSequence) strTrimStart, (CharSequence) "../", false, 2, (Object) null)) {
            return null;
        }
        return strTrimStart;
    }
}
