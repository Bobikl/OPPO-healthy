package com.oplus.pantaconnect.fusionservice;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface IntentParamsOrBuilder extends MessageOrBuilder {
    String getAction();

    ByteString getActionBytes();

    String getCategories(int i);

    ByteString getCategoriesBytes(int i);

    int getCategoriesCount();

    List<String> getCategoriesList();

    IntentParams.ComponentName getComponent();

    IntentParams.ComponentNameOrBuilder getComponentOrBuilder();

    String getDataUri();

    ByteString getDataUriBytes();

    ByteString getExtrasBundleBytes();

    int getFlags();

    String getMimeType();

    ByteString getMimeTypeBytes();

    String getPackageName();

    ByteString getPackageNameBytes();

    boolean hasAction();

    boolean hasComponent();

    boolean hasDataUri();

    boolean hasExtrasBundleBytes();

    boolean hasFlags();

    boolean hasMimeType();

    boolean hasPackageName();
}
