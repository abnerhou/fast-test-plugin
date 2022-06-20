package com.github.abnerhou.fasttestplugin.services

import com.intellij.openapi.project.Project
import com.github.abnerhou.fasttestplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
