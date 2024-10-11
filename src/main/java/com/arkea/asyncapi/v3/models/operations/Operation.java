package com.arkea.asyncapi.v3.models.operations;

import java.util.List;
import java.util.Map;

import com.arkea.asyncapi.v3.models.channels.Channel;
import com.arkea.asyncapi.v3.models.info.ExternalDocumentation;
import com.arkea.asyncapi.v3.models.messages.Message;
import com.arkea.asyncapi.v3.models.tags.Tag;

/**
 *
 * @see "https://github.com/asyncapi/asyncapi/blob/master/versions/2.0.0/asyncapi.md#operationObject"
 *
 */
public class Operation {

    /**
     * Gets or Sets Action
     */
    public enum ActionEnum {

        SEND("send"), RECEIVE("receive"), UNDEFINED("undefined");

        private final String value;

        ActionEnum(final String value) {
            this.value = value;
        }

        public static ActionEnum getAction(final String value) {
            try {
                return ActionEnum.valueOf(value.toUpperCase());
            } catch (final IllegalArgumentException e) {
                return ActionEnum.UNDEFINED;
            }

        }

        @Override
        public String toString() {
            return String.valueOf(this.value);
        }
    }

    private ActionEnum action = null;

    private String operationId = null; // string Unique string used to identify the operation. The id MUST be unique among all operations described in the API. The operationId value is case-sensitive. Tools and libraries MAY use the operationId to uniquely identify an operation, therefore, it is
                                       // RECOMMENDED to follow common programming naming conventions.

    private Channel channel = null; // [Channel Object | Reference Object] A definition of the channel in which this operation is performed.

    private String summary = null; // string A short summary of what the operation is about.

    private String description = null; // string A verbose explanation of the operation. CommonMark syntax can be used for rich text representation.

    private List<Tag> tags = null; // [Tag Object] A list of tags for API documentation control. Tags can be used for logical grouping of operations.

    private ExternalDocumentation externalDocs = null; // External Documentation Object Additional external documentation for this operation.

    private Map<String, OperationBinding> bindings = null; // Operation Bindings Object A map where the keys describe the name of the protocol and the values describe protocol-specific definitions for the operation.

    private List<OperationTrait> traits = null; // [Operation Trait Object | Reference Object ] A list of traits to apply to the operation object. Traits MUST be merged into the operation object using the JSON Merge Patch algorithm in the same order they are defined here.

    private Map<String, Message> messages = null; // [Messages Object | Reference Object] A definition of the messages that can be processed by this operation.


    /** Allows extensions to the AsyncAPI Schema. The field name MUST begin with x-, for example, x-internal-id.
     *  The value can be null, a primitive, an array or an object. Can have any valid JSON format value. */
    private Map<String, Object> extensions = null;

    public String getOperationId() {
        return this.operationId;
    }

    public void setOperationId(final String operationId) {
        this.operationId = operationId;
    }

    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public String getSummary() {
        return this.summary;
    }

    public void setSummary(final String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public void setTags(final List<Tag> tags) {
        this.tags = tags;
    }

    public ExternalDocumentation getExternalDocs() {
        return this.externalDocs;
    }

    public void setExternalDocs(final ExternalDocumentation externalDocs) {
        this.externalDocs = externalDocs;
    }

    public Map<String, OperationBinding> getBindings() {
        return this.bindings;
    }

    public void setBindings(final Map<String, OperationBinding> bindings) {
        this.bindings = bindings;
    }

    public List<OperationTrait> getTraits() {
        return this.traits;
    }

    public void setTraits(final List<OperationTrait> traits) {
        this.traits = traits;
    }

    public Map<String, Message> getMessages() {
		return messages;
	}

	public void setMessages(Map<String, Message> messages) {
		this.messages = messages;
	}

	public Map<String, Object> getExtensions() {
        return this.extensions;
    }

    public void setExtensions(final Map<String, Object> extensions) {
        this.extensions = extensions;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (this.bindings == null ? 0 : this.bindings.hashCode());
        result = prime * result + (this.channel == null ? 0 : this.channel.hashCode());
        result = prime * result + (this.description == null ? 0 : this.description.hashCode());
        result = prime * result + (this.extensions == null ? 0 : this.extensions.hashCode());
        result = prime * result + (this.externalDocs == null ? 0 : this.externalDocs.hashCode());
        result = prime * result + (this.messages == null ? 0 : this.messages.hashCode());
        result = prime * result + (this.operationId == null ? 0 : this.operationId.hashCode());
        result = prime * result + (this.summary == null ? 0 : this.summary.hashCode());
        result = prime * result + (this.tags == null ? 0 : this.tags.hashCode());
        result = prime * result + (this.traits == null ? 0 : this.traits.hashCode());
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
        final Operation other = (Operation) obj;
        if (this.bindings == null) {
            if (other.bindings != null) {
                return false;
            }
        } else if (!this.bindings.equals(other.bindings)) {
            return false;
        }
        if (this.description == null) {
            if (other.description != null) {
                return false;
            }
        } else if (!this.description.equals(other.description)) {
            return false;
        }
        if (this.channel == null) {
            if (other.channel != null) {
                return false;
            }
        } else if (!this.channel.equals(other.channel)) {
            return false;
        }
        if (this.extensions == null) {
            if (other.extensions != null) {
                return false;
            }
        } else if (!this.extensions.equals(other.extensions)) {
            return false;
        }
        if (this.externalDocs == null) {
            if (other.externalDocs != null) {
                return false;
            }
        } else if (!this.externalDocs.equals(other.externalDocs)) {
            return false;
        }
        if (this.messages == null) {
            if (other.messages != null) {
                return false;
            }
        } else if (!this.messages.equals(other.messages)) {
            return false;
        }
        if (this.operationId == null) {
            if (other.operationId != null) {
                return false;
            }
        } else if (!this.operationId.equals(other.operationId)) {
            return false;
        }
        if (this.summary == null) {
            if (other.summary != null) {
                return false;
            }
        } else if (!this.summary.equals(other.summary)) {
            return false;
        }
        if (this.tags == null) {
            if (other.tags != null) {
                return false;
            }
        } else if (!this.tags.equals(other.tags)) {
            return false;
        }
        if (this.traits == null) {
            if (other.traits != null) {
                return false;
            }
        } else if (!this.traits.equals(other.traits)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Operation [operationId=" + this.operationId +
                ", channel=" + this.channel +
                ", summary=" + this.summary +
                ", description=" + this.description +
                ", tags=" + this.tags +
                ", externalDocs=" + this.externalDocs +
                ", bindings=" + this.bindings +
                ", traits=" + this.traits +
                ", message=" + this.messages +
                ", extensions=" + this.extensions + "]";
    }

}
