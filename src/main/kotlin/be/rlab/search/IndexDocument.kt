package be.rlab.search

import be.rlab.nlp.model.Language

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class IndexDocument(
    val namespace: String,
    val languages: Array<Language>
)
