package dev.cubxity.libs.resolve.entities.library.sequence

import org.jonnyzzz.kotlin.xml.bind.XAttribute
import org.jonnyzzz.kotlin.xml.bind.XElements
import org.jonnyzzz.kotlin.xml.bind.XSub
import org.jonnyzzz.kotlin.xml.bind.jdom.JXML

class Sequence {
    var format by JXML / XAttribute("format")
    var tcStart by JXML / XAttribute("tcStart")
    var tcFormat by JXML / XAttribute("tcFormat")
    var duration by JXML / XAttribute("duration")
    var spines by JXML / XElements("spine") / XSub(Spine::class.java)
}