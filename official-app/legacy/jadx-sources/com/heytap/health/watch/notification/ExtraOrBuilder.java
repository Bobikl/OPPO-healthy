package com.heytap.health.watch.notification;

import com.google.protobuf.MessageLiteOrBuilder;

/* JADX INFO: loaded from: classes19.dex */
public interface ExtraOrBuilder extends MessageLiteOrBuilder {
    Extra.DataCase getDataCase();

    TemplateIconProcess getIconProcess();

    TemplateProcess getProcess();

    int getTemplate();

    boolean hasIconProcess();

    boolean hasProcess();
}
