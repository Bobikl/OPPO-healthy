package com.heytap.health.watch.notification;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public interface SeedingCardStyleProtoOrBuilder extends MessageLiteOrBuilder {
    String getB();

    String getB0();

    ByteString getB0Bytes();

    int getB0Color();

    String getB1();

    ByteString getB1Bytes();

    int getB1Color();

    ByteString getBBytes();

    int getBColor();

    int getBgColor();

    String getC1();

    ByteString getC1Bytes();

    int getC1Color();

    String getC2();

    ByteString getC2Bytes();

    int getC2Color();

    String getC3();

    ByteString getC3Bytes();

    int getC3Color();

    long getCountDownTarget();

    boolean getDismissOnce();

    boolean getForceShow();

    int getGroupPriority();

    ImagesElement getImages(int i);

    int getImagesCount();

    List<ImagesElement> getImagesList();

    int getNotifyLevel();

    ProcessInfo getProcess();

    float getScore();

    boolean getStartText();

    int getStep();

    TextElement getTexts(int i);

    int getTextsCount();

    List<TextElement> getTextsList();

    String getType();

    ByteString getTypeBytes();

    int getUpdateIndicator();

    boolean hasProcess();
}
