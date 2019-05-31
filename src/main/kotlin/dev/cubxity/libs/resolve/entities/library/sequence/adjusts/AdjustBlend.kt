package dev.cubxity.libs.resolve.entities.library.sequence.adjusts

import org.jonnyzzz.kotlin.xml.bind.XAttribute
import org.jonnyzzz.kotlin.xml.bind.jdom.JXML

/**
 * Blend opacity
 */
class AdjustBlend {
    var amount by JXML / XAttribute("amount")
}