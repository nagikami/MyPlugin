package com.github.nagikami.myplugin.services

import com.intellij.openapi.project.Project
import com.github.nagikami.myplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
