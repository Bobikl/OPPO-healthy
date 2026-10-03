package org.hapjs.card.api;

import android.net.Uri;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public interface CardInfo {
    Map<String, Map<String, AppDependency>> getDependencies();

    String getDescription();

    Uri getIcon();

    int getMinPlatformVersion();

    Collection<String> getPermissionDescriptions();

    String getTitle();
}
