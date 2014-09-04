package org.anarres.qemu.qapi.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import org.anarres.qemu.qapi.common.*;

/**
 * Autogenerated class.
 *
 * <p><pre>QApiCommandDescriptor{name=query-chardev-backends, returns=[ChardevBackendInfo], data=null}</pre></p>
 */
// QApiCommandDescriptor{name=query-chardev-backends, returns=[ChardevBackendInfo], data=null}
public class QueryChardevBackendsCommand extends QApiCommand<java.lang.Void, QueryChardevBackendsCommand.Response> {

	/** Response to a QueryChardevBackendsCommand. */
	public static class Response extends QApiResponse<java.util.List<ChardevBackendInfo>> {
	}

	/** Constructs a new QueryChardevBackendsCommand. */
	public QueryChardevBackendsCommand() {
		super("query-chardev-backends", Response.class, null);
	}

}
