package de.tschuehly.spring.viewcomponent.core

open class ViewContext(
    open vararg val contextAttributes: ViewProperty,
) {
    var componentTemplate: String? = null


    constructor(
        componentTemplate: String? = null,
        vararg contextAttributes: ViewProperty
    ) : this(*contextAttributes) {
        this.componentTemplate = componentTemplate

    }

}