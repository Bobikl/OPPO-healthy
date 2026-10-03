package com.heytap.health.interconnection.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.alibaba.android.arouter.facade.template.IProvider;

/* JADX INFO: loaded from: classes16.dex */
public interface IInternal extends IProvider {
    public static final String ROUTER_PATH = "/interconnection_impl/Internal";

    void c8(@NonNull AppCompatActivity appCompatActivity, @NonNull Bundle bundle);
}
