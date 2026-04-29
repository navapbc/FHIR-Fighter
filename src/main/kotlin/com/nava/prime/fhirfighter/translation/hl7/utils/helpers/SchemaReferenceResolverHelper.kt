package com.nava.prime.fhirfighter.translation.hl7.utils.helpers

import com.nava.prime.fhirfighter.translation.hl7.schema.ConfigSchemaReader
import com.nava.prime.fhirfighter.translation.hl7.schema.converter.HL7ConverterSchema
import com.nava.prime.fhirfighter.translation.hl7.schema.providers.ClasspathSchemaServiceProvider
import com.nava.prime.fhirfighter.translation.hl7.schema.providers.FileSchemaServiceProvider
import com.nava.prime.fhirfighter.translation.hl7.schema.providers.SchemaServiceProvider

object SchemaReferenceResolverHelper {

    fun retrieveHl7SchemaReference(schema: String): HL7ConverterSchema =
        ConfigSchemaReader.fromFile(
            schema,
            HL7ConverterSchema::class.java,
            getSchemaServiceProviders()
        )

    fun getSchemaServiceProviders():
        Map<String, SchemaServiceProvider> {
        val serviceProviders: MutableMap<String, SchemaServiceProvider> = mutableMapOf()
        serviceProviders["file"] = FileSchemaServiceProvider()
        serviceProviders["classpath"] = ClasspathSchemaServiceProvider()
        return serviceProviders
    }
}