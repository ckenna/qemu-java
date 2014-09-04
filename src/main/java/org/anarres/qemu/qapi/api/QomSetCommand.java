package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiCommandDescriptor{name=qom-set, returns=null, data={path=str, property=str, value=visitor}}</pre></p>
 */
// QApiCommandDescriptor{name=qom-set, returns=null, data={path=str, property=str, value=visitor}}
public class QomSetCommand extends QApiCommand<QomSetCommand.Arguments, QomSetCommand.Response> {
	/** Compound arguments to a QomSetCommand. */
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	public static class Arguments {

		@JsonProperty("path")
		@Nonnull
		public java.lang.String path;
		@JsonProperty("property")
		@Nonnull
		public java.lang.String property;
		@JsonProperty("value")
		@Nonnull
		public java.lang.Object value;

		public Arguments() {
		}

		public Arguments(java.lang.String path, java.lang.String property, java.lang.Object value) {
			this.path = path;
			this.property = property;
			this.value = value;
		}
	}

	/** Response to a QomSetCommand. */
	public static class Response extends QApiResponse<java.lang.Void> {
	}

	/** Constructs a new QomSetCommand. */
	public QomSetCommand(@Nonnull QomSetCommand.Arguments argument) {
		super("qom-set", Response.class, argument);
	}

	/** Constructs a new QomSetCommand. */
	public QomSetCommand(java.lang.String path, java.lang.String property, java.lang.Object value) {
		this(new Arguments(path, property, value));
	}
}
