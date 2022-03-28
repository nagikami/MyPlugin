package com.github.nagikami.myplugin;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;

public class DemoAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        Messages.showDialog("test my plugin", "Test", new String[0], 0,  Messages.getInformationIcon());
    }
}
