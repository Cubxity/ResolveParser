package dev.cubxity.libs.resolve.entities.library.sequence.adjusts

import org.jonnyzzz.kotlin.xml.bind.XAttribute
import org.jonnyzzz.kotlin.xml.bind.jdom.JXML

class AdjustTransform {
        var position by JXML / XAttribute("position")
        var scale by JXML / XAttribute("scale")
        var anchor by JXML / XAttribute("anchor")
    }