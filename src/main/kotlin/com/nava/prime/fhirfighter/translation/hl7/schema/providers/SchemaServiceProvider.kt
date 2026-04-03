package com.nava.prime.fhirfighter.translation.hl7.schema.providers

import java.io.InputStream
import java.net.URI

interface SchemaServiceProvider {
    fun getProviderType(): String
    fun getInputStream(schemaUri: URI): InputStream
}