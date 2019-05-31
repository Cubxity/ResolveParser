package dev.cubxity.libs.resolve.entities.library.sequence

import org.jonnyzzz.kotlin.xml.bind.XAttribute
import org.jonnyzzz.kotlin.xml.bind.XElements
import org.jonnyzzz.kotlin.xml.bind.XSub
import org.jonnyzzz.kotlin.xml.bind.jdom.JXML

class Gap {
    var name by JXML / XAttribute("name")
    var offset by JXML / XAttribute("offset")
    var start by JXML / XAttribute("start")
    var duration by JXML / XAttribute("duration")
    var clips by JXML / XElements("clip") / XSub(Clip::class.java)
    var titles by JXML / XElements("title") / XSub(Title::class.java)
}