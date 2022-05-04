package me.cosmi.mad.enumx;

import androidx.annotation.NonNull;

public enum ListActivityIntentEnum {
    ID("id");

    private final String value;

    ListActivityIntentEnum(String value) {
        this.value = value;
    }

    @NonNull
    @Override
    public String toString() {
        return this.value;
    }
}