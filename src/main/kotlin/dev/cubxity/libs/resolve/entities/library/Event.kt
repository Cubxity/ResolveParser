package dev.cubxity.libs.resolve.entities.library

import org.jonnyzzz.kotlin.xml.bind.XAttribute
import org.jonnyzzz.kotlin.xml.bind.XElements
import org.jonnyzzz.kotlin.xml.bind.XSub
import org.jonnyzzz.kotlin.xml.bind.jdom.JXML

/**
 * Timeline
 */
class Event {
    var name by JXML / XAttribute("name")
    var projects by JXML / XElements("project") / XSub(Project::class.java)
}