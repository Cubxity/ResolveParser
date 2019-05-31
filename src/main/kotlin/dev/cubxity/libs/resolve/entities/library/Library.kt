package dev.cubxity.libs.resolve.entities.library

import org.jonnyzzz.kotlin.xml.bind.XElements
import org.jonnyzzz.kotlin.xml.bind.XSub
import org.jonnyzzz.kotlin.xml.bind.jdom.JXML

class Library {
    var events by JXML / XElements("event") / XSub(Event::class.java)
}