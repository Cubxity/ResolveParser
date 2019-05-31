package dev.cubxity.libs.resolve.entities.library.sequence

import org.jonnyzzz.kotlin.xml.bind.XAttribute
import org.jonnyzzz.kotlin.xml.bind.jdom.JXML

class AudioAuxSource {
    var name by JXML / XAttribute("name")
    var srcCh by JXML / XAttribute("srcCh")
}