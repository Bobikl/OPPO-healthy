package com.heytap.store.homeservice;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/heytap/store/homeservice/IThemeProvider;", "", "getTabColorArray", "", "", "()[Ljava/lang/String;", "getTabName", "getThemeSate", "Lcom/heytap/store/homeservice/FragmentThemeState;", "useLightIcon", "", "com.heytap.store.business.home-service"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface IThemeProvider {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static String getTabName(@NotNull IThemeProvider iThemeProvider) {
            Intrinsics.checkNotNullParameter(iThemeProvider, "this");
            return "";
        }

        public static boolean useLightIcon(@NotNull IThemeProvider iThemeProvider) {
            Intrinsics.checkNotNullParameter(iThemeProvider, "this");
            return false;
        }
    }

    @NotNull
    String[] getTabColorArray();

    @NotNull
    String getTabName();

    @NotNull
    FragmentThemeState getThemeSate();

    boolean useLightIcon();
}
