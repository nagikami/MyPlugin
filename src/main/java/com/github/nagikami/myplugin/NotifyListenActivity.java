package com.github.nagikami.myplugin;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.startup.StartupActivity;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;

public class NotifyListenActivity implements StartupActivity {
    @Override
    public void runActivity(@NotNull Project project) {
        for (int i = 0; i < 10; i++) {
            Messages.showDialog("test my listen plugin on startup", "TestListen" + i, new String[0], 0,  Messages.getInformationIcon());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
