package dev.cubxity.libs.resolve.entities.library.sequence

import org.jonnyzzz.kotlin.xml.bind.XElements
import org.jonnyzzz.kotlin.xml.bind.XSub
import org.jonnyzzz.kotlin.xml.bind.jdom.JXML

class Spine {
    var clips by JXML / XElements("clip") / XSub(Clip::class.java)
    var gaps by JXML / XElements("gap") / XSub(Gap::class.java)
}