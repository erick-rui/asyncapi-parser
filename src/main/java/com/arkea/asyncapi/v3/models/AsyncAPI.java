package com.arkea.asyncapi.v3.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.arkea.asyncapi.v3.models.channels.Channel;
import com.arkea.asyncapi.v3.models.info.Identifier;
import com.arkea.asyncapi.v3.models.info.Info;
import com.arkea.asyncapi.v3.models.media.Schema;
import com.arkea.asyncapi.v3.models.security.SecurityScheme;
import com.arkea.asyncapi.v3.models.servers.Server;

/**
 * AsyncAPI
 *
 * @see "https://github.com/asyncapi/asyncapi/blob/master/versions/2.0.0/asyncapi.md"
 */

public class AsyncAPI {

    /** Required. Specifies the AsyncAPI Specification version being used.
     *  It can be used by tooling Specifications and clients to interpret the version.
     *  The structure shall be major.minor.patch, where patch versions must be compatible with the existing major.minor tooling.
     *  Typically patch versions will be introduced to address errors in the documentation, and tooling should typically be compatible with the corresponding major.minor (1.0.*).
     *  Patch versions will correspond to patches of this document. */
    private String asyncapi = "3.0.0";

    /** Identifier of the application the AsyncAPI document is defining. */
    private Identifier id = null;

    /** Required. Provides metadata about the API. The metadata can be used by the clients if needed. */
    private Info info = null;

    
    /** Provides connection details of servers. */
    private Map<String, Server> servers = null;

    /** Default content type to use when encoding/decoding a message's payload. */
    private String defaultContentType = null;

    /** Channels Object	Required The available channels and messages for the API. */
    private Map<String, Channel> channels = new HashMap<String, Channel>();

    /** An element to hold various schemas for the specification. */
    private Components components = null;

    /** Allows extensions to the AsyncAPI Schema. The field name MUST begin with x-, for example, x-internal-id.
     *  The value can be null, a primitive, an array or an object. Can have any valid JSON format value. */
    private Map<String, Object> extensions = null;

    /**
     * returns the asyncapi property from a AsyncAPI instance.
     *
     * @return String asyncapi
     **/



    public AsyncAPI asyncapi(final String asyncapi) {
        this.asyncapi = asyncapi;
        return this;
    }

    public Identifier getId() {
        return this.id;
    }

    public void setId(final Identifier id) {
        this.id = id;
    }

    /**
     * returns the info property from a AsyncAPI instance.
     *
     * @return Info info
     **/

    public Info getInfo() {
        return this.info;
    }

    public void setInfo(final Info info) {
        this.info = info;
    }

    public AsyncAPI info(final Info info) {
        this.info = info;
        return this;
    }

    /**
     * Servers defined in the API
     *
     * @return List&lt;Server&gt; servers
     **/

    public Map<String, Server> getServers() {
        return this.servers;
    }

    public void setServers(final Map<String, Server> servers) {
        this.servers = servers;
    }

    public AsyncAPI servers(final Map<String, Server> servers) {
        this.servers = servers;
        return this;
    }

    public AsyncAPI addServersItem(final String name, final Server serversItem) {
        if (this.servers == null) {
            this.servers = new LinkedHashMap<String, Server>();
        }
        this.servers.put(name, serversItem);
        return this;
    }

    public String getAsyncapi() {
        return this.asyncapi;
    }

    public void setAsyncapi(final String asyncapi) {
        this.asyncapi = asyncapi;
    }

    public String getDefaultContentType() {
        return this.defaultContentType;
    }

    public void setDefaultContentType(final String defaultContentType) {
        this.defaultContentType = defaultContentType;
    }

    public Map<String, Channel> getChannels() {
        return this.channels;
    }

    public void setChannels(final Map<String, Channel> channels) {
        this.channels = channels;
    }

    /**
     * returns the components property from a AsyncAPI instance.
     *
     * @return Components components
     **/

    public Components getComponents() {
        return this.components;
    }

    public void setComponents(final Components components) {
        this.components = components;
    }

    public AsyncAPI components(final Components components) {
        this.components = components;
        return this;
    }

    /*
     * helpers
     */

    public AsyncAPI schema(final String name, final Schema schema) {
        if (this.components == null) {
            this.components = new Components();
        }
        this.components.addSchemas(name, schema);
        return this;
    }

    public AsyncAPI schemaRequirement(final String name, final SecurityScheme securityScheme) {
        if (this.components == null) {
            this.components = new Components();
        }
        this.components.addSecuritySchemes(name, securityScheme);
        return this;
    }

    public Map<String, Object> getExtensions() {
        return this.extensions;
    }

    public void addExtension(final String name, final Object value) {
        if (name == null || name.isEmpty() || !name.startsWith("x-")) {
            return;
        }
        if (this.extensions == null) {
            this.extensions = new LinkedHashMap<>();
        }
        this.extensions.put(name, value);
    }

    public void setExtensions(final Map<String, Object> extensions) {
        this.extensions = extensions;
    }

    public AsyncAPI extensions(final Map<String, Object> extensions) {
        this.extensions = extensions;
        return this;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final AsyncAPI asyncAPI = (AsyncAPI) o;
        return Objects.equals(this.asyncapi, asyncAPI.asyncapi) &&
                        Objects.equals(this.id, asyncAPI.id) &&
                        Objects.equals(this.info, asyncAPI.info) &&
                        Objects.equals(this.servers, asyncAPI.servers) &&
                        Objects.equals(this.defaultContentType, asyncAPI.defaultContentType) &&
                        Objects.equals(this.channels, asyncAPI.channels) &&
                        Objects.equals(this.components, asyncAPI.components) &&
                        Objects.equals(this.extensions, asyncAPI.extensions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.asyncapi,
                this.id,
                this.info,
                this.servers,
                this.defaultContentType,
                this.channels,
                this.// security,
                        components,
                this.// paths,
                        extensions);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class AsyncAPI {\n");

        sb.append("    asyncapi: ").append(toIndentedString(this.asyncapi)).append("\n");
        sb.append("    id: ").append(toIndentedString(this.id)).append("\n");
        sb.append("    info: ").append(toIndentedString(this.info)).append("\n");
        sb.append("    servers: ").append(toIndentedString(this.servers)).append("\n");
        sb.append("    defaultContentType: ").append(toIndentedString(this.defaultContentType)).append("\n");
        sb.append("    channels: ").append(toIndentedString(this.channels)).append("\n");
        sb.append("    components: ").append(toIndentedString(this.components)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(final Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }


    
    
}
