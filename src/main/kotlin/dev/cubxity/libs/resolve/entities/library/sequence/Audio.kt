package dev.cubxity.libs.resolve.entities.library.sequence

import dev.cubxity.libs.resolve.entities.Resources
import org.jonnyzzz.kotlin.xml.bind.XAttribute
import org.jonnyzzz.kotlin.xml.bind.jdom.JXML

class Audio {
    var ref by JXML / XAttribute("ref")
    var lane by JXML / XAttribute("lane")
    var offset by JXML / XAttribute("offset")
    var start by JXML / XAttribute("start")
    var duration by JXML / XAttribute("duration")
    var srcCh by JXML / XAttribute("srcCh")

    fun findIn(resources: Resources) = resources.assets?.find { it.id == ref }
}