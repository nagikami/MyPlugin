package com.github.nagikami.myplugin;

import com.intellij.openapi.components.ServiceManager;

public interface NotifyListener {
    static NotifyListener getInstance() {
        return ServiceManager.getService(NotifyListener.class);
    }
}
