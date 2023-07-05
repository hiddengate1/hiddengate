package com.hiddengate1.mc

import android.content.Context
import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin

@CloudstreamPlugin
class MCPlugin : Plugin() {
    override fun load(context: Context) {
        registerMainAPI(MC())
    }
}