package dev.cubxity.libs.resolve.entities.library.sequence

import dev.cubxity.libs.resolve.entities.Resources
import org.jonnyzzz.kotlin.xml.bind.XAttribute
import org.jonnyzzz.kotlin.xml.bind.XElements
import org.jonnyzzz.kotlin.xml.bind.XSub
import org.jonnyzzz.kotlin.xml.bind.jdom.JXML

class Video {
    var ref by JXML / XAttribute("ref")
    var offset by JXML / XAttribute("offset")
    var start by JXML / XAttribute("start")
    var duration by JXML / XAttribute("duration")
    var audios by JXML / XElements("audio") / XSub(Audio::class.java)

    fun findIn(resources: Resources) = resources.assets?.find { it.id == ref }
}