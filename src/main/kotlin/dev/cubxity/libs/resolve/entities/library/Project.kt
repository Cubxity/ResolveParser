package dev.cubxity.libs.resolve.entities.library

import dev.cubxity.libs.resolve.entities.library.sequence.Sequence
import org.jonnyzzz.kotlin.xml.bind.XAttribute
import org.jonnyzzz.kotlin.xml.bind.XElements
import org.jonnyzzz.kotlin.xml.bind.XSub
import org.jonnyzzz.kotlin.xml.bind.jdom.JXML

class Project {
    var name by JXML / XAttribute("name")
    var sequences by JXML / XElements("sequence") / XSub(Sequence::class.java)
}