package com.arkea.asyncapi.v3.models.channels;

import java.util.Map;

import com.arkea.asyncapi.v3.models.messages.Message;
import com.arkea.asyncapi.v3.models.operations.Operation;
import com.arkea.asyncapi.v3.models.parameters.Parameter;

/**
 * Server
 *
 * @see "https://github.com/asyncapi/asyncapi/blob/master/versions/2.0.0/asyncapi.md#channelItemObject"
 */

public class Channel {

    /**
     * An optional string representation of this channel's address.
     * The address is typically the "topic name", "routing key", "event type", or "path".
     * When null or absent, it MUST be interpreted as unknown.
     * This is useful when the address is generated dynamically at runtime or can't be known upfront.
     * It MAY contain Channel Address Expressions. Query parameters and fragments SHALL NOT be used, instead use bindings to define them.
     */
    private String address = null;

    /**
     * An optional description of this channel item. CommonMark syntax can be used
     * for rich text representation.
     */
    private String description = null;

    /**
     * A map of the messages that will be sent to this channel by any application at any time.
     * Every message sent to this channel MUST be valid against one,
     * and only one, of the message objects defined in this map.
     */
    private Map<String, Message> messages = null;

    /**
     * A map of the parameters included in the channel name. It SHOULD be present
     * only when using channels with expressions (as defined by RFC 6570 section
     * 2.2).
     */
    private Map<String, Parameter> parameters = null;

    /**
     * A map where the keys describe the name of the protocol and the values
     * describe protocol-specific definitions for the channel.
     */
    private Map<String, ChannelBindings> bindings = null;

    /**
     * Allows for an external definition of this channel item. The referenced
     * structure MUST be in the format of a Channel Item Object. If there are
     * conflicts between the referenced definition and this Channel Item's
     * definition, the behavior is undefined.
     */
    private String $ref = null;

    /**
     * Allows extensions to the AsyncAPI Schema. The field name MUST begin with x-,
     * for example, x-internal-id. The value can be null, a primitive, an array or
     * an object. Can have any valid JSON format value.
     */
    private Map<String, Object> extensions = null;

    /**
     * Return the address of this channel
     *
     * @return String address
     */
    public String getAddress() {
        return this.description;
    }

    /**
     * Set the description property of this channel instance.
     *
     * @param address Channel Address
     */
    public void setAddress(final String address) {
        this.address = address;
    }

    /**
     * Return the description of this channel
     *
     * @return String description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property of this channel instance.
     *
     * @param description channel description
     */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
     * Return messages from this channel
     *
     * @return Map<String, Message> messages
     */
    public Map<String, Message> getMessages() {
        return this.messages;
    }

    /**
     * Set parameters of this channel instance.
     *
     * @param parameters Map of channel parameters
     */
    public void setMessages(final Map<String, Message> messages) {
        this.messages = messages;
    }

    /**
     * Return parameters from this channel
     *
     * @return Map<String, Parameter> parameters
     */
    public Map<String, Parameter> getParameters() {
        return this.parameters;
    }

    /**
     * Set parameters of this channel instance.
     *
     * @param parameters Map of channel parameters
     */
    public void setParameters(final Map<String, Parameter> parameters) {
        this.parameters = parameters;
    }


    /**
     * Return the bindings parameter from this channel
     *
     * @return Map<String, ChannelBindings> bindings
     */
    public Map<String, ChannelBindings> getBindings() {
        return this.bindings;
    }

    /**
     * Set the bindings property of this channel instance.
     *
     * @param bindings Map of channel bindings
     */
    public void setBindings(final Map<String, ChannelBindings> bindings) {
        this.bindings = bindings;
    }

    /**
     * Return the channel instance by ref
     *
     * @param $ref reference
     * @return channel
     */
    public Channel $ref(final String $ref) {

        set$ref($ref);
        return this;
    }

    public void set$ref(String $ref) {
        if ($ref != null && $ref.indexOf('.') == -1 && $ref.indexOf('/') == -1) {
            $ref = "#/components/channels/channel" + $ref;
        }
        this.$ref = $ref;
    }

    /**
     * Returns the extensions property from this channel instance.
     *
     * @return Map<String, Object> extensions
     */
    public Map<String, Object> getExtensions() {
        return this.extensions;
    }

    /**
     * Set the extensions property of this channel instance.
     *
     * @param extensions extensions
     */
    public void setExtensions(final Map<String, Object> extensions) {
        this.extensions = extensions;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (this.$ref == null ? 0 : this.$ref.hashCode());
        result = prime * result + (this.bindings == null ? 0 : this.bindings.hashCode());
        result = prime * result + (this.address == null ? 0 : this.address.hashCode());
        result = prime * result + (this.description == null ? 0 : this.description.hashCode());
        result = prime * result + (this.extensions == null ? 0 : this.extensions.hashCode());
        result = prime * result + (this.messages == null ? 0 : this.messages.hashCode());
        result = prime * result + (this.parameters == null ? 0 : this.parameters.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Channel other = (Channel) obj;
        if (this.$ref == null) {
            if (other.$ref != null) {
                return false;
            }
        } else if (!this.$ref.equals(other.$ref)) {
            return false;
        }
        if (this.bindings == null) {
            if (other.bindings != null) {
                return false;
            }
        } else if (!this.bindings.equals(other.bindings)) {
            return false;
        }
        if (this.address == null) {
            if (other.address != null) {
                return false;
            }
        } else if (!this.address.equals(other.address)) {
            return false;
        }
        if (this.description == null) {
            if (other.description != null) {
                return false;
            }
        } else if (!this.description.equals(other.description)) {
            return false;
        }
        if (this.extensions == null) {
            if (other.extensions != null) {
                return false;
            }
        } else if (!this.extensions.equals(other.extensions)) {
            return false;
        }
        if (this.messages == null) {
            if (other.messages != null) {
                return false;
            }
        } else if (!this.messages.equals(other.messages)) {
            return false;
        }
        if (this.parameters == null) {
            if (other.parameters != null) {
                return false;
            }
        } else if (!this.parameters.equals(other.parameters)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Channel [address=" + this.address +
                ", description=" + this.description +
                ", messages=" + this.messages +
                ", parameters=" + this.parameters +
                ", bindings=" + this.bindings +
                ", $ref=" + this.$ref +
                ", extensions=" + this.extensions + "]";
    }

}
