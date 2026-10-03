package org.hapjs.card.api;

/* JADX INFO: loaded from: classes11.dex */
public interface PackageListener {
    void onPackageRemoved(String str, Card card);

    void onPackageUpdated(String str, Card card);
}
