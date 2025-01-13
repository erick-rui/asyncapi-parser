package com.arkea.asyncapi.v3.models.media;

import com.arkea.asyncapi.v3.models.info.ExternalDocumentation;

import java.math.BigDecimal;
import java.util.*;

/**
 * Multi Format Schema Object
 *
 * @see "https://github.com/asyncapi/spec/blob/master/spec/asyncapi.md#multiFormatSchemaObject"
 */

public class MultiFormatSchema<T> {

    /**
     * Required. A string containing the name of the schema format that is used to define the information
     */
    private String schemaFormat = null;

    /**
     *  Required. Definition of the message payload. It can be of any type but defaults to Schema Object.
     *  It MUST match the schema format defined in schemaFormat, including the encoding type.
     */
    private Schema schema = null;

    /** Allows for an external definition of this item. */
    private String $ref = null;

    public MultiFormatSchema() {
    }

    protected MultiFormatSchema(final String schemaFormat, final Schema<T> schema) {
        this.schemaFormat = schemaFormat;
        this.schema = schema;
    }


    /**
     * returns the $ref property from a Schema instance.
     *
     * @return String $ref
     **/
    public String get$ref() {
        return this.$ref;
    }

    public void set$ref(String $ref) {
        if ($ref != null && $ref.indexOf('.') == -1 && $ref.indexOf('/') == -1) {
            $ref = "#/components/schemas/" + $ref;
        }
        this.$ref = $ref;
    }

    public MultiFormatSchema $ref(final String $ref) {
        set$ref($ref);
        return this;
    }

    public String getSchemaFormat() {
        return schemaFormat;
    }

    public void setSchemaFormat(String schemaFormat) {
        this.schemaFormat = schemaFormat;
    }

    public Schema<T> getSchema() {
        return schema;
    }

    public void setSchema(Schema schema) {
        this.schema = schema;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final MultiFormatSchema other = (MultiFormatSchema) o;
        return Objects.equals(this.schemaFormat, other.schemaFormat) &&
                        Objects.equals(this.schema, other.schema);

    }

    @Override
    public int hashCode() {
        return Objects.hash(this.schemaFormat, this.schema);
    }

	@Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class Schema {\n");
        sb.append("    type: ").append(toIndentedString(this.schemaFormat)).append("\n");
        sb.append("    format: ").append(toIndentedString(this.schema)).append("\n");
        sb.append("    $ref: ").append(toIndentedString(this.$ref)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    protected String toIndentedString(final Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
